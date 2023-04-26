/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public class TRangePartition implements org.apache.thrift.TBase<TRangePartition, TRangePartition._Fields>, java.io.Serializable, Cloneable, Comparable<TRangePartition> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRangePartition");

  private static final org.apache.thrift.protocol.TField PARTITION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField RANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("range", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField DISTRIBUTED_EXPRS_FIELD_DESC = new org.apache.thrift.protocol.TField("distributed_exprs", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField DISTRIBUTE_BUCKET_FIELD_DESC = new org.apache.thrift.protocol.TField("distribute_bucket", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TRangePartitionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TRangePartitionTupleSchemeFactory();

  public long partition_id; // required
  public @org.apache.thrift.annotation.Nullable TPartitionRange range; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TExpr> distributed_exprs; // optional
  public int distribute_bucket; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARTITION_ID((short)1, "partition_id"),
    RANGE((short)2, "range"),
    DISTRIBUTED_EXPRS((short)3, "distributed_exprs"),
    DISTRIBUTE_BUCKET((short)4, "distribute_bucket");

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
        case 1: // PARTITION_ID
          return PARTITION_ID;
        case 2: // RANGE
          return RANGE;
        case 3: // DISTRIBUTED_EXPRS
          return DISTRIBUTED_EXPRS;
        case 4: // DISTRIBUTE_BUCKET
          return DISTRIBUTE_BUCKET;
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
  private static final int __PARTITION_ID_ISSET_ID = 0;
  private static final int __DISTRIBUTE_BUCKET_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DISTRIBUTED_EXPRS,_Fields.DISTRIBUTE_BUCKET};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARTITION_ID, new org.apache.thrift.meta_data.FieldMetaData("partition_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.RANGE, new org.apache.thrift.meta_data.FieldMetaData("range", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TPartitionRange.class)));
    tmpMap.put(_Fields.DISTRIBUTED_EXPRS, new org.apache.thrift.meta_data.FieldMetaData("distributed_exprs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TExpr.class))));
    tmpMap.put(_Fields.DISTRIBUTE_BUCKET, new org.apache.thrift.meta_data.FieldMetaData("distribute_bucket", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRangePartition.class, metaDataMap);
  }

  public TRangePartition() {
  }

  public TRangePartition(
    long partition_id,
    TPartitionRange range)
  {
    this();
    this.partition_id = partition_id;
    setPartitionIdIsSet(true);
    this.range = range;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRangePartition(TRangePartition other) {
    __isset_bitfield = other.__isset_bitfield;
    this.partition_id = other.partition_id;
    if (other.isSetRange()) {
      this.range = new TPartitionRange(other.range);
    }
    if (other.isSetDistributedExprs()) {
      java.util.List<org.apache.doris.thrift.TExpr> __this__distributed_exprs = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(other.distributed_exprs.size());
      for (org.apache.doris.thrift.TExpr other_element : other.distributed_exprs) {
        __this__distributed_exprs.add(new org.apache.doris.thrift.TExpr(other_element));
      }
      this.distributed_exprs = __this__distributed_exprs;
    }
    this.distribute_bucket = other.distribute_bucket;
  }

  public TRangePartition deepCopy() {
    return new TRangePartition(this);
  }

  @Override
  public void clear() {
    setPartitionIdIsSet(false);
    this.partition_id = 0;
    this.range = null;
    this.distributed_exprs = null;
    setDistributeBucketIsSet(false);
    this.distribute_bucket = 0;
  }

  public long getPartitionId() {
    return this.partition_id;
  }

  public TRangePartition setPartitionId(long partition_id) {
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

  @org.apache.thrift.annotation.Nullable
  public TPartitionRange getRange() {
    return this.range;
  }

  public TRangePartition setRange(@org.apache.thrift.annotation.Nullable TPartitionRange range) {
    this.range = range;
    return this;
  }

  public void unsetRange() {
    this.range = null;
  }

  /** Returns true if field range is set (has been assigned a value) and false otherwise */
  public boolean isSetRange() {
    return this.range != null;
  }

  public void setRangeIsSet(boolean value) {
    if (!value) {
      this.range = null;
    }
  }

  public int getDistributedExprsSize() {
    return (this.distributed_exprs == null) ? 0 : this.distributed_exprs.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<org.apache.doris.thrift.TExpr> getDistributedExprsIterator() {
    return (this.distributed_exprs == null) ? null : this.distributed_exprs.iterator();
  }

  public void addToDistributedExprs(org.apache.doris.thrift.TExpr elem) {
    if (this.distributed_exprs == null) {
      this.distributed_exprs = new java.util.ArrayList<org.apache.doris.thrift.TExpr>();
    }
    this.distributed_exprs.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<org.apache.doris.thrift.TExpr> getDistributedExprs() {
    return this.distributed_exprs;
  }

  public TRangePartition setDistributedExprs(@org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TExpr> distributed_exprs) {
    this.distributed_exprs = distributed_exprs;
    return this;
  }

  public void unsetDistributedExprs() {
    this.distributed_exprs = null;
  }

  /** Returns true if field distributed_exprs is set (has been assigned a value) and false otherwise */
  public boolean isSetDistributedExprs() {
    return this.distributed_exprs != null;
  }

  public void setDistributedExprsIsSet(boolean value) {
    if (!value) {
      this.distributed_exprs = null;
    }
  }

  public int getDistributeBucket() {
    return this.distribute_bucket;
  }

  public TRangePartition setDistributeBucket(int distribute_bucket) {
    this.distribute_bucket = distribute_bucket;
    setDistributeBucketIsSet(true);
    return this;
  }

  public void unsetDistributeBucket() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DISTRIBUTE_BUCKET_ISSET_ID);
  }

  /** Returns true if field distribute_bucket is set (has been assigned a value) and false otherwise */
  public boolean isSetDistributeBucket() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DISTRIBUTE_BUCKET_ISSET_ID);
  }

  public void setDistributeBucketIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DISTRIBUTE_BUCKET_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PARTITION_ID:
      if (value == null) {
        unsetPartitionId();
      } else {
        setPartitionId((java.lang.Long)value);
      }
      break;

    case RANGE:
      if (value == null) {
        unsetRange();
      } else {
        setRange((TPartitionRange)value);
      }
      break;

    case DISTRIBUTED_EXPRS:
      if (value == null) {
        unsetDistributedExprs();
      } else {
        setDistributedExprs((java.util.List<org.apache.doris.thrift.TExpr>)value);
      }
      break;

    case DISTRIBUTE_BUCKET:
      if (value == null) {
        unsetDistributeBucket();
      } else {
        setDistributeBucket((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITION_ID:
      return getPartitionId();

    case RANGE:
      return getRange();

    case DISTRIBUTED_EXPRS:
      return getDistributedExprs();

    case DISTRIBUTE_BUCKET:
      return getDistributeBucket();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PARTITION_ID:
      return isSetPartitionId();
    case RANGE:
      return isSetRange();
    case DISTRIBUTED_EXPRS:
      return isSetDistributedExprs();
    case DISTRIBUTE_BUCKET:
      return isSetDistributeBucket();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TRangePartition)
      return this.equals((TRangePartition)that);
    return false;
  }

  public boolean equals(TRangePartition that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_partition_id = true;
    boolean that_present_partition_id = true;
    if (this_present_partition_id || that_present_partition_id) {
      if (!(this_present_partition_id && that_present_partition_id))
        return false;
      if (this.partition_id != that.partition_id)
        return false;
    }

    boolean this_present_range = true && this.isSetRange();
    boolean that_present_range = true && that.isSetRange();
    if (this_present_range || that_present_range) {
      if (!(this_present_range && that_present_range))
        return false;
      if (!this.range.equals(that.range))
        return false;
    }

    boolean this_present_distributed_exprs = true && this.isSetDistributedExprs();
    boolean that_present_distributed_exprs = true && that.isSetDistributedExprs();
    if (this_present_distributed_exprs || that_present_distributed_exprs) {
      if (!(this_present_distributed_exprs && that_present_distributed_exprs))
        return false;
      if (!this.distributed_exprs.equals(that.distributed_exprs))
        return false;
    }

    boolean this_present_distribute_bucket = true && this.isSetDistributeBucket();
    boolean that_present_distribute_bucket = true && that.isSetDistributeBucket();
    if (this_present_distribute_bucket || that_present_distribute_bucket) {
      if (!(this_present_distribute_bucket && that_present_distribute_bucket))
        return false;
      if (this.distribute_bucket != that.distribute_bucket)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(partition_id);

    hashCode = hashCode * 8191 + ((isSetRange()) ? 131071 : 524287);
    if (isSetRange())
      hashCode = hashCode * 8191 + range.hashCode();

    hashCode = hashCode * 8191 + ((isSetDistributedExprs()) ? 131071 : 524287);
    if (isSetDistributedExprs())
      hashCode = hashCode * 8191 + distributed_exprs.hashCode();

    hashCode = hashCode * 8191 + ((isSetDistributeBucket()) ? 131071 : 524287);
    if (isSetDistributeBucket())
      hashCode = hashCode * 8191 + distribute_bucket;

    return hashCode;
  }

  @Override
  public int compareTo(TRangePartition other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.compare(isSetRange(), other.isSetRange());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRange()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.range, other.range);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDistributedExprs(), other.isSetDistributedExprs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDistributedExprs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.distributed_exprs, other.distributed_exprs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDistributeBucket(), other.isSetDistributeBucket());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDistributeBucket()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.distribute_bucket, other.distribute_bucket);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TRangePartition(");
    boolean first = true;

    sb.append("partition_id:");
    sb.append(this.partition_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("range:");
    if (this.range == null) {
      sb.append("null");
    } else {
      sb.append(this.range);
    }
    first = false;
    if (isSetDistributedExprs()) {
      if (!first) sb.append(", ");
      sb.append("distributed_exprs:");
      if (this.distributed_exprs == null) {
        sb.append("null");
      } else {
        sb.append(this.distributed_exprs);
      }
      first = false;
    }
    if (isSetDistributeBucket()) {
      if (!first) sb.append(", ");
      sb.append("distribute_bucket:");
      sb.append(this.distribute_bucket);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'partition_id' because it's a primitive and you chose the non-beans generator.
    if (range == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'range' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (range != null) {
      range.validate();
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

  private static class TRangePartitionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRangePartitionStandardScheme getScheme() {
      return new TRangePartitionStandardScheme();
    }
  }

  private static class TRangePartitionStandardScheme extends org.apache.thrift.scheme.StandardScheme<TRangePartition> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TRangePartition struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.partition_id = iprot.readI64();
              struct.setPartitionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.range = new TPartitionRange();
              struct.range.read(iprot);
              struct.setRangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DISTRIBUTED_EXPRS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.distributed_exprs = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(_list0.size);
                @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new org.apache.doris.thrift.TExpr();
                  _elem1.read(iprot);
                  struct.distributed_exprs.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setDistributedExprsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DISTRIBUTE_BUCKET
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.distribute_bucket = iprot.readI32();
              struct.setDistributeBucketIsSet(true);
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
      if (!struct.isSetPartitionId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'partition_id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TRangePartition struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PARTITION_ID_FIELD_DESC);
      oprot.writeI64(struct.partition_id);
      oprot.writeFieldEnd();
      if (struct.range != null) {
        oprot.writeFieldBegin(RANGE_FIELD_DESC);
        struct.range.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.distributed_exprs != null) {
        if (struct.isSetDistributedExprs()) {
          oprot.writeFieldBegin(DISTRIBUTED_EXPRS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.distributed_exprs.size()));
            for (org.apache.doris.thrift.TExpr _iter3 : struct.distributed_exprs)
            {
              _iter3.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetDistributeBucket()) {
        oprot.writeFieldBegin(DISTRIBUTE_BUCKET_FIELD_DESC);
        oprot.writeI32(struct.distribute_bucket);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TRangePartitionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TRangePartitionTupleScheme getScheme() {
      return new TRangePartitionTupleScheme();
    }
  }

  private static class TRangePartitionTupleScheme extends org.apache.thrift.scheme.TupleScheme<TRangePartition> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRangePartition struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.partition_id);
      struct.range.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDistributedExprs()) {
        optionals.set(0);
      }
      if (struct.isSetDistributeBucket()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetDistributedExprs()) {
        {
          oprot.writeI32(struct.distributed_exprs.size());
          for (org.apache.doris.thrift.TExpr _iter4 : struct.distributed_exprs)
          {
            _iter4.write(oprot);
          }
        }
      }
      if (struct.isSetDistributeBucket()) {
        oprot.writeI32(struct.distribute_bucket);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TRangePartition struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.partition_id = iprot.readI64();
      struct.setPartitionIdIsSet(true);
      struct.range = new TPartitionRange();
      struct.range.read(iprot);
      struct.setRangeIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.distributed_exprs = new java.util.ArrayList<org.apache.doris.thrift.TExpr>(_list5.size);
          @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new org.apache.doris.thrift.TExpr();
            _elem6.read(iprot);
            struct.distributed_exprs.add(_elem6);
          }
        }
        struct.setDistributedExprsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.distribute_bucket = iprot.readI32();
        struct.setDistributeBucketIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

