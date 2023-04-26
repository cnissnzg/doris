/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public class TTransmitDataResult implements org.apache.thrift.TBase<TTransmitDataResult, TTransmitDataResult._Fields>, java.io.Serializable, Cloneable, Comparable<TTransmitDataResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTransmitDataResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PACKET_SEQ_FIELD_DESC = new org.apache.thrift.protocol.TField("packet_seq", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField DEST_FRAGMENT_INSTANCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("dest_fragment_instance_id", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField DEST_NODE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("dest_node_id", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTransmitDataResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTransmitDataResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status; // optional
  public long packet_seq; // optional
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId dest_fragment_instance_id; // optional
  public int dest_node_id; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    PACKET_SEQ((short)2, "packet_seq"),
    DEST_FRAGMENT_INSTANCE_ID((short)3, "dest_fragment_instance_id"),
    DEST_NODE_ID((short)4, "dest_node_id");

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
        case 1: // STATUS
          return STATUS;
        case 2: // PACKET_SEQ
          return PACKET_SEQ;
        case 3: // DEST_FRAGMENT_INSTANCE_ID
          return DEST_FRAGMENT_INSTANCE_ID;
        case 4: // DEST_NODE_ID
          return DEST_NODE_ID;
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
  private static final int __PACKET_SEQ_ISSET_ID = 0;
  private static final int __DEST_NODE_ID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.STATUS,_Fields.PACKET_SEQ,_Fields.DEST_FRAGMENT_INSTANCE_ID,_Fields.DEST_NODE_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TStatus.class)));
    tmpMap.put(_Fields.PACKET_SEQ, new org.apache.thrift.meta_data.FieldMetaData("packet_seq", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DEST_FRAGMENT_INSTANCE_ID, new org.apache.thrift.meta_data.FieldMetaData("dest_fragment_instance_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TUniqueId.class)));
    tmpMap.put(_Fields.DEST_NODE_ID, new org.apache.thrift.meta_data.FieldMetaData("dest_node_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TPlanNodeId")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTransmitDataResult.class, metaDataMap);
  }

  public TTransmitDataResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTransmitDataResult(TTransmitDataResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new org.apache.doris.thrift.TStatus(other.status);
    }
    this.packet_seq = other.packet_seq;
    if (other.isSetDestFragmentInstanceId()) {
      this.dest_fragment_instance_id = new org.apache.doris.thrift.TUniqueId(other.dest_fragment_instance_id);
    }
    this.dest_node_id = other.dest_node_id;
  }

  public TTransmitDataResult deepCopy() {
    return new TTransmitDataResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    setPacketSeqIsSet(false);
    this.packet_seq = 0;
    this.dest_fragment_instance_id = null;
    setDestNodeIdIsSet(false);
    this.dest_node_id = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TStatus getStatus() {
    return this.status;
  }

  public TTransmitDataResult setStatus(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public long getPacketSeq() {
    return this.packet_seq;
  }

  public TTransmitDataResult setPacketSeq(long packet_seq) {
    this.packet_seq = packet_seq;
    setPacketSeqIsSet(true);
    return this;
  }

  public void unsetPacketSeq() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PACKET_SEQ_ISSET_ID);
  }

  /** Returns true if field packet_seq is set (has been assigned a value) and false otherwise */
  public boolean isSetPacketSeq() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PACKET_SEQ_ISSET_ID);
  }

  public void setPacketSeqIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PACKET_SEQ_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TUniqueId getDestFragmentInstanceId() {
    return this.dest_fragment_instance_id;
  }

  public TTransmitDataResult setDestFragmentInstanceId(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId dest_fragment_instance_id) {
    this.dest_fragment_instance_id = dest_fragment_instance_id;
    return this;
  }

  public void unsetDestFragmentInstanceId() {
    this.dest_fragment_instance_id = null;
  }

  /** Returns true if field dest_fragment_instance_id is set (has been assigned a value) and false otherwise */
  public boolean isSetDestFragmentInstanceId() {
    return this.dest_fragment_instance_id != null;
  }

  public void setDestFragmentInstanceIdIsSet(boolean value) {
    if (!value) {
      this.dest_fragment_instance_id = null;
    }
  }

  public int getDestNodeId() {
    return this.dest_node_id;
  }

  public TTransmitDataResult setDestNodeId(int dest_node_id) {
    this.dest_node_id = dest_node_id;
    setDestNodeIdIsSet(true);
    return this;
  }

  public void unsetDestNodeId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DEST_NODE_ID_ISSET_ID);
  }

  /** Returns true if field dest_node_id is set (has been assigned a value) and false otherwise */
  public boolean isSetDestNodeId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DEST_NODE_ID_ISSET_ID);
  }

  public void setDestNodeIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DEST_NODE_ID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((org.apache.doris.thrift.TStatus)value);
      }
      break;

    case PACKET_SEQ:
      if (value == null) {
        unsetPacketSeq();
      } else {
        setPacketSeq((java.lang.Long)value);
      }
      break;

    case DEST_FRAGMENT_INSTANCE_ID:
      if (value == null) {
        unsetDestFragmentInstanceId();
      } else {
        setDestFragmentInstanceId((org.apache.doris.thrift.TUniqueId)value);
      }
      break;

    case DEST_NODE_ID:
      if (value == null) {
        unsetDestNodeId();
      } else {
        setDestNodeId((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case PACKET_SEQ:
      return getPacketSeq();

    case DEST_FRAGMENT_INSTANCE_ID:
      return getDestFragmentInstanceId();

    case DEST_NODE_ID:
      return getDestNodeId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case PACKET_SEQ:
      return isSetPacketSeq();
    case DEST_FRAGMENT_INSTANCE_ID:
      return isSetDestFragmentInstanceId();
    case DEST_NODE_ID:
      return isSetDestNodeId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TTransmitDataResult)
      return this.equals((TTransmitDataResult)that);
    return false;
  }

  public boolean equals(TTransmitDataResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_packet_seq = true && this.isSetPacketSeq();
    boolean that_present_packet_seq = true && that.isSetPacketSeq();
    if (this_present_packet_seq || that_present_packet_seq) {
      if (!(this_present_packet_seq && that_present_packet_seq))
        return false;
      if (this.packet_seq != that.packet_seq)
        return false;
    }

    boolean this_present_dest_fragment_instance_id = true && this.isSetDestFragmentInstanceId();
    boolean that_present_dest_fragment_instance_id = true && that.isSetDestFragmentInstanceId();
    if (this_present_dest_fragment_instance_id || that_present_dest_fragment_instance_id) {
      if (!(this_present_dest_fragment_instance_id && that_present_dest_fragment_instance_id))
        return false;
      if (!this.dest_fragment_instance_id.equals(that.dest_fragment_instance_id))
        return false;
    }

    boolean this_present_dest_node_id = true && this.isSetDestNodeId();
    boolean that_present_dest_node_id = true && that.isSetDestNodeId();
    if (this_present_dest_node_id || that_present_dest_node_id) {
      if (!(this_present_dest_node_id && that_present_dest_node_id))
        return false;
      if (this.dest_node_id != that.dest_node_id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.hashCode();

    hashCode = hashCode * 8191 + ((isSetPacketSeq()) ? 131071 : 524287);
    if (isSetPacketSeq())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(packet_seq);

    hashCode = hashCode * 8191 + ((isSetDestFragmentInstanceId()) ? 131071 : 524287);
    if (isSetDestFragmentInstanceId())
      hashCode = hashCode * 8191 + dest_fragment_instance_id.hashCode();

    hashCode = hashCode * 8191 + ((isSetDestNodeId()) ? 131071 : 524287);
    if (isSetDestNodeId())
      hashCode = hashCode * 8191 + dest_node_id;

    return hashCode;
  }

  @Override
  public int compareTo(TTransmitDataResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetStatus(), other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPacketSeq(), other.isSetPacketSeq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPacketSeq()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.packet_seq, other.packet_seq);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDestFragmentInstanceId(), other.isSetDestFragmentInstanceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDestFragmentInstanceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dest_fragment_instance_id, other.dest_fragment_instance_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDestNodeId(), other.isSetDestNodeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDestNodeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dest_node_id, other.dest_node_id);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTransmitDataResult(");
    boolean first = true;

    if (isSetStatus()) {
      sb.append("status:");
      if (this.status == null) {
        sb.append("null");
      } else {
        sb.append(this.status);
      }
      first = false;
    }
    if (isSetPacketSeq()) {
      if (!first) sb.append(", ");
      sb.append("packet_seq:");
      sb.append(this.packet_seq);
      first = false;
    }
    if (isSetDestFragmentInstanceId()) {
      if (!first) sb.append(", ");
      sb.append("dest_fragment_instance_id:");
      if (this.dest_fragment_instance_id == null) {
        sb.append("null");
      } else {
        sb.append(this.dest_fragment_instance_id);
      }
      first = false;
    }
    if (isSetDestNodeId()) {
      if (!first) sb.append(", ");
      sb.append("dest_node_id:");
      sb.append(this.dest_node_id);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (status != null) {
      status.validate();
    }
    if (dest_fragment_instance_id != null) {
      dest_fragment_instance_id.validate();
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

  private static class TTransmitDataResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTransmitDataResultStandardScheme getScheme() {
      return new TTransmitDataResultStandardScheme();
    }
  }

  private static class TTransmitDataResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTransmitDataResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTransmitDataResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new org.apache.doris.thrift.TStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PACKET_SEQ
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.packet_seq = iprot.readI64();
              struct.setPacketSeqIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DEST_FRAGMENT_INSTANCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.dest_fragment_instance_id = new org.apache.doris.thrift.TUniqueId();
              struct.dest_fragment_instance_id.read(iprot);
              struct.setDestFragmentInstanceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DEST_NODE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.dest_node_id = iprot.readI32();
              struct.setDestNodeIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTransmitDataResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        if (struct.isSetStatus()) {
          oprot.writeFieldBegin(STATUS_FIELD_DESC);
          struct.status.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetPacketSeq()) {
        oprot.writeFieldBegin(PACKET_SEQ_FIELD_DESC);
        oprot.writeI64(struct.packet_seq);
        oprot.writeFieldEnd();
      }
      if (struct.dest_fragment_instance_id != null) {
        if (struct.isSetDestFragmentInstanceId()) {
          oprot.writeFieldBegin(DEST_FRAGMENT_INSTANCE_ID_FIELD_DESC);
          struct.dest_fragment_instance_id.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDestNodeId()) {
        oprot.writeFieldBegin(DEST_NODE_ID_FIELD_DESC);
        oprot.writeI32(struct.dest_node_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTransmitDataResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTransmitDataResultTupleScheme getScheme() {
      return new TTransmitDataResultTupleScheme();
    }
  }

  private static class TTransmitDataResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTransmitDataResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTransmitDataResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetPacketSeq()) {
        optionals.set(1);
      }
      if (struct.isSetDestFragmentInstanceId()) {
        optionals.set(2);
      }
      if (struct.isSetDestNodeId()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetPacketSeq()) {
        oprot.writeI64(struct.packet_seq);
      }
      if (struct.isSetDestFragmentInstanceId()) {
        struct.dest_fragment_instance_id.write(oprot);
      }
      if (struct.isSetDestNodeId()) {
        oprot.writeI32(struct.dest_node_id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTransmitDataResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.status = new org.apache.doris.thrift.TStatus();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.packet_seq = iprot.readI64();
        struct.setPacketSeqIsSet(true);
      }
      if (incoming.get(2)) {
        struct.dest_fragment_instance_id = new org.apache.doris.thrift.TUniqueId();
        struct.dest_fragment_instance_id.read(iprot);
        struct.setDestFragmentInstanceIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.dest_node_id = iprot.readI32();
        struct.setDestNodeIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

