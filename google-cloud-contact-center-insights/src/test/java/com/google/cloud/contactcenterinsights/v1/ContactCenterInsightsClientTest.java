/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.contactcenterinsights.v1;

import static com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsClient.ListAnalysesPagedResponse;
import static com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsClient.ListConversationsPagedResponse;
import static com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsClient.ListPhraseMatchersPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import com.google.protobuf.Duration;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class ContactCenterInsightsClientTest {
  private static MockContactCenterInsights mockContactCenterInsights;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private ContactCenterInsightsClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockContactCenterInsights = new MockContactCenterInsights();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockContactCenterInsights));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    ContactCenterInsightsSettings settings =
        ContactCenterInsightsSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ContactCenterInsightsClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void createConversationTest() throws Exception {
    Conversation expectedResponse =
        Conversation.newBuilder()
            .setName(ConversationName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]").toString())
            .setDataSource(ConversationDataSource.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setLanguageCode("languageCode-2092349083")
            .setAgentId("agentId-1060987136")
            .putAllLabels(new HashMap<String, String>())
            .setTranscript(Conversation.Transcript.newBuilder().build())
            .setDuration(Duration.newBuilder().build())
            .setTurnCount(428155597)
            .setLatestAnalysis(Analysis.newBuilder().build())
            .addAllRuntimeAnnotations(new ArrayList<RuntimeAnnotation>())
            .putAllDialogflowIntents(new HashMap<String, DialogflowIntent>())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    Conversation conversation = Conversation.newBuilder().build();
    String conversationId = "conversationId-1676095234";

    Conversation actualResponse = client.createConversation(parent, conversation, conversationId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateConversationRequest actualRequest = ((CreateConversationRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(conversation, actualRequest.getConversation());
    Assert.assertEquals(conversationId, actualRequest.getConversationId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createConversationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      Conversation conversation = Conversation.newBuilder().build();
      String conversationId = "conversationId-1676095234";
      client.createConversation(parent, conversation, conversationId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createConversationTest2() throws Exception {
    Conversation expectedResponse =
        Conversation.newBuilder()
            .setName(ConversationName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]").toString())
            .setDataSource(ConversationDataSource.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setLanguageCode("languageCode-2092349083")
            .setAgentId("agentId-1060987136")
            .putAllLabels(new HashMap<String, String>())
            .setTranscript(Conversation.Transcript.newBuilder().build())
            .setDuration(Duration.newBuilder().build())
            .setTurnCount(428155597)
            .setLatestAnalysis(Analysis.newBuilder().build())
            .addAllRuntimeAnnotations(new ArrayList<RuntimeAnnotation>())
            .putAllDialogflowIntents(new HashMap<String, DialogflowIntent>())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    String parent = "parent-995424086";
    Conversation conversation = Conversation.newBuilder().build();
    String conversationId = "conversationId-1676095234";

    Conversation actualResponse = client.createConversation(parent, conversation, conversationId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateConversationRequest actualRequest = ((CreateConversationRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(conversation, actualRequest.getConversation());
    Assert.assertEquals(conversationId, actualRequest.getConversationId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createConversationExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String parent = "parent-995424086";
      Conversation conversation = Conversation.newBuilder().build();
      String conversationId = "conversationId-1676095234";
      client.createConversation(parent, conversation, conversationId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateConversationTest() throws Exception {
    Conversation expectedResponse =
        Conversation.newBuilder()
            .setName(ConversationName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]").toString())
            .setDataSource(ConversationDataSource.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setLanguageCode("languageCode-2092349083")
            .setAgentId("agentId-1060987136")
            .putAllLabels(new HashMap<String, String>())
            .setTranscript(Conversation.Transcript.newBuilder().build())
            .setDuration(Duration.newBuilder().build())
            .setTurnCount(428155597)
            .setLatestAnalysis(Analysis.newBuilder().build())
            .addAllRuntimeAnnotations(new ArrayList<RuntimeAnnotation>())
            .putAllDialogflowIntents(new HashMap<String, DialogflowIntent>())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    Conversation conversation = Conversation.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Conversation actualResponse = client.updateConversation(conversation, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateConversationRequest actualRequest = ((UpdateConversationRequest) actualRequests.get(0));

    Assert.assertEquals(conversation, actualRequest.getConversation());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateConversationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      Conversation conversation = Conversation.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateConversation(conversation, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getConversationTest() throws Exception {
    Conversation expectedResponse =
        Conversation.newBuilder()
            .setName(ConversationName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]").toString())
            .setDataSource(ConversationDataSource.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setLanguageCode("languageCode-2092349083")
            .setAgentId("agentId-1060987136")
            .putAllLabels(new HashMap<String, String>())
            .setTranscript(Conversation.Transcript.newBuilder().build())
            .setDuration(Duration.newBuilder().build())
            .setTurnCount(428155597)
            .setLatestAnalysis(Analysis.newBuilder().build())
            .addAllRuntimeAnnotations(new ArrayList<RuntimeAnnotation>())
            .putAllDialogflowIntents(new HashMap<String, DialogflowIntent>())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    ConversationName name = ConversationName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]");

    Conversation actualResponse = client.getConversation(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetConversationRequest actualRequest = ((GetConversationRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getConversationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      ConversationName name = ConversationName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]");
      client.getConversation(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getConversationTest2() throws Exception {
    Conversation expectedResponse =
        Conversation.newBuilder()
            .setName(ConversationName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]").toString())
            .setDataSource(ConversationDataSource.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setLanguageCode("languageCode-2092349083")
            .setAgentId("agentId-1060987136")
            .putAllLabels(new HashMap<String, String>())
            .setTranscript(Conversation.Transcript.newBuilder().build())
            .setDuration(Duration.newBuilder().build())
            .setTurnCount(428155597)
            .setLatestAnalysis(Analysis.newBuilder().build())
            .addAllRuntimeAnnotations(new ArrayList<RuntimeAnnotation>())
            .putAllDialogflowIntents(new HashMap<String, DialogflowIntent>())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    String name = "name3373707";

    Conversation actualResponse = client.getConversation(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetConversationRequest actualRequest = ((GetConversationRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getConversationExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String name = "name3373707";
      client.getConversation(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listConversationsTest() throws Exception {
    Conversation responsesElement = Conversation.newBuilder().build();
    ListConversationsResponse expectedResponse =
        ListConversationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllConversations(Arrays.asList(responsesElement))
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListConversationsPagedResponse pagedListResponse = client.listConversations(parent);

    List<Conversation> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getConversationsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListConversationsRequest actualRequest = ((ListConversationsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listConversationsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listConversations(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listConversationsTest2() throws Exception {
    Conversation responsesElement = Conversation.newBuilder().build();
    ListConversationsResponse expectedResponse =
        ListConversationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllConversations(Arrays.asList(responsesElement))
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListConversationsPagedResponse pagedListResponse = client.listConversations(parent);

    List<Conversation> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getConversationsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListConversationsRequest actualRequest = ((ListConversationsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listConversationsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listConversations(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteConversationTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockContactCenterInsights.addResponse(expectedResponse);

    ConversationName name = ConversationName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]");

    client.deleteConversation(name);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteConversationRequest actualRequest = ((DeleteConversationRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteConversationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      ConversationName name = ConversationName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]");
      client.deleteConversation(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteConversationTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockContactCenterInsights.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteConversation(name);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteConversationRequest actualRequest = ((DeleteConversationRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteConversationExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String name = "name3373707";
      client.deleteConversation(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createAnalysisTest() throws Exception {
    Analysis expectedResponse =
        Analysis.newBuilder()
            .setName(
                AnalysisName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]", "[ANALYSIS]")
                    .toString())
            .setRequestTime(Timestamp.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setAnalysisResult(AnalysisResult.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createAnalysisTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockContactCenterInsights.addResponse(resultOperation);

    ConversationName parent = ConversationName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]");
    Analysis analysis = Analysis.newBuilder().build();

    Analysis actualResponse = client.createAnalysisAsync(parent, analysis).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateAnalysisRequest actualRequest = ((CreateAnalysisRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(analysis, actualRequest.getAnalysis());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createAnalysisExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      ConversationName parent = ConversationName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]");
      Analysis analysis = Analysis.newBuilder().build();
      client.createAnalysisAsync(parent, analysis).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createAnalysisTest2() throws Exception {
    Analysis expectedResponse =
        Analysis.newBuilder()
            .setName(
                AnalysisName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]", "[ANALYSIS]")
                    .toString())
            .setRequestTime(Timestamp.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setAnalysisResult(AnalysisResult.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createAnalysisTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockContactCenterInsights.addResponse(resultOperation);

    String parent = "parent-995424086";
    Analysis analysis = Analysis.newBuilder().build();

    Analysis actualResponse = client.createAnalysisAsync(parent, analysis).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateAnalysisRequest actualRequest = ((CreateAnalysisRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(analysis, actualRequest.getAnalysis());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createAnalysisExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String parent = "parent-995424086";
      Analysis analysis = Analysis.newBuilder().build();
      client.createAnalysisAsync(parent, analysis).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void getAnalysisTest() throws Exception {
    Analysis expectedResponse =
        Analysis.newBuilder()
            .setName(
                AnalysisName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]", "[ANALYSIS]")
                    .toString())
            .setRequestTime(Timestamp.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setAnalysisResult(AnalysisResult.newBuilder().build())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    AnalysisName name = AnalysisName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]", "[ANALYSIS]");

    Analysis actualResponse = client.getAnalysis(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAnalysisRequest actualRequest = ((GetAnalysisRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAnalysisExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      AnalysisName name =
          AnalysisName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]", "[ANALYSIS]");
      client.getAnalysis(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAnalysisTest2() throws Exception {
    Analysis expectedResponse =
        Analysis.newBuilder()
            .setName(
                AnalysisName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]", "[ANALYSIS]")
                    .toString())
            .setRequestTime(Timestamp.newBuilder().build())
            .setCreateTime(Timestamp.newBuilder().build())
            .setAnalysisResult(AnalysisResult.newBuilder().build())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    String name = "name3373707";

    Analysis actualResponse = client.getAnalysis(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAnalysisRequest actualRequest = ((GetAnalysisRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAnalysisExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String name = "name3373707";
      client.getAnalysis(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAnalysesTest() throws Exception {
    Analysis responsesElement = Analysis.newBuilder().build();
    ListAnalysesResponse expectedResponse =
        ListAnalysesResponse.newBuilder()
            .setNextPageToken("")
            .addAllAnalyses(Arrays.asList(responsesElement))
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    ConversationName parent = ConversationName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]");

    ListAnalysesPagedResponse pagedListResponse = client.listAnalyses(parent);

    List<Analysis> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAnalysesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAnalysesRequest actualRequest = ((ListAnalysesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAnalysesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      ConversationName parent = ConversationName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]");
      client.listAnalyses(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAnalysesTest2() throws Exception {
    Analysis responsesElement = Analysis.newBuilder().build();
    ListAnalysesResponse expectedResponse =
        ListAnalysesResponse.newBuilder()
            .setNextPageToken("")
            .addAllAnalyses(Arrays.asList(responsesElement))
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListAnalysesPagedResponse pagedListResponse = client.listAnalyses(parent);

    List<Analysis> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAnalysesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAnalysesRequest actualRequest = ((ListAnalysesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAnalysesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listAnalyses(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteAnalysisTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockContactCenterInsights.addResponse(expectedResponse);

    AnalysisName name = AnalysisName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]", "[ANALYSIS]");

    client.deleteAnalysis(name);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteAnalysisRequest actualRequest = ((DeleteAnalysisRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteAnalysisExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      AnalysisName name =
          AnalysisName.of("[PROJECT]", "[LOCATION]", "[CONVERSATION]", "[ANALYSIS]");
      client.deleteAnalysis(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteAnalysisTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockContactCenterInsights.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteAnalysis(name);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteAnalysisRequest actualRequest = ((DeleteAnalysisRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteAnalysisExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String name = "name3373707";
      client.deleteAnalysis(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void exportInsightsDataTest() throws Exception {
    ExportInsightsDataResponse expectedResponse = ExportInsightsDataResponse.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("exportInsightsDataTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockContactCenterInsights.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ExportInsightsDataResponse actualResponse = client.exportInsightsDataAsync(parent).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ExportInsightsDataRequest actualRequest = ((ExportInsightsDataRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void exportInsightsDataExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.exportInsightsDataAsync(parent).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void exportInsightsDataTest2() throws Exception {
    ExportInsightsDataResponse expectedResponse = ExportInsightsDataResponse.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("exportInsightsDataTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockContactCenterInsights.addResponse(resultOperation);

    String parent = "parent-995424086";

    ExportInsightsDataResponse actualResponse = client.exportInsightsDataAsync(parent).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ExportInsightsDataRequest actualRequest = ((ExportInsightsDataRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void exportInsightsDataExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String parent = "parent-995424086";
      client.exportInsightsDataAsync(parent).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void getIssueModelTest() throws Exception {
    IssueModel expectedResponse =
        IssueModel.newBuilder()
            .setName(IssueModelName.of("[PROJECT]", "[LOCATION]", "[ISSUE_MODEL]").toString())
            .setDisplayName("displayName1714148973")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setTrainingStats(IssueModelLabelStats.newBuilder().build())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    IssueModelName name = IssueModelName.of("[PROJECT]", "[LOCATION]", "[ISSUE_MODEL]");

    IssueModel actualResponse = client.getIssueModel(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetIssueModelRequest actualRequest = ((GetIssueModelRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getIssueModelExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      IssueModelName name = IssueModelName.of("[PROJECT]", "[LOCATION]", "[ISSUE_MODEL]");
      client.getIssueModel(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getIssueModelTest2() throws Exception {
    IssueModel expectedResponse =
        IssueModel.newBuilder()
            .setName(IssueModelName.of("[PROJECT]", "[LOCATION]", "[ISSUE_MODEL]").toString())
            .setDisplayName("displayName1714148973")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setTrainingStats(IssueModelLabelStats.newBuilder().build())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    String name = "name3373707";

    IssueModel actualResponse = client.getIssueModel(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetIssueModelRequest actualRequest = ((GetIssueModelRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getIssueModelExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String name = "name3373707";
      client.getIssueModel(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listIssueModelsTest() throws Exception {
    ListIssueModelsResponse expectedResponse =
        ListIssueModelsResponse.newBuilder().addAllIssueModels(new ArrayList<IssueModel>()).build();
    mockContactCenterInsights.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListIssueModelsResponse actualResponse = client.listIssueModels(parent);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListIssueModelsRequest actualRequest = ((ListIssueModelsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listIssueModelsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listIssueModels(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listIssueModelsTest2() throws Exception {
    ListIssueModelsResponse expectedResponse =
        ListIssueModelsResponse.newBuilder().addAllIssueModels(new ArrayList<IssueModel>()).build();
    mockContactCenterInsights.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListIssueModelsResponse actualResponse = client.listIssueModels(parent);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListIssueModelsRequest actualRequest = ((ListIssueModelsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listIssueModelsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listIssueModels(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getIssueTest() throws Exception {
    Issue expectedResponse =
        Issue.newBuilder()
            .setName(IssueName.of("[PROJECT]", "[LOCATION]", "[ISSUE_MODEL]", "[ISSUE]").toString())
            .setDisplayName("displayName1714148973")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    IssueName name = IssueName.of("[PROJECT]", "[LOCATION]", "[ISSUE_MODEL]", "[ISSUE]");

    Issue actualResponse = client.getIssue(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetIssueRequest actualRequest = ((GetIssueRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getIssueExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      IssueName name = IssueName.of("[PROJECT]", "[LOCATION]", "[ISSUE_MODEL]", "[ISSUE]");
      client.getIssue(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getIssueTest2() throws Exception {
    Issue expectedResponse =
        Issue.newBuilder()
            .setName(IssueName.of("[PROJECT]", "[LOCATION]", "[ISSUE_MODEL]", "[ISSUE]").toString())
            .setDisplayName("displayName1714148973")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    String name = "name3373707";

    Issue actualResponse = client.getIssue(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetIssueRequest actualRequest = ((GetIssueRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getIssueExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String name = "name3373707";
      client.getIssue(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listIssuesTest() throws Exception {
    ListIssuesResponse expectedResponse =
        ListIssuesResponse.newBuilder().addAllIssues(new ArrayList<Issue>()).build();
    mockContactCenterInsights.addResponse(expectedResponse);

    IssueModelName parent = IssueModelName.of("[PROJECT]", "[LOCATION]", "[ISSUE_MODEL]");

    ListIssuesResponse actualResponse = client.listIssues(parent);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListIssuesRequest actualRequest = ((ListIssuesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listIssuesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      IssueModelName parent = IssueModelName.of("[PROJECT]", "[LOCATION]", "[ISSUE_MODEL]");
      client.listIssues(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listIssuesTest2() throws Exception {
    ListIssuesResponse expectedResponse =
        ListIssuesResponse.newBuilder().addAllIssues(new ArrayList<Issue>()).build();
    mockContactCenterInsights.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListIssuesResponse actualResponse = client.listIssues(parent);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListIssuesRequest actualRequest = ((ListIssuesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listIssuesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listIssues(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void calculateIssueModelStatsTest() throws Exception {
    CalculateIssueModelStatsResponse expectedResponse =
        CalculateIssueModelStatsResponse.newBuilder()
            .setCurrentStats(IssueModelLabelStats.newBuilder().build())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    IssueModelName issueModel = IssueModelName.of("[PROJECT]", "[LOCATION]", "[ISSUE_MODEL]");

    CalculateIssueModelStatsResponse actualResponse = client.calculateIssueModelStats(issueModel);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CalculateIssueModelStatsRequest actualRequest =
        ((CalculateIssueModelStatsRequest) actualRequests.get(0));

    Assert.assertEquals(issueModel.toString(), actualRequest.getIssueModel());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void calculateIssueModelStatsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      IssueModelName issueModel = IssueModelName.of("[PROJECT]", "[LOCATION]", "[ISSUE_MODEL]");
      client.calculateIssueModelStats(issueModel);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void calculateIssueModelStatsTest2() throws Exception {
    CalculateIssueModelStatsResponse expectedResponse =
        CalculateIssueModelStatsResponse.newBuilder()
            .setCurrentStats(IssueModelLabelStats.newBuilder().build())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    String issueModel = "issueModel1426588112";

    CalculateIssueModelStatsResponse actualResponse = client.calculateIssueModelStats(issueModel);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CalculateIssueModelStatsRequest actualRequest =
        ((CalculateIssueModelStatsRequest) actualRequests.get(0));

    Assert.assertEquals(issueModel, actualRequest.getIssueModel());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void calculateIssueModelStatsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String issueModel = "issueModel1426588112";
      client.calculateIssueModelStats(issueModel);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createPhraseMatcherTest() throws Exception {
    PhraseMatcher expectedResponse =
        PhraseMatcher.newBuilder()
            .setName(PhraseMatcherName.of("[PROJECT]", "[LOCATION]", "[PHRASE_MATCHER]").toString())
            .setRevisionId("revisionId-1507445162")
            .setVersionTag("versionTag-670508126")
            .setRevisionCreateTime(Timestamp.newBuilder().build())
            .setDisplayName("displayName1714148973")
            .setActive(true)
            .addAllPhraseMatchRuleGroups(new ArrayList<PhraseMatchRuleGroup>())
            .setActivationUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    PhraseMatcher phraseMatcher = PhraseMatcher.newBuilder().build();

    PhraseMatcher actualResponse = client.createPhraseMatcher(parent, phraseMatcher);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreatePhraseMatcherRequest actualRequest = ((CreatePhraseMatcherRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(phraseMatcher, actualRequest.getPhraseMatcher());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createPhraseMatcherExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      PhraseMatcher phraseMatcher = PhraseMatcher.newBuilder().build();
      client.createPhraseMatcher(parent, phraseMatcher);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createPhraseMatcherTest2() throws Exception {
    PhraseMatcher expectedResponse =
        PhraseMatcher.newBuilder()
            .setName(PhraseMatcherName.of("[PROJECT]", "[LOCATION]", "[PHRASE_MATCHER]").toString())
            .setRevisionId("revisionId-1507445162")
            .setVersionTag("versionTag-670508126")
            .setRevisionCreateTime(Timestamp.newBuilder().build())
            .setDisplayName("displayName1714148973")
            .setActive(true)
            .addAllPhraseMatchRuleGroups(new ArrayList<PhraseMatchRuleGroup>())
            .setActivationUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    String parent = "parent-995424086";
    PhraseMatcher phraseMatcher = PhraseMatcher.newBuilder().build();

    PhraseMatcher actualResponse = client.createPhraseMatcher(parent, phraseMatcher);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreatePhraseMatcherRequest actualRequest = ((CreatePhraseMatcherRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(phraseMatcher, actualRequest.getPhraseMatcher());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createPhraseMatcherExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String parent = "parent-995424086";
      PhraseMatcher phraseMatcher = PhraseMatcher.newBuilder().build();
      client.createPhraseMatcher(parent, phraseMatcher);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getPhraseMatcherTest() throws Exception {
    PhraseMatcher expectedResponse =
        PhraseMatcher.newBuilder()
            .setName(PhraseMatcherName.of("[PROJECT]", "[LOCATION]", "[PHRASE_MATCHER]").toString())
            .setRevisionId("revisionId-1507445162")
            .setVersionTag("versionTag-670508126")
            .setRevisionCreateTime(Timestamp.newBuilder().build())
            .setDisplayName("displayName1714148973")
            .setActive(true)
            .addAllPhraseMatchRuleGroups(new ArrayList<PhraseMatchRuleGroup>())
            .setActivationUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    PhraseMatcherName name = PhraseMatcherName.of("[PROJECT]", "[LOCATION]", "[PHRASE_MATCHER]");

    PhraseMatcher actualResponse = client.getPhraseMatcher(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetPhraseMatcherRequest actualRequest = ((GetPhraseMatcherRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getPhraseMatcherExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      PhraseMatcherName name = PhraseMatcherName.of("[PROJECT]", "[LOCATION]", "[PHRASE_MATCHER]");
      client.getPhraseMatcher(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getPhraseMatcherTest2() throws Exception {
    PhraseMatcher expectedResponse =
        PhraseMatcher.newBuilder()
            .setName(PhraseMatcherName.of("[PROJECT]", "[LOCATION]", "[PHRASE_MATCHER]").toString())
            .setRevisionId("revisionId-1507445162")
            .setVersionTag("versionTag-670508126")
            .setRevisionCreateTime(Timestamp.newBuilder().build())
            .setDisplayName("displayName1714148973")
            .setActive(true)
            .addAllPhraseMatchRuleGroups(new ArrayList<PhraseMatchRuleGroup>())
            .setActivationUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    String name = "name3373707";

    PhraseMatcher actualResponse = client.getPhraseMatcher(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetPhraseMatcherRequest actualRequest = ((GetPhraseMatcherRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getPhraseMatcherExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String name = "name3373707";
      client.getPhraseMatcher(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listPhraseMatchersTest() throws Exception {
    PhraseMatcher responsesElement = PhraseMatcher.newBuilder().build();
    ListPhraseMatchersResponse expectedResponse =
        ListPhraseMatchersResponse.newBuilder()
            .setNextPageToken("")
            .addAllPhraseMatchers(Arrays.asList(responsesElement))
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListPhraseMatchersPagedResponse pagedListResponse = client.listPhraseMatchers(parent);

    List<PhraseMatcher> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getPhraseMatchersList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListPhraseMatchersRequest actualRequest = ((ListPhraseMatchersRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listPhraseMatchersExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listPhraseMatchers(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listPhraseMatchersTest2() throws Exception {
    PhraseMatcher responsesElement = PhraseMatcher.newBuilder().build();
    ListPhraseMatchersResponse expectedResponse =
        ListPhraseMatchersResponse.newBuilder()
            .setNextPageToken("")
            .addAllPhraseMatchers(Arrays.asList(responsesElement))
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListPhraseMatchersPagedResponse pagedListResponse = client.listPhraseMatchers(parent);

    List<PhraseMatcher> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getPhraseMatchersList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListPhraseMatchersRequest actualRequest = ((ListPhraseMatchersRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listPhraseMatchersExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listPhraseMatchers(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deletePhraseMatcherTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockContactCenterInsights.addResponse(expectedResponse);

    PhraseMatcherName name = PhraseMatcherName.of("[PROJECT]", "[LOCATION]", "[PHRASE_MATCHER]");

    client.deletePhraseMatcher(name);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeletePhraseMatcherRequest actualRequest = ((DeletePhraseMatcherRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deletePhraseMatcherExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      PhraseMatcherName name = PhraseMatcherName.of("[PROJECT]", "[LOCATION]", "[PHRASE_MATCHER]");
      client.deletePhraseMatcher(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deletePhraseMatcherTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockContactCenterInsights.addResponse(expectedResponse);

    String name = "name3373707";

    client.deletePhraseMatcher(name);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeletePhraseMatcherRequest actualRequest = ((DeletePhraseMatcherRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deletePhraseMatcherExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String name = "name3373707";
      client.deletePhraseMatcher(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void calculateStatsTest() throws Exception {
    CalculateStatsResponse expectedResponse =
        CalculateStatsResponse.newBuilder()
            .setAverageDuration(Duration.newBuilder().build())
            .setAverageTurnCount(-1693477329)
            .setConversationCount(1994187347)
            .putAllSmartHighlighterMatches(new HashMap<String, Integer>())
            .putAllCustomHighlighterMatches(new HashMap<String, Integer>())
            .putAllIssueMatches(new HashMap<String, Integer>())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    LocationName location = LocationName.of("[PROJECT]", "[LOCATION]");

    CalculateStatsResponse actualResponse = client.calculateStats(location);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CalculateStatsRequest actualRequest = ((CalculateStatsRequest) actualRequests.get(0));

    Assert.assertEquals(location.toString(), actualRequest.getLocation());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void calculateStatsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      LocationName location = LocationName.of("[PROJECT]", "[LOCATION]");
      client.calculateStats(location);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void calculateStatsTest2() throws Exception {
    CalculateStatsResponse expectedResponse =
        CalculateStatsResponse.newBuilder()
            .setAverageDuration(Duration.newBuilder().build())
            .setAverageTurnCount(-1693477329)
            .setConversationCount(1994187347)
            .putAllSmartHighlighterMatches(new HashMap<String, Integer>())
            .putAllCustomHighlighterMatches(new HashMap<String, Integer>())
            .putAllIssueMatches(new HashMap<String, Integer>())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    String location = "location1901043637";

    CalculateStatsResponse actualResponse = client.calculateStats(location);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CalculateStatsRequest actualRequest = ((CalculateStatsRequest) actualRequests.get(0));

    Assert.assertEquals(location, actualRequest.getLocation());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void calculateStatsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String location = "location1901043637";
      client.calculateStats(location);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getSettingsTest() throws Exception {
    Settings expectedResponse =
        Settings.newBuilder()
            .setName(SettingsName.of("[PROJECT]", "[LOCATION]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLanguageCode("languageCode-2092349083")
            .setConversationTtl(Duration.newBuilder().build())
            .putAllPubsubNotificationSettings(new HashMap<String, String>())
            .setAnalysisConfig(Settings.AnalysisConfig.newBuilder().build())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    SettingsName name = SettingsName.of("[PROJECT]", "[LOCATION]");

    Settings actualResponse = client.getSettings(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSettingsRequest actualRequest = ((GetSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSettingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      SettingsName name = SettingsName.of("[PROJECT]", "[LOCATION]");
      client.getSettings(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getSettingsTest2() throws Exception {
    Settings expectedResponse =
        Settings.newBuilder()
            .setName(SettingsName.of("[PROJECT]", "[LOCATION]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLanguageCode("languageCode-2092349083")
            .setConversationTtl(Duration.newBuilder().build())
            .putAllPubsubNotificationSettings(new HashMap<String, String>())
            .setAnalysisConfig(Settings.AnalysisConfig.newBuilder().build())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    String name = "name3373707";

    Settings actualResponse = client.getSettings(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSettingsRequest actualRequest = ((GetSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSettingsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      String name = "name3373707";
      client.getSettings(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateSettingsTest() throws Exception {
    Settings expectedResponse =
        Settings.newBuilder()
            .setName(SettingsName.of("[PROJECT]", "[LOCATION]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setLanguageCode("languageCode-2092349083")
            .setConversationTtl(Duration.newBuilder().build())
            .putAllPubsubNotificationSettings(new HashMap<String, String>())
            .setAnalysisConfig(Settings.AnalysisConfig.newBuilder().build())
            .build();
    mockContactCenterInsights.addResponse(expectedResponse);

    Settings settings = Settings.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Settings actualResponse = client.updateSettings(settings, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockContactCenterInsights.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateSettingsRequest actualRequest = ((UpdateSettingsRequest) actualRequests.get(0));

    Assert.assertEquals(settings, actualRequest.getSettings());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateSettingsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockContactCenterInsights.addException(exception);

    try {
      Settings settings = Settings.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateSettings(settings, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
