// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: disease.proto

package com.rafsan.disease;

public interface DiseaseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.rafsan.disease.Disease)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>int32 virus_id = 2;</code>
   * @return The virusId.
   */
  int getVirusId();

  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string fatality = 4;</code>
   * @return The fatality.
   */
  java.lang.String getFatality();
  /**
   * <code>string fatality = 4;</code>
   * @return The bytes for fatality.
   */
  com.google.protobuf.ByteString
      getFatalityBytes();
}
