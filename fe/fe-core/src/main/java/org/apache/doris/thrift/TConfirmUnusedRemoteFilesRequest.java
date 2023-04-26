/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public class TConfirmUnusedRemoteFilesRequest implements org.apache.thrift.TBase<TConfirmUnusedRemoteFilesRequest, TConfirmUnusedRemoteFilesRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TConfirmUnusedRemoteFilesRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TConfirmUnusedRemoteFilesRequest");

  private static final org.apache.thrift.protocol.TField CONFIRM_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("confirm_list", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TConfirmUnusedRemoteFilesRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TConfirmUnusedRemoteFilesRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<TTabletCooldownInfo> confirm_list; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CONFIRM_LIST((short)1, "confirm_list");

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
        case 1: // CONFIRM_LIST
          return CONFIRM_LIST;
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
  private static final _Fields optionals[] = {_Fields.CONFIRM_LIST};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONFIRM_LIST, new org.apache.thrift.meta_data.FieldMetaData("confirm_list", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTabletCooldownInfo.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TConfirmUnusedRemoteFilesRequest.class, metaDataMap);
  }

  public TConfirmUnusedRemoteFilesRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TConfirmUnusedRemoteFilesRequest(TConfirmUnusedRemoteFilesRequest other) {
    if (other.isSetConfirmList()) {
      java.util.List<TTabletCooldownInfo> __this__confirm_list = new java.util.ArrayList<TTabletCooldownInfo>(other.confirm_list.size());
      for (TTabletCooldownInfo other_element : other.confirm_list) {
        __this__confirm_list.add(new TTabletCooldownInfo(other_element));
      }
      this.confirm_list = __this__confirm_list;
    }
  }

  public TConfirmUnusedRemoteFilesRequest deepCopy() {
    return new TConfirmUnusedRemoteFilesRequest(this);
  }

  @Override
  public void clear() {
    this.confirm_list = null;
  }

  public int getConfirmListSize() {
    return (this.confirm_list == null) ? 0 : this.confirm_list.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<TTabletCooldownInfo> getConfirmListIterator() {
    return (this.confirm_list == null) ? null : this.confirm_list.iterator();
  }

  public void addToConfirmList(TTabletCooldownInfo elem) {
    if (this.confirm_list == null) {
      this.confirm_list = new java.util.ArrayList<TTabletCooldownInfo>();
    }
    this.confirm_list.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<TTabletCooldownInfo> getConfirmList() {
    return this.confirm_list;
  }

  public TConfirmUnusedRemoteFilesRequest setConfirmList(@org.apache.thrift.annotation.Nullable java.util.List<TTabletCooldownInfo> confirm_list) {
    this.confirm_list = confirm_list;
    return this;
  }

  public void unsetConfirmList() {
    this.confirm_list = null;
  }

  /** Returns true if field confirm_list is set (has been assigned a value) and false otherwise */
  public boolean isSetConfirmList() {
    return this.confirm_list != null;
  }

  public void setConfirmListIsSet(boolean value) {
    if (!value) {
      this.confirm_list = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CONFIRM_LIST:
      if (value == null) {
        unsetConfirmList();
      } else {
        setConfirmList((java.util.List<TTabletCooldownInfo>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CONFIRM_LIST:
      return getConfirmList();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CONFIRM_LIST:
      return isSetConfirmList();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TConfirmUnusedRemoteFilesRequest)
      return this.equals((TConfirmUnusedRemoteFilesRequest)that);
    return false;
  }

  public boolean equals(TConfirmUnusedRemoteFilesRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_confirm_list = true && this.isSetConfirmList();
    boolean that_present_confirm_list = true && that.isSetConfirmList();
    if (this_present_confirm_list || that_present_confirm_list) {
      if (!(this_present_confirm_list && that_present_confirm_list))
        return false;
      if (!this.confirm_list.equals(that.confirm_list))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetConfirmList()) ? 131071 : 524287);
    if (isSetConfirmList())
      hashCode = hashCode * 8191 + confirm_list.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TConfirmUnusedRemoteFilesRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetConfirmList(), other.isSetConfirmList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfirmList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.confirm_list, other.confirm_list);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TConfirmUnusedRemoteFilesRequest(");
    boolean first = true;

    if (isSetConfirmList()) {
      sb.append("confirm_list:");
      if (this.confirm_list == null) {
        sb.append("null");
      } else {
        sb.append(this.confirm_list);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TConfirmUnusedRemoteFilesRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TConfirmUnusedRemoteFilesRequestStandardScheme getScheme() {
      return new TConfirmUnusedRemoteFilesRequestStandardScheme();
    }
  }

  private static class TConfirmUnusedRemoteFilesRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TConfirmUnusedRemoteFilesRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TConfirmUnusedRemoteFilesRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONFIRM_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list284 = iprot.readListBegin();
                struct.confirm_list = new java.util.ArrayList<TTabletCooldownInfo>(_list284.size);
                @org.apache.thrift.annotation.Nullable TTabletCooldownInfo _elem285;
                for (int _i286 = 0; _i286 < _list284.size; ++_i286)
                {
                  _elem285 = new TTabletCooldownInfo();
                  _elem285.read(iprot);
                  struct.confirm_list.add(_elem285);
                }
                iprot.readListEnd();
              }
              struct.setConfirmListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TConfirmUnusedRemoteFilesRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.confirm_list != null) {
        if (struct.isSetConfirmList()) {
          oprot.writeFieldBegin(CONFIRM_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.confirm_list.size()));
            for (TTabletCooldownInfo _iter287 : struct.confirm_list)
            {
              _iter287.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TConfirmUnusedRemoteFilesRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TConfirmUnusedRemoteFilesRequestTupleScheme getScheme() {
      return new TConfirmUnusedRemoteFilesRequestTupleScheme();
    }
  }

  private static class TConfirmUnusedRemoteFilesRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TConfirmUnusedRemoteFilesRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TConfirmUnusedRemoteFilesRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetConfirmList()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetConfirmList()) {
        {
          oprot.writeI32(struct.confirm_list.size());
          for (TTabletCooldownInfo _iter288 : struct.confirm_list)
          {
            _iter288.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TConfirmUnusedRemoteFilesRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list289 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.confirm_list = new java.util.ArrayList<TTabletCooldownInfo>(_list289.size);
          @org.apache.thrift.annotation.Nullable TTabletCooldownInfo _elem290;
          for (int _i291 = 0; _i291 < _list289.size; ++_i291)
          {
            _elem290 = new TTabletCooldownInfo();
            _elem290.read(iprot);
            struct.confirm_list.add(_elem290);
          }
        }
        struct.setConfirmListIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

