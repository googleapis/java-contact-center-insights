// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 * <pre>
 * The data for a matched phrase matcher.
 * Represents information identifying a phrase matcher for a given match.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.PhraseMatchData}
 */
public final class PhraseMatchData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.PhraseMatchData)
    PhraseMatchDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PhraseMatchData.newBuilder() to construct.
  private PhraseMatchData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PhraseMatchData() {
    phraseMatcher_ = "";
    displayName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PhraseMatchData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PhraseMatchData(
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

            phraseMatcher_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            displayName_ = s;
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
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_PhraseMatchData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_PhraseMatchData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.PhraseMatchData.class, com.google.cloud.contactcenterinsights.v1.PhraseMatchData.Builder.class);
  }

  public static final int PHRASE_MATCHER_FIELD_NUMBER = 1;
  private volatile java.lang.Object phraseMatcher_;
  /**
   * <pre>
   * The unique identifier (the resource name) of the phrase matcher.
   * </pre>
   *
   * <code>string phrase_matcher = 1;</code>
   * @return The phraseMatcher.
   */
  @java.lang.Override
  public java.lang.String getPhraseMatcher() {
    java.lang.Object ref = phraseMatcher_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      phraseMatcher_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The unique identifier (the resource name) of the phrase matcher.
   * </pre>
   *
   * <code>string phrase_matcher = 1;</code>
   * @return The bytes for phraseMatcher.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPhraseMatcherBytes() {
    java.lang.Object ref = phraseMatcher_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      phraseMatcher_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object displayName_;
  /**
   * <pre>
   * The human-readable name of the phrase matcher.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  @java.lang.Override
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The human-readable name of the phrase matcher.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(phraseMatcher_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, phraseMatcher_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, displayName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(phraseMatcher_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, phraseMatcher_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, displayName_);
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.PhraseMatchData)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.PhraseMatchData other = (com.google.cloud.contactcenterinsights.v1.PhraseMatchData) obj;

    if (!getPhraseMatcher()
        .equals(other.getPhraseMatcher())) return false;
    if (!getDisplayName()
        .equals(other.getDisplayName())) return false;
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
    hash = (37 * hash) + PHRASE_MATCHER_FIELD_NUMBER;
    hash = (53 * hash) + getPhraseMatcher().hashCode();
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchData parseFrom(
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
  public static Builder newBuilder(com.google.cloud.contactcenterinsights.v1.PhraseMatchData prototype) {
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
   * The data for a matched phrase matcher.
   * Represents information identifying a phrase matcher for a given match.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.PhraseMatchData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.PhraseMatchData)
      com.google.cloud.contactcenterinsights.v1.PhraseMatchDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_PhraseMatchData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_PhraseMatchData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.PhraseMatchData.class, com.google.cloud.contactcenterinsights.v1.PhraseMatchData.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.PhraseMatchData.newBuilder()
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
      phraseMatcher_ = "";

      displayName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_PhraseMatchData_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.PhraseMatchData getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.PhraseMatchData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.PhraseMatchData build() {
      com.google.cloud.contactcenterinsights.v1.PhraseMatchData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.PhraseMatchData buildPartial() {
      com.google.cloud.contactcenterinsights.v1.PhraseMatchData result = new com.google.cloud.contactcenterinsights.v1.PhraseMatchData(this);
      result.phraseMatcher_ = phraseMatcher_;
      result.displayName_ = displayName_;
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
      if (other instanceof com.google.cloud.contactcenterinsights.v1.PhraseMatchData) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.PhraseMatchData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.PhraseMatchData other) {
      if (other == com.google.cloud.contactcenterinsights.v1.PhraseMatchData.getDefaultInstance()) return this;
      if (!other.getPhraseMatcher().isEmpty()) {
        phraseMatcher_ = other.phraseMatcher_;
        onChanged();
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        onChanged();
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
      com.google.cloud.contactcenterinsights.v1.PhraseMatchData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.contactcenterinsights.v1.PhraseMatchData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object phraseMatcher_ = "";
    /**
     * <pre>
     * The unique identifier (the resource name) of the phrase matcher.
     * </pre>
     *
     * <code>string phrase_matcher = 1;</code>
     * @return The phraseMatcher.
     */
    public java.lang.String getPhraseMatcher() {
      java.lang.Object ref = phraseMatcher_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phraseMatcher_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The unique identifier (the resource name) of the phrase matcher.
     * </pre>
     *
     * <code>string phrase_matcher = 1;</code>
     * @return The bytes for phraseMatcher.
     */
    public com.google.protobuf.ByteString
        getPhraseMatcherBytes() {
      java.lang.Object ref = phraseMatcher_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phraseMatcher_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The unique identifier (the resource name) of the phrase matcher.
     * </pre>
     *
     * <code>string phrase_matcher = 1;</code>
     * @param value The phraseMatcher to set.
     * @return This builder for chaining.
     */
    public Builder setPhraseMatcher(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      phraseMatcher_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique identifier (the resource name) of the phrase matcher.
     * </pre>
     *
     * <code>string phrase_matcher = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPhraseMatcher() {
      
      phraseMatcher_ = getDefaultInstance().getPhraseMatcher();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique identifier (the resource name) of the phrase matcher.
     * </pre>
     *
     * <code>string phrase_matcher = 1;</code>
     * @param value The bytes for phraseMatcher to set.
     * @return This builder for chaining.
     */
    public Builder setPhraseMatcherBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      phraseMatcher_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     * <pre>
     * The human-readable name of the phrase matcher.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @return The displayName.
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The human-readable name of the phrase matcher.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @return The bytes for displayName.
     */
    public com.google.protobuf.ByteString
        getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The human-readable name of the phrase matcher.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      displayName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The human-readable name of the phrase matcher.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {
      
      displayName_ = getDefaultInstance().getDisplayName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The human-readable name of the phrase matcher.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      displayName_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.PhraseMatchData)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.PhraseMatchData)
  private static final com.google.cloud.contactcenterinsights.v1.PhraseMatchData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.PhraseMatchData();
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PhraseMatchData>
      PARSER = new com.google.protobuf.AbstractParser<PhraseMatchData>() {
    @java.lang.Override
    public PhraseMatchData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PhraseMatchData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PhraseMatchData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PhraseMatchData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.PhraseMatchData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
