/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public class TCaseExpr implements org.apache.thrift.TBase<TCaseExpr, TCaseExpr._Fields>, java.io.Serializable, Cloneable, Comparable<TCaseExpr> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCaseExpr");

  private static final org.apache.thrift.protocol.TField HAS_CASE_EXPR_FIELD_DESC = new org.apache.thrift.protocol.TField("has_case_expr", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField HAS_ELSE_EXPR_FIELD_DESC = new org.apache.thrift.protocol.TField("has_else_expr", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TCaseExprStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TCaseExprTupleSchemeFactory();

  public boolean has_case_expr; // required
  public boolean has_else_expr; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HAS_CASE_EXPR((short)1, "has_case_expr"),
    HAS_ELSE_EXPR((short)2, "has_else_expr");

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
        case 1: // HAS_CASE_EXPR
          return HAS_CASE_EXPR;
        case 2: // HAS_ELSE_EXPR
          return HAS_ELSE_EXPR;
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
  private static final int __HAS_CASE_EXPR_ISSET_ID = 0;
  private static final int __HAS_ELSE_EXPR_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HAS_CASE_EXPR, new org.apache.thrift.meta_data.FieldMetaData("has_case_expr", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.HAS_ELSE_EXPR, new org.apache.thrift.meta_data.FieldMetaData("has_else_expr", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCaseExpr.class, metaDataMap);
  }

  public TCaseExpr() {
  }

  public TCaseExpr(
    boolean has_case_expr,
    boolean has_else_expr)
  {
    this();
    this.has_case_expr = has_case_expr;
    setHasCaseExprIsSet(true);
    this.has_else_expr = has_else_expr;
    setHasElseExprIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCaseExpr(TCaseExpr other) {
    __isset_bitfield = other.__isset_bitfield;
    this.has_case_expr = other.has_case_expr;
    this.has_else_expr = other.has_else_expr;
  }

  public TCaseExpr deepCopy() {
    return new TCaseExpr(this);
  }

  @Override
  public void clear() {
    setHasCaseExprIsSet(false);
    this.has_case_expr = false;
    setHasElseExprIsSet(false);
    this.has_else_expr = false;
  }

  public boolean isHasCaseExpr() {
    return this.has_case_expr;
  }

  public TCaseExpr setHasCaseExpr(boolean has_case_expr) {
    this.has_case_expr = has_case_expr;
    setHasCaseExprIsSet(true);
    return this;
  }

  public void unsetHasCaseExpr() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HAS_CASE_EXPR_ISSET_ID);
  }

  /** Returns true if field has_case_expr is set (has been assigned a value) and false otherwise */
  public boolean isSetHasCaseExpr() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HAS_CASE_EXPR_ISSET_ID);
  }

  public void setHasCaseExprIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HAS_CASE_EXPR_ISSET_ID, value);
  }

  public boolean isHasElseExpr() {
    return this.has_else_expr;
  }

  public TCaseExpr setHasElseExpr(boolean has_else_expr) {
    this.has_else_expr = has_else_expr;
    setHasElseExprIsSet(true);
    return this;
  }

  public void unsetHasElseExpr() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HAS_ELSE_EXPR_ISSET_ID);
  }

  /** Returns true if field has_else_expr is set (has been assigned a value) and false otherwise */
  public boolean isSetHasElseExpr() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HAS_ELSE_EXPR_ISSET_ID);
  }

  public void setHasElseExprIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HAS_ELSE_EXPR_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case HAS_CASE_EXPR:
      if (value == null) {
        unsetHasCaseExpr();
      } else {
        setHasCaseExpr((java.lang.Boolean)value);
      }
      break;

    case HAS_ELSE_EXPR:
      if (value == null) {
        unsetHasElseExpr();
      } else {
        setHasElseExpr((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case HAS_CASE_EXPR:
      return isHasCaseExpr();

    case HAS_ELSE_EXPR:
      return isHasElseExpr();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case HAS_CASE_EXPR:
      return isSetHasCaseExpr();
    case HAS_ELSE_EXPR:
      return isSetHasElseExpr();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TCaseExpr)
      return this.equals((TCaseExpr)that);
    return false;
  }

  public boolean equals(TCaseExpr that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_has_case_expr = true;
    boolean that_present_has_case_expr = true;
    if (this_present_has_case_expr || that_present_has_case_expr) {
      if (!(this_present_has_case_expr && that_present_has_case_expr))
        return false;
      if (this.has_case_expr != that.has_case_expr)
        return false;
    }

    boolean this_present_has_else_expr = true;
    boolean that_present_has_else_expr = true;
    if (this_present_has_else_expr || that_present_has_else_expr) {
      if (!(this_present_has_else_expr && that_present_has_else_expr))
        return false;
      if (this.has_else_expr != that.has_else_expr)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((has_case_expr) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((has_else_expr) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TCaseExpr other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetHasCaseExpr(), other.isSetHasCaseExpr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasCaseExpr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.has_case_expr, other.has_case_expr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetHasElseExpr(), other.isSetHasElseExpr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasElseExpr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.has_else_expr, other.has_else_expr);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TCaseExpr(");
    boolean first = true;

    sb.append("has_case_expr:");
    sb.append(this.has_case_expr);
    first = false;
    if (!first) sb.append(", ");
    sb.append("has_else_expr:");
    sb.append(this.has_else_expr);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'has_case_expr' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'has_else_expr' because it's a primitive and you chose the non-beans generator.
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

  private static class TCaseExprStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCaseExprStandardScheme getScheme() {
      return new TCaseExprStandardScheme();
    }
  }

  private static class TCaseExprStandardScheme extends org.apache.thrift.scheme.StandardScheme<TCaseExpr> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCaseExpr struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HAS_CASE_EXPR
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.has_case_expr = iprot.readBool();
              struct.setHasCaseExprIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HAS_ELSE_EXPR
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.has_else_expr = iprot.readBool();
              struct.setHasElseExprIsSet(true);
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
      if (!struct.isSetHasCaseExpr()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'has_case_expr' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetHasElseExpr()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'has_else_expr' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCaseExpr struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(HAS_CASE_EXPR_FIELD_DESC);
      oprot.writeBool(struct.has_case_expr);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(HAS_ELSE_EXPR_FIELD_DESC);
      oprot.writeBool(struct.has_else_expr);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCaseExprTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCaseExprTupleScheme getScheme() {
      return new TCaseExprTupleScheme();
    }
  }

  private static class TCaseExprTupleScheme extends org.apache.thrift.scheme.TupleScheme<TCaseExpr> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCaseExpr struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeBool(struct.has_case_expr);
      oprot.writeBool(struct.has_else_expr);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCaseExpr struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.has_case_expr = iprot.readBool();
      struct.setHasCaseExprIsSet(true);
      struct.has_else_expr = iprot.readBool();
      struct.setHasElseExprIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

