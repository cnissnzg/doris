/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public class TColumnDict implements org.apache.thrift.TBase<TColumnDict, TColumnDict._Fields>, java.io.Serializable, Cloneable, Comparable<TColumnDict> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TColumnDict");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField STR_DICT_FIELD_DESC = new org.apache.thrift.protocol.TField("str_dict", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TColumnDictStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TColumnDictTupleSchemeFactory();

  /**
   * 
   * @see org.apache.doris.thrift.TPrimitiveType
   */
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TPrimitiveType type; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> str_dict; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see org.apache.doris.thrift.TPrimitiveType
     */
    TYPE((short)1, "type"),
    STR_DICT((short)2, "str_dict");

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
        case 2: // STR_DICT
          return STR_DICT;
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
  private static final _Fields optionals[] = {_Fields.TYPE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.doris.thrift.TPrimitiveType.class)));
    tmpMap.put(_Fields.STR_DICT, new org.apache.thrift.meta_data.FieldMetaData("str_dict", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TColumnDict.class, metaDataMap);
  }

  public TColumnDict() {
  }

  public TColumnDict(
    java.util.List<java.lang.String> str_dict)
  {
    this();
    this.str_dict = str_dict;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TColumnDict(TColumnDict other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetStrDict()) {
      java.util.List<java.lang.String> __this__str_dict = new java.util.ArrayList<java.lang.String>(other.str_dict);
      this.str_dict = __this__str_dict;
    }
  }

  public TColumnDict deepCopy() {
    return new TColumnDict(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.str_dict = null;
  }

  /**
   * 
   * @see org.apache.doris.thrift.TPrimitiveType
   */
  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TPrimitiveType getType() {
    return this.type;
  }

  /**
   * 
   * @see org.apache.doris.thrift.TPrimitiveType
   */
  public TColumnDict setType(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TPrimitiveType type) {
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

  public int getStrDictSize() {
    return (this.str_dict == null) ? 0 : this.str_dict.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getStrDictIterator() {
    return (this.str_dict == null) ? null : this.str_dict.iterator();
  }

  public void addToStrDict(java.lang.String elem) {
    if (this.str_dict == null) {
      this.str_dict = new java.util.ArrayList<java.lang.String>();
    }
    this.str_dict.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getStrDict() {
    return this.str_dict;
  }

  public TColumnDict setStrDict(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> str_dict) {
    this.str_dict = str_dict;
    return this;
  }

  public void unsetStrDict() {
    this.str_dict = null;
  }

  /** Returns true if field str_dict is set (has been assigned a value) and false otherwise */
  public boolean isSetStrDict() {
    return this.str_dict != null;
  }

  public void setStrDictIsSet(boolean value) {
    if (!value) {
      this.str_dict = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((org.apache.doris.thrift.TPrimitiveType)value);
      }
      break;

    case STR_DICT:
      if (value == null) {
        unsetStrDict();
      } else {
        setStrDict((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case STR_DICT:
      return getStrDict();

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
    case STR_DICT:
      return isSetStrDict();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TColumnDict)
      return this.equals((TColumnDict)that);
    return false;
  }

  public boolean equals(TColumnDict that) {
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

    boolean this_present_str_dict = true && this.isSetStrDict();
    boolean that_present_str_dict = true && that.isSetStrDict();
    if (this_present_str_dict || that_present_str_dict) {
      if (!(this_present_str_dict && that_present_str_dict))
        return false;
      if (!this.str_dict.equals(that.str_dict))
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

    hashCode = hashCode * 8191 + ((isSetStrDict()) ? 131071 : 524287);
    if (isSetStrDict())
      hashCode = hashCode * 8191 + str_dict.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TColumnDict other) {
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
    lastComparison = java.lang.Boolean.compare(isSetStrDict(), other.isSetStrDict());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStrDict()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.str_dict, other.str_dict);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TColumnDict(");
    boolean first = true;

    if (isSetType()) {
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("str_dict:");
    if (this.str_dict == null) {
      sb.append("null");
    } else {
      sb.append(this.str_dict);
    }
    first = false;
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

  private static class TColumnDictStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TColumnDictStandardScheme getScheme() {
      return new TColumnDictStandardScheme();
    }
  }

  private static class TColumnDictStandardScheme extends org.apache.thrift.scheme.StandardScheme<TColumnDict> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TColumnDict struct) throws org.apache.thrift.TException {
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
              struct.type = org.apache.doris.thrift.TPrimitiveType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STR_DICT
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list84 = iprot.readListBegin();
                struct.str_dict = new java.util.ArrayList<java.lang.String>(_list84.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem85;
                for (int _i86 = 0; _i86 < _list84.size; ++_i86)
                {
                  _elem85 = iprot.readString();
                  struct.str_dict.add(_elem85);
                }
                iprot.readListEnd();
              }
              struct.setStrDictIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TColumnDict struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeI32(struct.type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.str_dict != null) {
        oprot.writeFieldBegin(STR_DICT_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.str_dict.size()));
          for (java.lang.String _iter87 : struct.str_dict)
          {
            oprot.writeString(_iter87);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TColumnDictTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TColumnDictTupleScheme getScheme() {
      return new TColumnDictTupleScheme();
    }
  }

  private static class TColumnDictTupleScheme extends org.apache.thrift.scheme.TupleScheme<TColumnDict> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TColumnDict struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetStrDict()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetStrDict()) {
        {
          oprot.writeI32(struct.str_dict.size());
          for (java.lang.String _iter88 : struct.str_dict)
          {
            oprot.writeString(_iter88);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TColumnDict struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.type = org.apache.doris.thrift.TPrimitiveType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list89 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.str_dict = new java.util.ArrayList<java.lang.String>(_list89.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem90;
          for (int _i91 = 0; _i91 < _list89.size; ++_i91)
          {
            _elem90 = iprot.readString();
            struct.str_dict.add(_elem90);
          }
        }
        struct.setStrDictIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

