// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: disease.proto

package com.rafsan.disease;

public final class DiseaseOuterClass {
  private DiseaseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rafsan_disease_DiseaseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rafsan_disease_DiseaseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rafsan_disease_DiseaseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rafsan_disease_DiseaseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rafsan_disease_Disease_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rafsan_disease_Disease_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rdisease.proto\022\022com.rafsan.disease\"\034\n\016D" +
      "iseaseRequest\022\n\n\002id\030\001 \001(\005\"?\n\017DiseaseResp" +
      "onse\022,\n\007disease\030\001 \003(\0132\033.com.rafsan.disea" +
      "se.Disease\"G\n\007Disease\022\020\n\010virus_id\030\001 \001(\005\022" +
      "\n\n\002id\030\002 \001(\005\022\014\n\004name\030\003 \001(\t\022\020\n\010fatality\030\004 " +
      "\001(\t2p\n\016DiseaseService\022^\n\023getDiseasesForV" +
      "irus\022\".com.rafsan.disease.DiseaseRequest" +
      "\032#.com.rafsan.disease.DiseaseResponseB\026\n" +
      "\022com.rafsan.diseaseP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_rafsan_disease_DiseaseRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_rafsan_disease_DiseaseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rafsan_disease_DiseaseRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_rafsan_disease_DiseaseResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_rafsan_disease_DiseaseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rafsan_disease_DiseaseResponse_descriptor,
        new java.lang.String[] { "Disease", });
    internal_static_com_rafsan_disease_Disease_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_rafsan_disease_Disease_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rafsan_disease_Disease_descriptor,
        new java.lang.String[] { "VirusId", "Id", "Name", "Fatality", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
