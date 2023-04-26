/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public class TMasterOpResult implements org.apache.thrift.TBase<TMasterOpResult, TMasterOpResult._Fields>, java.io.Serializable, Cloneable, Comparable<TMasterOpResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMasterOpResult");

  private static final org.apache.thrift.protocol.TField MAX_JOURNAL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("maxJournalId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField PACKET_FIELD_DESC = new org.apache.thrift.protocol.TField("packet", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField RESULT_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("resultSet", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField QUERY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("queryId", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMasterOpResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMasterOpResultTupleSchemeFactory();

  public long maxJournalId; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer packet; // required
  public @org.apache.thrift.annotation.Nullable TShowResultSet resultSet; // optional
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId queryId; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String status; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MAX_JOURNAL_ID((short)1, "maxJournalId"),
    PACKET((short)2, "packet"),
    RESULT_SET((short)3, "resultSet"),
    QUERY_ID((short)4, "queryId"),
    STATUS((short)5, "status");

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
        case 1: // MAX_JOURNAL_ID
          return MAX_JOURNAL_ID;
        case 2: // PACKET
          return PACKET;
        case 3: // RESULT_SET
          return RESULT_SET;
        case 4: // QUERY_ID
          return QUERY_ID;
        case 5: // STATUS
          return STATUS;
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
  private static final int __MAXJOURNALID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RESULT_SET,_Fields.QUERY_ID,_Fields.STATUS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MAX_JOURNAL_ID, new org.apache.thrift.meta_data.FieldMetaData("maxJournalId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PACKET, new org.apache.thrift.meta_data.FieldMetaData("packet", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.RESULT_SET, new org.apache.thrift.meta_data.FieldMetaData("resultSet", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TShowResultSet.class)));
    tmpMap.put(_Fields.QUERY_ID, new org.apache.thrift.meta_data.FieldMetaData("queryId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TUniqueId.class)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMasterOpResult.class, metaDataMap);
  }

  public TMasterOpResult() {
  }

  public TMasterOpResult(
    long maxJournalId,
    java.nio.ByteBuffer packet)
  {
    this();
    this.maxJournalId = maxJournalId;
    setMaxJournalIdIsSet(true);
    this.packet = org.apache.thrift.TBaseHelper.copyBinary(packet);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMasterOpResult(TMasterOpResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.maxJournalId = other.maxJournalId;
    if (other.isSetPacket()) {
      this.packet = org.apache.thrift.TBaseHelper.copyBinary(other.packet);
    }
    if (other.isSetResultSet()) {
      this.resultSet = new TShowResultSet(other.resultSet);
    }
    if (other.isSetQueryId()) {
      this.queryId = new org.apache.doris.thrift.TUniqueId(other.queryId);
    }
    if (other.isSetStatus()) {
      this.status = other.status;
    }
  }

  public TMasterOpResult deepCopy() {
    return new TMasterOpResult(this);
  }

  @Override
  public void clear() {
    setMaxJournalIdIsSet(false);
    this.maxJournalId = 0;
    this.packet = null;
    this.resultSet = null;
    this.queryId = null;
    this.status = null;
  }

  public long getMaxJournalId() {
    return this.maxJournalId;
  }

  public TMasterOpResult setMaxJournalId(long maxJournalId) {
    this.maxJournalId = maxJournalId;
    setMaxJournalIdIsSet(true);
    return this;
  }

  public void unsetMaxJournalId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MAXJOURNALID_ISSET_ID);
  }

  /** Returns true if field maxJournalId is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxJournalId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MAXJOURNALID_ISSET_ID);
  }

  public void setMaxJournalIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MAXJOURNALID_ISSET_ID, value);
  }

  public byte[] getPacket() {
    setPacket(org.apache.thrift.TBaseHelper.rightSize(packet));
    return packet == null ? null : packet.array();
  }

  public java.nio.ByteBuffer bufferForPacket() {
    return org.apache.thrift.TBaseHelper.copyBinary(packet);
  }

  public TMasterOpResult setPacket(byte[] packet) {
    this.packet = packet == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(packet.clone());
    return this;
  }

  public TMasterOpResult setPacket(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer packet) {
    this.packet = org.apache.thrift.TBaseHelper.copyBinary(packet);
    return this;
  }

  public void unsetPacket() {
    this.packet = null;
  }

  /** Returns true if field packet is set (has been assigned a value) and false otherwise */
  public boolean isSetPacket() {
    return this.packet != null;
  }

  public void setPacketIsSet(boolean value) {
    if (!value) {
      this.packet = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TShowResultSet getResultSet() {
    return this.resultSet;
  }

  public TMasterOpResult setResultSet(@org.apache.thrift.annotation.Nullable TShowResultSet resultSet) {
    this.resultSet = resultSet;
    return this;
  }

  public void unsetResultSet() {
    this.resultSet = null;
  }

  /** Returns true if field resultSet is set (has been assigned a value) and false otherwise */
  public boolean isSetResultSet() {
    return this.resultSet != null;
  }

  public void setResultSetIsSet(boolean value) {
    if (!value) {
      this.resultSet = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TUniqueId getQueryId() {
    return this.queryId;
  }

  public TMasterOpResult setQueryId(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId queryId) {
    this.queryId = queryId;
    return this;
  }

  public void unsetQueryId() {
    this.queryId = null;
  }

  /** Returns true if field queryId is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryId() {
    return this.queryId != null;
  }

  public void setQueryIdIsSet(boolean value) {
    if (!value) {
      this.queryId = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getStatus() {
    return this.status;
  }

  public TMasterOpResult setStatus(@org.apache.thrift.annotation.Nullable java.lang.String status) {
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

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case MAX_JOURNAL_ID:
      if (value == null) {
        unsetMaxJournalId();
      } else {
        setMaxJournalId((java.lang.Long)value);
      }
      break;

    case PACKET:
      if (value == null) {
        unsetPacket();
      } else {
        if (value instanceof byte[]) {
          setPacket((byte[])value);
        } else {
          setPacket((java.nio.ByteBuffer)value);
        }
      }
      break;

    case RESULT_SET:
      if (value == null) {
        unsetResultSet();
      } else {
        setResultSet((TShowResultSet)value);
      }
      break;

    case QUERY_ID:
      if (value == null) {
        unsetQueryId();
      } else {
        setQueryId((org.apache.doris.thrift.TUniqueId)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MAX_JOURNAL_ID:
      return getMaxJournalId();

    case PACKET:
      return getPacket();

    case RESULT_SET:
      return getResultSet();

    case QUERY_ID:
      return getQueryId();

    case STATUS:
      return getStatus();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case MAX_JOURNAL_ID:
      return isSetMaxJournalId();
    case PACKET:
      return isSetPacket();
    case RESULT_SET:
      return isSetResultSet();
    case QUERY_ID:
      return isSetQueryId();
    case STATUS:
      return isSetStatus();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TMasterOpResult)
      return this.equals((TMasterOpResult)that);
    return false;
  }

  public boolean equals(TMasterOpResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_maxJournalId = true;
    boolean that_present_maxJournalId = true;
    if (this_present_maxJournalId || that_present_maxJournalId) {
      if (!(this_present_maxJournalId && that_present_maxJournalId))
        return false;
      if (this.maxJournalId != that.maxJournalId)
        return false;
    }

    boolean this_present_packet = true && this.isSetPacket();
    boolean that_present_packet = true && that.isSetPacket();
    if (this_present_packet || that_present_packet) {
      if (!(this_present_packet && that_present_packet))
        return false;
      if (!this.packet.equals(that.packet))
        return false;
    }

    boolean this_present_resultSet = true && this.isSetResultSet();
    boolean that_present_resultSet = true && that.isSetResultSet();
    if (this_present_resultSet || that_present_resultSet) {
      if (!(this_present_resultSet && that_present_resultSet))
        return false;
      if (!this.resultSet.equals(that.resultSet))
        return false;
    }

    boolean this_present_queryId = true && this.isSetQueryId();
    boolean that_present_queryId = true && that.isSetQueryId();
    if (this_present_queryId || that_present_queryId) {
      if (!(this_present_queryId && that_present_queryId))
        return false;
      if (!this.queryId.equals(that.queryId))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(maxJournalId);

    hashCode = hashCode * 8191 + ((isSetPacket()) ? 131071 : 524287);
    if (isSetPacket())
      hashCode = hashCode * 8191 + packet.hashCode();

    hashCode = hashCode * 8191 + ((isSetResultSet()) ? 131071 : 524287);
    if (isSetResultSet())
      hashCode = hashCode * 8191 + resultSet.hashCode();

    hashCode = hashCode * 8191 + ((isSetQueryId()) ? 131071 : 524287);
    if (isSetQueryId())
      hashCode = hashCode * 8191 + queryId.hashCode();

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TMasterOpResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetMaxJournalId(), other.isSetMaxJournalId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxJournalId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxJournalId, other.maxJournalId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPacket(), other.isSetPacket());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPacket()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.packet, other.packet);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetResultSet(), other.isSetResultSet());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResultSet()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resultSet, other.resultSet);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetQueryId(), other.isSetQueryId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryId, other.queryId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMasterOpResult(");
    boolean first = true;

    sb.append("maxJournalId:");
    sb.append(this.maxJournalId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("packet:");
    if (this.packet == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.packet, sb);
    }
    first = false;
    if (isSetResultSet()) {
      if (!first) sb.append(", ");
      sb.append("resultSet:");
      if (this.resultSet == null) {
        sb.append("null");
      } else {
        sb.append(this.resultSet);
      }
      first = false;
    }
    if (isSetQueryId()) {
      if (!first) sb.append(", ");
      sb.append("queryId:");
      if (this.queryId == null) {
        sb.append("null");
      } else {
        sb.append(this.queryId);
      }
      first = false;
    }
    if (isSetStatus()) {
      if (!first) sb.append(", ");
      sb.append("status:");
      if (this.status == null) {
        sb.append("null");
      } else {
        sb.append(this.status);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'maxJournalId' because it's a primitive and you chose the non-beans generator.
    if (packet == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'packet' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (resultSet != null) {
      resultSet.validate();
    }
    if (queryId != null) {
      queryId.validate();
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

  private static class TMasterOpResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMasterOpResultStandardScheme getScheme() {
      return new TMasterOpResultStandardScheme();
    }
  }

  private static class TMasterOpResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMasterOpResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TMasterOpResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MAX_JOURNAL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.maxJournalId = iprot.readI64();
              struct.setMaxJournalIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PACKET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.packet = iprot.readBinary();
              struct.setPacketIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESULT_SET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.resultSet = new TShowResultSet();
              struct.resultSet.read(iprot);
              struct.setResultSetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // QUERY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.queryId = new org.apache.doris.thrift.TUniqueId();
              struct.queryId.read(iprot);
              struct.setQueryIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.status = iprot.readString();
              struct.setStatusIsSet(true);
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
      if (!struct.isSetMaxJournalId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'maxJournalId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TMasterOpResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(MAX_JOURNAL_ID_FIELD_DESC);
      oprot.writeI64(struct.maxJournalId);
      oprot.writeFieldEnd();
      if (struct.packet != null) {
        oprot.writeFieldBegin(PACKET_FIELD_DESC);
        oprot.writeBinary(struct.packet);
        oprot.writeFieldEnd();
      }
      if (struct.resultSet != null) {
        if (struct.isSetResultSet()) {
          oprot.writeFieldBegin(RESULT_SET_FIELD_DESC);
          struct.resultSet.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.queryId != null) {
        if (struct.isSetQueryId()) {
          oprot.writeFieldBegin(QUERY_ID_FIELD_DESC);
          struct.queryId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.status != null) {
        if (struct.isSetStatus()) {
          oprot.writeFieldBegin(STATUS_FIELD_DESC);
          oprot.writeString(struct.status);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMasterOpResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMasterOpResultTupleScheme getScheme() {
      return new TMasterOpResultTupleScheme();
    }
  }

  private static class TMasterOpResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMasterOpResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMasterOpResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.maxJournalId);
      oprot.writeBinary(struct.packet);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetResultSet()) {
        optionals.set(0);
      }
      if (struct.isSetQueryId()) {
        optionals.set(1);
      }
      if (struct.isSetStatus()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetResultSet()) {
        struct.resultSet.write(oprot);
      }
      if (struct.isSetQueryId()) {
        struct.queryId.write(oprot);
      }
      if (struct.isSetStatus()) {
        oprot.writeString(struct.status);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMasterOpResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.maxJournalId = iprot.readI64();
      struct.setMaxJournalIdIsSet(true);
      struct.packet = iprot.readBinary();
      struct.setPacketIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.resultSet = new TShowResultSet();
        struct.resultSet.read(iprot);
        struct.setResultSetIsSet(true);
      }
      if (incoming.get(1)) {
        struct.queryId = new org.apache.doris.thrift.TUniqueId();
        struct.queryId.read(iprot);
        struct.setQueryIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.status = iprot.readString();
        struct.setStatusIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

