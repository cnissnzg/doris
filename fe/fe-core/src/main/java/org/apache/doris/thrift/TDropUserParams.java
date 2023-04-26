/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public class TDropUserParams implements org.apache.thrift.TBase<TDropUserParams, TDropUserParams._Fields>, java.io.Serializable, Cloneable, Comparable<TDropUserParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDropUserParams");

  private static final org.apache.thrift.protocol.TField USER_SPEC_FIELD_DESC = new org.apache.thrift.protocol.TField("user_spec", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDropUserParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDropUserParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String user_spec; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_SPEC((short)1, "user_spec");

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
        case 1: // USER_SPEC
          return USER_SPEC;
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
    tmpMap.put(_Fields.USER_SPEC, new org.apache.thrift.meta_data.FieldMetaData("user_spec", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDropUserParams.class, metaDataMap);
  }

  public TDropUserParams() {
  }

  public TDropUserParams(
    java.lang.String user_spec)
  {
    this();
    this.user_spec = user_spec;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDropUserParams(TDropUserParams other) {
    if (other.isSetUserSpec()) {
      this.user_spec = other.user_spec;
    }
  }

  public TDropUserParams deepCopy() {
    return new TDropUserParams(this);
  }

  @Override
  public void clear() {
    this.user_spec = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getUserSpec() {
    return this.user_spec;
  }

  public TDropUserParams setUserSpec(@org.apache.thrift.annotation.Nullable java.lang.String user_spec) {
    this.user_spec = user_spec;
    return this;
  }

  public void unsetUserSpec() {
    this.user_spec = null;
  }

  /** Returns true if field user_spec is set (has been assigned a value) and false otherwise */
  public boolean isSetUserSpec() {
    return this.user_spec != null;
  }

  public void setUserSpecIsSet(boolean value) {
    if (!value) {
      this.user_spec = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case USER_SPEC:
      if (value == null) {
        unsetUserSpec();
      } else {
        setUserSpec((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_SPEC:
      return getUserSpec();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USER_SPEC:
      return isSetUserSpec();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TDropUserParams)
      return this.equals((TDropUserParams)that);
    return false;
  }

  public boolean equals(TDropUserParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_user_spec = true && this.isSetUserSpec();
    boolean that_present_user_spec = true && that.isSetUserSpec();
    if (this_present_user_spec || that_present_user_spec) {
      if (!(this_present_user_spec && that_present_user_spec))
        return false;
      if (!this.user_spec.equals(that.user_spec))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUserSpec()) ? 131071 : 524287);
    if (isSetUserSpec())
      hashCode = hashCode * 8191 + user_spec.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TDropUserParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetUserSpec(), other.isSetUserSpec());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserSpec()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user_spec, other.user_spec);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDropUserParams(");
    boolean first = true;

    sb.append("user_spec:");
    if (this.user_spec == null) {
      sb.append("null");
    } else {
      sb.append(this.user_spec);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (user_spec == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'user_spec' was not present! Struct: " + toString());
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

  private static class TDropUserParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDropUserParamsStandardScheme getScheme() {
      return new TDropUserParamsStandardScheme();
    }
  }

  private static class TDropUserParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDropUserParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDropUserParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_SPEC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user_spec = iprot.readString();
              struct.setUserSpecIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDropUserParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.user_spec != null) {
        oprot.writeFieldBegin(USER_SPEC_FIELD_DESC);
        oprot.writeString(struct.user_spec);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDropUserParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDropUserParamsTupleScheme getScheme() {
      return new TDropUserParamsTupleScheme();
    }
  }

  private static class TDropUserParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDropUserParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDropUserParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.user_spec);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDropUserParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.user_spec = iprot.readString();
      struct.setUserSpecIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

