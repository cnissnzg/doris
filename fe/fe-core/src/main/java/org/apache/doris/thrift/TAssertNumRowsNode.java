/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public class TAssertNumRowsNode implements org.apache.thrift.TBase<TAssertNumRowsNode, TAssertNumRowsNode._Fields>, java.io.Serializable, Cloneable, Comparable<TAssertNumRowsNode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAssertNumRowsNode");

  private static final org.apache.thrift.protocol.TField DESIRED_NUM_ROWS_FIELD_DESC = new org.apache.thrift.protocol.TField("desired_num_rows", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField SUBQUERY_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("subquery_string", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ASSERTION_FIELD_DESC = new org.apache.thrift.protocol.TField("assertion", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TAssertNumRowsNodeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TAssertNumRowsNodeTupleSchemeFactory();

  public long desired_num_rows; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String subquery_string; // optional
  /**
   * 
   * @see TAssertion
   */
  public @org.apache.thrift.annotation.Nullable TAssertion assertion; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DESIRED_NUM_ROWS((short)1, "desired_num_rows"),
    SUBQUERY_STRING((short)2, "subquery_string"),
    /**
     * 
     * @see TAssertion
     */
    ASSERTION((short)3, "assertion");

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
        case 1: // DESIRED_NUM_ROWS
          return DESIRED_NUM_ROWS;
        case 2: // SUBQUERY_STRING
          return SUBQUERY_STRING;
        case 3: // ASSERTION
          return ASSERTION;
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
  private static final int __DESIRED_NUM_ROWS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DESIRED_NUM_ROWS,_Fields.SUBQUERY_STRING,_Fields.ASSERTION};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DESIRED_NUM_ROWS, new org.apache.thrift.meta_data.FieldMetaData("desired_num_rows", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SUBQUERY_STRING, new org.apache.thrift.meta_data.FieldMetaData("subquery_string", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ASSERTION, new org.apache.thrift.meta_data.FieldMetaData("assertion", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TAssertion.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAssertNumRowsNode.class, metaDataMap);
  }

  public TAssertNumRowsNode() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAssertNumRowsNode(TAssertNumRowsNode other) {
    __isset_bitfield = other.__isset_bitfield;
    this.desired_num_rows = other.desired_num_rows;
    if (other.isSetSubqueryString()) {
      this.subquery_string = other.subquery_string;
    }
    if (other.isSetAssertion()) {
      this.assertion = other.assertion;
    }
  }

  public TAssertNumRowsNode deepCopy() {
    return new TAssertNumRowsNode(this);
  }

  @Override
  public void clear() {
    setDesiredNumRowsIsSet(false);
    this.desired_num_rows = 0;
    this.subquery_string = null;
    this.assertion = null;
  }

  public long getDesiredNumRows() {
    return this.desired_num_rows;
  }

  public TAssertNumRowsNode setDesiredNumRows(long desired_num_rows) {
    this.desired_num_rows = desired_num_rows;
    setDesiredNumRowsIsSet(true);
    return this;
  }

  public void unsetDesiredNumRows() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DESIRED_NUM_ROWS_ISSET_ID);
  }

  /** Returns true if field desired_num_rows is set (has been assigned a value) and false otherwise */
  public boolean isSetDesiredNumRows() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DESIRED_NUM_ROWS_ISSET_ID);
  }

  public void setDesiredNumRowsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DESIRED_NUM_ROWS_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSubqueryString() {
    return this.subquery_string;
  }

  public TAssertNumRowsNode setSubqueryString(@org.apache.thrift.annotation.Nullable java.lang.String subquery_string) {
    this.subquery_string = subquery_string;
    return this;
  }

  public void unsetSubqueryString() {
    this.subquery_string = null;
  }

  /** Returns true if field subquery_string is set (has been assigned a value) and false otherwise */
  public boolean isSetSubqueryString() {
    return this.subquery_string != null;
  }

  public void setSubqueryStringIsSet(boolean value) {
    if (!value) {
      this.subquery_string = null;
    }
  }

  /**
   * 
   * @see TAssertion
   */
  @org.apache.thrift.annotation.Nullable
  public TAssertion getAssertion() {
    return this.assertion;
  }

  /**
   * 
   * @see TAssertion
   */
  public TAssertNumRowsNode setAssertion(@org.apache.thrift.annotation.Nullable TAssertion assertion) {
    this.assertion = assertion;
    return this;
  }

  public void unsetAssertion() {
    this.assertion = null;
  }

  /** Returns true if field assertion is set (has been assigned a value) and false otherwise */
  public boolean isSetAssertion() {
    return this.assertion != null;
  }

  public void setAssertionIsSet(boolean value) {
    if (!value) {
      this.assertion = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case DESIRED_NUM_ROWS:
      if (value == null) {
        unsetDesiredNumRows();
      } else {
        setDesiredNumRows((java.lang.Long)value);
      }
      break;

    case SUBQUERY_STRING:
      if (value == null) {
        unsetSubqueryString();
      } else {
        setSubqueryString((java.lang.String)value);
      }
      break;

    case ASSERTION:
      if (value == null) {
        unsetAssertion();
      } else {
        setAssertion((TAssertion)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DESIRED_NUM_ROWS:
      return getDesiredNumRows();

    case SUBQUERY_STRING:
      return getSubqueryString();

    case ASSERTION:
      return getAssertion();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case DESIRED_NUM_ROWS:
      return isSetDesiredNumRows();
    case SUBQUERY_STRING:
      return isSetSubqueryString();
    case ASSERTION:
      return isSetAssertion();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TAssertNumRowsNode)
      return this.equals((TAssertNumRowsNode)that);
    return false;
  }

  public boolean equals(TAssertNumRowsNode that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_desired_num_rows = true && this.isSetDesiredNumRows();
    boolean that_present_desired_num_rows = true && that.isSetDesiredNumRows();
    if (this_present_desired_num_rows || that_present_desired_num_rows) {
      if (!(this_present_desired_num_rows && that_present_desired_num_rows))
        return false;
      if (this.desired_num_rows != that.desired_num_rows)
        return false;
    }

    boolean this_present_subquery_string = true && this.isSetSubqueryString();
    boolean that_present_subquery_string = true && that.isSetSubqueryString();
    if (this_present_subquery_string || that_present_subquery_string) {
      if (!(this_present_subquery_string && that_present_subquery_string))
        return false;
      if (!this.subquery_string.equals(that.subquery_string))
        return false;
    }

    boolean this_present_assertion = true && this.isSetAssertion();
    boolean that_present_assertion = true && that.isSetAssertion();
    if (this_present_assertion || that_present_assertion) {
      if (!(this_present_assertion && that_present_assertion))
        return false;
      if (!this.assertion.equals(that.assertion))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDesiredNumRows()) ? 131071 : 524287);
    if (isSetDesiredNumRows())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(desired_num_rows);

    hashCode = hashCode * 8191 + ((isSetSubqueryString()) ? 131071 : 524287);
    if (isSetSubqueryString())
      hashCode = hashCode * 8191 + subquery_string.hashCode();

    hashCode = hashCode * 8191 + ((isSetAssertion()) ? 131071 : 524287);
    if (isSetAssertion())
      hashCode = hashCode * 8191 + assertion.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TAssertNumRowsNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetDesiredNumRows(), other.isSetDesiredNumRows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDesiredNumRows()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.desired_num_rows, other.desired_num_rows);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSubqueryString(), other.isSetSubqueryString());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubqueryString()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subquery_string, other.subquery_string);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetAssertion(), other.isSetAssertion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAssertion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.assertion, other.assertion);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TAssertNumRowsNode(");
    boolean first = true;

    if (isSetDesiredNumRows()) {
      sb.append("desired_num_rows:");
      sb.append(this.desired_num_rows);
      first = false;
    }
    if (isSetSubqueryString()) {
      if (!first) sb.append(", ");
      sb.append("subquery_string:");
      if (this.subquery_string == null) {
        sb.append("null");
      } else {
        sb.append(this.subquery_string);
      }
      first = false;
    }
    if (isSetAssertion()) {
      if (!first) sb.append(", ");
      sb.append("assertion:");
      if (this.assertion == null) {
        sb.append("null");
      } else {
        sb.append(this.assertion);
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

  private static class TAssertNumRowsNodeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TAssertNumRowsNodeStandardScheme getScheme() {
      return new TAssertNumRowsNodeStandardScheme();
    }
  }

  private static class TAssertNumRowsNodeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TAssertNumRowsNode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAssertNumRowsNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DESIRED_NUM_ROWS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.desired_num_rows = iprot.readI64();
              struct.setDesiredNumRowsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SUBQUERY_STRING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.subquery_string = iprot.readString();
              struct.setSubqueryStringIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ASSERTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.assertion = org.apache.doris.thrift.TAssertion.findByValue(iprot.readI32());
              struct.setAssertionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAssertNumRowsNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetDesiredNumRows()) {
        oprot.writeFieldBegin(DESIRED_NUM_ROWS_FIELD_DESC);
        oprot.writeI64(struct.desired_num_rows);
        oprot.writeFieldEnd();
      }
      if (struct.subquery_string != null) {
        if (struct.isSetSubqueryString()) {
          oprot.writeFieldBegin(SUBQUERY_STRING_FIELD_DESC);
          oprot.writeString(struct.subquery_string);
          oprot.writeFieldEnd();
        }
      }
      if (struct.assertion != null) {
        if (struct.isSetAssertion()) {
          oprot.writeFieldBegin(ASSERTION_FIELD_DESC);
          oprot.writeI32(struct.assertion.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAssertNumRowsNodeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TAssertNumRowsNodeTupleScheme getScheme() {
      return new TAssertNumRowsNodeTupleScheme();
    }
  }

  private static class TAssertNumRowsNodeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TAssertNumRowsNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAssertNumRowsNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDesiredNumRows()) {
        optionals.set(0);
      }
      if (struct.isSetSubqueryString()) {
        optionals.set(1);
      }
      if (struct.isSetAssertion()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetDesiredNumRows()) {
        oprot.writeI64(struct.desired_num_rows);
      }
      if (struct.isSetSubqueryString()) {
        oprot.writeString(struct.subquery_string);
      }
      if (struct.isSetAssertion()) {
        oprot.writeI32(struct.assertion.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAssertNumRowsNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.desired_num_rows = iprot.readI64();
        struct.setDesiredNumRowsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.subquery_string = iprot.readString();
        struct.setSubqueryStringIsSet(true);
      }
      if (incoming.get(2)) {
        struct.assertion = org.apache.doris.thrift.TAssertion.findByValue(iprot.readI32());
        struct.setAssertionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

