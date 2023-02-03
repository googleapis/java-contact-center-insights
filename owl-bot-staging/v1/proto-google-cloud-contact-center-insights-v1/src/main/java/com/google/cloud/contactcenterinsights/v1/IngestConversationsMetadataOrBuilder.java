// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

package com.google.cloud.contactcenterinsights.v1;

public interface IngestConversationsMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.IngestConversationsMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * Output only. The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * Output only. The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * Output only. The original request for ingest.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IngestConversationsRequest request = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   * <pre>
   * Output only. The original request for ingest.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IngestConversationsRequest request = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The request.
   */
  com.google.cloud.contactcenterinsights.v1.IngestConversationsRequest getRequest();
  /**
   * <pre>
   * Output only. The original request for ingest.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IngestConversationsRequest request = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.contactcenterinsights.v1.IngestConversationsRequestOrBuilder getRequestOrBuilder();

  /**
   * <pre>
   * Output only. Partial errors during ingest operation that might cause the
   * operation output to be incomplete.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_errors = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.rpc.Status> 
      getPartialErrorsList();
  /**
   * <pre>
   * Output only. Partial errors during ingest operation that might cause the
   * operation output to be incomplete.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_errors = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.Status getPartialErrors(int index);
  /**
   * <pre>
   * Output only. Partial errors during ingest operation that might cause the
   * operation output to be incomplete.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_errors = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getPartialErrorsCount();
  /**
   * <pre>
   * Output only. Partial errors during ingest operation that might cause the
   * operation output to be incomplete.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_errors = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> 
      getPartialErrorsOrBuilderList();
  /**
   * <pre>
   * Output only. Partial errors during ingest operation that might cause the
   * operation output to be incomplete.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_errors = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getPartialErrorsOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Statistics for IngestConversations operation.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IngestConversationsMetadata.IngestConversationsStats ingest_conversations_stats = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the ingestConversationsStats field is set.
   */
  boolean hasIngestConversationsStats();
  /**
   * <pre>
   * Output only. Statistics for IngestConversations operation.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IngestConversationsMetadata.IngestConversationsStats ingest_conversations_stats = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The ingestConversationsStats.
   */
  com.google.cloud.contactcenterinsights.v1.IngestConversationsMetadata.IngestConversationsStats getIngestConversationsStats();
  /**
   * <pre>
   * Output only. Statistics for IngestConversations operation.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IngestConversationsMetadata.IngestConversationsStats ingest_conversations_stats = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.contactcenterinsights.v1.IngestConversationsMetadata.IngestConversationsStatsOrBuilder getIngestConversationsStatsOrBuilder();
}
