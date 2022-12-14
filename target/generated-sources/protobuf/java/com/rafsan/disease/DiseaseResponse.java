// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: disease.proto

package com.rafsan.disease;

/**
 * Protobuf type {@code com.rafsan.disease.DiseaseResponse}
 */
public final class DiseaseResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.rafsan.disease.DiseaseResponse)
    DiseaseResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DiseaseResponse.newBuilder() to construct.
  private DiseaseResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DiseaseResponse() {
    disease_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DiseaseResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DiseaseResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              disease_ = new java.util.ArrayList<com.rafsan.disease.Disease>();
              mutable_bitField0_ |= 0x00000001;
            }
            disease_.add(
                input.readMessage(com.rafsan.disease.Disease.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        disease_ = java.util.Collections.unmodifiableList(disease_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.rafsan.disease.DiseaseOuterClass.internal_static_com_rafsan_disease_DiseaseResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.rafsan.disease.DiseaseOuterClass.internal_static_com_rafsan_disease_DiseaseResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.rafsan.disease.DiseaseResponse.class, com.rafsan.disease.DiseaseResponse.Builder.class);
  }

  public static final int DISEASE_FIELD_NUMBER = 1;
  private java.util.List<com.rafsan.disease.Disease> disease_;
  /**
   * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.rafsan.disease.Disease> getDiseaseList() {
    return disease_;
  }
  /**
   * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.rafsan.disease.DiseaseOrBuilder> 
      getDiseaseOrBuilderList() {
    return disease_;
  }
  /**
   * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
   */
  @java.lang.Override
  public int getDiseaseCount() {
    return disease_.size();
  }
  /**
   * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
   */
  @java.lang.Override
  public com.rafsan.disease.Disease getDisease(int index) {
    return disease_.get(index);
  }
  /**
   * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
   */
  @java.lang.Override
  public com.rafsan.disease.DiseaseOrBuilder getDiseaseOrBuilder(
      int index) {
    return disease_.get(index);
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
    for (int i = 0; i < disease_.size(); i++) {
      output.writeMessage(1, disease_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < disease_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, disease_.get(i));
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
    if (!(obj instanceof com.rafsan.disease.DiseaseResponse)) {
      return super.equals(obj);
    }
    com.rafsan.disease.DiseaseResponse other = (com.rafsan.disease.DiseaseResponse) obj;

    if (!getDiseaseList()
        .equals(other.getDiseaseList())) return false;
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
    if (getDiseaseCount() > 0) {
      hash = (37 * hash) + DISEASE_FIELD_NUMBER;
      hash = (53 * hash) + getDiseaseList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.rafsan.disease.DiseaseResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rafsan.disease.DiseaseResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rafsan.disease.DiseaseResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rafsan.disease.DiseaseResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rafsan.disease.DiseaseResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.rafsan.disease.DiseaseResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.rafsan.disease.DiseaseResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rafsan.disease.DiseaseResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rafsan.disease.DiseaseResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.rafsan.disease.DiseaseResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.rafsan.disease.DiseaseResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.rafsan.disease.DiseaseResponse parseFrom(
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
  public static Builder newBuilder(com.rafsan.disease.DiseaseResponse prototype) {
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
   * Protobuf type {@code com.rafsan.disease.DiseaseResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.rafsan.disease.DiseaseResponse)
      com.rafsan.disease.DiseaseResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.rafsan.disease.DiseaseOuterClass.internal_static_com_rafsan_disease_DiseaseResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.rafsan.disease.DiseaseOuterClass.internal_static_com_rafsan_disease_DiseaseResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.rafsan.disease.DiseaseResponse.class, com.rafsan.disease.DiseaseResponse.Builder.class);
    }

    // Construct using com.rafsan.disease.DiseaseResponse.newBuilder()
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
        getDiseaseFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (diseaseBuilder_ == null) {
        disease_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        diseaseBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.rafsan.disease.DiseaseOuterClass.internal_static_com_rafsan_disease_DiseaseResponse_descriptor;
    }

    @java.lang.Override
    public com.rafsan.disease.DiseaseResponse getDefaultInstanceForType() {
      return com.rafsan.disease.DiseaseResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.rafsan.disease.DiseaseResponse build() {
      com.rafsan.disease.DiseaseResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.rafsan.disease.DiseaseResponse buildPartial() {
      com.rafsan.disease.DiseaseResponse result = new com.rafsan.disease.DiseaseResponse(this);
      int from_bitField0_ = bitField0_;
      if (diseaseBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          disease_ = java.util.Collections.unmodifiableList(disease_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.disease_ = disease_;
      } else {
        result.disease_ = diseaseBuilder_.build();
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
      if (other instanceof com.rafsan.disease.DiseaseResponse) {
        return mergeFrom((com.rafsan.disease.DiseaseResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.rafsan.disease.DiseaseResponse other) {
      if (other == com.rafsan.disease.DiseaseResponse.getDefaultInstance()) return this;
      if (diseaseBuilder_ == null) {
        if (!other.disease_.isEmpty()) {
          if (disease_.isEmpty()) {
            disease_ = other.disease_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDiseaseIsMutable();
            disease_.addAll(other.disease_);
          }
          onChanged();
        }
      } else {
        if (!other.disease_.isEmpty()) {
          if (diseaseBuilder_.isEmpty()) {
            diseaseBuilder_.dispose();
            diseaseBuilder_ = null;
            disease_ = other.disease_;
            bitField0_ = (bitField0_ & ~0x00000001);
            diseaseBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDiseaseFieldBuilder() : null;
          } else {
            diseaseBuilder_.addAllMessages(other.disease_);
          }
        }
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
      com.rafsan.disease.DiseaseResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.rafsan.disease.DiseaseResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.rafsan.disease.Disease> disease_ =
      java.util.Collections.emptyList();
    private void ensureDiseaseIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        disease_ = new java.util.ArrayList<com.rafsan.disease.Disease>(disease_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.rafsan.disease.Disease, com.rafsan.disease.Disease.Builder, com.rafsan.disease.DiseaseOrBuilder> diseaseBuilder_;

    /**
     * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
     */
    public java.util.List<com.rafsan.disease.Disease> getDiseaseList() {
      if (diseaseBuilder_ == null) {
        return java.util.Collections.unmodifiableList(disease_);
      } else {
        return diseaseBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
     */
    public int getDiseaseCount() {
      if (diseaseBuilder_ == null) {
        return disease_.size();
      } else {
        return diseaseBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
     */
    public com.rafsan.disease.Disease getDisease(int index) {
      if (diseaseBuilder_ == null) {
        return disease_.get(index);
      } else {
        return diseaseBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
     */
    public Builder setDisease(
        int index, com.rafsan.disease.Disease value) {
      if (diseaseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiseaseIsMutable();
        disease_.set(index, value);
        onChanged();
      } else {
        diseaseBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
     */
    public Builder setDisease(
        int index, com.rafsan.disease.Disease.Builder builderForValue) {
      if (diseaseBuilder_ == null) {
        ensureDiseaseIsMutable();
        disease_.set(index, builderForValue.build());
        onChanged();
      } else {
        diseaseBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
     */
    public Builder addDisease(com.rafsan.disease.Disease value) {
      if (diseaseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiseaseIsMutable();
        disease_.add(value);
        onChanged();
      } else {
        diseaseBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
     */
    public Builder addDisease(
        int index, com.rafsan.disease.Disease value) {
      if (diseaseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiseaseIsMutable();
        disease_.add(index, value);
        onChanged();
      } else {
        diseaseBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
     */
    public Builder addDisease(
        com.rafsan.disease.Disease.Builder builderForValue) {
      if (diseaseBuilder_ == null) {
        ensureDiseaseIsMutable();
        disease_.add(builderForValue.build());
        onChanged();
      } else {
        diseaseBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
     */
    public Builder addDisease(
        int index, com.rafsan.disease.Disease.Builder builderForValue) {
      if (diseaseBuilder_ == null) {
        ensureDiseaseIsMutable();
        disease_.add(index, builderForValue.build());
        onChanged();
      } else {
        diseaseBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
     */
    public Builder addAllDisease(
        java.lang.Iterable<? extends com.rafsan.disease.Disease> values) {
      if (diseaseBuilder_ == null) {
        ensureDiseaseIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, disease_);
        onChanged();
      } else {
        diseaseBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
     */
    public Builder clearDisease() {
      if (diseaseBuilder_ == null) {
        disease_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        diseaseBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
     */
    public Builder removeDisease(int index) {
      if (diseaseBuilder_ == null) {
        ensureDiseaseIsMutable();
        disease_.remove(index);
        onChanged();
      } else {
        diseaseBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
     */
    public com.rafsan.disease.Disease.Builder getDiseaseBuilder(
        int index) {
      return getDiseaseFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
     */
    public com.rafsan.disease.DiseaseOrBuilder getDiseaseOrBuilder(
        int index) {
      if (diseaseBuilder_ == null) {
        return disease_.get(index);  } else {
        return diseaseBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
     */
    public java.util.List<? extends com.rafsan.disease.DiseaseOrBuilder> 
         getDiseaseOrBuilderList() {
      if (diseaseBuilder_ != null) {
        return diseaseBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(disease_);
      }
    }
    /**
     * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
     */
    public com.rafsan.disease.Disease.Builder addDiseaseBuilder() {
      return getDiseaseFieldBuilder().addBuilder(
          com.rafsan.disease.Disease.getDefaultInstance());
    }
    /**
     * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
     */
    public com.rafsan.disease.Disease.Builder addDiseaseBuilder(
        int index) {
      return getDiseaseFieldBuilder().addBuilder(
          index, com.rafsan.disease.Disease.getDefaultInstance());
    }
    /**
     * <code>repeated .com.rafsan.disease.Disease disease = 1;</code>
     */
    public java.util.List<com.rafsan.disease.Disease.Builder> 
         getDiseaseBuilderList() {
      return getDiseaseFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.rafsan.disease.Disease, com.rafsan.disease.Disease.Builder, com.rafsan.disease.DiseaseOrBuilder> 
        getDiseaseFieldBuilder() {
      if (diseaseBuilder_ == null) {
        diseaseBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.rafsan.disease.Disease, com.rafsan.disease.Disease.Builder, com.rafsan.disease.DiseaseOrBuilder>(
                disease_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        disease_ = null;
      }
      return diseaseBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.rafsan.disease.DiseaseResponse)
  }

  // @@protoc_insertion_point(class_scope:com.rafsan.disease.DiseaseResponse)
  private static final com.rafsan.disease.DiseaseResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.rafsan.disease.DiseaseResponse();
  }

  public static com.rafsan.disease.DiseaseResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiseaseResponse>
      PARSER = new com.google.protobuf.AbstractParser<DiseaseResponse>() {
    @java.lang.Override
    public DiseaseResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DiseaseResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DiseaseResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiseaseResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.rafsan.disease.DiseaseResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

