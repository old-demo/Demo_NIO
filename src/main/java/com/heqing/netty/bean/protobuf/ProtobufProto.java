// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package com.heqing.netty.bean.protobuf;

public final class ProtobufProto {
  private ProtobufProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface testBufOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int64 id = 1;
    /**
     * <code>required int64 id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>required int64 id = 1;</code>
     */
    long getId();

    // required int64 receive = 2;
    /**
     * <code>required int64 receive = 2;</code>
     */
    boolean hasReceive();
    /**
     * <code>required int64 receive = 2;</code>
     */
    long getReceive();

    // required int64 send = 3;
    /**
     * <code>required int64 send = 3;</code>
     */
    boolean hasSend();
    /**
     * <code>required int64 send = 3;</code>
     */
    long getSend();

    // required string content = 4;
    /**
     * <code>required string content = 4;</code>
     */
    boolean hasContent();
    /**
     * <code>required string content = 4;</code>
     */
    java.lang.String getContent();
    /**
     * <code>required string content = 4;</code>
     */
    com.google.protobuf.ByteString
        getContentBytes();

    // required int32 type = 5;
    /**
     * <code>required int32 type = 5;</code>
     */
    boolean hasType();
    /**
     * <code>required int32 type = 5;</code>
     */
    int getType();

    // required int32 state = 6;
    /**
     * <code>required int32 state = 6;</code>
     */
    boolean hasState();
    /**
     * <code>required int32 state = 6;</code>
     */
    int getState();

    // required int64 createTime = 7;
    /**
     * <code>required int64 createTime = 7;</code>
     */
    boolean hasCreateTime();
    /**
     * <code>required int64 createTime = 7;</code>
     */
    long getCreateTime();
  }
  /**
   * Protobuf type {@code protobuf.testBuf}
   */
  public static final class testBuf extends
      com.google.protobuf.GeneratedMessage
      implements testBufOrBuilder {
    // Use testBuf.newBuilder() to construct.
    private testBuf(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private testBuf(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final testBuf defaultInstance;
    public static testBuf getDefaultInstance() {
      return defaultInstance;
    }

    public testBuf getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private testBuf(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();

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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              receive_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              send_ = input.readInt64();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              content_ = input.readBytes();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              type_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              state_ = input.readInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              createTime_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.heqing.netty.bean.protobuf.ProtobufProto.internal_static_protobuf_testBuf_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.heqing.netty.bean.protobuf.ProtobufProto.internal_static_protobuf_testBuf_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.heqing.netty.bean.protobuf.ProtobufProto.testBuf.class, com.heqing.netty.bean.protobuf.ProtobufProto.testBuf.Builder.class);
    }

    public static com.google.protobuf.Parser<testBuf> PARSER =
        new com.google.protobuf.AbstractParser<testBuf>() {
      public testBuf parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new testBuf(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<testBuf> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int64 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <code>required int64 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    // required int64 receive = 2;
    public static final int RECEIVE_FIELD_NUMBER = 2;
    private long receive_;
    /**
     * <code>required int64 receive = 2;</code>
     */
    public boolean hasReceive() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 receive = 2;</code>
     */
    public long getReceive() {
      return receive_;
    }

    // required int64 send = 3;
    public static final int SEND_FIELD_NUMBER = 3;
    private long send_;
    /**
     * <code>required int64 send = 3;</code>
     */
    public boolean hasSend() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int64 send = 3;</code>
     */
    public long getSend() {
      return send_;
    }

    // required string content = 4;
    public static final int CONTENT_FIELD_NUMBER = 4;
    private java.lang.Object content_;
    /**
     * <code>required string content = 4;</code>
     */
    public boolean hasContent() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string content = 4;</code>
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          content_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string content = 4;</code>
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required int32 type = 5;
    public static final int TYPE_FIELD_NUMBER = 5;
    private int type_;
    /**
     * <code>required int32 type = 5;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required int32 type = 5;</code>
     */
    public int getType() {
      return type_;
    }

    // required int32 state = 6;
    public static final int STATE_FIELD_NUMBER = 6;
    private int state_;
    /**
     * <code>required int32 state = 6;</code>
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required int32 state = 6;</code>
     */
    public int getState() {
      return state_;
    }

    // required int64 createTime = 7;
    public static final int CREATETIME_FIELD_NUMBER = 7;
    private long createTime_;
    /**
     * <code>required int64 createTime = 7;</code>
     */
    public boolean hasCreateTime() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>required int64 createTime = 7;</code>
     */
    public long getCreateTime() {
      return createTime_;
    }

    private void initFields() {
      id_ = 0L;
      receive_ = 0L;
      send_ = 0L;
      content_ = "";
      type_ = 0;
      state_ = 0;
      createTime_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasReceive()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSend()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasContent()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasState()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCreateTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, receive_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, send_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getContentBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, type_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, state_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt64(7, createTime_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, receive_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, send_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getContentBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, type_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, state_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(7, createTime_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.heqing.netty.bean.protobuf.ProtobufProto.testBuf parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.heqing.netty.bean.protobuf.ProtobufProto.testBuf parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.heqing.netty.bean.protobuf.ProtobufProto.testBuf parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.heqing.netty.bean.protobuf.ProtobufProto.testBuf parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.heqing.netty.bean.protobuf.ProtobufProto.testBuf parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.heqing.netty.bean.protobuf.ProtobufProto.testBuf parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.heqing.netty.bean.protobuf.ProtobufProto.testBuf parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.heqing.netty.bean.protobuf.ProtobufProto.testBuf parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.heqing.netty.bean.protobuf.ProtobufProto.testBuf parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.heqing.netty.bean.protobuf.ProtobufProto.testBuf parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.heqing.netty.bean.protobuf.ProtobufProto.testBuf prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protobuf.testBuf}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.heqing.netty.bean.protobuf.ProtobufProto.testBufOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.heqing.netty.bean.protobuf.ProtobufProto.internal_static_protobuf_testBuf_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.heqing.netty.bean.protobuf.ProtobufProto.internal_static_protobuf_testBuf_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.heqing.netty.bean.protobuf.ProtobufProto.testBuf.class, com.heqing.netty.bean.protobuf.ProtobufProto.testBuf.Builder.class);
      }

      // Construct using com.heqing.netty.bean.MessageProto.testBuf.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        id_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        receive_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        send_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        content_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        state_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        createTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.heqing.netty.bean.protobuf.ProtobufProto.internal_static_protobuf_testBuf_descriptor;
      }

      public com.heqing.netty.bean.protobuf.ProtobufProto.testBuf getDefaultInstanceForType() {
        return com.heqing.netty.bean.protobuf.ProtobufProto.testBuf.getDefaultInstance();
      }

      public com.heqing.netty.bean.protobuf.ProtobufProto.testBuf build() {
        com.heqing.netty.bean.protobuf.ProtobufProto.testBuf result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.heqing.netty.bean.protobuf.ProtobufProto.testBuf buildPartial() {
        com.heqing.netty.bean.protobuf.ProtobufProto.testBuf result = new com.heqing.netty.bean.protobuf.ProtobufProto.testBuf(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.receive_ = receive_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.send_ = send_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.content_ = content_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.state_ = state_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.createTime_ = createTime_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.heqing.netty.bean.protobuf.ProtobufProto.testBuf) {
          return mergeFrom((com.heqing.netty.bean.protobuf.ProtobufProto.testBuf)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.heqing.netty.bean.protobuf.ProtobufProto.testBuf other) {
        if (other == com.heqing.netty.bean.protobuf.ProtobufProto.testBuf.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasReceive()) {
          setReceive(other.getReceive());
        }
        if (other.hasSend()) {
          setSend(other.getSend());
        }
        if (other.hasContent()) {
          bitField0_ |= 0x00000008;
          content_ = other.content_;
          onChanged();
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasState()) {
          setState(other.getState());
        }
        if (other.hasCreateTime()) {
          setCreateTime(other.getCreateTime());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasId()) {
          
          return false;
        }
        if (!hasReceive()) {
          
          return false;
        }
        if (!hasSend()) {
          
          return false;
        }
        if (!hasContent()) {
          
          return false;
        }
        if (!hasType()) {
          
          return false;
        }
        if (!hasState()) {
          
          return false;
        }
        if (!hasCreateTime()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.heqing.netty.bean.protobuf.ProtobufProto.testBuf parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.heqing.netty.bean.protobuf.ProtobufProto.testBuf) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int64 id = 1;
      private long id_ ;
      /**
       * <code>required int64 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }
      /**
       * <code>required int64 id = 1;</code>
       */
      public Builder setId(long value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0L;
        onChanged();
        return this;
      }

      // required int64 receive = 2;
      private long receive_ ;
      /**
       * <code>required int64 receive = 2;</code>
       */
      public boolean hasReceive() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int64 receive = 2;</code>
       */
      public long getReceive() {
        return receive_;
      }
      /**
       * <code>required int64 receive = 2;</code>
       */
      public Builder setReceive(long value) {
        bitField0_ |= 0x00000002;
        receive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 receive = 2;</code>
       */
      public Builder clearReceive() {
        bitField0_ = (bitField0_ & ~0x00000002);
        receive_ = 0L;
        onChanged();
        return this;
      }

      // required int64 send = 3;
      private long send_ ;
      /**
       * <code>required int64 send = 3;</code>
       */
      public boolean hasSend() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int64 send = 3;</code>
       */
      public long getSend() {
        return send_;
      }
      /**
       * <code>required int64 send = 3;</code>
       */
      public Builder setSend(long value) {
        bitField0_ |= 0x00000004;
        send_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 send = 3;</code>
       */
      public Builder clearSend() {
        bitField0_ = (bitField0_ & ~0x00000004);
        send_ = 0L;
        onChanged();
        return this;
      }

      // required string content = 4;
      private java.lang.Object content_ = "";
      /**
       * <code>required string content = 4;</code>
       */
      public boolean hasContent() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string content = 4;</code>
       */
      public java.lang.String getContent() {
        java.lang.Object ref = content_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          content_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string content = 4;</code>
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        java.lang.Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string content = 4;</code>
       */
      public Builder setContent(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string content = 4;</code>
       */
      public Builder clearContent() {
        bitField0_ = (bitField0_ & ~0x00000008);
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }
      /**
       * <code>required string content = 4;</code>
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        content_ = value;
        onChanged();
        return this;
      }

      // required int32 type = 5;
      private int type_ ;
      /**
       * <code>required int32 type = 5;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required int32 type = 5;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>required int32 type = 5;</code>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000010;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 type = 5;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000010);
        type_ = 0;
        onChanged();
        return this;
      }

      // required int32 state = 6;
      private int state_ ;
      /**
       * <code>required int32 state = 6;</code>
       */
      public boolean hasState() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>required int32 state = 6;</code>
       */
      public int getState() {
        return state_;
      }
      /**
       * <code>required int32 state = 6;</code>
       */
      public Builder setState(int value) {
        bitField0_ |= 0x00000020;
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 state = 6;</code>
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000020);
        state_ = 0;
        onChanged();
        return this;
      }

      // required int64 createTime = 7;
      private long createTime_ ;
      /**
       * <code>required int64 createTime = 7;</code>
       */
      public boolean hasCreateTime() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>required int64 createTime = 7;</code>
       */
      public long getCreateTime() {
        return createTime_;
      }
      /**
       * <code>required int64 createTime = 7;</code>
       */
      public Builder setCreateTime(long value) {
        bitField0_ |= 0x00000040;
        createTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 createTime = 7;</code>
       */
      public Builder clearCreateTime() {
        bitField0_ = (bitField0_ & ~0x00000040);
        createTime_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protobuf.testBuf)
    }

    static {
      defaultInstance = new testBuf(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:protobuf.testBuf)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_testBuf_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protobuf_testBuf_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmessage.proto\022\010protobuf\"v\n\007testBuf\022\n\n\002" +
      "id\030\001 \002(\003\022\017\n\007receive\030\002 \002(\003\022\014\n\004send\030\003 \002(\003\022" +
      "\017\n\007content\030\004 \002(\t\022\014\n\004type\030\005 \002(\005\022\r\n\005state\030" +
      "\006 \002(\005\022\022\n\ncreateTime\030\007 \002(\003B%\n\025com.heqing." +
      "netty.beanB\014MessageProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_protobuf_testBuf_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_protobuf_testBuf_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protobuf_testBuf_descriptor,
              new java.lang.String[] { "Id", "Receive", "Send", "Content", "Type", "State", "CreateTime", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
