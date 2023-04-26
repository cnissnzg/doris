/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.parquet.format;


/**
 * Representation of Schemas
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public enum FieldRepetitionType implements org.apache.thrift.TEnum {
  /**
   * This field is required (can not be null) and each record has exactly 1 value.
   */
  REQUIRED(0),
  /**
   * The field is optional (can be null) and each record has 0 or 1 values.
   */
  OPTIONAL(1),
  /**
   * The field is repeated and can contain 0 or more values
   */
  REPEATED(2);

  private final int value;

  private FieldRepetitionType(int value) {
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
  public static FieldRepetitionType findByValue(int value) { 
    switch (value) {
      case 0:
        return REQUIRED;
      case 1:
        return OPTIONAL;
      case 2:
        return REPEATED;
      default:
        return null;
    }
  }
}
