/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public enum TFileType implements org.apache.thrift.TEnum {
  FILE_LOCAL(0),
  FILE_BROKER(1),
  FILE_STREAM(2),
  FILE_S3(3),
  FILE_HDFS(4);

  private final int value;

  private TFileType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static TFileType findByValue(int value) { 
    switch (value) {
      case 0:
        return FILE_LOCAL;
      case 1:
        return FILE_BROKER;
      case 2:
        return FILE_STREAM;
      case 3:
        return FILE_S3;
      case 4:
        return FILE_HDFS;
      default:
        return null;
    }
  }
}
