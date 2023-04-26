/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public class TAnalyticWindowBoundary implements org.apache.thrift.TBase<TAnalyticWindowBoundary, TAnalyticWindowBoundary._Fields>, java.io.Serializable, Cloneable, Comparable<TAnalyticWindowBoundary> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAnalyticWindowBoundary");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField RANGE_OFFSET_PREDICATE_FIELD_DESC = new org.apache.thrift.protocol.TField("range_offset_predicate", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField ROWS_OFFSET_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("rows_offset_value", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TAnalyticWindowBoundaryStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TAnalyticWindowBoundaryTupleSchemeFactory();

  /**
   * 
   * @see TAnalyticWindowBoundaryType
   */
  public @org.apache.thrift.annotation.Nullable TAnalyticWindowBoundaryType type; // required
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr range_offset_predicate; // optional
  public long rows_offset_value; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TAnalyticWindowBoundaryType
     */
    TYPE((short)1, "type"),
    RANGE_OFFSET_PREDICATE((short)2, "range_offset_predicate"),
    ROWS_OFFSET_VALUE((short)3, "rows_offset_value");

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
        case 1: // TYPE
          return TYPE;
        case 2: // RANGE_OFFSET_PREDICATE
          return RANGE_OFFSET_PREDICATE;
        case 3: // ROWS_OFFSET_VALUE
          return ROWS_OFFSET_VALUE;
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
  private static final int __ROWS_OFFSET_VALUE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RANGE_OFFSET_PREDICATE,_Fields.ROWS_OFFSET_VALUE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TAnalyticWindowBoundaryType.class)));
    tmpMap.put(_Fields.RANGE_OFFSET_PREDICATE, new org.apache.thrift.meta_data.FieldMetaData("range_offset_predicate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TExpr.class)));
    tmpMap.put(_Fields.ROWS_OFFSET_VALUE, new org.apache.thrift.meta_data.FieldMetaData("rows_offset_value", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAnalyticWindowBoundary.class, metaDataMap);
  }

  public TAnalyticWindowBoundary() {
  }

  public TAnalyticWindowBoundary(
    TAnalyticWindowBoundaryType type)
  {
    this();
    this.type = type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAnalyticWindowBoundary(TAnalyticWindowBoundary other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetRangeOffsetPredicate()) {
      this.range_offset_predicate = new org.apache.doris.thrift.TExpr(other.range_offset_predicate);
    }
    this.rows_offset_value = other.rows_offset_value;
  }

  public TAnalyticWindowBoundary deepCopy() {
    return new TAnalyticWindowBoundary(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.range_offset_predicate = null;
    setRowsOffsetValueIsSet(false);
    this.rows_offset_value = 0;
  }

  /**
   * 
   * @see TAnalyticWindowBoundaryType
   */
  @org.apache.thrift.annotation.Nullable
  public TAnalyticWindowBoundaryType getType() {
    return this.type;
  }

  /**
   * 
   * @see TAnalyticWindowBoundaryType
   */
  public TAnalyticWindowBoundary setType(@org.apache.thrift.annotation.Nullable TAnalyticWindowBoundaryType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TExpr getRangeOffsetPredicate() {
    return this.range_offset_predicate;
  }

  public TAnalyticWindowBoundary setRangeOffsetPredicate(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr range_offset_predicate) {
    this.range_offset_predicate = range_offset_predicate;
    return this;
  }

  public void unsetRangeOffsetPredicate() {
    this.range_offset_predicate = null;
  }

  /** Returns true if field range_offset_predicate is set (has been assigned a value) and false otherwise */
  public boolean isSetRangeOffsetPredicate() {
    return this.range_offset_predicate != null;
  }

  public void setRangeOffsetPredicateIsSet(boolean value) {
    if (!value) {
      this.range_offset_predicate = null;
    }
  }

  public long getRowsOffsetValue() {
    return this.rows_offset_value;
  }

  public TAnalyticWindowBoundary setRowsOffsetValue(long rows_offset_value) {
    this.rows_offset_value = rows_offset_value;
    setRowsOffsetValueIsSet(true);
    return this;
  }

  public void unsetRowsOffsetValue() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ROWS_OFFSET_VALUE_ISSET_ID);
  }

  /** Returns true if field rows_offset_value is set (has been assigned a value) and false otherwise */
  public boolean isSetRowsOffsetValue() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ROWS_OFFSET_VALUE_ISSET_ID);
  }

  public void setRowsOffsetValueIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ROWS_OFFSET_VALUE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((TAnalyticWindowBoundaryType)value);
      }
      break;

    case RANGE_OFFSET_PREDICATE:
      if (value == null) {
        unsetRangeOffsetPredicate();
      } else {
        setRangeOffsetPredicate((org.apache.doris.thrift.TExpr)value);
      }
      break;

    case ROWS_OFFSET_VALUE:
      if (value == null) {
        unsetRowsOffsetValue();
      } else {
        setRowsOffsetValue((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case RANGE_OFFSET_PREDICATE:
      return getRangeOffsetPredicate();

    case ROWS_OFFSET_VALUE:
      return getRowsOffsetValue();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case RANGE_OFFSET_PREDICATE:
      return isSetRangeOffsetPredicate();
    case ROWS_OFFSET_VALUE:
      return isSetRowsOffsetValue();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TAnalyticWindowBoundary)
      return this.equals((TAnalyticWindowBoundary)that);
    return false;
  }

  public boolean equals(TAnalyticWindowBoundary that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_range_offset_predicate = true && this.isSetRangeOffsetPredicate();
    boolean that_present_range_offset_predicate = true && that.isSetRangeOffsetPredicate();
    if (this_present_range_offset_predicate || that_present_range_offset_predicate) {
      if (!(this_present_range_offset_predicate && that_present_range_offset_predicate))
        return false;
      if (!this.range_offset_predicate.equals(that.range_offset_predicate))
        return false;
    }

    boolean this_present_rows_offset_value = true && this.isSetRowsOffsetValue();
    boolean that_present_rows_offset_value = true && that.isSetRowsOffsetValue();
    if (this_present_rows_offset_value || that_present_rows_offset_value) {
      if (!(this_present_rows_offset_value && that_present_rows_offset_value))
        return false;
      if (this.rows_offset_value != that.rows_offset_value)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    hashCode = hashCode * 8191 + ((isSetRangeOffsetPredicate()) ? 131071 : 524287);
    if (isSetRangeOffsetPredicate())
      hashCode = hashCode * 8191 + range_offset_predicate.hashCode();

    hashCode = hashCode * 8191 + ((isSetRowsOffsetValue()) ? 131071 : 524287);
    if (isSetRowsOffsetValue())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(rows_offset_value);

    return hashCode;
  }

  @Override
  public int compareTo(TAnalyticWindowBoundary other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetType(), other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRangeOffsetPredicate(), other.isSetRangeOffsetPredicate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRangeOffsetPredicate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.range_offset_predicate, other.range_offset_predicate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRowsOffsetValue(), other.isSetRowsOffsetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRowsOffsetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rows_offset_value, other.rows_offset_value);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TAnalyticWindowBoundary(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (isSetRangeOffsetPredicate()) {
      if (!first) sb.append(", ");
      sb.append("range_offset_predicate:");
      if (this.range_offset_predicate == null) {
        sb.append("null");
      } else {
        sb.append(this.range_offset_predicate);
      }
      first = false;
    }
    if (isSetRowsOffsetValue()) {
      if (!first) sb.append(", ");
      sb.append("rows_offset_value:");
      sb.append(this.rows_offset_value);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (range_offset_predicate != null) {
      range_offset_predicate.validate();
    }
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

  private static class TAnalyticWindowBoundaryStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TAnalyticWindowBoundaryStandardScheme getScheme() {
      return new TAnalyticWindowBoundaryStandardScheme();
    }
  }

  private static class TAnalyticWindowBoundaryStandardScheme extends org.apache.thrift.scheme.StandardScheme<TAnalyticWindowBoundary> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAnalyticWindowBoundary struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = org.apache.doris.thrift.TAnalyticWindowBoundaryType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RANGE_OFFSET_PREDICATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.range_offset_predicate = new org.apache.doris.thrift.TExpr();
              struct.range_offset_predicate.read(iprot);
              struct.setRangeOffsetPredicateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ROWS_OFFSET_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.rows_offset_value = iprot.readI64();
              struct.setRowsOffsetValueIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAnalyticWindowBoundary struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.range_offset_predicate != null) {
        if (struct.isSetRangeOffsetPredicate()) {
          oprot.writeFieldBegin(RANGE_OFFSET_PREDICATE_FIELD_DESC);
          struct.range_offset_predicate.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetRowsOffsetValue()) {
        oprot.writeFieldBegin(ROWS_OFFSET_VALUE_FIELD_DESC);
        oprot.writeI64(struct.rows_offset_value);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAnalyticWindowBoundaryTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TAnalyticWindowBoundaryTupleScheme getScheme() {
      return new TAnalyticWindowBoundaryTupleScheme();
    }
  }

  private static class TAnalyticWindowBoundaryTupleScheme extends org.apache.thrift.scheme.TupleScheme<TAnalyticWindowBoundary> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAnalyticWindowBoundary struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.type.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRangeOffsetPredicate()) {
        optionals.set(0);
      }
      if (struct.isSetRowsOffsetValue()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetRangeOffsetPredicate()) {
        struct.range_offset_predicate.write(oprot);
      }
      if (struct.isSetRowsOffsetValue()) {
        oprot.writeI64(struct.rows_offset_value);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAnalyticWindowBoundary struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.type = org.apache.doris.thrift.TAnalyticWindowBoundaryType.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.range_offset_predicate = new org.apache.doris.thrift.TExpr();
        struct.range_offset_predicate.read(iprot);
        struct.setRangeOffsetPredicateIsSet(true);
      }
      if (incoming.get(1)) {
        struct.rows_offset_value = iprot.readI64();
        struct.setRowsOffsetValueIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

