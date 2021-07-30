/*
 * Copyright 2021 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.contactcenterinsights;

// [START contactcenterinsights_create_analyze_conversation]

import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.contactcenterinsights.v1.Analysis;
import com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsClient;
import com.google.cloud.contactcenterinsights.v1.Conversation;
import com.google.cloud.contactcenterinsights.v1.ConversationDataSource;
import com.google.cloud.contactcenterinsights.v1.CreateAnalysisOperationMetadata;
import com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest;
import com.google.cloud.contactcenterinsights.v1.CreateConversationRequest;
import com.google.cloud.contactcenterinsights.v1.DeleteConversationRequest;
import com.google.cloud.contactcenterinsights.v1.GcsSource;
import com.google.cloud.contactcenterinsights.v1.LocationName;

import java.util.concurrent.TimeUnit;

public class CreateAnalyzeConversation {

  public static void main(String[] args) {
    String projectId = "your-project-id";
    String location = "us-central1";

    // If a custom conversation ID is provided, it will be used. Setting to an empty string will result in Insights
    // generating an ID for you.
    String conversationId = "your-conversation-id";

    // The Cloud Storage location of a conversation transcript.
    String transcriptUri = "gs://example-bucket/some-example.json";

    // The medium of your conversation transcript.
    Conversation.Medium medium = Conversation.Medium.CHAT;

    // Create an Insights Conversation with the provided `transcriptUri` and `medium`.
    Conversation conversation =
      Conversation.newBuilder()
        .setDataSource(
          ConversationDataSource.newBuilder()
            .setGcsSource(GcsSource.newBuilder().setTranscriptUri(transcriptUri).build())
            .build())
        .setMedium(medium)
        .build();

    createAnalyzeConversation(projectId, location, conversationId, conversation);
  }

  public static void createAnalyzeConversation(
    String projectId, String location, String conversationId, Conversation conversation) {
    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (ContactCenterInsightsClient contactCenterInsightsClient =
           ContactCenterInsightsClient.create()) {
      LocationName parent = LocationName.of(projectId, location);

      CreateConversationRequest.Builder createConversationRequestBuilder =
        CreateConversationRequest.newBuilder()
          .setConversation(conversation)
          .setParent(parent.toString()).setConversationId(conversationId);

      Conversation response =
        contactCenterInsightsClient.createConversation(createConversationRequestBuilder.build());

      String conversationName = response.getName();
      CreateAnalysisRequest request =
        CreateAnalysisRequest.newBuilder().setParent(conversationName).build();
      OperationFuture<Analysis, CreateAnalysisOperationMetadata> future =
        contactCenterInsightsClient.createAnalysisAsync(request);

      System.out.println("Waiting for operation to complete...");
      Analysis analysis = future.get(60L, TimeUnit.SECONDS);
      System.out.printf("Analysis created: %s.%n", analysis.getName());

      // Clean up the created resources.
      DeleteConversationRequest deleteConversationRequest =
        DeleteConversationRequest.newBuilder().setName(conversationName).setForce(true).build();
      contactCenterInsightsClient.deleteConversation(deleteConversationRequest);
      System.out.printf("Conversation deleted %s.%n", conversationName);
    } catch (Exception exception) {
      System.err.println("Failed to create the client due to: " + exception);
    }
  }
}
// [END contactcenterinsights_create_analyze_conversation]