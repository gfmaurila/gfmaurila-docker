// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/person.proto

package kafdrop.protos;

public final class PersonProto {
  private PersonProto() {
  }

  public static void registerAllExtensions(
    com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
    com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
      (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kafdrop_Person_descriptor;
  static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internal_static_kafdrop_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor
    descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\021PATH/person.proto\022\007kafdrop\"\217\001\n\006Person\022" +
        "\014\n\004name\030\001 \001(\t\022\n\n\002id\030\002 \001(\005\022\r\n\005email\030\003 \001(\t" +
        "\022(\n\007contact\030\004 \001(\0162\027.kafdrop.Person.Conta" +
        "ct\022\014\n\004data\030\005 \003(\t\"$\n\007Contact\022\r\n\tTELEPHONE" +
        "\020\000\022\n\n\006MOBILE\020\001B\037\n\016kafdrop.protosB\013Person" +
        "ProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[]{
        });
    internal_static_kafdrop_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_kafdrop_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
      internal_static_kafdrop_Person_descriptor,
      new java.lang.String[]{"Name", "Id", "Email", "Contact", "Data",});
  }

  // @@protoc_insertion_point(outer_class_scope)
}