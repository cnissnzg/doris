/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public class TSessionState implements org.apache.thrift.TBase<TSessionState, TSessionState._Fields>, java.io.Serializable, Cloneable, Comparable<TSessionState> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSessionState");

  private static final org.apache.thrift.protocol.TField DATABASE_FIELD_DESC = new org.apache.thrift.protocol.TField("database", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CONNECTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("connection_id", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TSessionStateStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TSessionStateTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String database; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String user; // required
  public long connection_id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATABASE((short)1, "database"),
    USER((short)2, "user"),
    CONNECTION_ID((short)3, "connection_id");

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
        case 1: // DATABASE
          return DATABASE;
        case 2: // USER
          return USER;
        case 3: // CONNECTION_ID
          return CONNECTION_ID;
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
  private static final int __CONNECTION_ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DATABASE, new org.apache.thrift.meta_data.FieldMetaData("database", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONNECTION_ID, new org.apache.thrift.meta_data.FieldMetaData("connection_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSessionState.class, metaDataMap);
  }

  public TSessionState() {
  }

  public TSessionState(
    java.lang.String database,
    java.lang.String user,
    long connection_id)
  {
    this();
    this.database = database;
    this.user = user;
    this.connection_id = connection_id;
    setConnectionIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSessionState(TSessionState other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetDatabase()) {
      this.database = other.database;
    }
    if (other.isSetUser()) {
      this.user = other.user;
    }
    this.connection_id = other.connection_id;
  }

  public TSessionState deepCopy() {
    return new TSessionState(this);
  }

  @Override
  public void clear() {
    this.database = null;
    this.user = null;
    setConnectionIdIsSet(false);
    this.connection_id = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDatabase() {
    return this.database;
  }

  public TSessionState setDatabase(@org.apache.thrift.annotation.Nullable java.lang.String database) {
    this.database = database;
    return this;
  }

  public void unsetDatabase() {
    this.database = null;
  }

  /** Returns true if field database is set (has been assigned a value) and false otherwise */
  public boolean isSetDatabase() {
    return this.database != null;
  }

  public void setDatabaseIsSet(boolean value) {
    if (!value) {
      this.database = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getUser() {
    return this.user;
  }

  public TSessionState setUser(@org.apache.thrift.annotation.Nullable java.lang.String user) {
    this.user = user;
    return this;
  }

  public void unsetUser() {
    this.user = null;
  }

  /** Returns true if field user is set (has been assigned a value) and false otherwise */
  public boolean isSetUser() {
    return this.user != null;
  }

  public void setUserIsSet(boolean value) {
    if (!value) {
      this.user = null;
    }
  }

  public long getConnectionId() {
    return this.connection_id;
  }

  public TSessionState setConnectionId(long connection_id) {
    this.connection_id = connection_id;
    setConnectionIdIsSet(true);
    return this;
  }

  public void unsetConnectionId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CONNECTION_ID_ISSET_ID);
  }

  /** Returns true if field connection_id is set (has been assigned a value) and false otherwise */
  public boolean isSetConnectionId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CONNECTION_ID_ISSET_ID);
  }

  public void setConnectionIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CONNECTION_ID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case DATABASE:
      if (value == null) {
        unsetDatabase();
      } else {
        setDatabase((java.lang.String)value);
      }
      break;

    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((java.lang.String)value);
      }
      break;

    case CONNECTION_ID:
      if (value == null) {
        unsetConnectionId();
      } else {
        setConnectionId((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DATABASE:
      return getDatabase();

    case USER:
      return getUser();

    case CONNECTION_ID:
      return getConnectionId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case DATABASE:
      return isSetDatabase();
    case USER:
      return isSetUser();
    case CONNECTION_ID:
      return isSetConnectionId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TSessionState)
      return this.equals((TSessionState)that);
    return false;
  }

  public boolean equals(TSessionState that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_database = true && this.isSetDatabase();
    boolean that_present_database = true && that.isSetDatabase();
    if (this_present_database || that_present_database) {
      if (!(this_present_database && that_present_database))
        return false;
      if (!this.database.equals(that.database))
        return false;
    }

    boolean this_present_user = true && this.isSetUser();
    boolean that_present_user = true && that.isSetUser();
    if (this_present_user || that_present_user) {
      if (!(this_present_user && that_present_user))
        return false;
      if (!this.user.equals(that.user))
        return false;
    }

    boolean this_present_connection_id = true;
    boolean that_present_connection_id = true;
    if (this_present_connection_id || that_present_connection_id) {
      if (!(this_present_connection_id && that_present_connection_id))
        return false;
      if (this.connection_id != that.connection_id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDatabase()) ? 131071 : 524287);
    if (isSetDatabase())
      hashCode = hashCode * 8191 + database.hashCode();

    hashCode = hashCode * 8191 + ((isSetUser()) ? 131071 : 524287);
    if (isSetUser())
      hashCode = hashCode * 8191 + user.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(connection_id);

    return hashCode;
  }

  @Override
  public int compareTo(TSessionState other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetDatabase(), other.isSetDatabase());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDatabase()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.database, other.database);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetUser(), other.isSetUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user, other.user);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetConnectionId(), other.isSetConnectionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConnectionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.connection_id, other.connection_id);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TSessionState(");
    boolean first = true;

    sb.append("database:");
    if (this.database == null) {
      sb.append("null");
    } else {
      sb.append(this.database);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("user:");
    if (this.user == null) {
      sb.append("null");
    } else {
      sb.append(this.user);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("connection_id:");
    sb.append(this.connection_id);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (database == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'database' was not present! Struct: " + toString());
    }
    if (user == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'user' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'connection_id' because it's a primitive and you chose the non-beans generator.
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

  private static class TSessionStateStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TSessionStateStandardScheme getScheme() {
      return new TSessionStateStandardScheme();
    }
  }

  private static class TSessionStateStandardScheme extends org.apache.thrift.scheme.StandardScheme<TSessionState> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSessionState struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DATABASE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.database = iprot.readString();
              struct.setDatabaseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user = iprot.readString();
              struct.setUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONNECTION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.connection_id = iprot.readI64();
              struct.setConnectionIdIsSet(true);
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
      if (!struct.isSetConnectionId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'connection_id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSessionState struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.database != null) {
        oprot.writeFieldBegin(DATABASE_FIELD_DESC);
        oprot.writeString(struct.database);
        oprot.writeFieldEnd();
      }
      if (struct.user != null) {
        oprot.writeFieldBegin(USER_FIELD_DESC);
        oprot.writeString(struct.user);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CONNECTION_ID_FIELD_DESC);
      oprot.writeI64(struct.connection_id);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSessionStateTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TSessionStateTupleScheme getScheme() {
      return new TSessionStateTupleScheme();
    }
  }

  private static class TSessionStateTupleScheme extends org.apache.thrift.scheme.TupleScheme<TSessionState> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSessionState struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.database);
      oprot.writeString(struct.user);
      oprot.writeI64(struct.connection_id);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSessionState struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.database = iprot.readString();
      struct.setDatabaseIsSet(true);
      struct.user = iprot.readString();
      struct.setUserIsSet(true);
      struct.connection_id = iprot.readI64();
      struct.setConnectionIdIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

