/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public enum TMetadataType implements org.apache.thrift.TEnum {
  ICEBERG(0),
  BACKENDS(1),
  RESOURCE_GROUPS(2);

  private final int value;

  private TMetadataType(int value) {
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
  public static TMetadataType findByValue(int value) { 
    switch (value) {
      case 0:
        return ICEBERG;
      case 1:
        return BACKENDS;
      case 2:
        return RESOURCE_GROUPS;
      default:
        return null;
    }
  }
}
