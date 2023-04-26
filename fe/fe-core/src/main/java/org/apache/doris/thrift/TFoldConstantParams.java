/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public class TFoldConstantParams implements org.apache.thrift.TBase<TFoldConstantParams, TFoldConstantParams._Fields>, java.io.Serializable, Cloneable, Comparable<TFoldConstantParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFoldConstantParams");

  private static final org.apache.thrift.protocol.TField EXPR_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("expr_map", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField QUERY_GLOBALS_FIELD_DESC = new org.apache.thrift.protocol.TField("query_globals", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField VEC_EXEC_FIELD_DESC = new org.apache.thrift.protocol.TField("vec_exec", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField QUERY_OPTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("query_options", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField QUERY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("query_id", org.apache.thrift.protocol.TType.STRUCT, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TFoldConstantParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TFoldConstantParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr>> expr_map; // required
  public @org.apache.thrift.annotation.Nullable TQueryGlobals query_globals; // required
  public boolean vec_exec; // optional
  public @org.apache.thrift.annotation.Nullable TQueryOptions query_options; // optional
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId query_id; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXPR_MAP((short)1, "expr_map"),
    QUERY_GLOBALS((short)2, "query_globals"),
    VEC_EXEC((short)3, "vec_exec"),
    QUERY_OPTIONS((short)4, "query_options"),
    QUERY_ID((short)5, "query_id");

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
        case 1: // EXPR_MAP
          return EXPR_MAP;
        case 2: // QUERY_GLOBALS
          return QUERY_GLOBALS;
        case 3: // VEC_EXEC
          return VEC_EXEC;
        case 4: // QUERY_OPTIONS
          return QUERY_OPTIONS;
        case 5: // QUERY_ID
          return QUERY_ID;
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
  private static final int __VEC_EXEC_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.VEC_EXEC,_Fields.QUERY_OPTIONS,_Fields.QUERY_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXPR_MAP, new org.apache.thrift.meta_data.FieldMetaData("expr_map", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TExpr.class)))));
    tmpMap.put(_Fields.QUERY_GLOBALS, new org.apache.thrift.meta_data.FieldMetaData("query_globals", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TQueryGlobals.class)));
    tmpMap.put(_Fields.VEC_EXEC, new org.apache.thrift.meta_data.FieldMetaData("vec_exec", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.QUERY_OPTIONS, new org.apache.thrift.meta_data.FieldMetaData("query_options", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TQueryOptions.class)));
    tmpMap.put(_Fields.QUERY_ID, new org.apache.thrift.meta_data.FieldMetaData("query_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TUniqueId.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFoldConstantParams.class, metaDataMap);
  }

  public TFoldConstantParams() {
  }

  public TFoldConstantParams(
    java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr>> expr_map,
    TQueryGlobals query_globals)
  {
    this();
    this.expr_map = expr_map;
    this.query_globals = query_globals;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TFoldConstantParams(TFoldConstantParams other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetExprMap()) {
      java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr>> __this__expr_map = new java.util.HashMap<java.lang.String,java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr>>(other.expr_map.size());
      for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr>> other_element : other.expr_map.entrySet()) {

        java.lang.String other_element_key = other_element.getKey();
        java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr> other_element_value = other_element.getValue();

        java.lang.String __this__expr_map_copy_key = other_element_key;

        java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr> __this__expr_map_copy_value = new java.util.HashMap<java.lang.String,org.apache.doris.thrift.TExpr>(other_element_value.size());
        for (java.util.Map.Entry<java.lang.String, org.apache.doris.thrift.TExpr> other_element_value_element : other_element_value.entrySet()) {

          java.lang.String other_element_value_element_key = other_element_value_element.getKey();
          org.apache.doris.thrift.TExpr other_element_value_element_value = other_element_value_element.getValue();

          java.lang.String __this__expr_map_copy_value_copy_key = other_element_value_element_key;

          org.apache.doris.thrift.TExpr __this__expr_map_copy_value_copy_value = new org.apache.doris.thrift.TExpr(other_element_value_element_value);

          __this__expr_map_copy_value.put(__this__expr_map_copy_value_copy_key, __this__expr_map_copy_value_copy_value);
        }

        __this__expr_map.put(__this__expr_map_copy_key, __this__expr_map_copy_value);
      }
      this.expr_map = __this__expr_map;
    }
    if (other.isSetQueryGlobals()) {
      this.query_globals = new TQueryGlobals(other.query_globals);
    }
    this.vec_exec = other.vec_exec;
    if (other.isSetQueryOptions()) {
      this.query_options = new TQueryOptions(other.query_options);
    }
    if (other.isSetQueryId()) {
      this.query_id = new org.apache.doris.thrift.TUniqueId(other.query_id);
    }
  }

  public TFoldConstantParams deepCopy() {
    return new TFoldConstantParams(this);
  }

  @Override
  public void clear() {
    this.expr_map = null;
    this.query_globals = null;
    setVecExecIsSet(false);
    this.vec_exec = false;
    this.query_options = null;
    this.query_id = null;
  }

  public int getExprMapSize() {
    return (this.expr_map == null) ? 0 : this.expr_map.size();
  }

  public void putToExprMap(java.lang.String key, java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr> val) {
    if (this.expr_map == null) {
      this.expr_map = new java.util.HashMap<java.lang.String,java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr>>();
    }
    this.expr_map.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr>> getExprMap() {
    return this.expr_map;
  }

  public TFoldConstantParams setExprMap(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr>> expr_map) {
    this.expr_map = expr_map;
    return this;
  }

  public void unsetExprMap() {
    this.expr_map = null;
  }

  /** Returns true if field expr_map is set (has been assigned a value) and false otherwise */
  public boolean isSetExprMap() {
    return this.expr_map != null;
  }

  public void setExprMapIsSet(boolean value) {
    if (!value) {
      this.expr_map = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TQueryGlobals getQueryGlobals() {
    return this.query_globals;
  }

  public TFoldConstantParams setQueryGlobals(@org.apache.thrift.annotation.Nullable TQueryGlobals query_globals) {
    this.query_globals = query_globals;
    return this;
  }

  public void unsetQueryGlobals() {
    this.query_globals = null;
  }

  /** Returns true if field query_globals is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryGlobals() {
    return this.query_globals != null;
  }

  public void setQueryGlobalsIsSet(boolean value) {
    if (!value) {
      this.query_globals = null;
    }
  }

  public boolean isVecExec() {
    return this.vec_exec;
  }

  public TFoldConstantParams setVecExec(boolean vec_exec) {
    this.vec_exec = vec_exec;
    setVecExecIsSet(true);
    return this;
  }

  public void unsetVecExec() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VEC_EXEC_ISSET_ID);
  }

  /** Returns true if field vec_exec is set (has been assigned a value) and false otherwise */
  public boolean isSetVecExec() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VEC_EXEC_ISSET_ID);
  }

  public void setVecExecIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VEC_EXEC_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public TQueryOptions getQueryOptions() {
    return this.query_options;
  }

  public TFoldConstantParams setQueryOptions(@org.apache.thrift.annotation.Nullable TQueryOptions query_options) {
    this.query_options = query_options;
    return this;
  }

  public void unsetQueryOptions() {
    this.query_options = null;
  }

  /** Returns true if field query_options is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryOptions() {
    return this.query_options != null;
  }

  public void setQueryOptionsIsSet(boolean value) {
    if (!value) {
      this.query_options = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TUniqueId getQueryId() {
    return this.query_id;
  }

  public TFoldConstantParams setQueryId(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUniqueId query_id) {
    this.query_id = query_id;
    return this;
  }

  public void unsetQueryId() {
    this.query_id = null;
  }

  /** Returns true if field query_id is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryId() {
    return this.query_id != null;
  }

  public void setQueryIdIsSet(boolean value) {
    if (!value) {
      this.query_id = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case EXPR_MAP:
      if (value == null) {
        unsetExprMap();
      } else {
        setExprMap((java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr>>)value);
      }
      break;

    case QUERY_GLOBALS:
      if (value == null) {
        unsetQueryGlobals();
      } else {
        setQueryGlobals((TQueryGlobals)value);
      }
      break;

    case VEC_EXEC:
      if (value == null) {
        unsetVecExec();
      } else {
        setVecExec((java.lang.Boolean)value);
      }
      break;

    case QUERY_OPTIONS:
      if (value == null) {
        unsetQueryOptions();
      } else {
        setQueryOptions((TQueryOptions)value);
      }
      break;

    case QUERY_ID:
      if (value == null) {
        unsetQueryId();
      } else {
        setQueryId((org.apache.doris.thrift.TUniqueId)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case EXPR_MAP:
      return getExprMap();

    case QUERY_GLOBALS:
      return getQueryGlobals();

    case VEC_EXEC:
      return isVecExec();

    case QUERY_OPTIONS:
      return getQueryOptions();

    case QUERY_ID:
      return getQueryId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case EXPR_MAP:
      return isSetExprMap();
    case QUERY_GLOBALS:
      return isSetQueryGlobals();
    case VEC_EXEC:
      return isSetVecExec();
    case QUERY_OPTIONS:
      return isSetQueryOptions();
    case QUERY_ID:
      return isSetQueryId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TFoldConstantParams)
      return this.equals((TFoldConstantParams)that);
    return false;
  }

  public boolean equals(TFoldConstantParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_expr_map = true && this.isSetExprMap();
    boolean that_present_expr_map = true && that.isSetExprMap();
    if (this_present_expr_map || that_present_expr_map) {
      if (!(this_present_expr_map && that_present_expr_map))
        return false;
      if (!this.expr_map.equals(that.expr_map))
        return false;
    }

    boolean this_present_query_globals = true && this.isSetQueryGlobals();
    boolean that_present_query_globals = true && that.isSetQueryGlobals();
    if (this_present_query_globals || that_present_query_globals) {
      if (!(this_present_query_globals && that_present_query_globals))
        return false;
      if (!this.query_globals.equals(that.query_globals))
        return false;
    }

    boolean this_present_vec_exec = true && this.isSetVecExec();
    boolean that_present_vec_exec = true && that.isSetVecExec();
    if (this_present_vec_exec || that_present_vec_exec) {
      if (!(this_present_vec_exec && that_present_vec_exec))
        return false;
      if (this.vec_exec != that.vec_exec)
        return false;
    }

    boolean this_present_query_options = true && this.isSetQueryOptions();
    boolean that_present_query_options = true && that.isSetQueryOptions();
    if (this_present_query_options || that_present_query_options) {
      if (!(this_present_query_options && that_present_query_options))
        return false;
      if (!this.query_options.equals(that.query_options))
        return false;
    }

    boolean this_present_query_id = true && this.isSetQueryId();
    boolean that_present_query_id = true && that.isSetQueryId();
    if (this_present_query_id || that_present_query_id) {
      if (!(this_present_query_id && that_present_query_id))
        return false;
      if (!this.query_id.equals(that.query_id))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetExprMap()) ? 131071 : 524287);
    if (isSetExprMap())
      hashCode = hashCode * 8191 + expr_map.hashCode();

    hashCode = hashCode * 8191 + ((isSetQueryGlobals()) ? 131071 : 524287);
    if (isSetQueryGlobals())
      hashCode = hashCode * 8191 + query_globals.hashCode();

    hashCode = hashCode * 8191 + ((isSetVecExec()) ? 131071 : 524287);
    if (isSetVecExec())
      hashCode = hashCode * 8191 + ((vec_exec) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetQueryOptions()) ? 131071 : 524287);
    if (isSetQueryOptions())
      hashCode = hashCode * 8191 + query_options.hashCode();

    hashCode = hashCode * 8191 + ((isSetQueryId()) ? 131071 : 524287);
    if (isSetQueryId())
      hashCode = hashCode * 8191 + query_id.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TFoldConstantParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetExprMap(), other.isSetExprMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExprMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expr_map, other.expr_map);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetQueryGlobals(), other.isSetQueryGlobals());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryGlobals()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.query_globals, other.query_globals);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetVecExec(), other.isSetVecExec());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVecExec()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.vec_exec, other.vec_exec);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetQueryOptions(), other.isSetQueryOptions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryOptions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.query_options, other.query_options);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetQueryId(), other.isSetQueryId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.query_id, other.query_id);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TFoldConstantParams(");
    boolean first = true;

    sb.append("expr_map:");
    if (this.expr_map == null) {
      sb.append("null");
    } else {
      sb.append(this.expr_map);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("query_globals:");
    if (this.query_globals == null) {
      sb.append("null");
    } else {
      sb.append(this.query_globals);
    }
    first = false;
    if (isSetVecExec()) {
      if (!first) sb.append(", ");
      sb.append("vec_exec:");
      sb.append(this.vec_exec);
      first = false;
    }
    if (isSetQueryOptions()) {
      if (!first) sb.append(", ");
      sb.append("query_options:");
      if (this.query_options == null) {
        sb.append("null");
      } else {
        sb.append(this.query_options);
      }
      first = false;
    }
    if (isSetQueryId()) {
      if (!first) sb.append(", ");
      sb.append("query_id:");
      if (this.query_id == null) {
        sb.append("null");
      } else {
        sb.append(this.query_id);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (expr_map == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'expr_map' was not present! Struct: " + toString());
    }
    if (query_globals == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'query_globals' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (query_globals != null) {
      query_globals.validate();
    }
    if (query_options != null) {
      query_options.validate();
    }
    if (query_id != null) {
      query_id.validate();
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

  private static class TFoldConstantParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TFoldConstantParamsStandardScheme getScheme() {
      return new TFoldConstantParamsStandardScheme();
    }
  }

  private static class TFoldConstantParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TFoldConstantParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TFoldConstantParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXPR_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map138 = iprot.readMapBegin();
                struct.expr_map = new java.util.HashMap<java.lang.String,java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr>>(2*_map138.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key139;
                @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr> _val140;
                for (int _i141 = 0; _i141 < _map138.size; ++_i141)
                {
                  _key139 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TMap _map142 = iprot.readMapBegin();
                    _val140 = new java.util.HashMap<java.lang.String,org.apache.doris.thrift.TExpr>(2*_map142.size);
                    @org.apache.thrift.annotation.Nullable java.lang.String _key143;
                    @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _val144;
                    for (int _i145 = 0; _i145 < _map142.size; ++_i145)
                    {
                      _key143 = iprot.readString();
                      _val144 = new org.apache.doris.thrift.TExpr();
                      _val144.read(iprot);
                      _val140.put(_key143, _val144);
                    }
                    iprot.readMapEnd();
                  }
                  struct.expr_map.put(_key139, _val140);
                }
                iprot.readMapEnd();
              }
              struct.setExprMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // QUERY_GLOBALS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.query_globals = new TQueryGlobals();
              struct.query_globals.read(iprot);
              struct.setQueryGlobalsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VEC_EXEC
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.vec_exec = iprot.readBool();
              struct.setVecExecIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // QUERY_OPTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.query_options = new TQueryOptions();
              struct.query_options.read(iprot);
              struct.setQueryOptionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // QUERY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.query_id = new org.apache.doris.thrift.TUniqueId();
              struct.query_id.read(iprot);
              struct.setQueryIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TFoldConstantParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.expr_map != null) {
        oprot.writeFieldBegin(EXPR_MAP_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP, struct.expr_map.size()));
          for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr>> _iter146 : struct.expr_map.entrySet())
          {
            oprot.writeString(_iter146.getKey());
            {
              oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, _iter146.getValue().size()));
              for (java.util.Map.Entry<java.lang.String, org.apache.doris.thrift.TExpr> _iter147 : _iter146.getValue().entrySet())
              {
                oprot.writeString(_iter147.getKey());
                _iter147.getValue().write(oprot);
              }
              oprot.writeMapEnd();
            }
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.query_globals != null) {
        oprot.writeFieldBegin(QUERY_GLOBALS_FIELD_DESC);
        struct.query_globals.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetVecExec()) {
        oprot.writeFieldBegin(VEC_EXEC_FIELD_DESC);
        oprot.writeBool(struct.vec_exec);
        oprot.writeFieldEnd();
      }
      if (struct.query_options != null) {
        if (struct.isSetQueryOptions()) {
          oprot.writeFieldBegin(QUERY_OPTIONS_FIELD_DESC);
          struct.query_options.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.query_id != null) {
        if (struct.isSetQueryId()) {
          oprot.writeFieldBegin(QUERY_ID_FIELD_DESC);
          struct.query_id.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TFoldConstantParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TFoldConstantParamsTupleScheme getScheme() {
      return new TFoldConstantParamsTupleScheme();
    }
  }

  private static class TFoldConstantParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TFoldConstantParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFoldConstantParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.expr_map.size());
        for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr>> _iter148 : struct.expr_map.entrySet())
        {
          oprot.writeString(_iter148.getKey());
          {
            oprot.writeI32(_iter148.getValue().size());
            for (java.util.Map.Entry<java.lang.String, org.apache.doris.thrift.TExpr> _iter149 : _iter148.getValue().entrySet())
            {
              oprot.writeString(_iter149.getKey());
              _iter149.getValue().write(oprot);
            }
          }
        }
      }
      struct.query_globals.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetVecExec()) {
        optionals.set(0);
      }
      if (struct.isSetQueryOptions()) {
        optionals.set(1);
      }
      if (struct.isSetQueryId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetVecExec()) {
        oprot.writeBool(struct.vec_exec);
      }
      if (struct.isSetQueryOptions()) {
        struct.query_options.write(oprot);
      }
      if (struct.isSetQueryId()) {
        struct.query_id.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFoldConstantParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map150 = iprot.readMapBegin(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP); 
        struct.expr_map = new java.util.HashMap<java.lang.String,java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr>>(2*_map150.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _key151;
        @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,org.apache.doris.thrift.TExpr> _val152;
        for (int _i153 = 0; _i153 < _map150.size; ++_i153)
        {
          _key151 = iprot.readString();
          {
            org.apache.thrift.protocol.TMap _map154 = iprot.readMapBegin(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT); 
            _val152 = new java.util.HashMap<java.lang.String,org.apache.doris.thrift.TExpr>(2*_map154.size);
            @org.apache.thrift.annotation.Nullable java.lang.String _key155;
            @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TExpr _val156;
            for (int _i157 = 0; _i157 < _map154.size; ++_i157)
            {
              _key155 = iprot.readString();
              _val156 = new org.apache.doris.thrift.TExpr();
              _val156.read(iprot);
              _val152.put(_key155, _val156);
            }
          }
          struct.expr_map.put(_key151, _val152);
        }
      }
      struct.setExprMapIsSet(true);
      struct.query_globals = new TQueryGlobals();
      struct.query_globals.read(iprot);
      struct.setQueryGlobalsIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.vec_exec = iprot.readBool();
        struct.setVecExecIsSet(true);
      }
      if (incoming.get(1)) {
        struct.query_options = new TQueryOptions();
        struct.query_options.read(iprot);
        struct.setQueryOptionsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.query_id = new org.apache.doris.thrift.TUniqueId();
        struct.query_id.read(iprot);
        struct.setQueryIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

