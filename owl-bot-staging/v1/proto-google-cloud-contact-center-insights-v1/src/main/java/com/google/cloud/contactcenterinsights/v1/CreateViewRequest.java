// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 * <pre>
 * The request to create a view.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.CreateViewRequest}
 */
public final class CreateViewRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.CreateViewRequest)
    CreateViewRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateViewRequest.newBuilder() to construct.
  private CreateViewRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateViewRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateViewRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateViewRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            com.google.cloud.contactcenterinsights.v1.View.Builder subBuilder = null;
            if (view_ != null) {
              subBuilder = view_.toBuilder();
            }
            view_ = input.readMessage(com.google.cloud.contactcenterinsights.v1.View.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(view_);
              view_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_CreateViewRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_CreateViewRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.CreateViewRequest.class, com.google.cloud.contactcenterinsights.v1.CreateViewRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The parent resource of the view. Required. The location to create
   * a view for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;` or
   * `projects/&lt;Project Number&gt;/locations/&lt;Location ID&gt;`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The parent resource of the view. Required. The location to create
   * a view for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;` or
   * `projects/&lt;Project Number&gt;/locations/&lt;Location ID&gt;`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VIEW_FIELD_NUMBER = 2;
  private com.google.cloud.contactcenterinsights.v1.View view_;
  /**
   * <pre>
   * Required. The view resource to create.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.View view = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the view field is set.
   */
  @java.lang.Override
  public boolean hasView() {
    return view_ != null;
  }
  /**
   * <pre>
   * Required. The view resource to create.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.View view = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The view.
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.View getView() {
    return view_ == null ? com.google.cloud.contactcenterinsights.v1.View.getDefaultInstance() : view_;
  }
  /**
   * <pre>
   * Required. The view resource to create.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.View view = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.ViewOrBuilder getViewOrBuilder() {
    return getView();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (view_ != null) {
      output.writeMessage(2, getView());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (view_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getView());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.CreateViewRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.CreateViewRequest other = (com.google.cloud.contactcenterinsights.v1.CreateViewRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasView() != other.hasView()) return false;
    if (hasView()) {
      if (!getView()
          .equals(other.getView())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasView()) {
      hash = (37 * hash) + VIEW_FIELD_NUMBER;
      hash = (53 * hash) + getView().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.CreateViewRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateViewRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateViewRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateViewRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateViewRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateViewRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateViewRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateViewRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateViewRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateViewRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateViewRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.CreateViewRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.contactcenterinsights.v1.CreateViewRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The request to create a view.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.CreateViewRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.CreateViewRequest)
      com.google.cloud.contactcenterinsights.v1.CreateViewRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_CreateViewRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_CreateViewRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.CreateViewRequest.class, com.google.cloud.contactcenterinsights.v1.CreateViewRequest.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.CreateViewRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (viewBuilder_ == null) {
        view_ = null;
      } else {
        view_ = null;
        viewBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_CreateViewRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.CreateViewRequest getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.CreateViewRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.CreateViewRequest build() {
      com.google.cloud.contactcenterinsights.v1.CreateViewRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.CreateViewRequest buildPartial() {
      com.google.cloud.contactcenterinsights.v1.CreateViewRequest result = new com.google.cloud.contactcenterinsights.v1.CreateViewRequest(this);
      result.parent_ = parent_;
      if (viewBuilder_ == null) {
        result.view_ = view_;
      } else {
        result.view_ = viewBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.contactcenterinsights.v1.CreateViewRequest) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.CreateViewRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.CreateViewRequest other) {
      if (other == com.google.cloud.contactcenterinsights.v1.CreateViewRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasView()) {
        mergeView(other.getView());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.contactcenterinsights.v1.CreateViewRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.contactcenterinsights.v1.CreateViewRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The parent resource of the view. Required. The location to create
     * a view for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;` or
     * `projects/&lt;Project Number&gt;/locations/&lt;Location ID&gt;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent resource of the view. Required. The location to create
     * a view for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;` or
     * `projects/&lt;Project Number&gt;/locations/&lt;Location ID&gt;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The parent resource of the view. Required. The location to create
     * a view for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;` or
     * `projects/&lt;Project Number&gt;/locations/&lt;Location ID&gt;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource of the view. Required. The location to create
     * a view for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;` or
     * `projects/&lt;Project Number&gt;/locations/&lt;Location ID&gt;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The parent resource of the view. Required. The location to create
     * a view for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;` or
     * `projects/&lt;Project Number&gt;/locations/&lt;Location ID&gt;`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.contactcenterinsights.v1.View view_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.contactcenterinsights.v1.View, com.google.cloud.contactcenterinsights.v1.View.Builder, com.google.cloud.contactcenterinsights.v1.ViewOrBuilder> viewBuilder_;
    /**
     * <pre>
     * Required. The view resource to create.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.View view = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the view field is set.
     */
    public boolean hasView() {
      return viewBuilder_ != null || view_ != null;
    }
    /**
     * <pre>
     * Required. The view resource to create.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.View view = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The view.
     */
    public com.google.cloud.contactcenterinsights.v1.View getView() {
      if (viewBuilder_ == null) {
        return view_ == null ? com.google.cloud.contactcenterinsights.v1.View.getDefaultInstance() : view_;
      } else {
        return viewBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The view resource to create.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.View view = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setView(com.google.cloud.contactcenterinsights.v1.View value) {
      if (viewBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        view_ = value;
        onChanged();
      } else {
        viewBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The view resource to create.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.View view = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setView(
        com.google.cloud.contactcenterinsights.v1.View.Builder builderForValue) {
      if (viewBuilder_ == null) {
        view_ = builderForValue.build();
        onChanged();
      } else {
        viewBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The view resource to create.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.View view = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeView(com.google.cloud.contactcenterinsights.v1.View value) {
      if (viewBuilder_ == null) {
        if (view_ != null) {
          view_ =
            com.google.cloud.contactcenterinsights.v1.View.newBuilder(view_).mergeFrom(value).buildPartial();
        } else {
          view_ = value;
        }
        onChanged();
      } else {
        viewBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The view resource to create.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.View view = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearView() {
      if (viewBuilder_ == null) {
        view_ = null;
        onChanged();
      } else {
        view_ = null;
        viewBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The view resource to create.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.View view = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.contactcenterinsights.v1.View.Builder getViewBuilder() {
      
      onChanged();
      return getViewFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The view resource to create.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.View view = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.contactcenterinsights.v1.ViewOrBuilder getViewOrBuilder() {
      if (viewBuilder_ != null) {
        return viewBuilder_.getMessageOrBuilder();
      } else {
        return view_ == null ?
            com.google.cloud.contactcenterinsights.v1.View.getDefaultInstance() : view_;
      }
    }
    /**
     * <pre>
     * Required. The view resource to create.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.View view = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.contactcenterinsights.v1.View, com.google.cloud.contactcenterinsights.v1.View.Builder, com.google.cloud.contactcenterinsights.v1.ViewOrBuilder> 
        getViewFieldBuilder() {
      if (viewBuilder_ == null) {
        viewBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.View, com.google.cloud.contactcenterinsights.v1.View.Builder, com.google.cloud.contactcenterinsights.v1.ViewOrBuilder>(
                getView(),
                getParentForChildren(),
                isClean());
        view_ = null;
      }
      return viewBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.CreateViewRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.CreateViewRequest)
  private static final com.google.cloud.contactcenterinsights.v1.CreateViewRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.CreateViewRequest();
  }

  public static com.google.cloud.contactcenterinsights.v1.CreateViewRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateViewRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateViewRequest>() {
    @java.lang.Override
    public CreateViewRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateViewRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateViewRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateViewRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.CreateViewRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

