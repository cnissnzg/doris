/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public class TCreateRollupParams implements org.apache.thrift.TBase<TCreateRollupParams, TCreateRollupParams._Fields>, java.io.Serializable, Cloneable, Comparable<TCreateRollupParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCreateRollupParams");

  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("table_name", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMN_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("column_names", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField ROLLUP_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("rollup_name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PARTITION_DESC_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_desc", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TCreateRollupParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TCreateRollupParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable TTableName table_name; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> column_names; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String rollup_name; // optional
  public @org.apache.thrift.annotation.Nullable TPartitionDesc partition_desc; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLE_NAME((short)1, "table_name"),
    COLUMN_NAMES((short)2, "column_names"),
    ROLLUP_NAME((short)3, "rollup_name"),
    PARTITION_DESC((short)4, "partition_desc");

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
        case 1: // TABLE_NAME
          return TABLE_NAME;
        case 2: // COLUMN_NAMES
          return COLUMN_NAMES;
        case 3: // ROLLUP_NAME
          return ROLLUP_NAME;
        case 4: // PARTITION_DESC
          return PARTITION_DESC;
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
  private static final _Fields optionals[] = {_Fields.ROLLUP_NAME,_Fields.PARTITION_DESC};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("table_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTableName.class)));
    tmpMap.put(_Fields.COLUMN_NAMES, new org.apache.thrift.meta_data.FieldMetaData("column_names", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.ROLLUP_NAME, new org.apache.thrift.meta_data.FieldMetaData("rollup_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARTITION_DESC, new org.apache.thrift.meta_data.FieldMetaData("partition_desc", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TPartitionDesc.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCreateRollupParams.class, metaDataMap);
  }

  public TCreateRollupParams() {
  }

  public TCreateRollupParams(
    TTableName table_name,
    java.util.List<java.lang.String> column_names)
  {
    this();
    this.table_name = table_name;
    this.column_names = column_names;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCreateRollupParams(TCreateRollupParams other) {
    if (other.isSetTableName()) {
      this.table_name = new TTableName(other.table_name);
    }
    if (other.isSetColumnNames()) {
      java.util.List<java.lang.String> __this__column_names = new java.util.ArrayList<java.lang.String>(other.column_names);
      this.column_names = __this__column_names;
    }
    if (other.isSetRollupName()) {
      this.rollup_name = other.rollup_name;
    }
    if (other.isSetPartitionDesc()) {
      this.partition_desc = new TPartitionDesc(other.partition_desc);
    }
  }

  public TCreateRollupParams deepCopy() {
    return new TCreateRollupParams(this);
  }

  @Override
  public void clear() {
    this.table_name = null;
    this.column_names = null;
    this.rollup_name = null;
    this.partition_desc = null;
  }

  @org.apache.thrift.annotation.Nullable
  public TTableName getTableName() {
    return this.table_name;
  }

  public TCreateRollupParams setTableName(@org.apache.thrift.annotation.Nullable TTableName table_name) {
    this.table_name = table_name;
    return this;
  }

  public void unsetTableName() {
    this.table_name = null;
  }

  /** Returns true if field table_name is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.table_name != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.table_name = null;
    }
  }

  public int getColumnNamesSize() {
    return (this.column_names == null) ? 0 : this.column_names.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getColumnNamesIterator() {
    return (this.column_names == null) ? null : this.column_names.iterator();
  }

  public void addToColumnNames(java.lang.String elem) {
    if (this.column_names == null) {
      this.column_names = new java.util.ArrayList<java.lang.String>();
    }
    this.column_names.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getColumnNames() {
    return this.column_names;
  }

  public TCreateRollupParams setColumnNames(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> column_names) {
    this.column_names = column_names;
    return this;
  }

  public void unsetColumnNames() {
    this.column_names = null;
  }

  /** Returns true if field column_names is set (has been assigned a value) and false otherwise */
  public boolean isSetColumnNames() {
    return this.column_names != null;
  }

  public void setColumnNamesIsSet(boolean value) {
    if (!value) {
      this.column_names = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getRollupName() {
    return this.rollup_name;
  }

  public TCreateRollupParams setRollupName(@org.apache.thrift.annotation.Nullable java.lang.String rollup_name) {
    this.rollup_name = rollup_name;
    return this;
  }

  public void unsetRollupName() {
    this.rollup_name = null;
  }

  /** Returns true if field rollup_name is set (has been assigned a value) and false otherwise */
  public boolean isSetRollupName() {
    return this.rollup_name != null;
  }

  public void setRollupNameIsSet(boolean value) {
    if (!value) {
      this.rollup_name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TPartitionDesc getPartitionDesc() {
    return this.partition_desc;
  }

  public TCreateRollupParams setPartitionDesc(@org.apache.thrift.annotation.Nullable TPartitionDesc partition_desc) {
    this.partition_desc = partition_desc;
    return this;
  }

  public void unsetPartitionDesc() {
    this.partition_desc = null;
  }

  /** Returns true if field partition_desc is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionDesc() {
    return this.partition_desc != null;
  }

  public void setPartitionDescIsSet(boolean value) {
    if (!value) {
      this.partition_desc = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((TTableName)value);
      }
      break;

    case COLUMN_NAMES:
      if (value == null) {
        unsetColumnNames();
      } else {
        setColumnNames((java.util.List<java.lang.String>)value);
      }
      break;

    case ROLLUP_NAME:
      if (value == null) {
        unsetRollupName();
      } else {
        setRollupName((java.lang.String)value);
      }
      break;

    case PARTITION_DESC:
      if (value == null) {
        unsetPartitionDesc();
      } else {
        setPartitionDesc((TPartitionDesc)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_NAME:
      return getTableName();

    case COLUMN_NAMES:
      return getColumnNames();

    case ROLLUP_NAME:
      return getRollupName();

    case PARTITION_DESC:
      return getPartitionDesc();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TABLE_NAME:
      return isSetTableName();
    case COLUMN_NAMES:
      return isSetColumnNames();
    case ROLLUP_NAME:
      return isSetRollupName();
    case PARTITION_DESC:
      return isSetPartitionDesc();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TCreateRollupParams)
      return this.equals((TCreateRollupParams)that);
    return false;
  }

  public boolean equals(TCreateRollupParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_table_name = true && this.isSetTableName();
    boolean that_present_table_name = true && that.isSetTableName();
    if (this_present_table_name || that_present_table_name) {
      if (!(this_present_table_name && that_present_table_name))
        return false;
      if (!this.table_name.equals(that.table_name))
        return false;
    }

    boolean this_present_column_names = true && this.isSetColumnNames();
    boolean that_present_column_names = true && that.isSetColumnNames();
    if (this_present_column_names || that_present_column_names) {
      if (!(this_present_column_names && that_present_column_names))
        return false;
      if (!this.column_names.equals(that.column_names))
        return false;
    }

    boolean this_present_rollup_name = true && this.isSetRollupName();
    boolean that_present_rollup_name = true && that.isSetRollupName();
    if (this_present_rollup_name || that_present_rollup_name) {
      if (!(this_present_rollup_name && that_present_rollup_name))
        return false;
      if (!this.rollup_name.equals(that.rollup_name))
        return false;
    }

    boolean this_present_partition_desc = true && this.isSetPartitionDesc();
    boolean that_present_partition_desc = true && that.isSetPartitionDesc();
    if (this_present_partition_desc || that_present_partition_desc) {
      if (!(this_present_partition_desc && that_present_partition_desc))
        return false;
      if (!this.partition_desc.equals(that.partition_desc))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTableName()) ? 131071 : 524287);
    if (isSetTableName())
      hashCode = hashCode * 8191 + table_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetColumnNames()) ? 131071 : 524287);
    if (isSetColumnNames())
      hashCode = hashCode * 8191 + column_names.hashCode();

    hashCode = hashCode * 8191 + ((isSetRollupName()) ? 131071 : 524287);
    if (isSetRollupName())
      hashCode = hashCode * 8191 + rollup_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetPartitionDesc()) ? 131071 : 524287);
    if (isSetPartitionDesc())
      hashCode = hashCode * 8191 + partition_desc.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TCreateRollupParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTableName(), other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_name, other.table_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetColumnNames(), other.isSetColumnNames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumnNames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.column_names, other.column_names);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRollupName(), other.isSetRollupName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRollupName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rollup_name, other.rollup_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPartitionDesc(), other.isSetPartitionDesc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionDesc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition_desc, other.partition_desc);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TCreateRollupParams(");
    boolean first = true;

    sb.append("table_name:");
    if (this.table_name == null) {
      sb.append("null");
    } else {
      sb.append(this.table_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("column_names:");
    if (this.column_names == null) {
      sb.append("null");
    } else {
      sb.append(this.column_names);
    }
    first = false;
    if (isSetRollupName()) {
      if (!first) sb.append(", ");
      sb.append("rollup_name:");
      if (this.rollup_name == null) {
        sb.append("null");
      } else {
        sb.append(this.rollup_name);
      }
      first = false;
    }
    if (isSetPartitionDesc()) {
      if (!first) sb.append(", ");
      sb.append("partition_desc:");
      if (this.partition_desc == null) {
        sb.append("null");
      } else {
        sb.append(this.partition_desc);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (table_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'table_name' was not present! Struct: " + toString());
    }
    if (column_names == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'column_names' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (table_name != null) {
      table_name.validate();
    }
    if (partition_desc != null) {
      partition_desc.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TCreateRollupParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCreateRollupParamsStandardScheme getScheme() {
      return new TCreateRollupParamsStandardScheme();
    }
  }

  private static class TCreateRollupParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TCreateRollupParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCreateRollupParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.table_name = new TTableName();
              struct.table_name.read(iprot);
              struct.setTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMN_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list42 = iprot.readListBegin();
                struct.column_names = new java.util.ArrayList<java.lang.String>(_list42.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem43;
                for (int _i44 = 0; _i44 < _list42.size; ++_i44)
                {
                  _elem43 = iprot.readString();
                  struct.column_names.add(_elem43);
                }
                iprot.readListEnd();
              }
              struct.setColumnNamesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ROLLUP_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.rollup_name = iprot.readString();
              struct.setRollupNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PARTITION_DESC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.partition_desc = new TPartitionDesc();
              struct.partition_desc.read(iprot);
              struct.setPartitionDescIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCreateRollupParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.table_name != null) {
        oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
        struct.table_name.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.column_names != null) {
        oprot.writeFieldBegin(COLUMN_NAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.column_names.size()));
          for (java.lang.String _iter45 : struct.column_names)
          {
            oprot.writeString(_iter45);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.rollup_name != null) {
        if (struct.isSetRollupName()) {
          oprot.writeFieldBegin(ROLLUP_NAME_FIELD_DESC);
          oprot.writeString(struct.rollup_name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.partition_desc != null) {
        if (struct.isSetPartitionDesc()) {
          oprot.writeFieldBegin(PARTITION_DESC_FIELD_DESC);
          struct.partition_desc.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCreateRollupParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCreateRollupParamsTupleScheme getScheme() {
      return new TCreateRollupParamsTupleScheme();
    }
  }

  private static class TCreateRollupParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TCreateRollupParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCreateRollupParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.table_name.write(oprot);
      {
        oprot.writeI32(struct.column_names.size());
        for (java.lang.String _iter46 : struct.column_names)
        {
          oprot.writeString(_iter46);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRollupName()) {
        optionals.set(0);
      }
      if (struct.isSetPartitionDesc()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetRollupName()) {
        oprot.writeString(struct.rollup_name);
      }
      if (struct.isSetPartitionDesc()) {
        struct.partition_desc.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCreateRollupParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.table_name = new TTableName();
      struct.table_name.read(iprot);
      struct.setTableNameIsSet(true);
      {
        org.apache.thrift.protocol.TList _list47 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
        struct.column_names = new java.util.ArrayList<java.lang.String>(_list47.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _elem48;
        for (int _i49 = 0; _i49 < _list47.size; ++_i49)
        {
          _elem48 = iprot.readString();
          struct.column_names.add(_elem48);
        }
      }
      struct.setColumnNamesIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.rollup_name = iprot.readString();
        struct.setRollupNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.partition_desc = new TPartitionDesc();
        struct.partition_desc.read(iprot);
        struct.setPartitionDescIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

