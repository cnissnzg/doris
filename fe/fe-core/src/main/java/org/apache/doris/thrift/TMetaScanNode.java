/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public class TMetaScanNode implements org.apache.thrift.TBase<TMetaScanNode, TMetaScanNode._Fields>, java.io.Serializable, Cloneable, Comparable<TMetaScanNode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMetaScanNode");

  private static final org.apache.thrift.protocol.TField TUPLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tuple_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField METADATA_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata_type", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMetaScanNodeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMetaScanNodeTupleSchemeFactory();

  public int tuple_id; // required
  /**
   * 
   * @see org.apache.doris.thrift.TMetadataType
   */
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TMetadataType metadata_type; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TUPLE_ID((short)1, "tuple_id"),
    /**
     * 
     * @see org.apache.doris.thrift.TMetadataType
     */
    METADATA_TYPE((short)2, "metadata_type");

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
        case 1: // TUPLE_ID
          return TUPLE_ID;
        case 2: // METADATA_TYPE
          return METADATA_TYPE;
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
  private static final int __TUPLE_ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.METADATA_TYPE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TUPLE_ID, new org.apache.thrift.meta_data.FieldMetaData("tuple_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TTupleId")));
    tmpMap.put(_Fields.METADATA_TYPE, new org.apache.thrift.meta_data.FieldMetaData("metadata_type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.doris.thrift.TMetadataType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMetaScanNode.class, metaDataMap);
  }

  public TMetaScanNode() {
  }

  public TMetaScanNode(
    int tuple_id)
  {
    this();
    this.tuple_id = tuple_id;
    setTupleIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMetaScanNode(TMetaScanNode other) {
    __isset_bitfield = other.__isset_bitfield;
    this.tuple_id = other.tuple_id;
    if (other.isSetMetadataType()) {
      this.metadata_type = other.metadata_type;
    }
  }

  public TMetaScanNode deepCopy() {
    return new TMetaScanNode(this);
  }

  @Override
  public void clear() {
    setTupleIdIsSet(false);
    this.tuple_id = 0;
    this.metadata_type = null;
  }

  public int getTupleId() {
    return this.tuple_id;
  }

  public TMetaScanNode setTupleId(int tuple_id) {
    this.tuple_id = tuple_id;
    setTupleIdIsSet(true);
    return this;
  }

  public void unsetTupleId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TUPLE_ID_ISSET_ID);
  }

  /** Returns true if field tuple_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTupleId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TUPLE_ID_ISSET_ID);
  }

  public void setTupleIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TUPLE_ID_ISSET_ID, value);
  }

  /**
   * 
   * @see org.apache.doris.thrift.TMetadataType
   */
  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TMetadataType getMetadataType() {
    return this.metadata_type;
  }

  /**
   * 
   * @see org.apache.doris.thrift.TMetadataType
   */
  public TMetaScanNode setMetadataType(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TMetadataType metadata_type) {
    this.metadata_type = metadata_type;
    return this;
  }

  public void unsetMetadataType() {
    this.metadata_type = null;
  }

  /** Returns true if field metadata_type is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadataType() {
    return this.metadata_type != null;
  }

  public void setMetadataTypeIsSet(boolean value) {
    if (!value) {
      this.metadata_type = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TUPLE_ID:
      if (value == null) {
        unsetTupleId();
      } else {
        setTupleId((java.lang.Integer)value);
      }
      break;

    case METADATA_TYPE:
      if (value == null) {
        unsetMetadataType();
      } else {
        setMetadataType((org.apache.doris.thrift.TMetadataType)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TUPLE_ID:
      return getTupleId();

    case METADATA_TYPE:
      return getMetadataType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TUPLE_ID:
      return isSetTupleId();
    case METADATA_TYPE:
      return isSetMetadataType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TMetaScanNode)
      return this.equals((TMetaScanNode)that);
    return false;
  }

  public boolean equals(TMetaScanNode that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tuple_id = true;
    boolean that_present_tuple_id = true;
    if (this_present_tuple_id || that_present_tuple_id) {
      if (!(this_present_tuple_id && that_present_tuple_id))
        return false;
      if (this.tuple_id != that.tuple_id)
        return false;
    }

    boolean this_present_metadata_type = true && this.isSetMetadataType();
    boolean that_present_metadata_type = true && that.isSetMetadataType();
    if (this_present_metadata_type || that_present_metadata_type) {
      if (!(this_present_metadata_type && that_present_metadata_type))
        return false;
      if (!this.metadata_type.equals(that.metadata_type))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + tuple_id;

    hashCode = hashCode * 8191 + ((isSetMetadataType()) ? 131071 : 524287);
    if (isSetMetadataType())
      hashCode = hashCode * 8191 + metadata_type.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TMetaScanNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTupleId(), other.isSetTupleId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTupleId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tuple_id, other.tuple_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMetadataType(), other.isSetMetadataType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadataType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadata_type, other.metadata_type);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMetaScanNode(");
    boolean first = true;

    sb.append("tuple_id:");
    sb.append(this.tuple_id);
    first = false;
    if (isSetMetadataType()) {
      if (!first) sb.append(", ");
      sb.append("metadata_type:");
      if (this.metadata_type == null) {
        sb.append("null");
      } else {
        sb.append(this.metadata_type);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'tuple_id' because it's a primitive and you chose the non-beans generator.
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

  private static class TMetaScanNodeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMetaScanNodeStandardScheme getScheme() {
      return new TMetaScanNodeStandardScheme();
    }
  }

  private static class TMetaScanNodeStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMetaScanNode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TMetaScanNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TUPLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.tuple_id = iprot.readI32();
              struct.setTupleIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // METADATA_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.metadata_type = org.apache.doris.thrift.TMetadataType.findByValue(iprot.readI32());
              struct.setMetadataTypeIsSet(true);
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
      if (!struct.isSetTupleId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'tuple_id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TMetaScanNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TUPLE_ID_FIELD_DESC);
      oprot.writeI32(struct.tuple_id);
      oprot.writeFieldEnd();
      if (struct.metadata_type != null) {
        if (struct.isSetMetadataType()) {
          oprot.writeFieldBegin(METADATA_TYPE_FIELD_DESC);
          oprot.writeI32(struct.metadata_type.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMetaScanNodeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMetaScanNodeTupleScheme getScheme() {
      return new TMetaScanNodeTupleScheme();
    }
  }

  private static class TMetaScanNodeTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMetaScanNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMetaScanNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.tuple_id);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMetadataType()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetMetadataType()) {
        oprot.writeI32(struct.metadata_type.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMetaScanNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.tuple_id = iprot.readI32();
      struct.setTupleIdIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.metadata_type = org.apache.doris.thrift.TMetadataType.findByValue(iprot.readI32());
        struct.setMetadataTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

