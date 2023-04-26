/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public class TTupleIsNullPredicate implements org.apache.thrift.TBase<TTupleIsNullPredicate, TTupleIsNullPredicate._Fields>, java.io.Serializable, Cloneable, Comparable<TTupleIsNullPredicate> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTupleIsNullPredicate");

  private static final org.apache.thrift.protocol.TField TUPLE_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("tuple_ids", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField NULL_SIDE_FIELD_DESC = new org.apache.thrift.protocol.TField("null_side", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTupleIsNullPredicateStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTupleIsNullPredicateTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> tuple_ids; // required
  /**
   * 
   * @see TNullSide
   */
  public @org.apache.thrift.annotation.Nullable TNullSide null_side; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TUPLE_IDS((short)1, "tuple_ids"),
    /**
     * 
     * @see TNullSide
     */
    NULL_SIDE((short)2, "null_side");

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
        case 1: // TUPLE_IDS
          return TUPLE_IDS;
        case 2: // NULL_SIDE
          return NULL_SIDE;
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
  private static final _Fields optionals[] = {_Fields.NULL_SIDE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TUPLE_IDS, new org.apache.thrift.meta_data.FieldMetaData("tuple_ids", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32            , "TTupleId"))));
    tmpMap.put(_Fields.NULL_SIDE, new org.apache.thrift.meta_data.FieldMetaData("null_side", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TNullSide.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTupleIsNullPredicate.class, metaDataMap);
  }

  public TTupleIsNullPredicate() {
  }

  public TTupleIsNullPredicate(
    java.util.List<java.lang.Integer> tuple_ids)
  {
    this();
    this.tuple_ids = tuple_ids;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTupleIsNullPredicate(TTupleIsNullPredicate other) {
    if (other.isSetTupleIds()) {
      java.util.List<java.lang.Integer> __this__tuple_ids = new java.util.ArrayList<java.lang.Integer>(other.tuple_ids.size());
      for (java.lang.Integer other_element : other.tuple_ids) {
        __this__tuple_ids.add(other_element);
      }
      this.tuple_ids = __this__tuple_ids;
    }
    if (other.isSetNullSide()) {
      this.null_side = other.null_side;
    }
  }

  public TTupleIsNullPredicate deepCopy() {
    return new TTupleIsNullPredicate(this);
  }

  @Override
  public void clear() {
    this.tuple_ids = null;
    this.null_side = null;
  }

  public int getTupleIdsSize() {
    return (this.tuple_ids == null) ? 0 : this.tuple_ids.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Integer> getTupleIdsIterator() {
    return (this.tuple_ids == null) ? null : this.tuple_ids.iterator();
  }

  public void addToTupleIds(int elem) {
    if (this.tuple_ids == null) {
      this.tuple_ids = new java.util.ArrayList<java.lang.Integer>();
    }
    this.tuple_ids.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Integer> getTupleIds() {
    return this.tuple_ids;
  }

  public TTupleIsNullPredicate setTupleIds(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Integer> tuple_ids) {
    this.tuple_ids = tuple_ids;
    return this;
  }

  public void unsetTupleIds() {
    this.tuple_ids = null;
  }

  /** Returns true if field tuple_ids is set (has been assigned a value) and false otherwise */
  public boolean isSetTupleIds() {
    return this.tuple_ids != null;
  }

  public void setTupleIdsIsSet(boolean value) {
    if (!value) {
      this.tuple_ids = null;
    }
  }

  /**
   * 
   * @see TNullSide
   */
  @org.apache.thrift.annotation.Nullable
  public TNullSide getNullSide() {
    return this.null_side;
  }

  /**
   * 
   * @see TNullSide
   */
  public TTupleIsNullPredicate setNullSide(@org.apache.thrift.annotation.Nullable TNullSide null_side) {
    this.null_side = null_side;
    return this;
  }

  public void unsetNullSide() {
    this.null_side = null;
  }

  /** Returns true if field null_side is set (has been assigned a value) and false otherwise */
  public boolean isSetNullSide() {
    return this.null_side != null;
  }

  public void setNullSideIsSet(boolean value) {
    if (!value) {
      this.null_side = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TUPLE_IDS:
      if (value == null) {
        unsetTupleIds();
      } else {
        setTupleIds((java.util.List<java.lang.Integer>)value);
      }
      break;

    case NULL_SIDE:
      if (value == null) {
        unsetNullSide();
      } else {
        setNullSide((TNullSide)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TUPLE_IDS:
      return getTupleIds();

    case NULL_SIDE:
      return getNullSide();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TUPLE_IDS:
      return isSetTupleIds();
    case NULL_SIDE:
      return isSetNullSide();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TTupleIsNullPredicate)
      return this.equals((TTupleIsNullPredicate)that);
    return false;
  }

  public boolean equals(TTupleIsNullPredicate that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tuple_ids = true && this.isSetTupleIds();
    boolean that_present_tuple_ids = true && that.isSetTupleIds();
    if (this_present_tuple_ids || that_present_tuple_ids) {
      if (!(this_present_tuple_ids && that_present_tuple_ids))
        return false;
      if (!this.tuple_ids.equals(that.tuple_ids))
        return false;
    }

    boolean this_present_null_side = true && this.isSetNullSide();
    boolean that_present_null_side = true && that.isSetNullSide();
    if (this_present_null_side || that_present_null_side) {
      if (!(this_present_null_side && that_present_null_side))
        return false;
      if (!this.null_side.equals(that.null_side))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTupleIds()) ? 131071 : 524287);
    if (isSetTupleIds())
      hashCode = hashCode * 8191 + tuple_ids.hashCode();

    hashCode = hashCode * 8191 + ((isSetNullSide()) ? 131071 : 524287);
    if (isSetNullSide())
      hashCode = hashCode * 8191 + null_side.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(TTupleIsNullPredicate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTupleIds(), other.isSetTupleIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTupleIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tuple_ids, other.tuple_ids);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNullSide(), other.isSetNullSide());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNullSide()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.null_side, other.null_side);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTupleIsNullPredicate(");
    boolean first = true;

    sb.append("tuple_ids:");
    if (this.tuple_ids == null) {
      sb.append("null");
    } else {
      sb.append(this.tuple_ids);
    }
    first = false;
    if (isSetNullSide()) {
      if (!first) sb.append(", ");
      sb.append("null_side:");
      if (this.null_side == null) {
        sb.append("null");
      } else {
        sb.append(this.null_side);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (tuple_ids == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tuple_ids' was not present! Struct: " + toString());
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

  private static class TTupleIsNullPredicateStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTupleIsNullPredicateStandardScheme getScheme() {
      return new TTupleIsNullPredicateStandardScheme();
    }
  }

  private static class TTupleIsNullPredicateStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTupleIsNullPredicate> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTupleIsNullPredicate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TUPLE_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.tuple_ids = new java.util.ArrayList<java.lang.Integer>(_list8.size);
                int _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = iprot.readI32();
                  struct.tuple_ids.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setTupleIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NULL_SIDE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.null_side = org.apache.doris.thrift.TNullSide.findByValue(iprot.readI32());
              struct.setNullSideIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTupleIsNullPredicate struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tuple_ids != null) {
        oprot.writeFieldBegin(TUPLE_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.tuple_ids.size()));
          for (int _iter11 : struct.tuple_ids)
          {
            oprot.writeI32(_iter11);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.null_side != null) {
        if (struct.isSetNullSide()) {
          oprot.writeFieldBegin(NULL_SIDE_FIELD_DESC);
          oprot.writeI32(struct.null_side.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTupleIsNullPredicateTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTupleIsNullPredicateTupleScheme getScheme() {
      return new TTupleIsNullPredicateTupleScheme();
    }
  }

  private static class TTupleIsNullPredicateTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTupleIsNullPredicate> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTupleIsNullPredicate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.tuple_ids.size());
        for (int _iter12 : struct.tuple_ids)
        {
          oprot.writeI32(_iter12);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetNullSide()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetNullSide()) {
        oprot.writeI32(struct.null_side.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTupleIsNullPredicate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list13 = iprot.readListBegin(org.apache.thrift.protocol.TType.I32);
        struct.tuple_ids = new java.util.ArrayList<java.lang.Integer>(_list13.size);
        int _elem14;
        for (int _i15 = 0; _i15 < _list13.size; ++_i15)
        {
          _elem14 = iprot.readI32();
          struct.tuple_ids.add(_elem14);
        }
      }
      struct.setTupleIdsIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.null_side = org.apache.doris.thrift.TNullSide.findByValue(iprot.readI32());
        struct.setNullSideIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

