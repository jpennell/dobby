// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/java/com/utl/dobby/data/roles.proto

package com.utl.dobby.data;

public final class Roles {
  private Roles() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RolesMessageOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string person = 1;
    boolean hasPerson();
    String getPerson();
    
    // repeated string roles = 2;
    java.util.List<String> getRolesList();
    int getRolesCount();
    String getRoles(int index);
  }
  public static final class RolesMessage extends
      com.google.protobuf.GeneratedMessage
      implements RolesMessageOrBuilder {
    // Use RolesMessage.newBuilder() to construct.
    private RolesMessage(Builder builder) {
      super(builder);
    }
    private RolesMessage(boolean noInit) {}
    
    private static final RolesMessage defaultInstance;
    public static RolesMessage getDefaultInstance() {
      return defaultInstance;
    }
    
    public RolesMessage getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.utl.dobby.data.Roles.internal_static_com_utl_dobby_data_RolesMessage_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.utl.dobby.data.Roles.internal_static_com_utl_dobby_data_RolesMessage_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string person = 1;
    public static final int PERSON_FIELD_NUMBER = 1;
    private java.lang.Object person_;
    public boolean hasPerson() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getPerson() {
      java.lang.Object ref = person_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          person_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getPersonBytes() {
      java.lang.Object ref = person_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        person_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // repeated string roles = 2;
    public static final int ROLES_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList roles_;
    public java.util.List<String>
        getRolesList() {
      return roles_;
    }
    public int getRolesCount() {
      return roles_.size();
    }
    public String getRoles(int index) {
      return roles_.get(index);
    }
    
    private void initFields() {
      person_ = "";
      roles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getPersonBytes());
      }
      for (int i = 0; i < roles_.size(); i++) {
        output.writeBytes(2, roles_.getByteString(i));
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
          .computeBytesSize(1, getPersonBytes());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < roles_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(roles_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getRolesList().size();
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
    
    public static com.utl.dobby.data.Roles.RolesMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.utl.dobby.data.Roles.RolesMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.utl.dobby.data.Roles.RolesMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.utl.dobby.data.Roles.RolesMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.utl.dobby.data.Roles.RolesMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.utl.dobby.data.Roles.RolesMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.utl.dobby.data.Roles.RolesMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.utl.dobby.data.Roles.RolesMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.utl.dobby.data.Roles.RolesMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.utl.dobby.data.Roles.RolesMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.utl.dobby.data.Roles.RolesMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.utl.dobby.data.Roles.RolesMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.utl.dobby.data.Roles.internal_static_com_utl_dobby_data_RolesMessage_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.utl.dobby.data.Roles.internal_static_com_utl_dobby_data_RolesMessage_fieldAccessorTable;
      }
      
      // Construct using com.utl.dobby.data.Roles.RolesMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
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
        person_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        roles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.utl.dobby.data.Roles.RolesMessage.getDescriptor();
      }
      
      public com.utl.dobby.data.Roles.RolesMessage getDefaultInstanceForType() {
        return com.utl.dobby.data.Roles.RolesMessage.getDefaultInstance();
      }
      
      public com.utl.dobby.data.Roles.RolesMessage build() {
        com.utl.dobby.data.Roles.RolesMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.utl.dobby.data.Roles.RolesMessage buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.utl.dobby.data.Roles.RolesMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.utl.dobby.data.Roles.RolesMessage buildPartial() {
        com.utl.dobby.data.Roles.RolesMessage result = new com.utl.dobby.data.Roles.RolesMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.person_ = person_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          roles_ = new com.google.protobuf.UnmodifiableLazyStringList(
              roles_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.roles_ = roles_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.utl.dobby.data.Roles.RolesMessage) {
          return mergeFrom((com.utl.dobby.data.Roles.RolesMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.utl.dobby.data.Roles.RolesMessage other) {
        if (other == com.utl.dobby.data.Roles.RolesMessage.getDefaultInstance()) return this;
        if (other.hasPerson()) {
          setPerson(other.getPerson());
        }
        if (!other.roles_.isEmpty()) {
          if (roles_.isEmpty()) {
            roles_ = other.roles_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRolesIsMutable();
            roles_.addAll(other.roles_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              person_ = input.readBytes();
              break;
            }
            case 18: {
              ensureRolesIsMutable();
              roles_.add(input.readBytes());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string person = 1;
      private java.lang.Object person_ = "";
      public boolean hasPerson() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getPerson() {
        java.lang.Object ref = person_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          person_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setPerson(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        person_ = value;
        onChanged();
        return this;
      }
      public Builder clearPerson() {
        bitField0_ = (bitField0_ & ~0x00000001);
        person_ = getDefaultInstance().getPerson();
        onChanged();
        return this;
      }
      void setPerson(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        person_ = value;
        onChanged();
      }
      
      // repeated string roles = 2;
      private com.google.protobuf.LazyStringList roles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureRolesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          roles_ = new com.google.protobuf.LazyStringArrayList(roles_);
          bitField0_ |= 0x00000002;
         }
      }
      public java.util.List<String>
          getRolesList() {
        return java.util.Collections.unmodifiableList(roles_);
      }
      public int getRolesCount() {
        return roles_.size();
      }
      public String getRoles(int index) {
        return roles_.get(index);
      }
      public Builder setRoles(
          int index, String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureRolesIsMutable();
        roles_.set(index, value);
        onChanged();
        return this;
      }
      public Builder addRoles(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureRolesIsMutable();
        roles_.add(value);
        onChanged();
        return this;
      }
      public Builder addAllRoles(
          java.lang.Iterable<String> values) {
        ensureRolesIsMutable();
        super.addAll(values, roles_);
        onChanged();
        return this;
      }
      public Builder clearRoles() {
        roles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      void addRoles(com.google.protobuf.ByteString value) {
        ensureRolesIsMutable();
        roles_.add(value);
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.utl.dobby.data.RolesMessage)
    }
    
    static {
      defaultInstance = new RolesMessage(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.utl.dobby.data.RolesMessage)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_utl_dobby_data_RolesMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_utl_dobby_data_RolesMessage_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(main/java/com/utl/dobby/data/roles.pro" +
      "to\022\022com.utl.dobby.data\"-\n\014RolesMessage\022\016" +
      "\n\006person\030\001 \001(\t\022\r\n\005roles\030\002 \003(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_utl_dobby_data_RolesMessage_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_utl_dobby_data_RolesMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_utl_dobby_data_RolesMessage_descriptor,
              new java.lang.String[] { "Person", "Roles", },
              com.utl.dobby.data.Roles.RolesMessage.class,
              com.utl.dobby.data.Roles.RolesMessage.Builder.class);
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