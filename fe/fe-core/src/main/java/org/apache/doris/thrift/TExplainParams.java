/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public class TExplainParams implements org.apache.thrift.TBase<TExplainParams, TExplainParams._Fields>, java.io.Serializable, Cloneable, Comparable<TExplainParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TExplainParams");

  private static final org.apache.thrift.protocol.TField EXPLAIN_FIELD_DESC = new org.apache.thrift.protocol.TField("explain", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TExplainParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TExplainParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String explain; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXPLAIN((short)1, "explain");

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
        case 1: // EXPLAIN
          return EXPLAIN;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXPLAIN, new org.apache.thrift.meta_data.FieldMetaData("explain", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TExplainParams.class, metaDataMap);
  }

  public TExplainParams() {
  }

  public TExplainParams(
    java.lang.String explain)
  {
    this();
    this.explain = explain;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TExplainParams(TExplainParams other) {
    if (other.isSetExplain()) {
      this.explain = other.explain;
    }
  }

  public TExplainParams deepCopy() {
    return new TExplainParams(this);
  }

  @Override
  public void clear() {
    this.explain = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getExplain() {
    return this.explain;
  }

  public TExplainParams setExplain(@org.apache.thrift.annotation.Nullable java.lang.String explain) {
    this.explain = explain;
    return this;
  }

  public void unsetExplain() {
    this.explain = null;
  }

  /** Returns true if field explain is set (has been assigned a value) and false otherwise */
  public boolean isSetExplain() {
    return this.explain != null;
  }

  public void setExplainIsSet(boolean value) {
    if (!value) {
      this.explain = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case EXPLAIN:
      if (value == null) {
        unsetExplain();
      } else {
        setExplain((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case EXPLAIN:
      return getExplain();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case EXPLAIN:
      return isSetExplain();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TExplainParams)
      return this.equals((TExplainParams)that);
    return false;
  }

  public boolean equals(TExplainParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_explain = true && this.isSetExplain();
    boolean that_present_explain = true && that.isSetExplain();
    if (this_present_explain || that_present_explain) {
      if (!(this_present_explain && that_present_explain))
        return false;
      if (!this.explain.equals(that.explain))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetExplain()) ? 131071 : 524287);
    if (isSetExplain())
      hashCode = hashCode * 8191 + explain.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TExplainParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetExplain(), other.isSetExplain());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExplain()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.explain, other.explain);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TExplainParams(");
    boolean first = true;

    sb.append("explain:");
    if (this.explain == null) {
      sb.append("null");
    } else {
      sb.append(this.explain);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (explain == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'explain' was not present! Struct: " + toString());
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TExplainParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TExplainParamsStandardScheme getScheme() {
      return new TExplainParamsStandardScheme();
    }
  }

  private static class TExplainParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TExplainParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TExplainParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXPLAIN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.explain = iprot.readString();
              struct.setExplainIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TExplainParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.explain != null) {
        oprot.writeFieldBegin(EXPLAIN_FIELD_DESC);
        oprot.writeString(struct.explain);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TExplainParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TExplainParamsTupleScheme getScheme() {
      return new TExplainParamsTupleScheme();
    }
  }

  private static class TExplainParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TExplainParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TExplainParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.explain);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TExplainParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.explain = iprot.readString();
      struct.setExplainIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

