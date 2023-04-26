/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public class TCell implements org.apache.thrift.TBase<TCell, TCell._Fields>, java.io.Serializable, Cloneable, Comparable<TCell> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCell");

  private static final org.apache.thrift.protocol.TField BOOL_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("boolVal", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField INT_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("intVal", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField LONG_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("longVal", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField DOUBLE_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("doubleVal", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField STRING_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("stringVal", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TCellStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TCellTupleSchemeFactory();

  public boolean boolVal; // optional
  public int intVal; // optional
  public long longVal; // optional
  public double doubleVal; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String stringVal; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BOOL_VAL((short)1, "boolVal"),
    INT_VAL((short)2, "intVal"),
    LONG_VAL((short)3, "longVal"),
    DOUBLE_VAL((short)4, "doubleVal"),
    STRING_VAL((short)5, "stringVal");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BOOL_VAL
          return BOOL_VAL;
        case 2: // INT_VAL
          return INT_VAL;
        case 3: // LONG_VAL
          return LONG_VAL;
        case 4: // DOUBLE_VAL
          return DOUBLE_VAL;
        case 5: // STRING_VAL
          return STRING_VAL;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __BOOLVAL_ISSET_ID = 0;
  private static final int __INTVAL_ISSET_ID = 1;
  private static final int __LONGVAL_ISSET_ID = 2;
  private static final int __DOUBLEVAL_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.BOOL_VAL,_Fields.INT_VAL,_Fields.LONG_VAL,_Fields.DOUBLE_VAL,_Fields.STRING_VAL};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BOOL_VAL, new org.apache.thrift.meta_data.FieldMetaData("boolVal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.INT_VAL, new org.apache.thrift.meta_data.FieldMetaData("intVal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LONG_VAL, new org.apache.thrift.meta_data.FieldMetaData("longVal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DOUBLE_VAL, new org.apache.thrift.meta_data.FieldMetaData("doubleVal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.STRING_VAL, new org.apache.thrift.meta_data.FieldMetaData("stringVal", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCell.class, metaDataMap);
  }

  public TCell() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCell(TCell other) {
    __isset_bitfield = other.__isset_bitfield;
    this.boolVal = other.boolVal;
    this.intVal = other.intVal;
    this.longVal = other.longVal;
    this.doubleVal = other.doubleVal;
    if (other.isSetStringVal()) {
      this.stringVal = other.stringVal;
    }
  }

  public TCell deepCopy() {
    return new TCell(this);
  }

  @Override
  public void clear() {
    setBoolValIsSet(false);
    this.boolVal = false;
    setIntValIsSet(false);
    this.intVal = 0;
    setLongValIsSet(false);
    this.longVal = 0;
    setDoubleValIsSet(false);
    this.doubleVal = 0.0;
    this.stringVal = null;
  }

  public boolean isBoolVal() {
    return this.boolVal;
  }

  public TCell setBoolVal(boolean boolVal) {
    this.boolVal = boolVal;
    setBoolValIsSet(true);
    return this;
  }

  public void unsetBoolVal() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __BOOLVAL_ISSET_ID);
  }

  /** Returns true if field boolVal is set (has been assigned a value) and false otherwise */
  public boolean isSetBoolVal() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __BOOLVAL_ISSET_ID);
  }

  public void setBoolValIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __BOOLVAL_ISSET_ID, value);
  }

  public int getIntVal() {
    return this.intVal;
  }

  public TCell setIntVal(int intVal) {
    this.intVal = intVal;
    setIntValIsSet(true);
    return this;
  }

  public void unsetIntVal() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INTVAL_ISSET_ID);
  }

  /** Returns true if field intVal is set (has been assigned a value) and false otherwise */
  public boolean isSetIntVal() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INTVAL_ISSET_ID);
  }

  public void setIntValIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INTVAL_ISSET_ID, value);
  }

  public long getLongVal() {
    return this.longVal;
  }

  public TCell setLongVal(long longVal) {
    this.longVal = longVal;
    setLongValIsSet(true);
    return this;
  }

  public void unsetLongVal() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LONGVAL_ISSET_ID);
  }

  /** Returns true if field longVal is set (has been assigned a value) and false otherwise */
  public boolean isSetLongVal() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LONGVAL_ISSET_ID);
  }

  public void setLongValIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LONGVAL_ISSET_ID, value);
  }

  public double getDoubleVal() {
    return this.doubleVal;
  }

  public TCell setDoubleVal(double doubleVal) {
    this.doubleVal = doubleVal;
    setDoubleValIsSet(true);
    return this;
  }

  public void unsetDoubleVal() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DOUBLEVAL_ISSET_ID);
  }

  /** Returns true if field doubleVal is set (has been assigned a value) and false otherwise */
  public boolean isSetDoubleVal() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DOUBLEVAL_ISSET_ID);
  }

  public void setDoubleValIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DOUBLEVAL_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getStringVal() {
    return this.stringVal;
  }

  public TCell setStringVal(@org.apache.thrift.annotation.Nullable java.lang.String stringVal) {
    this.stringVal = stringVal;
    return this;
  }

  public void unsetStringVal() {
    this.stringVal = null;
  }

  /** Returns true if field stringVal is set (has been assigned a value) and false otherwise */
  public boolean isSetStringVal() {
    return this.stringVal != null;
  }

  public void setStringValIsSet(boolean value) {
    if (!value) {
      this.stringVal = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case BOOL_VAL:
      if (value == null) {
        unsetBoolVal();
      } else {
        setBoolVal((java.lang.Boolean)value);
      }
      break;

    case INT_VAL:
      if (value == null) {
        unsetIntVal();
      } else {
        setIntVal((java.lang.Integer)value);
      }
      break;

    case LONG_VAL:
      if (value == null) {
        unsetLongVal();
      } else {
        setLongVal((java.lang.Long)value);
      }
      break;

    case DOUBLE_VAL:
      if (value == null) {
        unsetDoubleVal();
      } else {
        setDoubleVal((java.lang.Double)value);
      }
      break;

    case STRING_VAL:
      if (value == null) {
        unsetStringVal();
      } else {
        setStringVal((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case BOOL_VAL:
      return isBoolVal();

    case INT_VAL:
      return getIntVal();

    case LONG_VAL:
      return getLongVal();

    case DOUBLE_VAL:
      return getDoubleVal();

    case STRING_VAL:
      return getStringVal();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case BOOL_VAL:
      return isSetBoolVal();
    case INT_VAL:
      return isSetIntVal();
    case LONG_VAL:
      return isSetLongVal();
    case DOUBLE_VAL:
      return isSetDoubleVal();
    case STRING_VAL:
      return isSetStringVal();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TCell)
      return this.equals((TCell)that);
    return false;
  }

  public boolean equals(TCell that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_boolVal = true && this.isSetBoolVal();
    boolean that_present_boolVal = true && that.isSetBoolVal();
    if (this_present_boolVal || that_present_boolVal) {
      if (!(this_present_boolVal && that_present_boolVal))
        return false;
      if (this.boolVal != that.boolVal)
        return false;
    }

    boolean this_present_intVal = true && this.isSetIntVal();
    boolean that_present_intVal = true && that.isSetIntVal();
    if (this_present_intVal || that_present_intVal) {
      if (!(this_present_intVal && that_present_intVal))
        return false;
      if (this.intVal != that.intVal)
        return false;
    }

    boolean this_present_longVal = true && this.isSetLongVal();
    boolean that_present_longVal = true && that.isSetLongVal();
    if (this_present_longVal || that_present_longVal) {
      if (!(this_present_longVal && that_present_longVal))
        return false;
      if (this.longVal != that.longVal)
        return false;
    }

    boolean this_present_doubleVal = true && this.isSetDoubleVal();
    boolean that_present_doubleVal = true && that.isSetDoubleVal();
    if (this_present_doubleVal || that_present_doubleVal) {
      if (!(this_present_doubleVal && that_present_doubleVal))
        return false;
      if (this.doubleVal != that.doubleVal)
        return false;
    }

    boolean this_present_stringVal = true && this.isSetStringVal();
    boolean that_present_stringVal = true && that.isSetStringVal();
    if (this_present_stringVal || that_present_stringVal) {
      if (!(this_present_stringVal && that_present_stringVal))
        return false;
      if (!this.stringVal.equals(that.stringVal))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetBoolVal()) ? 131071 : 524287);
    if (isSetBoolVal())
      hashCode = hashCode * 8191 + ((boolVal) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetIntVal()) ? 131071 : 524287);
    if (isSetIntVal())
      hashCode = hashCode * 8191 + intVal;

    hashCode = hashCode * 8191 + ((isSetLongVal()) ? 131071 : 524287);
    if (isSetLongVal())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(longVal);

    hashCode = hashCode * 8191 + ((isSetDoubleVal()) ? 131071 : 524287);
    if (isSetDoubleVal())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(doubleVal);

    hashCode = hashCode * 8191 + ((isSetStringVal()) ? 131071 : 524287);
    if (isSetStringVal())
      hashCode = hashCode * 8191 + stringVal.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TCell other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetBoolVal(), other.isSetBoolVal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBoolVal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.boolVal, other.boolVal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIntVal(), other.isSetIntVal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIntVal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.intVal, other.intVal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetLongVal(), other.isSetLongVal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLongVal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.longVal, other.longVal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDoubleVal(), other.isSetDoubleVal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDoubleVal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.doubleVal, other.doubleVal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetStringVal(), other.isSetStringVal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStringVal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stringVal, other.stringVal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TCell(");
    boolean first = true;

    if (isSetBoolVal()) {
      sb.append("boolVal:");
      sb.append(this.boolVal);
      first = false;
    }
    if (isSetIntVal()) {
      if (!first) sb.append(", ");
      sb.append("intVal:");
      sb.append(this.intVal);
      first = false;
    }
    if (isSetLongVal()) {
      if (!first) sb.append(", ");
      sb.append("longVal:");
      sb.append(this.longVal);
      first = false;
    }
    if (isSetDoubleVal()) {
      if (!first) sb.append(", ");
      sb.append("doubleVal:");
      sb.append(this.doubleVal);
      first = false;
    }
    if (isSetStringVal()) {
      if (!first) sb.append(", ");
      sb.append("stringVal:");
      if (this.stringVal == null) {
        sb.append("null");
      } else {
        sb.append(this.stringVal);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TCellStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCellStandardScheme getScheme() {
      return new TCellStandardScheme();
    }
  }

  private static class TCellStandardScheme extends org.apache.thrift.scheme.StandardScheme<TCell> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCell struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BOOL_VAL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.boolVal = iprot.readBool();
              struct.setBoolValIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INT_VAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.intVal = iprot.readI32();
              struct.setIntValIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LONG_VAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.longVal = iprot.readI64();
              struct.setLongValIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DOUBLE_VAL
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.doubleVal = iprot.readDouble();
              struct.setDoubleValIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STRING_VAL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stringVal = iprot.readString();
              struct.setStringValIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCell struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetBoolVal()) {
        oprot.writeFieldBegin(BOOL_VAL_FIELD_DESC);
        oprot.writeBool(struct.boolVal);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIntVal()) {
        oprot.writeFieldBegin(INT_VAL_FIELD_DESC);
        oprot.writeI32(struct.intVal);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLongVal()) {
        oprot.writeFieldBegin(LONG_VAL_FIELD_DESC);
        oprot.writeI64(struct.longVal);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDoubleVal()) {
        oprot.writeFieldBegin(DOUBLE_VAL_FIELD_DESC);
        oprot.writeDouble(struct.doubleVal);
        oprot.writeFieldEnd();
      }
      if (struct.stringVal != null) {
        if (struct.isSetStringVal()) {
          oprot.writeFieldBegin(STRING_VAL_FIELD_DESC);
          oprot.writeString(struct.stringVal);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCellTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCellTupleScheme getScheme() {
      return new TCellTupleScheme();
    }
  }

  private static class TCellTupleScheme extends org.apache.thrift.scheme.TupleScheme<TCell> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCell struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetBoolVal()) {
        optionals.set(0);
      }
      if (struct.isSetIntVal()) {
        optionals.set(1);
      }
      if (struct.isSetLongVal()) {
        optionals.set(2);
      }
      if (struct.isSetDoubleVal()) {
        optionals.set(3);
      }
      if (struct.isSetStringVal()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetBoolVal()) {
        oprot.writeBool(struct.boolVal);
      }
      if (struct.isSetIntVal()) {
        oprot.writeI32(struct.intVal);
      }
      if (struct.isSetLongVal()) {
        oprot.writeI64(struct.longVal);
      }
      if (struct.isSetDoubleVal()) {
        oprot.writeDouble(struct.doubleVal);
      }
      if (struct.isSetStringVal()) {
        oprot.writeString(struct.stringVal);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCell struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.boolVal = iprot.readBool();
        struct.setBoolValIsSet(true);
      }
      if (incoming.get(1)) {
        struct.intVal = iprot.readI32();
        struct.setIntValIsSet(true);
      }
      if (incoming.get(2)) {
        struct.longVal = iprot.readI64();
        struct.setLongValIsSet(true);
      }
      if (incoming.get(3)) {
        struct.doubleVal = iprot.readDouble();
        struct.setDoubleValIsSet(true);
      }
      if (incoming.get(4)) {
        struct.stringVal = iprot.readString();
        struct.setStringValIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

