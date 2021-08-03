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

package com.google.cloud.contactcenterinsights.v1.stub;

import static com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsClient.ListAnalysesPagedResponse;
import static com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsClient.ListConversationsPagedResponse;
import static com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsClient.ListPhraseMatchersPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.contactcenterinsights.v1.Analysis;
import com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsRequest;
import com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse;
import com.google.cloud.contactcenterinsights.v1.CalculateStatsRequest;
import com.google.cloud.contactcenterinsights.v1.CalculateStatsResponse;
import com.google.cloud.contactcenterinsights.v1.Conversation;
import com.google.cloud.contactcenterinsights.v1.CreateAnalysisOperationMetadata;
import com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest;
import com.google.cloud.contactcenterinsights.v1.CreateConversationRequest;
import com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest;
import com.google.cloud.contactcenterinsights.v1.DeleteAnalysisRequest;
import com.google.cloud.contactcenterinsights.v1.DeleteConversationRequest;
import com.google.cloud.contactcenterinsights.v1.DeletePhraseMatcherRequest;
import com.google.cloud.contactcenterinsights.v1.ExportInsightsDataMetadata;
import com.google.cloud.contactcenterinsights.v1.ExportInsightsDataRequest;
import com.google.cloud.contactcenterinsights.v1.ExportInsightsDataResponse;
import com.google.cloud.contactcenterinsights.v1.GetAnalysisRequest;
import com.google.cloud.contactcenterinsights.v1.GetConversationRequest;
import com.google.cloud.contactcenterinsights.v1.GetIssueModelRequest;
import com.google.cloud.contactcenterinsights.v1.GetIssueRequest;
import com.google.cloud.contactcenterinsights.v1.GetPhraseMatcherRequest;
import com.google.cloud.contactcenterinsights.v1.GetSettingsRequest;
import com.google.cloud.contactcenterinsights.v1.Issue;
import com.google.cloud.contactcenterinsights.v1.IssueModel;
import com.google.cloud.contactcenterinsights.v1.ListAnalysesRequest;
import com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse;
import com.google.cloud.contactcenterinsights.v1.ListConversationsRequest;
import com.google.cloud.contactcenterinsights.v1.ListConversationsResponse;
import com.google.cloud.contactcenterinsights.v1.ListIssueModelsRequest;
import com.google.cloud.contactcenterinsights.v1.ListIssueModelsResponse;
import com.google.cloud.contactcenterinsights.v1.ListIssuesRequest;
import com.google.cloud.contactcenterinsights.v1.ListIssuesResponse;
import com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersRequest;
import com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersResponse;
import com.google.cloud.contactcenterinsights.v1.PhraseMatcher;
import com.google.cloud.contactcenterinsights.v1.Settings;
import com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest;
import com.google.cloud.contactcenterinsights.v1.UpdateSettingsRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link ContactCenterInsightsStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li> The default service address (contactcenterinsights.googleapis.com) and default port (443)
 *       are used.
 *   <li> Credentials are acquired automatically through Application Default Credentials.
 *   <li> Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of createConversation to 30 seconds:
 *
 * <pre>{@code
 * ContactCenterInsightsStubSettings.Builder contactCenterInsightsSettingsBuilder =
 *     ContactCenterInsightsStubSettings.newBuilder();
 * contactCenterInsightsSettingsBuilder
 *     .createConversationSettings()
 *     .setRetrySettings(
 *         contactCenterInsightsSettingsBuilder
 *             .createConversationSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ContactCenterInsightsStubSettings contactCenterInsightsSettings =
 *     contactCenterInsightsSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class ContactCenterInsightsStubSettings
    extends StubSettings<ContactCenterInsightsStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<CreateConversationRequest, Conversation>
      createConversationSettings;
  private final UnaryCallSettings<UpdateConversationRequest, Conversation>
      updateConversationSettings;
  private final UnaryCallSettings<GetConversationRequest, Conversation> getConversationSettings;
  private final PagedCallSettings<
          ListConversationsRequest, ListConversationsResponse, ListConversationsPagedResponse>
      listConversationsSettings;
  private final UnaryCallSettings<DeleteConversationRequest, Empty> deleteConversationSettings;
  private final UnaryCallSettings<CreateAnalysisRequest, Operation> createAnalysisSettings;
  private final OperationCallSettings<
          CreateAnalysisRequest, Analysis, CreateAnalysisOperationMetadata>
      createAnalysisOperationSettings;
  private final UnaryCallSettings<GetAnalysisRequest, Analysis> getAnalysisSettings;
  private final PagedCallSettings<
          ListAnalysesRequest, ListAnalysesResponse, ListAnalysesPagedResponse>
      listAnalysesSettings;
  private final UnaryCallSettings<DeleteAnalysisRequest, Empty> deleteAnalysisSettings;
  private final UnaryCallSettings<ExportInsightsDataRequest, Operation> exportInsightsDataSettings;
  private final OperationCallSettings<
          ExportInsightsDataRequest, ExportInsightsDataResponse, ExportInsightsDataMetadata>
      exportInsightsDataOperationSettings;
  private final UnaryCallSettings<GetIssueModelRequest, IssueModel> getIssueModelSettings;
  private final UnaryCallSettings<ListIssueModelsRequest, ListIssueModelsResponse>
      listIssueModelsSettings;
  private final UnaryCallSettings<GetIssueRequest, Issue> getIssueSettings;
  private final UnaryCallSettings<ListIssuesRequest, ListIssuesResponse> listIssuesSettings;
  private final UnaryCallSettings<CalculateIssueModelStatsRequest, CalculateIssueModelStatsResponse>
      calculateIssueModelStatsSettings;
  private final UnaryCallSettings<CreatePhraseMatcherRequest, PhraseMatcher>
      createPhraseMatcherSettings;
  private final UnaryCallSettings<GetPhraseMatcherRequest, PhraseMatcher> getPhraseMatcherSettings;
  private final PagedCallSettings<
          ListPhraseMatchersRequest, ListPhraseMatchersResponse, ListPhraseMatchersPagedResponse>
      listPhraseMatchersSettings;
  private final UnaryCallSettings<DeletePhraseMatcherRequest, Empty> deletePhraseMatcherSettings;
  private final UnaryCallSettings<CalculateStatsRequest, CalculateStatsResponse>
      calculateStatsSettings;
  private final UnaryCallSettings<GetSettingsRequest, Settings> getSettingsSettings;
  private final UnaryCallSettings<UpdateSettingsRequest, Settings> updateSettingsSettings;

  private static final PagedListDescriptor<
          ListConversationsRequest, ListConversationsResponse, Conversation>
      LIST_CONVERSATIONS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListConversationsRequest, ListConversationsResponse, Conversation>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListConversationsRequest injectToken(
                ListConversationsRequest payload, String token) {
              return ListConversationsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListConversationsRequest injectPageSize(
                ListConversationsRequest payload, int pageSize) {
              return ListConversationsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListConversationsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListConversationsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Conversation> extractResources(ListConversationsResponse payload) {
              return payload.getConversationsList() == null
                  ? ImmutableList.<Conversation>of()
                  : payload.getConversationsList();
            }
          };

  private static final PagedListDescriptor<ListAnalysesRequest, ListAnalysesResponse, Analysis>
      LIST_ANALYSES_PAGE_STR_DESC =
          new PagedListDescriptor<ListAnalysesRequest, ListAnalysesResponse, Analysis>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListAnalysesRequest injectToken(ListAnalysesRequest payload, String token) {
              return ListAnalysesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListAnalysesRequest injectPageSize(ListAnalysesRequest payload, int pageSize) {
              return ListAnalysesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListAnalysesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListAnalysesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Analysis> extractResources(ListAnalysesResponse payload) {
              return payload.getAnalysesList() == null
                  ? ImmutableList.<Analysis>of()
                  : payload.getAnalysesList();
            }
          };

  private static final PagedListDescriptor<
          ListPhraseMatchersRequest, ListPhraseMatchersResponse, PhraseMatcher>
      LIST_PHRASE_MATCHERS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListPhraseMatchersRequest, ListPhraseMatchersResponse, PhraseMatcher>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListPhraseMatchersRequest injectToken(
                ListPhraseMatchersRequest payload, String token) {
              return ListPhraseMatchersRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListPhraseMatchersRequest injectPageSize(
                ListPhraseMatchersRequest payload, int pageSize) {
              return ListPhraseMatchersRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListPhraseMatchersRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListPhraseMatchersResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<PhraseMatcher> extractResources(ListPhraseMatchersResponse payload) {
              return payload.getPhraseMatchersList() == null
                  ? ImmutableList.<PhraseMatcher>of()
                  : payload.getPhraseMatchersList();
            }
          };

  private static final PagedListResponseFactory<
          ListConversationsRequest, ListConversationsResponse, ListConversationsPagedResponse>
      LIST_CONVERSATIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListConversationsRequest, ListConversationsResponse,
              ListConversationsPagedResponse>() {
            @Override
            public ApiFuture<ListConversationsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListConversationsRequest, ListConversationsResponse> callable,
                ListConversationsRequest request,
                ApiCallContext context,
                ApiFuture<ListConversationsResponse> futureResponse) {
              PageContext<ListConversationsRequest, ListConversationsResponse, Conversation>
                  pageContext =
                      PageContext.create(
                          callable, LIST_CONVERSATIONS_PAGE_STR_DESC, request, context);
              return ListConversationsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListAnalysesRequest, ListAnalysesResponse, ListAnalysesPagedResponse>
      LIST_ANALYSES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListAnalysesRequest, ListAnalysesResponse, ListAnalysesPagedResponse>() {
            @Override
            public ApiFuture<ListAnalysesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListAnalysesRequest, ListAnalysesResponse> callable,
                ListAnalysesRequest request,
                ApiCallContext context,
                ApiFuture<ListAnalysesResponse> futureResponse) {
              PageContext<ListAnalysesRequest, ListAnalysesResponse, Analysis> pageContext =
                  PageContext.create(callable, LIST_ANALYSES_PAGE_STR_DESC, request, context);
              return ListAnalysesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListPhraseMatchersRequest, ListPhraseMatchersResponse, ListPhraseMatchersPagedResponse>
      LIST_PHRASE_MATCHERS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListPhraseMatchersRequest, ListPhraseMatchersResponse,
              ListPhraseMatchersPagedResponse>() {
            @Override
            public ApiFuture<ListPhraseMatchersPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListPhraseMatchersRequest, ListPhraseMatchersResponse> callable,
                ListPhraseMatchersRequest request,
                ApiCallContext context,
                ApiFuture<ListPhraseMatchersResponse> futureResponse) {
              PageContext<ListPhraseMatchersRequest, ListPhraseMatchersResponse, PhraseMatcher>
                  pageContext =
                      PageContext.create(
                          callable, LIST_PHRASE_MATCHERS_PAGE_STR_DESC, request, context);
              return ListPhraseMatchersPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to createConversation. */
  public UnaryCallSettings<CreateConversationRequest, Conversation> createConversationSettings() {
    return createConversationSettings;
  }

  /** Returns the object with the settings used for calls to updateConversation. */
  public UnaryCallSettings<UpdateConversationRequest, Conversation> updateConversationSettings() {
    return updateConversationSettings;
  }

  /** Returns the object with the settings used for calls to getConversation. */
  public UnaryCallSettings<GetConversationRequest, Conversation> getConversationSettings() {
    return getConversationSettings;
  }

  /** Returns the object with the settings used for calls to listConversations. */
  public PagedCallSettings<
          ListConversationsRequest, ListConversationsResponse, ListConversationsPagedResponse>
      listConversationsSettings() {
    return listConversationsSettings;
  }

  /** Returns the object with the settings used for calls to deleteConversation. */
  public UnaryCallSettings<DeleteConversationRequest, Empty> deleteConversationSettings() {
    return deleteConversationSettings;
  }

  /** Returns the object with the settings used for calls to createAnalysis. */
  public UnaryCallSettings<CreateAnalysisRequest, Operation> createAnalysisSettings() {
    return createAnalysisSettings;
  }

  /** Returns the object with the settings used for calls to createAnalysis. */
  public OperationCallSettings<CreateAnalysisRequest, Analysis, CreateAnalysisOperationMetadata>
      createAnalysisOperationSettings() {
    return createAnalysisOperationSettings;
  }

  /** Returns the object with the settings used for calls to getAnalysis. */
  public UnaryCallSettings<GetAnalysisRequest, Analysis> getAnalysisSettings() {
    return getAnalysisSettings;
  }

  /** Returns the object with the settings used for calls to listAnalyses. */
  public PagedCallSettings<ListAnalysesRequest, ListAnalysesResponse, ListAnalysesPagedResponse>
      listAnalysesSettings() {
    return listAnalysesSettings;
  }

  /** Returns the object with the settings used for calls to deleteAnalysis. */
  public UnaryCallSettings<DeleteAnalysisRequest, Empty> deleteAnalysisSettings() {
    return deleteAnalysisSettings;
  }

  /** Returns the object with the settings used for calls to exportInsightsData. */
  public UnaryCallSettings<ExportInsightsDataRequest, Operation> exportInsightsDataSettings() {
    return exportInsightsDataSettings;
  }

  /** Returns the object with the settings used for calls to exportInsightsData. */
  public OperationCallSettings<
          ExportInsightsDataRequest, ExportInsightsDataResponse, ExportInsightsDataMetadata>
      exportInsightsDataOperationSettings() {
    return exportInsightsDataOperationSettings;
  }

  /** Returns the object with the settings used for calls to getIssueModel. */
  public UnaryCallSettings<GetIssueModelRequest, IssueModel> getIssueModelSettings() {
    return getIssueModelSettings;
  }

  /** Returns the object with the settings used for calls to listIssueModels. */
  public UnaryCallSettings<ListIssueModelsRequest, ListIssueModelsResponse>
      listIssueModelsSettings() {
    return listIssueModelsSettings;
  }

  /** Returns the object with the settings used for calls to getIssue. */
  public UnaryCallSettings<GetIssueRequest, Issue> getIssueSettings() {
    return getIssueSettings;
  }

  /** Returns the object with the settings used for calls to listIssues. */
  public UnaryCallSettings<ListIssuesRequest, ListIssuesResponse> listIssuesSettings() {
    return listIssuesSettings;
  }

  /** Returns the object with the settings used for calls to calculateIssueModelStats. */
  public UnaryCallSettings<CalculateIssueModelStatsRequest, CalculateIssueModelStatsResponse>
      calculateIssueModelStatsSettings() {
    return calculateIssueModelStatsSettings;
  }

  /** Returns the object with the settings used for calls to createPhraseMatcher. */
  public UnaryCallSettings<CreatePhraseMatcherRequest, PhraseMatcher>
      createPhraseMatcherSettings() {
    return createPhraseMatcherSettings;
  }

  /** Returns the object with the settings used for calls to getPhraseMatcher. */
  public UnaryCallSettings<GetPhraseMatcherRequest, PhraseMatcher> getPhraseMatcherSettings() {
    return getPhraseMatcherSettings;
  }

  /** Returns the object with the settings used for calls to listPhraseMatchers. */
  public PagedCallSettings<
          ListPhraseMatchersRequest, ListPhraseMatchersResponse, ListPhraseMatchersPagedResponse>
      listPhraseMatchersSettings() {
    return listPhraseMatchersSettings;
  }

  /** Returns the object with the settings used for calls to deletePhraseMatcher. */
  public UnaryCallSettings<DeletePhraseMatcherRequest, Empty> deletePhraseMatcherSettings() {
    return deletePhraseMatcherSettings;
  }

  /** Returns the object with the settings used for calls to calculateStats. */
  public UnaryCallSettings<CalculateStatsRequest, CalculateStatsResponse> calculateStatsSettings() {
    return calculateStatsSettings;
  }

  /** Returns the object with the settings used for calls to getSettings. */
  public UnaryCallSettings<GetSettingsRequest, Settings> getSettingsSettings() {
    return getSettingsSettings;
  }

  /** Returns the object with the settings used for calls to updateSettings. */
  public UnaryCallSettings<UpdateSettingsRequest, Settings> updateSettingsSettings() {
    return updateSettingsSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ContactCenterInsightsStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcContactCenterInsightsStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "contactcenterinsights.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "contactcenterinsights.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(ContactCenterInsightsStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected ContactCenterInsightsStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createConversationSettings = settingsBuilder.createConversationSettings().build();
    updateConversationSettings = settingsBuilder.updateConversationSettings().build();
    getConversationSettings = settingsBuilder.getConversationSettings().build();
    listConversationsSettings = settingsBuilder.listConversationsSettings().build();
    deleteConversationSettings = settingsBuilder.deleteConversationSettings().build();
    createAnalysisSettings = settingsBuilder.createAnalysisSettings().build();
    createAnalysisOperationSettings = settingsBuilder.createAnalysisOperationSettings().build();
    getAnalysisSettings = settingsBuilder.getAnalysisSettings().build();
    listAnalysesSettings = settingsBuilder.listAnalysesSettings().build();
    deleteAnalysisSettings = settingsBuilder.deleteAnalysisSettings().build();
    exportInsightsDataSettings = settingsBuilder.exportInsightsDataSettings().build();
    exportInsightsDataOperationSettings =
        settingsBuilder.exportInsightsDataOperationSettings().build();
    getIssueModelSettings = settingsBuilder.getIssueModelSettings().build();
    listIssueModelsSettings = settingsBuilder.listIssueModelsSettings().build();
    getIssueSettings = settingsBuilder.getIssueSettings().build();
    listIssuesSettings = settingsBuilder.listIssuesSettings().build();
    calculateIssueModelStatsSettings = settingsBuilder.calculateIssueModelStatsSettings().build();
    createPhraseMatcherSettings = settingsBuilder.createPhraseMatcherSettings().build();
    getPhraseMatcherSettings = settingsBuilder.getPhraseMatcherSettings().build();
    listPhraseMatchersSettings = settingsBuilder.listPhraseMatchersSettings().build();
    deletePhraseMatcherSettings = settingsBuilder.deletePhraseMatcherSettings().build();
    calculateStatsSettings = settingsBuilder.calculateStatsSettings().build();
    getSettingsSettings = settingsBuilder.getSettingsSettings().build();
    updateSettingsSettings = settingsBuilder.updateSettingsSettings().build();
  }

  /** Builder for ContactCenterInsightsStubSettings. */
  public static class Builder
      extends StubSettings.Builder<ContactCenterInsightsStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CreateConversationRequest, Conversation>
        createConversationSettings;
    private final UnaryCallSettings.Builder<UpdateConversationRequest, Conversation>
        updateConversationSettings;
    private final UnaryCallSettings.Builder<GetConversationRequest, Conversation>
        getConversationSettings;
    private final PagedCallSettings.Builder<
            ListConversationsRequest, ListConversationsResponse, ListConversationsPagedResponse>
        listConversationsSettings;
    private final UnaryCallSettings.Builder<DeleteConversationRequest, Empty>
        deleteConversationSettings;
    private final UnaryCallSettings.Builder<CreateAnalysisRequest, Operation>
        createAnalysisSettings;
    private final OperationCallSettings.Builder<
            CreateAnalysisRequest, Analysis, CreateAnalysisOperationMetadata>
        createAnalysisOperationSettings;
    private final UnaryCallSettings.Builder<GetAnalysisRequest, Analysis> getAnalysisSettings;
    private final PagedCallSettings.Builder<
            ListAnalysesRequest, ListAnalysesResponse, ListAnalysesPagedResponse>
        listAnalysesSettings;
    private final UnaryCallSettings.Builder<DeleteAnalysisRequest, Empty> deleteAnalysisSettings;
    private final UnaryCallSettings.Builder<ExportInsightsDataRequest, Operation>
        exportInsightsDataSettings;
    private final OperationCallSettings.Builder<
            ExportInsightsDataRequest, ExportInsightsDataResponse, ExportInsightsDataMetadata>
        exportInsightsDataOperationSettings;
    private final UnaryCallSettings.Builder<GetIssueModelRequest, IssueModel> getIssueModelSettings;
    private final UnaryCallSettings.Builder<ListIssueModelsRequest, ListIssueModelsResponse>
        listIssueModelsSettings;
    private final UnaryCallSettings.Builder<GetIssueRequest, Issue> getIssueSettings;
    private final UnaryCallSettings.Builder<ListIssuesRequest, ListIssuesResponse>
        listIssuesSettings;
    private final UnaryCallSettings.Builder<
            CalculateIssueModelStatsRequest, CalculateIssueModelStatsResponse>
        calculateIssueModelStatsSettings;
    private final UnaryCallSettings.Builder<CreatePhraseMatcherRequest, PhraseMatcher>
        createPhraseMatcherSettings;
    private final UnaryCallSettings.Builder<GetPhraseMatcherRequest, PhraseMatcher>
        getPhraseMatcherSettings;
    private final PagedCallSettings.Builder<
            ListPhraseMatchersRequest, ListPhraseMatchersResponse, ListPhraseMatchersPagedResponse>
        listPhraseMatchersSettings;
    private final UnaryCallSettings.Builder<DeletePhraseMatcherRequest, Empty>
        deletePhraseMatcherSettings;
    private final UnaryCallSettings.Builder<CalculateStatsRequest, CalculateStatsResponse>
        calculateStatsSettings;
    private final UnaryCallSettings.Builder<GetSettingsRequest, Settings> getSettingsSettings;
    private final UnaryCallSettings.Builder<UpdateSettingsRequest, Settings> updateSettingsSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(1000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(10000L))
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createConversationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateConversationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getConversationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listConversationsSettings = PagedCallSettings.newBuilder(LIST_CONVERSATIONS_PAGE_STR_FACT);
      deleteConversationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createAnalysisSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createAnalysisOperationSettings = OperationCallSettings.newBuilder();
      getAnalysisSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listAnalysesSettings = PagedCallSettings.newBuilder(LIST_ANALYSES_PAGE_STR_FACT);
      deleteAnalysisSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      exportInsightsDataSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      exportInsightsDataOperationSettings = OperationCallSettings.newBuilder();
      getIssueModelSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listIssueModelsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getIssueSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listIssuesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      calculateIssueModelStatsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createPhraseMatcherSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getPhraseMatcherSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listPhraseMatchersSettings = PagedCallSettings.newBuilder(LIST_PHRASE_MATCHERS_PAGE_STR_FACT);
      deletePhraseMatcherSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      calculateStatsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getSettingsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateSettingsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createConversationSettings,
              updateConversationSettings,
              getConversationSettings,
              listConversationsSettings,
              deleteConversationSettings,
              createAnalysisSettings,
              getAnalysisSettings,
              listAnalysesSettings,
              deleteAnalysisSettings,
              exportInsightsDataSettings,
              getIssueModelSettings,
              listIssueModelsSettings,
              getIssueSettings,
              listIssuesSettings,
              calculateIssueModelStatsSettings,
              createPhraseMatcherSettings,
              getPhraseMatcherSettings,
              listPhraseMatchersSettings,
              deletePhraseMatcherSettings,
              calculateStatsSettings,
              getSettingsSettings,
              updateSettingsSettings);
      initDefaults(this);
    }

    protected Builder(ContactCenterInsightsStubSettings settings) {
      super(settings);

      createConversationSettings = settings.createConversationSettings.toBuilder();
      updateConversationSettings = settings.updateConversationSettings.toBuilder();
      getConversationSettings = settings.getConversationSettings.toBuilder();
      listConversationsSettings = settings.listConversationsSettings.toBuilder();
      deleteConversationSettings = settings.deleteConversationSettings.toBuilder();
      createAnalysisSettings = settings.createAnalysisSettings.toBuilder();
      createAnalysisOperationSettings = settings.createAnalysisOperationSettings.toBuilder();
      getAnalysisSettings = settings.getAnalysisSettings.toBuilder();
      listAnalysesSettings = settings.listAnalysesSettings.toBuilder();
      deleteAnalysisSettings = settings.deleteAnalysisSettings.toBuilder();
      exportInsightsDataSettings = settings.exportInsightsDataSettings.toBuilder();
      exportInsightsDataOperationSettings =
          settings.exportInsightsDataOperationSettings.toBuilder();
      getIssueModelSettings = settings.getIssueModelSettings.toBuilder();
      listIssueModelsSettings = settings.listIssueModelsSettings.toBuilder();
      getIssueSettings = settings.getIssueSettings.toBuilder();
      listIssuesSettings = settings.listIssuesSettings.toBuilder();
      calculateIssueModelStatsSettings = settings.calculateIssueModelStatsSettings.toBuilder();
      createPhraseMatcherSettings = settings.createPhraseMatcherSettings.toBuilder();
      getPhraseMatcherSettings = settings.getPhraseMatcherSettings.toBuilder();
      listPhraseMatchersSettings = settings.listPhraseMatchersSettings.toBuilder();
      deletePhraseMatcherSettings = settings.deletePhraseMatcherSettings.toBuilder();
      calculateStatsSettings = settings.calculateStatsSettings.toBuilder();
      getSettingsSettings = settings.getSettingsSettings.toBuilder();
      updateSettingsSettings = settings.updateSettingsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createConversationSettings,
              updateConversationSettings,
              getConversationSettings,
              listConversationsSettings,
              deleteConversationSettings,
              createAnalysisSettings,
              getAnalysisSettings,
              listAnalysesSettings,
              deleteAnalysisSettings,
              exportInsightsDataSettings,
              getIssueModelSettings,
              listIssueModelsSettings,
              getIssueSettings,
              listIssuesSettings,
              calculateIssueModelStatsSettings,
              createPhraseMatcherSettings,
              getPhraseMatcherSettings,
              listPhraseMatchersSettings,
              deletePhraseMatcherSettings,
              calculateStatsSettings,
              getSettingsSettings,
              updateSettingsSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .createConversationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateConversationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getConversationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listConversationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteConversationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createAnalysisSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getAnalysisSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listAnalysesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteAnalysisSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .exportInsightsDataSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getIssueModelSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listIssueModelsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getIssueSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listIssuesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .calculateIssueModelStatsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createPhraseMatcherSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getPhraseMatcherSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listPhraseMatchersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deletePhraseMatcherSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .calculateStatsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getSettingsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateSettingsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createAnalysisOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateAnalysisRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Analysis.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  CreateAnalysisOperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .exportInsightsDataOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ExportInsightsDataRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  ExportInsightsDataResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  ExportInsightsDataMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to createConversation. */
    public UnaryCallSettings.Builder<CreateConversationRequest, Conversation>
        createConversationSettings() {
      return createConversationSettings;
    }

    /** Returns the builder for the settings used for calls to updateConversation. */
    public UnaryCallSettings.Builder<UpdateConversationRequest, Conversation>
        updateConversationSettings() {
      return updateConversationSettings;
    }

    /** Returns the builder for the settings used for calls to getConversation. */
    public UnaryCallSettings.Builder<GetConversationRequest, Conversation>
        getConversationSettings() {
      return getConversationSettings;
    }

    /** Returns the builder for the settings used for calls to listConversations. */
    public PagedCallSettings.Builder<
            ListConversationsRequest, ListConversationsResponse, ListConversationsPagedResponse>
        listConversationsSettings() {
      return listConversationsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteConversation. */
    public UnaryCallSettings.Builder<DeleteConversationRequest, Empty>
        deleteConversationSettings() {
      return deleteConversationSettings;
    }

    /** Returns the builder for the settings used for calls to createAnalysis. */
    public UnaryCallSettings.Builder<CreateAnalysisRequest, Operation> createAnalysisSettings() {
      return createAnalysisSettings;
    }

    /** Returns the builder for the settings used for calls to createAnalysis. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            CreateAnalysisRequest, Analysis, CreateAnalysisOperationMetadata>
        createAnalysisOperationSettings() {
      return createAnalysisOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getAnalysis. */
    public UnaryCallSettings.Builder<GetAnalysisRequest, Analysis> getAnalysisSettings() {
      return getAnalysisSettings;
    }

    /** Returns the builder for the settings used for calls to listAnalyses. */
    public PagedCallSettings.Builder<
            ListAnalysesRequest, ListAnalysesResponse, ListAnalysesPagedResponse>
        listAnalysesSettings() {
      return listAnalysesSettings;
    }

    /** Returns the builder for the settings used for calls to deleteAnalysis. */
    public UnaryCallSettings.Builder<DeleteAnalysisRequest, Empty> deleteAnalysisSettings() {
      return deleteAnalysisSettings;
    }

    /** Returns the builder for the settings used for calls to exportInsightsData. */
    public UnaryCallSettings.Builder<ExportInsightsDataRequest, Operation>
        exportInsightsDataSettings() {
      return exportInsightsDataSettings;
    }

    /** Returns the builder for the settings used for calls to exportInsightsData. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            ExportInsightsDataRequest, ExportInsightsDataResponse, ExportInsightsDataMetadata>
        exportInsightsDataOperationSettings() {
      return exportInsightsDataOperationSettings;
    }

    /** Returns the builder for the settings used for calls to getIssueModel. */
    public UnaryCallSettings.Builder<GetIssueModelRequest, IssueModel> getIssueModelSettings() {
      return getIssueModelSettings;
    }

    /** Returns the builder for the settings used for calls to listIssueModels. */
    public UnaryCallSettings.Builder<ListIssueModelsRequest, ListIssueModelsResponse>
        listIssueModelsSettings() {
      return listIssueModelsSettings;
    }

    /** Returns the builder for the settings used for calls to getIssue. */
    public UnaryCallSettings.Builder<GetIssueRequest, Issue> getIssueSettings() {
      return getIssueSettings;
    }

    /** Returns the builder for the settings used for calls to listIssues. */
    public UnaryCallSettings.Builder<ListIssuesRequest, ListIssuesResponse> listIssuesSettings() {
      return listIssuesSettings;
    }

    /** Returns the builder for the settings used for calls to calculateIssueModelStats. */
    public UnaryCallSettings.Builder<
            CalculateIssueModelStatsRequest, CalculateIssueModelStatsResponse>
        calculateIssueModelStatsSettings() {
      return calculateIssueModelStatsSettings;
    }

    /** Returns the builder for the settings used for calls to createPhraseMatcher. */
    public UnaryCallSettings.Builder<CreatePhraseMatcherRequest, PhraseMatcher>
        createPhraseMatcherSettings() {
      return createPhraseMatcherSettings;
    }

    /** Returns the builder for the settings used for calls to getPhraseMatcher. */
    public UnaryCallSettings.Builder<GetPhraseMatcherRequest, PhraseMatcher>
        getPhraseMatcherSettings() {
      return getPhraseMatcherSettings;
    }

    /** Returns the builder for the settings used for calls to listPhraseMatchers. */
    public PagedCallSettings.Builder<
            ListPhraseMatchersRequest, ListPhraseMatchersResponse, ListPhraseMatchersPagedResponse>
        listPhraseMatchersSettings() {
      return listPhraseMatchersSettings;
    }

    /** Returns the builder for the settings used for calls to deletePhraseMatcher. */
    public UnaryCallSettings.Builder<DeletePhraseMatcherRequest, Empty>
        deletePhraseMatcherSettings() {
      return deletePhraseMatcherSettings;
    }

    /** Returns the builder for the settings used for calls to calculateStats. */
    public UnaryCallSettings.Builder<CalculateStatsRequest, CalculateStatsResponse>
        calculateStatsSettings() {
      return calculateStatsSettings;
    }

    /** Returns the builder for the settings used for calls to getSettings. */
    public UnaryCallSettings.Builder<GetSettingsRequest, Settings> getSettingsSettings() {
      return getSettingsSettings;
    }

    /** Returns the builder for the settings used for calls to updateSettings. */
    public UnaryCallSettings.Builder<UpdateSettingsRequest, Settings> updateSettingsSettings() {
      return updateSettingsSettings;
    }

    @Override
    public ContactCenterInsightsStubSettings build() throws IOException {
      return new ContactCenterInsightsStubSettings(this);
    }
  }
}
