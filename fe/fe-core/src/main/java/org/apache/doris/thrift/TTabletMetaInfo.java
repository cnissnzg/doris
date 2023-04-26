/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public class TTabletMetaInfo implements org.apache.thrift.TBase<TTabletMetaInfo, TTabletMetaInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TTabletMetaInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTabletMetaInfo");

  private static final org.apache.thrift.protocol.TField TABLET_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tablet_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField SCHEMA_HASH_FIELD_DESC = new org.apache.thrift.protocol.TField("schema_hash", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PARTITION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_id", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField META_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("meta_type", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField IS_IN_MEMORY_FIELD_DESC = new org.apache.thrift.protocol.TField("is_in_memory", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField STORAGE_POLICY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("storage_policy_id", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField IS_DROPPED_FIELD_DESC = new org.apache.thrift.protocol.TField("is_dropped", org.apache.thrift.protocol.TType.BOOL, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTabletMetaInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTabletMetaInfoTupleSchemeFactory();

  public long tablet_id; // optional
  public int schema_hash; // optional
  public long partition_id; // optional
  /**
   * 
   * @see TTabletMetaType
   */
  public @org.apache.thrift.annotation.Nullable TTabletMetaType meta_type; // optional
  public boolean is_in_memory; // optional
  public long storage_policy_id; // optional
  public boolean is_dropped; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLET_ID((short)1, "tablet_id"),
    SCHEMA_HASH((short)2, "schema_hash"),
    PARTITION_ID((short)3, "partition_id"),
    /**
     * 
     * @see TTabletMetaType
     */
    META_TYPE((short)4, "meta_type"),
    IS_IN_MEMORY((short)5, "is_in_memory"),
    STORAGE_POLICY_ID((short)7, "storage_policy_id"),
    IS_DROPPED((short)8, "is_dropped");

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
        case 1: // TABLET_ID
          return TABLET_ID;
        case 2: // SCHEMA_HASH
          return SCHEMA_HASH;
        case 3: // PARTITION_ID
          return PARTITION_ID;
        case 4: // META_TYPE
          return META_TYPE;
        case 5: // IS_IN_MEMORY
          return IS_IN_MEMORY;
        case 7: // STORAGE_POLICY_ID
          return STORAGE_POLICY_ID;
        case 8: // IS_DROPPED
          return IS_DROPPED;
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
  private static final int __TABLET_ID_ISSET_ID = 0;
  private static final int __SCHEMA_HASH_ISSET_ID = 1;
  private static final int __PARTITION_ID_ISSET_ID = 2;
  private static final int __IS_IN_MEMORY_ISSET_ID = 3;
  private static final int __STORAGE_POLICY_ID_ISSET_ID = 4;
  private static final int __IS_DROPPED_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TABLET_ID,_Fields.SCHEMA_HASH,_Fields.PARTITION_ID,_Fields.META_TYPE,_Fields.IS_IN_MEMORY,_Fields.STORAGE_POLICY_ID,_Fields.IS_DROPPED};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLET_ID, new org.apache.thrift.meta_data.FieldMetaData("tablet_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TTabletId")));
    tmpMap.put(_Fields.SCHEMA_HASH, new org.apache.thrift.meta_data.FieldMetaData("schema_hash", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TSchemaHash")));
    tmpMap.put(_Fields.PARTITION_ID, new org.apache.thrift.meta_data.FieldMetaData("partition_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "TPartitionId")));
    tmpMap.put(_Fields.META_TYPE, new org.apache.thrift.meta_data.FieldMetaData("meta_type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TTabletMetaType.class)));
    tmpMap.put(_Fields.IS_IN_MEMORY, new org.apache.thrift.meta_data.FieldMetaData("is_in_memory", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.STORAGE_POLICY_ID, new org.apache.thrift.meta_data.FieldMetaData("storage_policy_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.IS_DROPPED, new org.apache.thrift.meta_data.FieldMetaData("is_dropped", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTabletMetaInfo.class, metaDataMap);
  }

  public TTabletMetaInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTabletMetaInfo(TTabletMetaInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.tablet_id = other.tablet_id;
    this.schema_hash = other.schema_hash;
    this.partition_id = other.partition_id;
    if (other.isSetMetaType()) {
      this.meta_type = other.meta_type;
    }
    this.is_in_memory = other.is_in_memory;
    this.storage_policy_id = other.storage_policy_id;
    this.is_dropped = other.is_dropped;
  }

  public TTabletMetaInfo deepCopy() {
    return new TTabletMetaInfo(this);
  }

  @Override
  public void clear() {
    setTabletIdIsSet(false);
    this.tablet_id = 0;
    setSchemaHashIsSet(false);
    this.schema_hash = 0;
    setPartitionIdIsSet(false);
    this.partition_id = 0;
    this.meta_type = null;
    setIsInMemoryIsSet(false);
    this.is_in_memory = false;
    setStoragePolicyIdIsSet(false);
    this.storage_policy_id = 0;
    setIsDroppedIsSet(false);
    this.is_dropped = false;
  }

  public long getTabletId() {
    return this.tablet_id;
  }

  public TTabletMetaInfo setTabletId(long tablet_id) {
    this.tablet_id = tablet_id;
    setTabletIdIsSet(true);
    return this;
  }

  public void unsetTabletId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TABLET_ID_ISSET_ID);
  }

  /** Returns true if field tablet_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTabletId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TABLET_ID_ISSET_ID);
  }

  public void setTabletIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TABLET_ID_ISSET_ID, value);
  }

  public int getSchemaHash() {
    return this.schema_hash;
  }

  public TTabletMetaInfo setSchemaHash(int schema_hash) {
    this.schema_hash = schema_hash;
    setSchemaHashIsSet(true);
    return this;
  }

  public void unsetSchemaHash() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SCHEMA_HASH_ISSET_ID);
  }

  /** Returns true if field schema_hash is set (has been assigned a value) and false otherwise */
  public boolean isSetSchemaHash() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SCHEMA_HASH_ISSET_ID);
  }

  public void setSchemaHashIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SCHEMA_HASH_ISSET_ID, value);
  }

  public long getPartitionId() {
    return this.partition_id;
  }

  public TTabletMetaInfo setPartitionId(long partition_id) {
    this.partition_id = partition_id;
    setPartitionIdIsSet(true);
    return this;
  }

  public void unsetPartitionId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PARTITION_ID_ISSET_ID);
  }

  /** Returns true if field partition_id is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PARTITION_ID_ISSET_ID);
  }

  public void setPartitionIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PARTITION_ID_ISSET_ID, value);
  }

  /**
   * 
   * @see TTabletMetaType
   */
  @org.apache.thrift.annotation.Nullable
  public TTabletMetaType getMetaType() {
    return this.meta_type;
  }

  /**
   * 
   * @see TTabletMetaType
   */
  public TTabletMetaInfo setMetaType(@org.apache.thrift.annotation.Nullable TTabletMetaType meta_type) {
    this.meta_type = meta_type;
    return this;
  }

  public void unsetMetaType() {
    this.meta_type = null;
  }

  /** Returns true if field meta_type is set (has been assigned a value) and false otherwise */
  public boolean isSetMetaType() {
    return this.meta_type != null;
  }

  public void setMetaTypeIsSet(boolean value) {
    if (!value) {
      this.meta_type = null;
    }
  }

  public boolean isIsInMemory() {
    return this.is_in_memory;
  }

  public TTabletMetaInfo setIsInMemory(boolean is_in_memory) {
    this.is_in_memory = is_in_memory;
    setIsInMemoryIsSet(true);
    return this;
  }

  public void unsetIsInMemory() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IS_IN_MEMORY_ISSET_ID);
  }

  /** Returns true if field is_in_memory is set (has been assigned a value) and false otherwise */
  public boolean isSetIsInMemory() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IS_IN_MEMORY_ISSET_ID);
  }

  public void setIsInMemoryIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IS_IN_MEMORY_ISSET_ID, value);
  }

  public long getStoragePolicyId() {
    return this.storage_policy_id;
  }

  public TTabletMetaInfo setStoragePolicyId(long storage_policy_id) {
    this.storage_policy_id = storage_policy_id;
    setStoragePolicyIdIsSet(true);
    return this;
  }

  public void unsetStoragePolicyId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STORAGE_POLICY_ID_ISSET_ID);
  }

  /** Returns true if field storage_policy_id is set (has been assigned a value) and false otherwise */
  public boolean isSetStoragePolicyId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STORAGE_POLICY_ID_ISSET_ID);
  }

  public void setStoragePolicyIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STORAGE_POLICY_ID_ISSET_ID, value);
  }

  public boolean isIsDropped() {
    return this.is_dropped;
  }

  public TTabletMetaInfo setIsDropped(boolean is_dropped) {
    this.is_dropped = is_dropped;
    setIsDroppedIsSet(true);
    return this;
  }

  public void unsetIsDropped() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IS_DROPPED_ISSET_ID);
  }

  /** Returns true if field is_dropped is set (has been assigned a value) and false otherwise */
  public boolean isSetIsDropped() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IS_DROPPED_ISSET_ID);
  }

  public void setIsDroppedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IS_DROPPED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TABLET_ID:
      if (value == null) {
        unsetTabletId();
      } else {
        setTabletId((java.lang.Long)value);
      }
      break;

    case SCHEMA_HASH:
      if (value == null) {
        unsetSchemaHash();
      } else {
        setSchemaHash((java.lang.Integer)value);
      }
      break;

    case PARTITION_ID:
      if (value == null) {
        unsetPartitionId();
      } else {
        setPartitionId((java.lang.Long)value);
      }
      break;

    case META_TYPE:
      if (value == null) {
        unsetMetaType();
      } else {
        setMetaType((TTabletMetaType)value);
      }
      break;

    case IS_IN_MEMORY:
      if (value == null) {
        unsetIsInMemory();
      } else {
        setIsInMemory((java.lang.Boolean)value);
      }
      break;

    case STORAGE_POLICY_ID:
      if (value == null) {
        unsetStoragePolicyId();
      } else {
        setStoragePolicyId((java.lang.Long)value);
      }
      break;

    case IS_DROPPED:
      if (value == null) {
        unsetIsDropped();
      } else {
        setIsDropped((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLET_ID:
      return getTabletId();

    case SCHEMA_HASH:
      return getSchemaHash();

    case PARTITION_ID:
      return getPartitionId();

    case META_TYPE:
      return getMetaType();

    case IS_IN_MEMORY:
      return isIsInMemory();

    case STORAGE_POLICY_ID:
      return getStoragePolicyId();

    case IS_DROPPED:
      return isIsDropped();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TABLET_ID:
      return isSetTabletId();
    case SCHEMA_HASH:
      return isSetSchemaHash();
    case PARTITION_ID:
      return isSetPartitionId();
    case META_TYPE:
      return isSetMetaType();
    case IS_IN_MEMORY:
      return isSetIsInMemory();
    case STORAGE_POLICY_ID:
      return isSetStoragePolicyId();
    case IS_DROPPED:
      return isSetIsDropped();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TTabletMetaInfo)
      return this.equals((TTabletMetaInfo)that);
    return false;
  }

  public boolean equals(TTabletMetaInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tablet_id = true && this.isSetTabletId();
    boolean that_present_tablet_id = true && that.isSetTabletId();
    if (this_present_tablet_id || that_present_tablet_id) {
      if (!(this_present_tablet_id && that_present_tablet_id))
        return false;
      if (this.tablet_id != that.tablet_id)
        return false;
    }

    boolean this_present_schema_hash = true && this.isSetSchemaHash();
    boolean that_present_schema_hash = true && that.isSetSchemaHash();
    if (this_present_schema_hash || that_present_schema_hash) {
      if (!(this_present_schema_hash && that_present_schema_hash))
        return false;
      if (this.schema_hash != that.schema_hash)
        return false;
    }

    boolean this_present_partition_id = true && this.isSetPartitionId();
    boolean that_present_partition_id = true && that.isSetPartitionId();
    if (this_present_partition_id || that_present_partition_id) {
      if (!(this_present_partition_id && that_present_partition_id))
        return false;
      if (this.partition_id != that.partition_id)
        return false;
    }

    boolean this_present_meta_type = true && this.isSetMetaType();
    boolean that_present_meta_type = true && that.isSetMetaType();
    if (this_present_meta_type || that_present_meta_type) {
      if (!(this_present_meta_type && that_present_meta_type))
        return false;
      if (!this.meta_type.equals(that.meta_type))
        return false;
    }

    boolean this_present_is_in_memory = true && this.isSetIsInMemory();
    boolean that_present_is_in_memory = true && that.isSetIsInMemory();
    if (this_present_is_in_memory || that_present_is_in_memory) {
      if (!(this_present_is_in_memory && that_present_is_in_memory))
        return false;
      if (this.is_in_memory != that.is_in_memory)
        return false;
    }

    boolean this_present_storage_policy_id = true && this.isSetStoragePolicyId();
    boolean that_present_storage_policy_id = true && that.isSetStoragePolicyId();
    if (this_present_storage_policy_id || that_present_storage_policy_id) {
      if (!(this_present_storage_policy_id && that_present_storage_policy_id))
        return false;
      if (this.storage_policy_id != that.storage_policy_id)
        return false;
    }

    boolean this_present_is_dropped = true && this.isSetIsDropped();
    boolean that_present_is_dropped = true && that.isSetIsDropped();
    if (this_present_is_dropped || that_present_is_dropped) {
      if (!(this_present_is_dropped && that_present_is_dropped))
        return false;
      if (this.is_dropped != that.is_dropped)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTabletId()) ? 131071 : 524287);
    if (isSetTabletId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(tablet_id);

    hashCode = hashCode * 8191 + ((isSetSchemaHash()) ? 131071 : 524287);
    if (isSetSchemaHash())
      hashCode = hashCode * 8191 + schema_hash;

    hashCode = hashCode * 8191 + ((isSetPartitionId()) ? 131071 : 524287);
    if (isSetPartitionId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(partition_id);

    hashCode = hashCode * 8191 + ((isSetMetaType()) ? 131071 : 524287);
    if (isSetMetaType())
      hashCode = hashCode * 8191 + meta_type.getValue();

    hashCode = hashCode * 8191 + ((isSetIsInMemory()) ? 131071 : 524287);
    if (isSetIsInMemory())
      hashCode = hashCode * 8191 + ((is_in_memory) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetStoragePolicyId()) ? 131071 : 524287);
    if (isSetStoragePolicyId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(storage_policy_id);

    hashCode = hashCode * 8191 + ((isSetIsDropped()) ? 131071 : 524287);
    if (isSetIsDropped())
      hashCode = hashCode * 8191 + ((is_dropped) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TTabletMetaInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTabletId(), other.isSetTabletId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTabletId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tablet_id, other.tablet_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSchemaHash(), other.isSetSchemaHash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchemaHash()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.schema_hash, other.schema_hash);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPartitionId(), other.isSetPartitionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition_id, other.partition_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMetaType(), other.isSetMetaType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetaType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.meta_type, other.meta_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIsInMemory(), other.isSetIsInMemory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsInMemory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_in_memory, other.is_in_memory);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetStoragePolicyId(), other.isSetStoragePolicyId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStoragePolicyId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.storage_policy_id, other.storage_policy_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIsDropped(), other.isSetIsDropped());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsDropped()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_dropped, other.is_dropped);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTabletMetaInfo(");
    boolean first = true;

    if (isSetTabletId()) {
      sb.append("tablet_id:");
      sb.append(this.tablet_id);
      first = false;
    }
    if (isSetSchemaHash()) {
      if (!first) sb.append(", ");
      sb.append("schema_hash:");
      sb.append(this.schema_hash);
      first = false;
    }
    if (isSetPartitionId()) {
      if (!first) sb.append(", ");
      sb.append("partition_id:");
      sb.append(this.partition_id);
      first = false;
    }
    if (isSetMetaType()) {
      if (!first) sb.append(", ");
      sb.append("meta_type:");
      if (this.meta_type == null) {
        sb.append("null");
      } else {
        sb.append(this.meta_type);
      }
      first = false;
    }
    if (isSetIsInMemory()) {
      if (!first) sb.append(", ");
      sb.append("is_in_memory:");
      sb.append(this.is_in_memory);
      first = false;
    }
    if (isSetStoragePolicyId()) {
      if (!first) sb.append(", ");
      sb.append("storage_policy_id:");
      sb.append(this.storage_policy_id);
      first = false;
    }
    if (isSetIsDropped()) {
      if (!first) sb.append(", ");
      sb.append("is_dropped:");
      sb.append(this.is_dropped);
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

  private static class TTabletMetaInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTabletMetaInfoStandardScheme getScheme() {
      return new TTabletMetaInfoStandardScheme();
    }
  }

  private static class TTabletMetaInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTabletMetaInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTabletMetaInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLET_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.tablet_id = iprot.readI64();
              struct.setTabletIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SCHEMA_HASH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.schema_hash = iprot.readI32();
              struct.setSchemaHashIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARTITION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.partition_id = iprot.readI64();
              struct.setPartitionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // META_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.meta_type = org.apache.doris.thrift.TTabletMetaType.findByValue(iprot.readI32());
              struct.setMetaTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // IS_IN_MEMORY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_in_memory = iprot.readBool();
              struct.setIsInMemoryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // STORAGE_POLICY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.storage_policy_id = iprot.readI64();
              struct.setStoragePolicyIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // IS_DROPPED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_dropped = iprot.readBool();
              struct.setIsDroppedIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTabletMetaInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetTabletId()) {
        oprot.writeFieldBegin(TABLET_ID_FIELD_DESC);
        oprot.writeI64(struct.tablet_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSchemaHash()) {
        oprot.writeFieldBegin(SCHEMA_HASH_FIELD_DESC);
        oprot.writeI32(struct.schema_hash);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPartitionId()) {
        oprot.writeFieldBegin(PARTITION_ID_FIELD_DESC);
        oprot.writeI64(struct.partition_id);
        oprot.writeFieldEnd();
      }
      if (struct.meta_type != null) {
        if (struct.isSetMetaType()) {
          oprot.writeFieldBegin(META_TYPE_FIELD_DESC);
          oprot.writeI32(struct.meta_type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetIsInMemory()) {
        oprot.writeFieldBegin(IS_IN_MEMORY_FIELD_DESC);
        oprot.writeBool(struct.is_in_memory);
        oprot.writeFieldEnd();
      }
      if (struct.isSetStoragePolicyId()) {
        oprot.writeFieldBegin(STORAGE_POLICY_ID_FIELD_DESC);
        oprot.writeI64(struct.storage_policy_id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIsDropped()) {
        oprot.writeFieldBegin(IS_DROPPED_FIELD_DESC);
        oprot.writeBool(struct.is_dropped);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTabletMetaInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTabletMetaInfoTupleScheme getScheme() {
      return new TTabletMetaInfoTupleScheme();
    }
  }

  private static class TTabletMetaInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTabletMetaInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTabletMetaInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTabletId()) {
        optionals.set(0);
      }
      if (struct.isSetSchemaHash()) {
        optionals.set(1);
      }
      if (struct.isSetPartitionId()) {
        optionals.set(2);
      }
      if (struct.isSetMetaType()) {
        optionals.set(3);
      }
      if (struct.isSetIsInMemory()) {
        optionals.set(4);
      }
      if (struct.isSetStoragePolicyId()) {
        optionals.set(5);
      }
      if (struct.isSetIsDropped()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetTabletId()) {
        oprot.writeI64(struct.tablet_id);
      }
      if (struct.isSetSchemaHash()) {
        oprot.writeI32(struct.schema_hash);
      }
      if (struct.isSetPartitionId()) {
        oprot.writeI64(struct.partition_id);
      }
      if (struct.isSetMetaType()) {
        oprot.writeI32(struct.meta_type.getValue());
      }
      if (struct.isSetIsInMemory()) {
        oprot.writeBool(struct.is_in_memory);
      }
      if (struct.isSetStoragePolicyId()) {
        oprot.writeI64(struct.storage_policy_id);
      }
      if (struct.isSetIsDropped()) {
        oprot.writeBool(struct.is_dropped);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTabletMetaInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.tablet_id = iprot.readI64();
        struct.setTabletIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.schema_hash = iprot.readI32();
        struct.setSchemaHashIsSet(true);
      }
      if (incoming.get(2)) {
        struct.partition_id = iprot.readI64();
        struct.setPartitionIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.meta_type = org.apache.doris.thrift.TTabletMetaType.findByValue(iprot.readI32());
        struct.setMetaTypeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.is_in_memory = iprot.readBool();
        struct.setIsInMemoryIsSet(true);
      }
      if (incoming.get(5)) {
        struct.storage_policy_id = iprot.readI64();
        struct.setStoragePolicyIdIsSet(true);
      }
      if (incoming.get(6)) {
        struct.is_dropped = iprot.readBool();
        struct.setIsDroppedIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

