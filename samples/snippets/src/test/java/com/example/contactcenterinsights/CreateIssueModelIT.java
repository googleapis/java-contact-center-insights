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

import static com.google.common.truth.Truth.assertThat;
import static junit.framework.TestCase.assertNotNull;

import com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsClient;
import com.google.cloud.contactcenterinsights.v1.IssueModel;
import com.google.cloud.contactcenterinsights.v1.ListConversationsRequest;
import com.google.cloud.contactcenterinsights.v1.ListConversationsResponse;
import com.google.cloud.contactcenterinsights.v1.LocationName;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CreateIssueModelIT {

  private static final String PROJECT_ID = System.getenv("GOOGLE_CLOUD_PROJECT");
  private static final int MIN_CONVERSATION_COUNT = 10000;
  private ByteArrayOutputStream bout;
  private PrintStream out;
  private String issueModelName;
  private int conversationCount;

  private static void requireEnvVar(String varName) {
    assertNotNull(String.format(varName), String.format(varName));
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("GOOGLE_CLOUD_PROJECT");
  }

  @Before
  public void setUp() throws IOException {
    bout = new ByteArrayOutputStream();
    out = new PrintStream(bout);
    System.setOut(out);

    try (ContactCenterInsightsClient client = ContactCenterInsightsClient.create()) {
      // Check if the project has the minimum number of conversations required to create
      // an issue model. See https://cloud.google.com/contact-center/insights/docs/topic-model.
      LocationName parent = LocationName.of(PROJECT_ID, "us-central1");
      ListConversationsRequest.Builder listRequest = ListConversationsRequest.newBuilder()
          .setParent(parent.toString())
          .setPageSize(1000);

      conversationCount = 0;
      while (conversationCount < MIN_CONVERSATION_COUNT) {
        ListConversationsResponse listResponse =
            client.listConversationsCallable().call(listRequest.build());

        if (listResponse.getConversationsCount() == 0) {
          break;
        }
        conversationCount += listResponse.getConversationsCount();

        if (!Strings.isNullOrEmpty(listResponse.getNextPageToken())) {
          break;
        }
        listRequest.setPageToken(listResponse.getNextPageToken());
      }
    }
  }

  @After
  public void tearDown() throws IOException {
    try (ContactCenterInsightsClient client = ContactCenterInsightsClient.create()) {
      client.deleteIssueModel(issueModelName);
    }
    System.setOut(null);
  }

  @Test
  public void testCreateIssueModel() throws IOException {
    if (conversationCount >= MIN_CONVERSATION_COUNT) {
      IssueModel issueModel = CreateIssueModel.createIssueModel(PROJECT_ID);
      issueModelName = issueModel.getName();
      assertThat(bout.toString()).contains(issueModelName);
    }
  }
}