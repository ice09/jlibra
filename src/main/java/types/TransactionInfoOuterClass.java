// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transaction_info.proto

package types;

public final class TransactionInfoOuterClass {
  private TransactionInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TransactionInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:types.TransactionInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Hash of the signed transaction that is stored
     * </pre>
     *
     * <code>bytes signed_transaction_hash = 1;</code>
     */
    com.google.protobuf.ByteString getSignedTransactionHash();

    /**
     * <pre>
     * The root hash of Sparse Merkle Tree describing the world state at the end
     * of this transaction
     * </pre>
     *
     * <code>bytes state_root_hash = 2;</code>
     */
    com.google.protobuf.ByteString getStateRootHash();

    /**
     * <pre>
     * The root hash of Merkle Accumulator storing all events emitted during this
     * transaction.
     * </pre>
     *
     * <code>bytes event_root_hash = 3;</code>
     */
    com.google.protobuf.ByteString getEventRootHash();

    /**
     * <pre>
     * The amount of gas used by this transaction.
     * </pre>
     *
     * <code>uint64 gas_used = 4;</code>
     */
    long getGasUsed();
  }
  /**
   * <pre>
   * `TransactionInfo` is the object we store in the transaction accumulator. It
   * consists of the transaction as well as the execution result of this
   * transaction. This are later returned to the client so that a client can
   * validate the tree
   * </pre>
   *
   * Protobuf type {@code types.TransactionInfo}
   */
  public  static final class TransactionInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:types.TransactionInfo)
      TransactionInfoOrBuilder {
    // Use TransactionInfo.newBuilder() to construct.
    private TransactionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TransactionInfo() {
      signedTransactionHash_ = com.google.protobuf.ByteString.EMPTY;
      stateRootHash_ = com.google.protobuf.ByteString.EMPTY;
      eventRootHash_ = com.google.protobuf.ByteString.EMPTY;
      gasUsed_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private TransactionInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {

              signedTransactionHash_ = input.readBytes();
              break;
            }
            case 18: {

              stateRootHash_ = input.readBytes();
              break;
            }
            case 26: {

              eventRootHash_ = input.readBytes();
              break;
            }
            case 32: {

              gasUsed_ = input.readUInt64();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return types.TransactionInfoOuterClass.internal_static_types_TransactionInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return types.TransactionInfoOuterClass.internal_static_types_TransactionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              types.TransactionInfoOuterClass.TransactionInfo.class, types.TransactionInfoOuterClass.TransactionInfo.Builder.class);
    }

    public static final int SIGNED_TRANSACTION_HASH_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString signedTransactionHash_;
    /**
     * <pre>
     * Hash of the signed transaction that is stored
     * </pre>
     *
     * <code>bytes signed_transaction_hash = 1;</code>
     */
    public com.google.protobuf.ByteString getSignedTransactionHash() {
      return signedTransactionHash_;
    }

    public static final int STATE_ROOT_HASH_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString stateRootHash_;
    /**
     * <pre>
     * The root hash of Sparse Merkle Tree describing the world state at the end
     * of this transaction
     * </pre>
     *
     * <code>bytes state_root_hash = 2;</code>
     */
    public com.google.protobuf.ByteString getStateRootHash() {
      return stateRootHash_;
    }

    public static final int EVENT_ROOT_HASH_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString eventRootHash_;
    /**
     * <pre>
     * The root hash of Merkle Accumulator storing all events emitted during this
     * transaction.
     * </pre>
     *
     * <code>bytes event_root_hash = 3;</code>
     */
    public com.google.protobuf.ByteString getEventRootHash() {
      return eventRootHash_;
    }

    public static final int GAS_USED_FIELD_NUMBER = 4;
    private long gasUsed_;
    /**
     * <pre>
     * The amount of gas used by this transaction.
     * </pre>
     *
     * <code>uint64 gas_used = 4;</code>
     */
    public long getGasUsed() {
      return gasUsed_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!signedTransactionHash_.isEmpty()) {
        output.writeBytes(1, signedTransactionHash_);
      }
      if (!stateRootHash_.isEmpty()) {
        output.writeBytes(2, stateRootHash_);
      }
      if (!eventRootHash_.isEmpty()) {
        output.writeBytes(3, eventRootHash_);
      }
      if (gasUsed_ != 0L) {
        output.writeUInt64(4, gasUsed_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!signedTransactionHash_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, signedTransactionHash_);
      }
      if (!stateRootHash_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, stateRootHash_);
      }
      if (!eventRootHash_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, eventRootHash_);
      }
      if (gasUsed_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, gasUsed_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof types.TransactionInfoOuterClass.TransactionInfo)) {
        return super.equals(obj);
      }
      types.TransactionInfoOuterClass.TransactionInfo other = (types.TransactionInfoOuterClass.TransactionInfo) obj;

      boolean result = true;
      result = result && getSignedTransactionHash()
          .equals(other.getSignedTransactionHash());
      result = result && getStateRootHash()
          .equals(other.getStateRootHash());
      result = result && getEventRootHash()
          .equals(other.getEventRootHash());
      result = result && (getGasUsed()
          == other.getGasUsed());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SIGNED_TRANSACTION_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getSignedTransactionHash().hashCode();
      hash = (37 * hash) + STATE_ROOT_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getStateRootHash().hashCode();
      hash = (37 * hash) + EVENT_ROOT_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getEventRootHash().hashCode();
      hash = (37 * hash) + GAS_USED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGasUsed());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static types.TransactionInfoOuterClass.TransactionInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static types.TransactionInfoOuterClass.TransactionInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static types.TransactionInfoOuterClass.TransactionInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static types.TransactionInfoOuterClass.TransactionInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static types.TransactionInfoOuterClass.TransactionInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static types.TransactionInfoOuterClass.TransactionInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static types.TransactionInfoOuterClass.TransactionInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static types.TransactionInfoOuterClass.TransactionInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static types.TransactionInfoOuterClass.TransactionInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static types.TransactionInfoOuterClass.TransactionInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static types.TransactionInfoOuterClass.TransactionInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static types.TransactionInfoOuterClass.TransactionInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(types.TransactionInfoOuterClass.TransactionInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * `TransactionInfo` is the object we store in the transaction accumulator. It
     * consists of the transaction as well as the execution result of this
     * transaction. This are later returned to the client so that a client can
     * validate the tree
     * </pre>
     *
     * Protobuf type {@code types.TransactionInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:types.TransactionInfo)
        types.TransactionInfoOuterClass.TransactionInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return types.TransactionInfoOuterClass.internal_static_types_TransactionInfo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return types.TransactionInfoOuterClass.internal_static_types_TransactionInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                types.TransactionInfoOuterClass.TransactionInfo.class, types.TransactionInfoOuterClass.TransactionInfo.Builder.class);
      }

      // Construct using types.TransactionInfoOuterClass.TransactionInfo.newBuilder()
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
      public Builder clear() {
        super.clear();
        signedTransactionHash_ = com.google.protobuf.ByteString.EMPTY;

        stateRootHash_ = com.google.protobuf.ByteString.EMPTY;

        eventRootHash_ = com.google.protobuf.ByteString.EMPTY;

        gasUsed_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return types.TransactionInfoOuterClass.internal_static_types_TransactionInfo_descriptor;
      }

      public types.TransactionInfoOuterClass.TransactionInfo getDefaultInstanceForType() {
        return types.TransactionInfoOuterClass.TransactionInfo.getDefaultInstance();
      }

      public types.TransactionInfoOuterClass.TransactionInfo build() {
        types.TransactionInfoOuterClass.TransactionInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public types.TransactionInfoOuterClass.TransactionInfo buildPartial() {
        types.TransactionInfoOuterClass.TransactionInfo result = new types.TransactionInfoOuterClass.TransactionInfo(this);
        result.signedTransactionHash_ = signedTransactionHash_;
        result.stateRootHash_ = stateRootHash_;
        result.eventRootHash_ = eventRootHash_;
        result.gasUsed_ = gasUsed_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof types.TransactionInfoOuterClass.TransactionInfo) {
          return mergeFrom((types.TransactionInfoOuterClass.TransactionInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(types.TransactionInfoOuterClass.TransactionInfo other) {
        if (other == types.TransactionInfoOuterClass.TransactionInfo.getDefaultInstance()) return this;
        if (other.getSignedTransactionHash() != com.google.protobuf.ByteString.EMPTY) {
          setSignedTransactionHash(other.getSignedTransactionHash());
        }
        if (other.getStateRootHash() != com.google.protobuf.ByteString.EMPTY) {
          setStateRootHash(other.getStateRootHash());
        }
        if (other.getEventRootHash() != com.google.protobuf.ByteString.EMPTY) {
          setEventRootHash(other.getEventRootHash());
        }
        if (other.getGasUsed() != 0L) {
          setGasUsed(other.getGasUsed());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        types.TransactionInfoOuterClass.TransactionInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (types.TransactionInfoOuterClass.TransactionInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString signedTransactionHash_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * Hash of the signed transaction that is stored
       * </pre>
       *
       * <code>bytes signed_transaction_hash = 1;</code>
       */
      public com.google.protobuf.ByteString getSignedTransactionHash() {
        return signedTransactionHash_;
      }
      /**
       * <pre>
       * Hash of the signed transaction that is stored
       * </pre>
       *
       * <code>bytes signed_transaction_hash = 1;</code>
       */
      public Builder setSignedTransactionHash(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        signedTransactionHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Hash of the signed transaction that is stored
       * </pre>
       *
       * <code>bytes signed_transaction_hash = 1;</code>
       */
      public Builder clearSignedTransactionHash() {
        
        signedTransactionHash_ = getDefaultInstance().getSignedTransactionHash();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString stateRootHash_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * The root hash of Sparse Merkle Tree describing the world state at the end
       * of this transaction
       * </pre>
       *
       * <code>bytes state_root_hash = 2;</code>
       */
      public com.google.protobuf.ByteString getStateRootHash() {
        return stateRootHash_;
      }
      /**
       * <pre>
       * The root hash of Sparse Merkle Tree describing the world state at the end
       * of this transaction
       * </pre>
       *
       * <code>bytes state_root_hash = 2;</code>
       */
      public Builder setStateRootHash(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        stateRootHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The root hash of Sparse Merkle Tree describing the world state at the end
       * of this transaction
       * </pre>
       *
       * <code>bytes state_root_hash = 2;</code>
       */
      public Builder clearStateRootHash() {
        
        stateRootHash_ = getDefaultInstance().getStateRootHash();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString eventRootHash_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * The root hash of Merkle Accumulator storing all events emitted during this
       * transaction.
       * </pre>
       *
       * <code>bytes event_root_hash = 3;</code>
       */
      public com.google.protobuf.ByteString getEventRootHash() {
        return eventRootHash_;
      }
      /**
       * <pre>
       * The root hash of Merkle Accumulator storing all events emitted during this
       * transaction.
       * </pre>
       *
       * <code>bytes event_root_hash = 3;</code>
       */
      public Builder setEventRootHash(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        eventRootHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The root hash of Merkle Accumulator storing all events emitted during this
       * transaction.
       * </pre>
       *
       * <code>bytes event_root_hash = 3;</code>
       */
      public Builder clearEventRootHash() {
        
        eventRootHash_ = getDefaultInstance().getEventRootHash();
        onChanged();
        return this;
      }

      private long gasUsed_ ;
      /**
       * <pre>
       * The amount of gas used by this transaction.
       * </pre>
       *
       * <code>uint64 gas_used = 4;</code>
       */
      public long getGasUsed() {
        return gasUsed_;
      }
      /**
       * <pre>
       * The amount of gas used by this transaction.
       * </pre>
       *
       * <code>uint64 gas_used = 4;</code>
       */
      public Builder setGasUsed(long value) {
        
        gasUsed_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The amount of gas used by this transaction.
       * </pre>
       *
       * <code>uint64 gas_used = 4;</code>
       */
      public Builder clearGasUsed() {
        
        gasUsed_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:types.TransactionInfo)
    }

    // @@protoc_insertion_point(class_scope:types.TransactionInfo)
    private static final types.TransactionInfoOuterClass.TransactionInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new types.TransactionInfoOuterClass.TransactionInfo();
    }

    public static types.TransactionInfoOuterClass.TransactionInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TransactionInfo>
        PARSER = new com.google.protobuf.AbstractParser<TransactionInfo>() {
      public TransactionInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new TransactionInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TransactionInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TransactionInfo> getParserForType() {
      return PARSER;
    }

    public types.TransactionInfoOuterClass.TransactionInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_types_TransactionInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_types_TransactionInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026transaction_info.proto\022\005types\"v\n\017Trans" +
      "actionInfo\022\037\n\027signed_transaction_hash\030\001 " +
      "\001(\014\022\027\n\017state_root_hash\030\002 \001(\014\022\027\n\017event_ro" +
      "ot_hash\030\003 \001(\014\022\020\n\010gas_used\030\004 \001(\004b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_types_TransactionInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_types_TransactionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_types_TransactionInfo_descriptor,
        new java.lang.String[] { "SignedTransactionHash", "StateRootHash", "EventRootHash", "GasUsed", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
