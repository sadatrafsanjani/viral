// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: virus.proto

package com.rafsan.virus;

public final class Virus {
  private Virus() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rafsan_virus_VirusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rafsan_virus_VirusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rafsan_virus_VirusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rafsan_virus_VirusResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013virus.proto\022\020com.rafsan.virus\"\032\n\014Virus" +
      "Request\022\n\n\002id\030\001 \001(\005\"A\n\rVirusResponse\022\n\n\002" +
      "id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\026\n\016no_of_diseases" +
      "\030\003 \001(\0052[\n\014VirusService\022K\n\010getVirus\022\036.com" +
      ".rafsan.virus.VirusRequest\032\037.com.rafsan." +
      "virus.VirusResponseB\024\n\020com.rafsan.virusP" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_rafsan_virus_VirusRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_rafsan_virus_VirusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rafsan_virus_VirusRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_rafsan_virus_VirusResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_rafsan_virus_VirusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rafsan_virus_VirusResponse_descriptor,
        new java.lang.String[] { "Id", "Name", "NoOfDiseases", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
