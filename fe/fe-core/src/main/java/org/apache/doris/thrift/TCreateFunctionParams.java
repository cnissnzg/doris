/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public class TCreateFunctionParams implements org.apache.thrift.TBase<TCreateFunctionParams, TCreateFunctionParams._Fields>, java.io.Serializable, Cloneable, Comparable<TCreateFunctionParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCreateFunctionParams");

  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("db_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FUNCTION_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("function_name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ARGUMENT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("argument_type", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField RETURN_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("return_type", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField SO_FILE_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("so_file_path", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField PROPERTIES_FIELD_DESC = new org.apache.thrift.protocol.TField("properties", org.apache.thrift.protocol.TType.MAP, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TCreateFunctionParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TCreateFunctionParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String db_name; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String function_name; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TColumnType> argument_type; // required
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TColumnType return_type; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String so_file_path; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> properties; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DB_NAME((short)1, "db_name"),
    FUNCTION_NAME((short)2, "function_name"),
    ARGUMENT_TYPE((short)3, "argument_type"),
    RETURN_TYPE((short)4, "return_type"),
    SO_FILE_PATH((short)5, "so_file_path"),
    PROPERTIES((short)6, "properties");

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
        case 1: // DB_NAME
          return DB_NAME;
        case 2: // FUNCTION_NAME
          return FUNCTION_NAME;
        case 3: // ARGUMENT_TYPE
          return ARGUMENT_TYPE;
        case 4: // RETURN_TYPE
          return RETURN_TYPE;
        case 5: // SO_FILE_PATH
          return SO_FILE_PATH;
        case 6: // PROPERTIES
          return PROPERTIES;
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
  private static final _Fields optionals[] = {_Fields.PROPERTIES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("db_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FUNCTION_NAME, new org.apache.thrift.meta_data.FieldMetaData("function_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ARGUMENT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("argument_type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TColumnType.class))));
    tmpMap.put(_Fields.RETURN_TYPE, new org.apache.thrift.meta_data.FieldMetaData("return_type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TColumnType.class)));
    tmpMap.put(_Fields.SO_FILE_PATH, new org.apache.thrift.meta_data.FieldMetaData("so_file_path", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROPERTIES, new org.apache.thrift.meta_data.FieldMetaData("properties", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCreateFunctionParams.class, metaDataMap);
  }

  public TCreateFunctionParams() {
  }

  public TCreateFunctionParams(
    java.lang.String db_name,
    java.lang.String function_name,
    java.util.List<org.apache.doris.thrift.TColumnType> argument_type,
    org.apache.doris.thrift.TColumnType return_type,
    java.lang.String so_file_path)
  {
    this();
    this.db_name = db_name;
    this.function_name = function_name;
    this.argument_type = argument_type;
    this.return_type = return_type;
    this.so_file_path = so_file_path;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCreateFunctionParams(TCreateFunctionParams other) {
    if (other.isSetDbName()) {
      this.db_name = other.db_name;
    }
    if (other.isSetFunctionName()) {
      this.function_name = other.function_name;
    }
    if (other.isSetArgumentType()) {
      java.util.List<org.apache.doris.thrift.TColumnType> __this__argument_type = new java.util.ArrayList<org.apache.doris.thrift.TColumnType>(other.argument_type.size());
      for (org.apache.doris.thrift.TColumnType other_element : other.argument_type) {
        __this__argument_type.add(new org.apache.doris.thrift.TColumnType(other_element));
      }
      this.argument_type = __this__argument_type;
    }
    if (other.isSetReturnType()) {
      this.return_type = new org.apache.doris.thrift.TColumnType(other.return_type);
    }
    if (other.isSetSoFilePath()) {
      this.so_file_path = other.so_file_path;
    }
    if (other.isSetProperties()) {
      java.util.Map<java.lang.String,java.lang.String> __this__properties = new java.util.HashMap<java.lang.String,java.lang.String>(other.properties);
      this.properties = __this__properties;
    }
  }

  public TCreateFunctionParams deepCopy() {
    return new TCreateFunctionParams(this);
  }

  @Override
  public void clear() {
    this.db_name = null;
    this.function_name = null;
    this.argument_type = null;
    this.return_type = null;
    this.so_file_path = null;
    this.properties = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDbName() {
    return this.db_name;
  }

  public TCreateFunctionParams setDbName(@org.apache.thrift.annotation.Nullable java.lang.String db_name) {
    this.db_name = db_name;
    return this;
  }

  public void unsetDbName() {
    this.db_name = null;
  }

  /** Returns true if field db_name is set (has been assigned a value) and false otherwise */
  public boolean isSetDbName() {
    return this.db_name != null;
  }

  public void setDbNameIsSet(boolean value) {
    if (!value) {
      this.db_name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getFunctionName() {
    return this.function_name;
  }

  public TCreateFunctionParams setFunctionName(@org.apache.thrift.annotation.Nullable java.lang.String function_name) {
    this.function_name = function_name;
    return this;
  }

  public void unsetFunctionName() {
    this.function_name = null;
  }

  /** Returns true if field function_name is set (has been assigned a value) and false otherwise */
  public boolean isSetFunctionName() {
    return this.function_name != null;
  }

  public void setFunctionNameIsSet(boolean value) {
    if (!value) {
      this.function_name = null;
    }
  }

  public int getArgumentTypeSize() {
    return (this.argument_type == null) ? 0 : this.argument_type.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<org.apache.doris.thrift.TColumnType> getArgumentTypeIterator() {
    return (this.argument_type == null) ? null : this.argument_type.iterator();
  }

  public void addToArgumentType(org.apache.doris.thrift.TColumnType elem) {
    if (this.argument_type == null) {
      this.argument_type = new java.util.ArrayList<org.apache.doris.thrift.TColumnType>();
    }
    this.argument_type.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<org.apache.doris.thrift.TColumnType> getArgumentType() {
    return this.argument_type;
  }

  public TCreateFunctionParams setArgumentType(@org.apache.thrift.annotation.Nullable java.util.List<org.apache.doris.thrift.TColumnType> argument_type) {
    this.argument_type = argument_type;
    return this;
  }

  public void unsetArgumentType() {
    this.argument_type = null;
  }

  /** Returns true if field argument_type is set (has been assigned a value) and false otherwise */
  public boolean isSetArgumentType() {
    return this.argument_type != null;
  }

  public void setArgumentTypeIsSet(boolean value) {
    if (!value) {
      this.argument_type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TColumnType getReturnType() {
    return this.return_type;
  }

  public TCreateFunctionParams setReturnType(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TColumnType return_type) {
    this.return_type = return_type;
    return this;
  }

  public void unsetReturnType() {
    this.return_type = null;
  }

  /** Returns true if field return_type is set (has been assigned a value) and false otherwise */
  public boolean isSetReturnType() {
    return this.return_type != null;
  }

  public void setReturnTypeIsSet(boolean value) {
    if (!value) {
      this.return_type = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSoFilePath() {
    return this.so_file_path;
  }

  public TCreateFunctionParams setSoFilePath(@org.apache.thrift.annotation.Nullable java.lang.String so_file_path) {
    this.so_file_path = so_file_path;
    return this;
  }

  public void unsetSoFilePath() {
    this.so_file_path = null;
  }

  /** Returns true if field so_file_path is set (has been assigned a value) and false otherwise */
  public boolean isSetSoFilePath() {
    return this.so_file_path != null;
  }

  public void setSoFilePathIsSet(boolean value) {
    if (!value) {
      this.so_file_path = null;
    }
  }

  public int getPropertiesSize() {
    return (this.properties == null) ? 0 : this.properties.size();
  }

  public void putToProperties(java.lang.String key, java.lang.String val) {
    if (this.properties == null) {
      this.properties = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.properties.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.lang.String> getProperties() {
    return this.properties;
  }

  public TCreateFunctionParams setProperties(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> properties) {
    this.properties = properties;
    return this;
  }

  public void unsetProperties() {
    this.properties = null;
  }

  /** Returns true if field properties is set (has been assigned a value) and false otherwise */
  public boolean isSetProperties() {
    return this.properties != null;
  }

  public void setPropertiesIsSet(boolean value) {
    if (!value) {
      this.properties = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case DB_NAME:
      if (value == null) {
        unsetDbName();
      } else {
        setDbName((java.lang.String)value);
      }
      break;

    case FUNCTION_NAME:
      if (value == null) {
        unsetFunctionName();
      } else {
        setFunctionName((java.lang.String)value);
      }
      break;

    case ARGUMENT_TYPE:
      if (value == null) {
        unsetArgumentType();
      } else {
        setArgumentType((java.util.List<org.apache.doris.thrift.TColumnType>)value);
      }
      break;

    case RETURN_TYPE:
      if (value == null) {
        unsetReturnType();
      } else {
        setReturnType((org.apache.doris.thrift.TColumnType)value);
      }
      break;

    case SO_FILE_PATH:
      if (value == null) {
        unsetSoFilePath();
      } else {
        setSoFilePath((java.lang.String)value);
      }
      break;

    case PROPERTIES:
      if (value == null) {
        unsetProperties();
      } else {
        setProperties((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DB_NAME:
      return getDbName();

    case FUNCTION_NAME:
      return getFunctionName();

    case ARGUMENT_TYPE:
      return getArgumentType();

    case RETURN_TYPE:
      return getReturnType();

    case SO_FILE_PATH:
      return getSoFilePath();

    case PROPERTIES:
      return getProperties();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case DB_NAME:
      return isSetDbName();
    case FUNCTION_NAME:
      return isSetFunctionName();
    case ARGUMENT_TYPE:
      return isSetArgumentType();
    case RETURN_TYPE:
      return isSetReturnType();
    case SO_FILE_PATH:
      return isSetSoFilePath();
    case PROPERTIES:
      return isSetProperties();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TCreateFunctionParams)
      return this.equals((TCreateFunctionParams)that);
    return false;
  }

  public boolean equals(TCreateFunctionParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_db_name = true && this.isSetDbName();
    boolean that_present_db_name = true && that.isSetDbName();
    if (this_present_db_name || that_present_db_name) {
      if (!(this_present_db_name && that_present_db_name))
        return false;
      if (!this.db_name.equals(that.db_name))
        return false;
    }

    boolean this_present_function_name = true && this.isSetFunctionName();
    boolean that_present_function_name = true && that.isSetFunctionName();
    if (this_present_function_name || that_present_function_name) {
      if (!(this_present_function_name && that_present_function_name))
        return false;
      if (!this.function_name.equals(that.function_name))
        return false;
    }

    boolean this_present_argument_type = true && this.isSetArgumentType();
    boolean that_present_argument_type = true && that.isSetArgumentType();
    if (this_present_argument_type || that_present_argument_type) {
      if (!(this_present_argument_type && that_present_argument_type))
        return false;
      if (!this.argument_type.equals(that.argument_type))
        return false;
    }

    boolean this_present_return_type = true && this.isSetReturnType();
    boolean that_present_return_type = true && that.isSetReturnType();
    if (this_present_return_type || that_present_return_type) {
      if (!(this_present_return_type && that_present_return_type))
        return false;
      if (!this.return_type.equals(that.return_type))
        return false;
    }

    boolean this_present_so_file_path = true && this.isSetSoFilePath();
    boolean that_present_so_file_path = true && that.isSetSoFilePath();
    if (this_present_so_file_path || that_present_so_file_path) {
      if (!(this_present_so_file_path && that_present_so_file_path))
        return false;
      if (!this.so_file_path.equals(that.so_file_path))
        return false;
    }

    boolean this_present_properties = true && this.isSetProperties();
    boolean that_present_properties = true && that.isSetProperties();
    if (this_present_properties || that_present_properties) {
      if (!(this_present_properties && that_present_properties))
        return false;
      if (!this.properties.equals(that.properties))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDbName()) ? 131071 : 524287);
    if (isSetDbName())
      hashCode = hashCode * 8191 + db_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetFunctionName()) ? 131071 : 524287);
    if (isSetFunctionName())
      hashCode = hashCode * 8191 + function_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetArgumentType()) ? 131071 : 524287);
    if (isSetArgumentType())
      hashCode = hashCode * 8191 + argument_type.hashCode();

    hashCode = hashCode * 8191 + ((isSetReturnType()) ? 131071 : 524287);
    if (isSetReturnType())
      hashCode = hashCode * 8191 + return_type.hashCode();

    hashCode = hashCode * 8191 + ((isSetSoFilePath()) ? 131071 : 524287);
    if (isSetSoFilePath())
      hashCode = hashCode * 8191 + so_file_path.hashCode();

    hashCode = hashCode * 8191 + ((isSetProperties()) ? 131071 : 524287);
    if (isSetProperties())
      hashCode = hashCode * 8191 + properties.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TCreateFunctionParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetDbName(), other.isSetDbName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.db_name, other.db_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetFunctionName(), other.isSetFunctionName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFunctionName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.function_name, other.function_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetArgumentType(), other.isSetArgumentType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArgumentType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.argument_type, other.argument_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetReturnType(), other.isSetReturnType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReturnType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.return_type, other.return_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSoFilePath(), other.isSetSoFilePath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSoFilePath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.so_file_path, other.so_file_path);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetProperties(), other.isSetProperties());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProperties()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.properties, other.properties);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TCreateFunctionParams(");
    boolean first = true;

    sb.append("db_name:");
    if (this.db_name == null) {
      sb.append("null");
    } else {
      sb.append(this.db_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("function_name:");
    if (this.function_name == null) {
      sb.append("null");
    } else {
      sb.append(this.function_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("argument_type:");
    if (this.argument_type == null) {
      sb.append("null");
    } else {
      sb.append(this.argument_type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("return_type:");
    if (this.return_type == null) {
      sb.append("null");
    } else {
      sb.append(this.return_type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("so_file_path:");
    if (this.so_file_path == null) {
      sb.append("null");
    } else {
      sb.append(this.so_file_path);
    }
    first = false;
    if (isSetProperties()) {
      if (!first) sb.append(", ");
      sb.append("properties:");
      if (this.properties == null) {
        sb.append("null");
      } else {
        sb.append(this.properties);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (db_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'db_name' was not present! Struct: " + toString());
    }
    if (function_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'function_name' was not present! Struct: " + toString());
    }
    if (argument_type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'argument_type' was not present! Struct: " + toString());
    }
    if (return_type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'return_type' was not present! Struct: " + toString());
    }
    if (so_file_path == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'so_file_path' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (return_type != null) {
      return_type.validate();
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

  private static class TCreateFunctionParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCreateFunctionParamsStandardScheme getScheme() {
      return new TCreateFunctionParamsStandardScheme();
    }
  }

  private static class TCreateFunctionParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TCreateFunctionParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCreateFunctionParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.db_name = iprot.readString();
              struct.setDbNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FUNCTION_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.function_name = iprot.readString();
              struct.setFunctionNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ARGUMENT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list50 = iprot.readListBegin();
                struct.argument_type = new java.util.ArrayList<org.apache.doris.thrift.TColumnType>(_list50.size);
                @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TColumnType _elem51;
                for (int _i52 = 0; _i52 < _list50.size; ++_i52)
                {
                  _elem51 = new org.apache.doris.thrift.TColumnType();
                  _elem51.read(iprot);
                  struct.argument_type.add(_elem51);
                }
                iprot.readListEnd();
              }
              struct.setArgumentTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RETURN_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.return_type = new org.apache.doris.thrift.TColumnType();
              struct.return_type.read(iprot);
              struct.setReturnTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SO_FILE_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.so_file_path = iprot.readString();
              struct.setSoFilePathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PROPERTIES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map53 = iprot.readMapBegin();
                struct.properties = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map53.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key54;
                @org.apache.thrift.annotation.Nullable java.lang.String _val55;
                for (int _i56 = 0; _i56 < _map53.size; ++_i56)
                {
                  _key54 = iprot.readString();
                  _val55 = iprot.readString();
                  struct.properties.put(_key54, _val55);
                }
                iprot.readMapEnd();
              }
              struct.setPropertiesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCreateFunctionParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.db_name != null) {
        oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
        oprot.writeString(struct.db_name);
        oprot.writeFieldEnd();
      }
      if (struct.function_name != null) {
        oprot.writeFieldBegin(FUNCTION_NAME_FIELD_DESC);
        oprot.writeString(struct.function_name);
        oprot.writeFieldEnd();
      }
      if (struct.argument_type != null) {
        oprot.writeFieldBegin(ARGUMENT_TYPE_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.argument_type.size()));
          for (org.apache.doris.thrift.TColumnType _iter57 : struct.argument_type)
          {
            _iter57.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.return_type != null) {
        oprot.writeFieldBegin(RETURN_TYPE_FIELD_DESC);
        struct.return_type.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.so_file_path != null) {
        oprot.writeFieldBegin(SO_FILE_PATH_FIELD_DESC);
        oprot.writeString(struct.so_file_path);
        oprot.writeFieldEnd();
      }
      if (struct.properties != null) {
        if (struct.isSetProperties()) {
          oprot.writeFieldBegin(PROPERTIES_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.properties.size()));
            for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter58 : struct.properties.entrySet())
            {
              oprot.writeString(_iter58.getKey());
              oprot.writeString(_iter58.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCreateFunctionParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCreateFunctionParamsTupleScheme getScheme() {
      return new TCreateFunctionParamsTupleScheme();
    }
  }

  private static class TCreateFunctionParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TCreateFunctionParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCreateFunctionParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.db_name);
      oprot.writeString(struct.function_name);
      {
        oprot.writeI32(struct.argument_type.size());
        for (org.apache.doris.thrift.TColumnType _iter59 : struct.argument_type)
        {
          _iter59.write(oprot);
        }
      }
      struct.return_type.write(oprot);
      oprot.writeString(struct.so_file_path);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetProperties()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetProperties()) {
        {
          oprot.writeI32(struct.properties.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter60 : struct.properties.entrySet())
          {
            oprot.writeString(_iter60.getKey());
            oprot.writeString(_iter60.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCreateFunctionParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.db_name = iprot.readString();
      struct.setDbNameIsSet(true);
      struct.function_name = iprot.readString();
      struct.setFunctionNameIsSet(true);
      {
        org.apache.thrift.protocol.TList _list61 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.argument_type = new java.util.ArrayList<org.apache.doris.thrift.TColumnType>(_list61.size);
        @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TColumnType _elem62;
        for (int _i63 = 0; _i63 < _list61.size; ++_i63)
        {
          _elem62 = new org.apache.doris.thrift.TColumnType();
          _elem62.read(iprot);
          struct.argument_type.add(_elem62);
        }
      }
      struct.setArgumentTypeIsSet(true);
      struct.return_type = new org.apache.doris.thrift.TColumnType();
      struct.return_type.read(iprot);
      struct.setReturnTypeIsSet(true);
      struct.so_file_path = iprot.readString();
      struct.setSoFilePathIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map64 = iprot.readMapBegin(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING); 
          struct.properties = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map64.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _key65;
          @org.apache.thrift.annotation.Nullable java.lang.String _val66;
          for (int _i67 = 0; _i67 < _map64.size; ++_i67)
          {
            _key65 = iprot.readString();
            _val66 = iprot.readString();
            struct.properties.put(_key65, _val66);
          }
        }
        struct.setPropertiesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

