package com.google.cloud.contactcenterinsights.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * An API that lets users analyze and explore their business conversation data.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto")
public final class ContactCenterInsightsGrpc {

  private ContactCenterInsightsGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.contactcenterinsights.v1.ContactCenterInsights";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.CreateConversationRequest,
      com.google.cloud.contactcenterinsights.v1.Conversation> getCreateConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateConversation",
      requestType = com.google.cloud.contactcenterinsights.v1.CreateConversationRequest.class,
      responseType = com.google.cloud.contactcenterinsights.v1.Conversation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.CreateConversationRequest,
      com.google.cloud.contactcenterinsights.v1.Conversation> getCreateConversationMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.CreateConversationRequest, com.google.cloud.contactcenterinsights.v1.Conversation> getCreateConversationMethod;
    if ((getCreateConversationMethod = ContactCenterInsightsGrpc.getCreateConversationMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getCreateConversationMethod = ContactCenterInsightsGrpc.getCreateConversationMethod) == null) {
          ContactCenterInsightsGrpc.getCreateConversationMethod = getCreateConversationMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.CreateConversationRequest, com.google.cloud.contactcenterinsights.v1.Conversation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateConversation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.CreateConversationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.Conversation.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("CreateConversation"))
              .build();
        }
      }
    }
    return getCreateConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest,
      com.google.cloud.contactcenterinsights.v1.Conversation> getUpdateConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateConversation",
      requestType = com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest.class,
      responseType = com.google.cloud.contactcenterinsights.v1.Conversation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest,
      com.google.cloud.contactcenterinsights.v1.Conversation> getUpdateConversationMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest, com.google.cloud.contactcenterinsights.v1.Conversation> getUpdateConversationMethod;
    if ((getUpdateConversationMethod = ContactCenterInsightsGrpc.getUpdateConversationMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getUpdateConversationMethod = ContactCenterInsightsGrpc.getUpdateConversationMethod) == null) {
          ContactCenterInsightsGrpc.getUpdateConversationMethod = getUpdateConversationMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest, com.google.cloud.contactcenterinsights.v1.Conversation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateConversation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.Conversation.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("UpdateConversation"))
              .build();
        }
      }
    }
    return getUpdateConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.GetConversationRequest,
      com.google.cloud.contactcenterinsights.v1.Conversation> getGetConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConversation",
      requestType = com.google.cloud.contactcenterinsights.v1.GetConversationRequest.class,
      responseType = com.google.cloud.contactcenterinsights.v1.Conversation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.GetConversationRequest,
      com.google.cloud.contactcenterinsights.v1.Conversation> getGetConversationMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.GetConversationRequest, com.google.cloud.contactcenterinsights.v1.Conversation> getGetConversationMethod;
    if ((getGetConversationMethod = ContactCenterInsightsGrpc.getGetConversationMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getGetConversationMethod = ContactCenterInsightsGrpc.getGetConversationMethod) == null) {
          ContactCenterInsightsGrpc.getGetConversationMethod = getGetConversationMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.GetConversationRequest, com.google.cloud.contactcenterinsights.v1.Conversation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConversation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.GetConversationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.Conversation.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("GetConversation"))
              .build();
        }
      }
    }
    return getGetConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.ListConversationsRequest,
      com.google.cloud.contactcenterinsights.v1.ListConversationsResponse> getListConversationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListConversations",
      requestType = com.google.cloud.contactcenterinsights.v1.ListConversationsRequest.class,
      responseType = com.google.cloud.contactcenterinsights.v1.ListConversationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.ListConversationsRequest,
      com.google.cloud.contactcenterinsights.v1.ListConversationsResponse> getListConversationsMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.ListConversationsRequest, com.google.cloud.contactcenterinsights.v1.ListConversationsResponse> getListConversationsMethod;
    if ((getListConversationsMethod = ContactCenterInsightsGrpc.getListConversationsMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getListConversationsMethod = ContactCenterInsightsGrpc.getListConversationsMethod) == null) {
          ContactCenterInsightsGrpc.getListConversationsMethod = getListConversationsMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.ListConversationsRequest, com.google.cloud.contactcenterinsights.v1.ListConversationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListConversations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.ListConversationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.ListConversationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("ListConversations"))
              .build();
        }
      }
    }
    return getListConversationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.DeleteConversationRequest,
      com.google.protobuf.Empty> getDeleteConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteConversation",
      requestType = com.google.cloud.contactcenterinsights.v1.DeleteConversationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.DeleteConversationRequest,
      com.google.protobuf.Empty> getDeleteConversationMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.DeleteConversationRequest, com.google.protobuf.Empty> getDeleteConversationMethod;
    if ((getDeleteConversationMethod = ContactCenterInsightsGrpc.getDeleteConversationMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getDeleteConversationMethod = ContactCenterInsightsGrpc.getDeleteConversationMethod) == null) {
          ContactCenterInsightsGrpc.getDeleteConversationMethod = getDeleteConversationMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.DeleteConversationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteConversation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.DeleteConversationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("DeleteConversation"))
              .build();
        }
      }
    }
    return getDeleteConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest,
      com.google.longrunning.Operation> getCreateAnalysisMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAnalysis",
      requestType = com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest,
      com.google.longrunning.Operation> getCreateAnalysisMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest, com.google.longrunning.Operation> getCreateAnalysisMethod;
    if ((getCreateAnalysisMethod = ContactCenterInsightsGrpc.getCreateAnalysisMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getCreateAnalysisMethod = ContactCenterInsightsGrpc.getCreateAnalysisMethod) == null) {
          ContactCenterInsightsGrpc.getCreateAnalysisMethod = getCreateAnalysisMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAnalysis"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("CreateAnalysis"))
              .build();
        }
      }
    }
    return getCreateAnalysisMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.GetAnalysisRequest,
      com.google.cloud.contactcenterinsights.v1.Analysis> getGetAnalysisMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnalysis",
      requestType = com.google.cloud.contactcenterinsights.v1.GetAnalysisRequest.class,
      responseType = com.google.cloud.contactcenterinsights.v1.Analysis.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.GetAnalysisRequest,
      com.google.cloud.contactcenterinsights.v1.Analysis> getGetAnalysisMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.GetAnalysisRequest, com.google.cloud.contactcenterinsights.v1.Analysis> getGetAnalysisMethod;
    if ((getGetAnalysisMethod = ContactCenterInsightsGrpc.getGetAnalysisMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getGetAnalysisMethod = ContactCenterInsightsGrpc.getGetAnalysisMethod) == null) {
          ContactCenterInsightsGrpc.getGetAnalysisMethod = getGetAnalysisMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.GetAnalysisRequest, com.google.cloud.contactcenterinsights.v1.Analysis>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnalysis"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.GetAnalysisRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.Analysis.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("GetAnalysis"))
              .build();
        }
      }
    }
    return getGetAnalysisMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.ListAnalysesRequest,
      com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse> getListAnalysesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAnalyses",
      requestType = com.google.cloud.contactcenterinsights.v1.ListAnalysesRequest.class,
      responseType = com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.ListAnalysesRequest,
      com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse> getListAnalysesMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.ListAnalysesRequest, com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse> getListAnalysesMethod;
    if ((getListAnalysesMethod = ContactCenterInsightsGrpc.getListAnalysesMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getListAnalysesMethod = ContactCenterInsightsGrpc.getListAnalysesMethod) == null) {
          ContactCenterInsightsGrpc.getListAnalysesMethod = getListAnalysesMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.ListAnalysesRequest, com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAnalyses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.ListAnalysesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("ListAnalyses"))
              .build();
        }
      }
    }
    return getListAnalysesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.DeleteAnalysisRequest,
      com.google.protobuf.Empty> getDeleteAnalysisMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAnalysis",
      requestType = com.google.cloud.contactcenterinsights.v1.DeleteAnalysisRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.DeleteAnalysisRequest,
      com.google.protobuf.Empty> getDeleteAnalysisMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.DeleteAnalysisRequest, com.google.protobuf.Empty> getDeleteAnalysisMethod;
    if ((getDeleteAnalysisMethod = ContactCenterInsightsGrpc.getDeleteAnalysisMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getDeleteAnalysisMethod = ContactCenterInsightsGrpc.getDeleteAnalysisMethod) == null) {
          ContactCenterInsightsGrpc.getDeleteAnalysisMethod = getDeleteAnalysisMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.DeleteAnalysisRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAnalysis"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.DeleteAnalysisRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("DeleteAnalysis"))
              .build();
        }
      }
    }
    return getDeleteAnalysisMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.ExportInsightsDataRequest,
      com.google.longrunning.Operation> getExportInsightsDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportInsightsData",
      requestType = com.google.cloud.contactcenterinsights.v1.ExportInsightsDataRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.ExportInsightsDataRequest,
      com.google.longrunning.Operation> getExportInsightsDataMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.ExportInsightsDataRequest, com.google.longrunning.Operation> getExportInsightsDataMethod;
    if ((getExportInsightsDataMethod = ContactCenterInsightsGrpc.getExportInsightsDataMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getExportInsightsDataMethod = ContactCenterInsightsGrpc.getExportInsightsDataMethod) == null) {
          ContactCenterInsightsGrpc.getExportInsightsDataMethod = getExportInsightsDataMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.ExportInsightsDataRequest, com.google.longrunning.Operation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportInsightsData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.ExportInsightsDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.longrunning.Operation.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("ExportInsightsData"))
              .build();
        }
      }
    }
    return getExportInsightsDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.GetIssueModelRequest,
      com.google.cloud.contactcenterinsights.v1.IssueModel> getGetIssueModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIssueModel",
      requestType = com.google.cloud.contactcenterinsights.v1.GetIssueModelRequest.class,
      responseType = com.google.cloud.contactcenterinsights.v1.IssueModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.GetIssueModelRequest,
      com.google.cloud.contactcenterinsights.v1.IssueModel> getGetIssueModelMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.GetIssueModelRequest, com.google.cloud.contactcenterinsights.v1.IssueModel> getGetIssueModelMethod;
    if ((getGetIssueModelMethod = ContactCenterInsightsGrpc.getGetIssueModelMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getGetIssueModelMethod = ContactCenterInsightsGrpc.getGetIssueModelMethod) == null) {
          ContactCenterInsightsGrpc.getGetIssueModelMethod = getGetIssueModelMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.GetIssueModelRequest, com.google.cloud.contactcenterinsights.v1.IssueModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIssueModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.GetIssueModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.IssueModel.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("GetIssueModel"))
              .build();
        }
      }
    }
    return getGetIssueModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.ListIssueModelsRequest,
      com.google.cloud.contactcenterinsights.v1.ListIssueModelsResponse> getListIssueModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIssueModels",
      requestType = com.google.cloud.contactcenterinsights.v1.ListIssueModelsRequest.class,
      responseType = com.google.cloud.contactcenterinsights.v1.ListIssueModelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.ListIssueModelsRequest,
      com.google.cloud.contactcenterinsights.v1.ListIssueModelsResponse> getListIssueModelsMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.ListIssueModelsRequest, com.google.cloud.contactcenterinsights.v1.ListIssueModelsResponse> getListIssueModelsMethod;
    if ((getListIssueModelsMethod = ContactCenterInsightsGrpc.getListIssueModelsMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getListIssueModelsMethod = ContactCenterInsightsGrpc.getListIssueModelsMethod) == null) {
          ContactCenterInsightsGrpc.getListIssueModelsMethod = getListIssueModelsMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.ListIssueModelsRequest, com.google.cloud.contactcenterinsights.v1.ListIssueModelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListIssueModels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.ListIssueModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.ListIssueModelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("ListIssueModels"))
              .build();
        }
      }
    }
    return getListIssueModelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.GetIssueRequest,
      com.google.cloud.contactcenterinsights.v1.Issue> getGetIssueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIssue",
      requestType = com.google.cloud.contactcenterinsights.v1.GetIssueRequest.class,
      responseType = com.google.cloud.contactcenterinsights.v1.Issue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.GetIssueRequest,
      com.google.cloud.contactcenterinsights.v1.Issue> getGetIssueMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.GetIssueRequest, com.google.cloud.contactcenterinsights.v1.Issue> getGetIssueMethod;
    if ((getGetIssueMethod = ContactCenterInsightsGrpc.getGetIssueMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getGetIssueMethod = ContactCenterInsightsGrpc.getGetIssueMethod) == null) {
          ContactCenterInsightsGrpc.getGetIssueMethod = getGetIssueMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.GetIssueRequest, com.google.cloud.contactcenterinsights.v1.Issue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIssue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.GetIssueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.Issue.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("GetIssue"))
              .build();
        }
      }
    }
    return getGetIssueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.ListIssuesRequest,
      com.google.cloud.contactcenterinsights.v1.ListIssuesResponse> getListIssuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIssues",
      requestType = com.google.cloud.contactcenterinsights.v1.ListIssuesRequest.class,
      responseType = com.google.cloud.contactcenterinsights.v1.ListIssuesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.ListIssuesRequest,
      com.google.cloud.contactcenterinsights.v1.ListIssuesResponse> getListIssuesMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.ListIssuesRequest, com.google.cloud.contactcenterinsights.v1.ListIssuesResponse> getListIssuesMethod;
    if ((getListIssuesMethod = ContactCenterInsightsGrpc.getListIssuesMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getListIssuesMethod = ContactCenterInsightsGrpc.getListIssuesMethod) == null) {
          ContactCenterInsightsGrpc.getListIssuesMethod = getListIssuesMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.ListIssuesRequest, com.google.cloud.contactcenterinsights.v1.ListIssuesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListIssues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.ListIssuesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.ListIssuesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("ListIssues"))
              .build();
        }
      }
    }
    return getListIssuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsRequest,
      com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse> getCalculateIssueModelStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateIssueModelStats",
      requestType = com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsRequest.class,
      responseType = com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsRequest,
      com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse> getCalculateIssueModelStatsMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsRequest, com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse> getCalculateIssueModelStatsMethod;
    if ((getCalculateIssueModelStatsMethod = ContactCenterInsightsGrpc.getCalculateIssueModelStatsMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getCalculateIssueModelStatsMethod = ContactCenterInsightsGrpc.getCalculateIssueModelStatsMethod) == null) {
          ContactCenterInsightsGrpc.getCalculateIssueModelStatsMethod = getCalculateIssueModelStatsMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsRequest, com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateIssueModelStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("CalculateIssueModelStats"))
              .build();
        }
      }
    }
    return getCalculateIssueModelStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest,
      com.google.cloud.contactcenterinsights.v1.PhraseMatcher> getCreatePhraseMatcherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePhraseMatcher",
      requestType = com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest.class,
      responseType = com.google.cloud.contactcenterinsights.v1.PhraseMatcher.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest,
      com.google.cloud.contactcenterinsights.v1.PhraseMatcher> getCreatePhraseMatcherMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest, com.google.cloud.contactcenterinsights.v1.PhraseMatcher> getCreatePhraseMatcherMethod;
    if ((getCreatePhraseMatcherMethod = ContactCenterInsightsGrpc.getCreatePhraseMatcherMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getCreatePhraseMatcherMethod = ContactCenterInsightsGrpc.getCreatePhraseMatcherMethod) == null) {
          ContactCenterInsightsGrpc.getCreatePhraseMatcherMethod = getCreatePhraseMatcherMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest, com.google.cloud.contactcenterinsights.v1.PhraseMatcher>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePhraseMatcher"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.PhraseMatcher.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("CreatePhraseMatcher"))
              .build();
        }
      }
    }
    return getCreatePhraseMatcherMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.GetPhraseMatcherRequest,
      com.google.cloud.contactcenterinsights.v1.PhraseMatcher> getGetPhraseMatcherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPhraseMatcher",
      requestType = com.google.cloud.contactcenterinsights.v1.GetPhraseMatcherRequest.class,
      responseType = com.google.cloud.contactcenterinsights.v1.PhraseMatcher.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.GetPhraseMatcherRequest,
      com.google.cloud.contactcenterinsights.v1.PhraseMatcher> getGetPhraseMatcherMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.GetPhraseMatcherRequest, com.google.cloud.contactcenterinsights.v1.PhraseMatcher> getGetPhraseMatcherMethod;
    if ((getGetPhraseMatcherMethod = ContactCenterInsightsGrpc.getGetPhraseMatcherMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getGetPhraseMatcherMethod = ContactCenterInsightsGrpc.getGetPhraseMatcherMethod) == null) {
          ContactCenterInsightsGrpc.getGetPhraseMatcherMethod = getGetPhraseMatcherMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.GetPhraseMatcherRequest, com.google.cloud.contactcenterinsights.v1.PhraseMatcher>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPhraseMatcher"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.GetPhraseMatcherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.PhraseMatcher.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("GetPhraseMatcher"))
              .build();
        }
      }
    }
    return getGetPhraseMatcherMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersRequest,
      com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersResponse> getListPhraseMatchersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPhraseMatchers",
      requestType = com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersRequest.class,
      responseType = com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersRequest,
      com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersResponse> getListPhraseMatchersMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersRequest, com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersResponse> getListPhraseMatchersMethod;
    if ((getListPhraseMatchersMethod = ContactCenterInsightsGrpc.getListPhraseMatchersMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getListPhraseMatchersMethod = ContactCenterInsightsGrpc.getListPhraseMatchersMethod) == null) {
          ContactCenterInsightsGrpc.getListPhraseMatchersMethod = getListPhraseMatchersMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersRequest, com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPhraseMatchers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("ListPhraseMatchers"))
              .build();
        }
      }
    }
    return getListPhraseMatchersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.DeletePhraseMatcherRequest,
      com.google.protobuf.Empty> getDeletePhraseMatcherMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePhraseMatcher",
      requestType = com.google.cloud.contactcenterinsights.v1.DeletePhraseMatcherRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.DeletePhraseMatcherRequest,
      com.google.protobuf.Empty> getDeletePhraseMatcherMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.DeletePhraseMatcherRequest, com.google.protobuf.Empty> getDeletePhraseMatcherMethod;
    if ((getDeletePhraseMatcherMethod = ContactCenterInsightsGrpc.getDeletePhraseMatcherMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getDeletePhraseMatcherMethod = ContactCenterInsightsGrpc.getDeletePhraseMatcherMethod) == null) {
          ContactCenterInsightsGrpc.getDeletePhraseMatcherMethod = getDeletePhraseMatcherMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.DeletePhraseMatcherRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePhraseMatcher"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.DeletePhraseMatcherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("DeletePhraseMatcher"))
              .build();
        }
      }
    }
    return getDeletePhraseMatcherMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.CalculateStatsRequest,
      com.google.cloud.contactcenterinsights.v1.CalculateStatsResponse> getCalculateStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateStats",
      requestType = com.google.cloud.contactcenterinsights.v1.CalculateStatsRequest.class,
      responseType = com.google.cloud.contactcenterinsights.v1.CalculateStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.CalculateStatsRequest,
      com.google.cloud.contactcenterinsights.v1.CalculateStatsResponse> getCalculateStatsMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.CalculateStatsRequest, com.google.cloud.contactcenterinsights.v1.CalculateStatsResponse> getCalculateStatsMethod;
    if ((getCalculateStatsMethod = ContactCenterInsightsGrpc.getCalculateStatsMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getCalculateStatsMethod = ContactCenterInsightsGrpc.getCalculateStatsMethod) == null) {
          ContactCenterInsightsGrpc.getCalculateStatsMethod = getCalculateStatsMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.CalculateStatsRequest, com.google.cloud.contactcenterinsights.v1.CalculateStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.CalculateStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.CalculateStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("CalculateStats"))
              .build();
        }
      }
    }
    return getCalculateStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.GetSettingsRequest,
      com.google.cloud.contactcenterinsights.v1.Settings> getGetSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSettings",
      requestType = com.google.cloud.contactcenterinsights.v1.GetSettingsRequest.class,
      responseType = com.google.cloud.contactcenterinsights.v1.Settings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.GetSettingsRequest,
      com.google.cloud.contactcenterinsights.v1.Settings> getGetSettingsMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.GetSettingsRequest, com.google.cloud.contactcenterinsights.v1.Settings> getGetSettingsMethod;
    if ((getGetSettingsMethod = ContactCenterInsightsGrpc.getGetSettingsMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getGetSettingsMethod = ContactCenterInsightsGrpc.getGetSettingsMethod) == null) {
          ContactCenterInsightsGrpc.getGetSettingsMethod = getGetSettingsMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.GetSettingsRequest, com.google.cloud.contactcenterinsights.v1.Settings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.GetSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.Settings.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("GetSettings"))
              .build();
        }
      }
    }
    return getGetSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.UpdateSettingsRequest,
      com.google.cloud.contactcenterinsights.v1.Settings> getUpdateSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSettings",
      requestType = com.google.cloud.contactcenterinsights.v1.UpdateSettingsRequest.class,
      responseType = com.google.cloud.contactcenterinsights.v1.Settings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.UpdateSettingsRequest,
      com.google.cloud.contactcenterinsights.v1.Settings> getUpdateSettingsMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.contactcenterinsights.v1.UpdateSettingsRequest, com.google.cloud.contactcenterinsights.v1.Settings> getUpdateSettingsMethod;
    if ((getUpdateSettingsMethod = ContactCenterInsightsGrpc.getUpdateSettingsMethod) == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        if ((getUpdateSettingsMethod = ContactCenterInsightsGrpc.getUpdateSettingsMethod) == null) {
          ContactCenterInsightsGrpc.getUpdateSettingsMethod = getUpdateSettingsMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.contactcenterinsights.v1.UpdateSettingsRequest, com.google.cloud.contactcenterinsights.v1.Settings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.UpdateSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.contactcenterinsights.v1.Settings.getDefaultInstance()))
              .setSchemaDescriptor(new ContactCenterInsightsMethodDescriptorSupplier("UpdateSettings"))
              .build();
        }
      }
    }
    return getUpdateSettingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContactCenterInsightsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContactCenterInsightsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContactCenterInsightsStub>() {
        @java.lang.Override
        public ContactCenterInsightsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContactCenterInsightsStub(channel, callOptions);
        }
      };
    return ContactCenterInsightsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContactCenterInsightsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContactCenterInsightsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContactCenterInsightsBlockingStub>() {
        @java.lang.Override
        public ContactCenterInsightsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContactCenterInsightsBlockingStub(channel, callOptions);
        }
      };
    return ContactCenterInsightsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContactCenterInsightsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContactCenterInsightsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContactCenterInsightsFutureStub>() {
        @java.lang.Override
        public ContactCenterInsightsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContactCenterInsightsFutureStub(channel, callOptions);
        }
      };
    return ContactCenterInsightsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * An API that lets users analyze and explore their business conversation data.
   * </pre>
   */
  public static abstract class ContactCenterInsightsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates a conversation.
     * </pre>
     */
    public void createConversation(com.google.cloud.contactcenterinsights.v1.CreateConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Conversation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateConversationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a conversation.
     * </pre>
     */
    public void updateConversation(com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Conversation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateConversationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a conversation.
     * </pre>
     */
    public void getConversation(com.google.cloud.contactcenterinsights.v1.GetConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Conversation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConversationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists conversations.
     * </pre>
     */
    public void listConversations(com.google.cloud.contactcenterinsights.v1.ListConversationsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.ListConversationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListConversationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a conversation.
     * </pre>
     */
    public void deleteConversation(com.google.cloud.contactcenterinsights.v1.DeleteConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteConversationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an analysis. The long running operation is done when the analysis
     * has completed.
     * </pre>
     */
    public void createAnalysis(com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAnalysisMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets an analysis.
     * </pre>
     */
    public void getAnalysis(com.google.cloud.contactcenterinsights.v1.GetAnalysisRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Analysis> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnalysisMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists analyses.
     * </pre>
     */
    public void listAnalyses(com.google.cloud.contactcenterinsights.v1.ListAnalysesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAnalysesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an analysis.
     * </pre>
     */
    public void deleteAnalysis(com.google.cloud.contactcenterinsights.v1.DeleteAnalysisRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAnalysisMethod(), responseObserver);
    }

    /**
     * <pre>
     * Export insights data to a destination defined in the request body.
     * </pre>
     */
    public void exportInsightsData(com.google.cloud.contactcenterinsights.v1.ExportInsightsDataRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExportInsightsDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets an issue model.
     * </pre>
     */
    public void getIssueModel(com.google.cloud.contactcenterinsights.v1.GetIssueModelRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.IssueModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIssueModelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists issue models.
     * </pre>
     */
    public void listIssueModels(com.google.cloud.contactcenterinsights.v1.ListIssueModelsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.ListIssueModelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListIssueModelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets an issue.
     * </pre>
     */
    public void getIssue(com.google.cloud.contactcenterinsights.v1.GetIssueRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Issue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIssueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists issues.
     * </pre>
     */
    public void listIssues(com.google.cloud.contactcenterinsights.v1.ListIssuesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.ListIssuesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListIssuesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets an issue model's statistics.
     * </pre>
     */
    public void calculateIssueModelStats(com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateIssueModelStatsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a phrase matcher.
     * </pre>
     */
    public void createPhraseMatcher(com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.PhraseMatcher> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePhraseMatcherMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a phrase matcher.
     * </pre>
     */
    public void getPhraseMatcher(com.google.cloud.contactcenterinsights.v1.GetPhraseMatcherRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.PhraseMatcher> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPhraseMatcherMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists phrase matchers.
     * </pre>
     */
    public void listPhraseMatchers(com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPhraseMatchersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a phrase matcher.
     * </pre>
     */
    public void deletePhraseMatcher(com.google.cloud.contactcenterinsights.v1.DeletePhraseMatcherRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePhraseMatcherMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets conversation statistics.
     * </pre>
     */
    public void calculateStats(com.google.cloud.contactcenterinsights.v1.CalculateStatsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.CalculateStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateStatsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets project-level settings.
     * </pre>
     */
    public void getSettings(com.google.cloud.contactcenterinsights.v1.GetSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Settings> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates project-level settings.
     * </pre>
     */
    public void updateSettings(com.google.cloud.contactcenterinsights.v1.UpdateSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Settings> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSettingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateConversationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.CreateConversationRequest,
                com.google.cloud.contactcenterinsights.v1.Conversation>(
                  this, METHODID_CREATE_CONVERSATION)))
          .addMethod(
            getUpdateConversationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest,
                com.google.cloud.contactcenterinsights.v1.Conversation>(
                  this, METHODID_UPDATE_CONVERSATION)))
          .addMethod(
            getGetConversationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.GetConversationRequest,
                com.google.cloud.contactcenterinsights.v1.Conversation>(
                  this, METHODID_GET_CONVERSATION)))
          .addMethod(
            getListConversationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.ListConversationsRequest,
                com.google.cloud.contactcenterinsights.v1.ListConversationsResponse>(
                  this, METHODID_LIST_CONVERSATIONS)))
          .addMethod(
            getDeleteConversationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.DeleteConversationRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_CONVERSATION)))
          .addMethod(
            getCreateAnalysisMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_CREATE_ANALYSIS)))
          .addMethod(
            getGetAnalysisMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.GetAnalysisRequest,
                com.google.cloud.contactcenterinsights.v1.Analysis>(
                  this, METHODID_GET_ANALYSIS)))
          .addMethod(
            getListAnalysesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.ListAnalysesRequest,
                com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse>(
                  this, METHODID_LIST_ANALYSES)))
          .addMethod(
            getDeleteAnalysisMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.DeleteAnalysisRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ANALYSIS)))
          .addMethod(
            getExportInsightsDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.ExportInsightsDataRequest,
                com.google.longrunning.Operation>(
                  this, METHODID_EXPORT_INSIGHTS_DATA)))
          .addMethod(
            getGetIssueModelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.GetIssueModelRequest,
                com.google.cloud.contactcenterinsights.v1.IssueModel>(
                  this, METHODID_GET_ISSUE_MODEL)))
          .addMethod(
            getListIssueModelsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.ListIssueModelsRequest,
                com.google.cloud.contactcenterinsights.v1.ListIssueModelsResponse>(
                  this, METHODID_LIST_ISSUE_MODELS)))
          .addMethod(
            getGetIssueMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.GetIssueRequest,
                com.google.cloud.contactcenterinsights.v1.Issue>(
                  this, METHODID_GET_ISSUE)))
          .addMethod(
            getListIssuesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.ListIssuesRequest,
                com.google.cloud.contactcenterinsights.v1.ListIssuesResponse>(
                  this, METHODID_LIST_ISSUES)))
          .addMethod(
            getCalculateIssueModelStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsRequest,
                com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse>(
                  this, METHODID_CALCULATE_ISSUE_MODEL_STATS)))
          .addMethod(
            getCreatePhraseMatcherMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest,
                com.google.cloud.contactcenterinsights.v1.PhraseMatcher>(
                  this, METHODID_CREATE_PHRASE_MATCHER)))
          .addMethod(
            getGetPhraseMatcherMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.GetPhraseMatcherRequest,
                com.google.cloud.contactcenterinsights.v1.PhraseMatcher>(
                  this, METHODID_GET_PHRASE_MATCHER)))
          .addMethod(
            getListPhraseMatchersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersRequest,
                com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersResponse>(
                  this, METHODID_LIST_PHRASE_MATCHERS)))
          .addMethod(
            getDeletePhraseMatcherMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.DeletePhraseMatcherRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_PHRASE_MATCHER)))
          .addMethod(
            getCalculateStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.CalculateStatsRequest,
                com.google.cloud.contactcenterinsights.v1.CalculateStatsResponse>(
                  this, METHODID_CALCULATE_STATS)))
          .addMethod(
            getGetSettingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.GetSettingsRequest,
                com.google.cloud.contactcenterinsights.v1.Settings>(
                  this, METHODID_GET_SETTINGS)))
          .addMethod(
            getUpdateSettingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.cloud.contactcenterinsights.v1.UpdateSettingsRequest,
                com.google.cloud.contactcenterinsights.v1.Settings>(
                  this, METHODID_UPDATE_SETTINGS)))
          .build();
    }
  }

  /**
   * <pre>
   * An API that lets users analyze and explore their business conversation data.
   * </pre>
   */
  public static final class ContactCenterInsightsStub extends io.grpc.stub.AbstractAsyncStub<ContactCenterInsightsStub> {
    private ContactCenterInsightsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactCenterInsightsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContactCenterInsightsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a conversation.
     * </pre>
     */
    public void createConversation(com.google.cloud.contactcenterinsights.v1.CreateConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Conversation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateConversationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a conversation.
     * </pre>
     */
    public void updateConversation(com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Conversation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateConversationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a conversation.
     * </pre>
     */
    public void getConversation(com.google.cloud.contactcenterinsights.v1.GetConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Conversation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConversationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists conversations.
     * </pre>
     */
    public void listConversations(com.google.cloud.contactcenterinsights.v1.ListConversationsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.ListConversationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListConversationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a conversation.
     * </pre>
     */
    public void deleteConversation(com.google.cloud.contactcenterinsights.v1.DeleteConversationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteConversationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an analysis. The long running operation is done when the analysis
     * has completed.
     * </pre>
     */
    public void createAnalysis(com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAnalysisMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an analysis.
     * </pre>
     */
    public void getAnalysis(com.google.cloud.contactcenterinsights.v1.GetAnalysisRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Analysis> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnalysisMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists analyses.
     * </pre>
     */
    public void listAnalyses(com.google.cloud.contactcenterinsights.v1.ListAnalysesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAnalysesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an analysis.
     * </pre>
     */
    public void deleteAnalysis(com.google.cloud.contactcenterinsights.v1.DeleteAnalysisRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAnalysisMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Export insights data to a destination defined in the request body.
     * </pre>
     */
    public void exportInsightsData(com.google.cloud.contactcenterinsights.v1.ExportInsightsDataRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExportInsightsDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an issue model.
     * </pre>
     */
    public void getIssueModel(com.google.cloud.contactcenterinsights.v1.GetIssueModelRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.IssueModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIssueModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists issue models.
     * </pre>
     */
    public void listIssueModels(com.google.cloud.contactcenterinsights.v1.ListIssueModelsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.ListIssueModelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListIssueModelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an issue.
     * </pre>
     */
    public void getIssue(com.google.cloud.contactcenterinsights.v1.GetIssueRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Issue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIssueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists issues.
     * </pre>
     */
    public void listIssues(com.google.cloud.contactcenterinsights.v1.ListIssuesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.ListIssuesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListIssuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an issue model's statistics.
     * </pre>
     */
    public void calculateIssueModelStats(com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateIssueModelStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a phrase matcher.
     * </pre>
     */
    public void createPhraseMatcher(com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.PhraseMatcher> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePhraseMatcherMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a phrase matcher.
     * </pre>
     */
    public void getPhraseMatcher(com.google.cloud.contactcenterinsights.v1.GetPhraseMatcherRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.PhraseMatcher> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPhraseMatcherMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists phrase matchers.
     * </pre>
     */
    public void listPhraseMatchers(com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPhraseMatchersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a phrase matcher.
     * </pre>
     */
    public void deletePhraseMatcher(com.google.cloud.contactcenterinsights.v1.DeletePhraseMatcherRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePhraseMatcherMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets conversation statistics.
     * </pre>
     */
    public void calculateStats(com.google.cloud.contactcenterinsights.v1.CalculateStatsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.CalculateStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets project-level settings.
     * </pre>
     */
    public void getSettings(com.google.cloud.contactcenterinsights.v1.GetSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Settings> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates project-level settings.
     * </pre>
     */
    public void updateSettings(com.google.cloud.contactcenterinsights.v1.UpdateSettingsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Settings> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSettingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * An API that lets users analyze and explore their business conversation data.
   * </pre>
   */
  public static final class ContactCenterInsightsBlockingStub extends io.grpc.stub.AbstractBlockingStub<ContactCenterInsightsBlockingStub> {
    private ContactCenterInsightsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactCenterInsightsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContactCenterInsightsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a conversation.
     * </pre>
     */
    public com.google.cloud.contactcenterinsights.v1.Conversation createConversation(com.google.cloud.contactcenterinsights.v1.CreateConversationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateConversationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a conversation.
     * </pre>
     */
    public com.google.cloud.contactcenterinsights.v1.Conversation updateConversation(com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateConversationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a conversation.
     * </pre>
     */
    public com.google.cloud.contactcenterinsights.v1.Conversation getConversation(com.google.cloud.contactcenterinsights.v1.GetConversationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConversationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists conversations.
     * </pre>
     */
    public com.google.cloud.contactcenterinsights.v1.ListConversationsResponse listConversations(com.google.cloud.contactcenterinsights.v1.ListConversationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListConversationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a conversation.
     * </pre>
     */
    public com.google.protobuf.Empty deleteConversation(com.google.cloud.contactcenterinsights.v1.DeleteConversationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteConversationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an analysis. The long running operation is done when the analysis
     * has completed.
     * </pre>
     */
    public com.google.longrunning.Operation createAnalysis(com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAnalysisMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an analysis.
     * </pre>
     */
    public com.google.cloud.contactcenterinsights.v1.Analysis getAnalysis(com.google.cloud.contactcenterinsights.v1.GetAnalysisRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnalysisMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists analyses.
     * </pre>
     */
    public com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse listAnalyses(com.google.cloud.contactcenterinsights.v1.ListAnalysesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAnalysesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an analysis.
     * </pre>
     */
    public com.google.protobuf.Empty deleteAnalysis(com.google.cloud.contactcenterinsights.v1.DeleteAnalysisRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAnalysisMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Export insights data to a destination defined in the request body.
     * </pre>
     */
    public com.google.longrunning.Operation exportInsightsData(com.google.cloud.contactcenterinsights.v1.ExportInsightsDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExportInsightsDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an issue model.
     * </pre>
     */
    public com.google.cloud.contactcenterinsights.v1.IssueModel getIssueModel(com.google.cloud.contactcenterinsights.v1.GetIssueModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIssueModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists issue models.
     * </pre>
     */
    public com.google.cloud.contactcenterinsights.v1.ListIssueModelsResponse listIssueModels(com.google.cloud.contactcenterinsights.v1.ListIssueModelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListIssueModelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an issue.
     * </pre>
     */
    public com.google.cloud.contactcenterinsights.v1.Issue getIssue(com.google.cloud.contactcenterinsights.v1.GetIssueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIssueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists issues.
     * </pre>
     */
    public com.google.cloud.contactcenterinsights.v1.ListIssuesResponse listIssues(com.google.cloud.contactcenterinsights.v1.ListIssuesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListIssuesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an issue model's statistics.
     * </pre>
     */
    public com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse calculateIssueModelStats(com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateIssueModelStatsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a phrase matcher.
     * </pre>
     */
    public com.google.cloud.contactcenterinsights.v1.PhraseMatcher createPhraseMatcher(com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePhraseMatcherMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a phrase matcher.
     * </pre>
     */
    public com.google.cloud.contactcenterinsights.v1.PhraseMatcher getPhraseMatcher(com.google.cloud.contactcenterinsights.v1.GetPhraseMatcherRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPhraseMatcherMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists phrase matchers.
     * </pre>
     */
    public com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersResponse listPhraseMatchers(com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPhraseMatchersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a phrase matcher.
     * </pre>
     */
    public com.google.protobuf.Empty deletePhraseMatcher(com.google.cloud.contactcenterinsights.v1.DeletePhraseMatcherRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePhraseMatcherMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets conversation statistics.
     * </pre>
     */
    public com.google.cloud.contactcenterinsights.v1.CalculateStatsResponse calculateStats(com.google.cloud.contactcenterinsights.v1.CalculateStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateStatsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets project-level settings.
     * </pre>
     */
    public com.google.cloud.contactcenterinsights.v1.Settings getSettings(com.google.cloud.contactcenterinsights.v1.GetSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates project-level settings.
     * </pre>
     */
    public com.google.cloud.contactcenterinsights.v1.Settings updateSettings(com.google.cloud.contactcenterinsights.v1.UpdateSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSettingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * An API that lets users analyze and explore their business conversation data.
   * </pre>
   */
  public static final class ContactCenterInsightsFutureStub extends io.grpc.stub.AbstractFutureStub<ContactCenterInsightsFutureStub> {
    private ContactCenterInsightsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactCenterInsightsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContactCenterInsightsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a conversation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.contactcenterinsights.v1.Conversation> createConversation(
        com.google.cloud.contactcenterinsights.v1.CreateConversationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateConversationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a conversation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.contactcenterinsights.v1.Conversation> updateConversation(
        com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateConversationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a conversation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.contactcenterinsights.v1.Conversation> getConversation(
        com.google.cloud.contactcenterinsights.v1.GetConversationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConversationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists conversations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.contactcenterinsights.v1.ListConversationsResponse> listConversations(
        com.google.cloud.contactcenterinsights.v1.ListConversationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListConversationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a conversation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteConversation(
        com.google.cloud.contactcenterinsights.v1.DeleteConversationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteConversationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an analysis. The long running operation is done when the analysis
     * has completed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> createAnalysis(
        com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAnalysisMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an analysis.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.contactcenterinsights.v1.Analysis> getAnalysis(
        com.google.cloud.contactcenterinsights.v1.GetAnalysisRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnalysisMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists analyses.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse> listAnalyses(
        com.google.cloud.contactcenterinsights.v1.ListAnalysesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAnalysesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an analysis.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAnalysis(
        com.google.cloud.contactcenterinsights.v1.DeleteAnalysisRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAnalysisMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Export insights data to a destination defined in the request body.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation> exportInsightsData(
        com.google.cloud.contactcenterinsights.v1.ExportInsightsDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExportInsightsDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an issue model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.contactcenterinsights.v1.IssueModel> getIssueModel(
        com.google.cloud.contactcenterinsights.v1.GetIssueModelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIssueModelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists issue models.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.contactcenterinsights.v1.ListIssueModelsResponse> listIssueModels(
        com.google.cloud.contactcenterinsights.v1.ListIssueModelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListIssueModelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an issue.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.contactcenterinsights.v1.Issue> getIssue(
        com.google.cloud.contactcenterinsights.v1.GetIssueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIssueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists issues.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.contactcenterinsights.v1.ListIssuesResponse> listIssues(
        com.google.cloud.contactcenterinsights.v1.ListIssuesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListIssuesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an issue model's statistics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse> calculateIssueModelStats(
        com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateIssueModelStatsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a phrase matcher.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.contactcenterinsights.v1.PhraseMatcher> createPhraseMatcher(
        com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePhraseMatcherMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a phrase matcher.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.contactcenterinsights.v1.PhraseMatcher> getPhraseMatcher(
        com.google.cloud.contactcenterinsights.v1.GetPhraseMatcherRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPhraseMatcherMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists phrase matchers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersResponse> listPhraseMatchers(
        com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPhraseMatchersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a phrase matcher.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deletePhraseMatcher(
        com.google.cloud.contactcenterinsights.v1.DeletePhraseMatcherRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePhraseMatcherMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets conversation statistics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.contactcenterinsights.v1.CalculateStatsResponse> calculateStats(
        com.google.cloud.contactcenterinsights.v1.CalculateStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateStatsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets project-level settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.contactcenterinsights.v1.Settings> getSettings(
        com.google.cloud.contactcenterinsights.v1.GetSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates project-level settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.contactcenterinsights.v1.Settings> updateSettings(
        com.google.cloud.contactcenterinsights.v1.UpdateSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSettingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CONVERSATION = 0;
  private static final int METHODID_UPDATE_CONVERSATION = 1;
  private static final int METHODID_GET_CONVERSATION = 2;
  private static final int METHODID_LIST_CONVERSATIONS = 3;
  private static final int METHODID_DELETE_CONVERSATION = 4;
  private static final int METHODID_CREATE_ANALYSIS = 5;
  private static final int METHODID_GET_ANALYSIS = 6;
  private static final int METHODID_LIST_ANALYSES = 7;
  private static final int METHODID_DELETE_ANALYSIS = 8;
  private static final int METHODID_EXPORT_INSIGHTS_DATA = 9;
  private static final int METHODID_GET_ISSUE_MODEL = 10;
  private static final int METHODID_LIST_ISSUE_MODELS = 11;
  private static final int METHODID_GET_ISSUE = 12;
  private static final int METHODID_LIST_ISSUES = 13;
  private static final int METHODID_CALCULATE_ISSUE_MODEL_STATS = 14;
  private static final int METHODID_CREATE_PHRASE_MATCHER = 15;
  private static final int METHODID_GET_PHRASE_MATCHER = 16;
  private static final int METHODID_LIST_PHRASE_MATCHERS = 17;
  private static final int METHODID_DELETE_PHRASE_MATCHER = 18;
  private static final int METHODID_CALCULATE_STATS = 19;
  private static final int METHODID_GET_SETTINGS = 20;
  private static final int METHODID_UPDATE_SETTINGS = 21;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ContactCenterInsightsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ContactCenterInsightsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CONVERSATION:
          serviceImpl.createConversation((com.google.cloud.contactcenterinsights.v1.CreateConversationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Conversation>) responseObserver);
          break;
        case METHODID_UPDATE_CONVERSATION:
          serviceImpl.updateConversation((com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Conversation>) responseObserver);
          break;
        case METHODID_GET_CONVERSATION:
          serviceImpl.getConversation((com.google.cloud.contactcenterinsights.v1.GetConversationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Conversation>) responseObserver);
          break;
        case METHODID_LIST_CONVERSATIONS:
          serviceImpl.listConversations((com.google.cloud.contactcenterinsights.v1.ListConversationsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.ListConversationsResponse>) responseObserver);
          break;
        case METHODID_DELETE_CONVERSATION:
          serviceImpl.deleteConversation((com.google.cloud.contactcenterinsights.v1.DeleteConversationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_ANALYSIS:
          serviceImpl.createAnalysis((com.google.cloud.contactcenterinsights.v1.CreateAnalysisRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_ANALYSIS:
          serviceImpl.getAnalysis((com.google.cloud.contactcenterinsights.v1.GetAnalysisRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Analysis>) responseObserver);
          break;
        case METHODID_LIST_ANALYSES:
          serviceImpl.listAnalyses((com.google.cloud.contactcenterinsights.v1.ListAnalysesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.ListAnalysesResponse>) responseObserver);
          break;
        case METHODID_DELETE_ANALYSIS:
          serviceImpl.deleteAnalysis((com.google.cloud.contactcenterinsights.v1.DeleteAnalysisRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_EXPORT_INSIGHTS_DATA:
          serviceImpl.exportInsightsData((com.google.cloud.contactcenterinsights.v1.ExportInsightsDataRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_ISSUE_MODEL:
          serviceImpl.getIssueModel((com.google.cloud.contactcenterinsights.v1.GetIssueModelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.IssueModel>) responseObserver);
          break;
        case METHODID_LIST_ISSUE_MODELS:
          serviceImpl.listIssueModels((com.google.cloud.contactcenterinsights.v1.ListIssueModelsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.ListIssueModelsResponse>) responseObserver);
          break;
        case METHODID_GET_ISSUE:
          serviceImpl.getIssue((com.google.cloud.contactcenterinsights.v1.GetIssueRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Issue>) responseObserver);
          break;
        case METHODID_LIST_ISSUES:
          serviceImpl.listIssues((com.google.cloud.contactcenterinsights.v1.ListIssuesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.ListIssuesResponse>) responseObserver);
          break;
        case METHODID_CALCULATE_ISSUE_MODEL_STATS:
          serviceImpl.calculateIssueModelStats((com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse>) responseObserver);
          break;
        case METHODID_CREATE_PHRASE_MATCHER:
          serviceImpl.createPhraseMatcher((com.google.cloud.contactcenterinsights.v1.CreatePhraseMatcherRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.PhraseMatcher>) responseObserver);
          break;
        case METHODID_GET_PHRASE_MATCHER:
          serviceImpl.getPhraseMatcher((com.google.cloud.contactcenterinsights.v1.GetPhraseMatcherRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.PhraseMatcher>) responseObserver);
          break;
        case METHODID_LIST_PHRASE_MATCHERS:
          serviceImpl.listPhraseMatchers((com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.ListPhraseMatchersResponse>) responseObserver);
          break;
        case METHODID_DELETE_PHRASE_MATCHER:
          serviceImpl.deletePhraseMatcher((com.google.cloud.contactcenterinsights.v1.DeletePhraseMatcherRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CALCULATE_STATS:
          serviceImpl.calculateStats((com.google.cloud.contactcenterinsights.v1.CalculateStatsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.CalculateStatsResponse>) responseObserver);
          break;
        case METHODID_GET_SETTINGS:
          serviceImpl.getSettings((com.google.cloud.contactcenterinsights.v1.GetSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Settings>) responseObserver);
          break;
        case METHODID_UPDATE_SETTINGS:
          serviceImpl.updateSettings((com.google.cloud.contactcenterinsights.v1.UpdateSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.contactcenterinsights.v1.Settings>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ContactCenterInsightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContactCenterInsightsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContactCenterInsights");
    }
  }

  private static final class ContactCenterInsightsFileDescriptorSupplier
      extends ContactCenterInsightsBaseDescriptorSupplier {
    ContactCenterInsightsFileDescriptorSupplier() {}
  }

  private static final class ContactCenterInsightsMethodDescriptorSupplier
      extends ContactCenterInsightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ContactCenterInsightsMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ContactCenterInsightsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContactCenterInsightsFileDescriptorSupplier())
              .addMethod(getCreateConversationMethod())
              .addMethod(getUpdateConversationMethod())
              .addMethod(getGetConversationMethod())
              .addMethod(getListConversationsMethod())
              .addMethod(getDeleteConversationMethod())
              .addMethod(getCreateAnalysisMethod())
              .addMethod(getGetAnalysisMethod())
              .addMethod(getListAnalysesMethod())
              .addMethod(getDeleteAnalysisMethod())
              .addMethod(getExportInsightsDataMethod())
              .addMethod(getGetIssueModelMethod())
              .addMethod(getListIssueModelsMethod())
              .addMethod(getGetIssueMethod())
              .addMethod(getListIssuesMethod())
              .addMethod(getCalculateIssueModelStatsMethod())
              .addMethod(getCreatePhraseMatcherMethod())
              .addMethod(getGetPhraseMatcherMethod())
              .addMethod(getListPhraseMatchersMethod())
              .addMethod(getDeletePhraseMatcherMethod())
              .addMethod(getCalculateStatsMethod())
              .addMethod(getGetSettingsMethod())
              .addMethod(getUpdateSettingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
