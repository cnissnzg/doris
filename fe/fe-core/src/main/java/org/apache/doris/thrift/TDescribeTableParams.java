/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.doris.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2023-04-28")
public class TDescribeTableParams implements org.apache.thrift.TBase<TDescribeTableParams, TDescribeTableParams._Fields>, java.io.Serializable, Cloneable, Comparable<TDescribeTableParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDescribeTableParams");

  private static final org.apache.thrift.protocol.TField DB_FIELD_DESC = new org.apache.thrift.protocol.TField("db", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("table_name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField USER_FIELD_DESC = new org.apache.thrift.protocol.TField("user", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField USER_IP_FIELD_DESC = new org.apache.thrift.protocol.TField("user_ip", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CURRENT_USER_IDENT_FIELD_DESC = new org.apache.thrift.protocol.TField("current_user_ident", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField SHOW_HIDDEN_COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("show_hidden_columns", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField CATALOG_FIELD_DESC = new org.apache.thrift.protocol.TField("catalog", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TDescribeTableParamsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TDescribeTableParamsTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String db; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String table_name; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String user; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String user_ip; // optional
  public @org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUserIdentity current_user_ident; // optional
  public boolean show_hidden_columns; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String catalog; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DB((short)1, "db"),
    TABLE_NAME((short)2, "table_name"),
    USER((short)3, "user"),
    USER_IP((short)4, "user_ip"),
    CURRENT_USER_IDENT((short)5, "current_user_ident"),
    SHOW_HIDDEN_COLUMNS((short)6, "show_hidden_columns"),
    CATALOG((short)7, "catalog");

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
        case 1: // DB
          return DB;
        case 2: // TABLE_NAME
          return TABLE_NAME;
        case 3: // USER
          return USER;
        case 4: // USER_IP
          return USER_IP;
        case 5: // CURRENT_USER_IDENT
          return CURRENT_USER_IDENT;
        case 6: // SHOW_HIDDEN_COLUMNS
          return SHOW_HIDDEN_COLUMNS;
        case 7: // CATALOG
          return CATALOG;
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
  private static final int __SHOW_HIDDEN_COLUMNS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DB,_Fields.USER,_Fields.USER_IP,_Fields.CURRENT_USER_IDENT,_Fields.SHOW_HIDDEN_COLUMNS,_Fields.CATALOG};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DB, new org.apache.thrift.meta_data.FieldMetaData("db", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("table_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER, new org.apache.thrift.meta_data.FieldMetaData("user", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_IP, new org.apache.thrift.meta_data.FieldMetaData("user_ip", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CURRENT_USER_IDENT, new org.apache.thrift.meta_data.FieldMetaData("current_user_ident", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.doris.thrift.TUserIdentity.class)));
    tmpMap.put(_Fields.SHOW_HIDDEN_COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("show_hidden_columns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CATALOG, new org.apache.thrift.meta_data.FieldMetaData("catalog", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDescribeTableParams.class, metaDataMap);
  }

  public TDescribeTableParams() {
    this.show_hidden_columns = false;

  }

  public TDescribeTableParams(
    java.lang.String table_name)
  {
    this();
    this.table_name = table_name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDescribeTableParams(TDescribeTableParams other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetDb()) {
      this.db = other.db;
    }
    if (other.isSetTableName()) {
      this.table_name = other.table_name;
    }
    if (other.isSetUser()) {
      this.user = other.user;
    }
    if (other.isSetUserIp()) {
      this.user_ip = other.user_ip;
    }
    if (other.isSetCurrentUserIdent()) {
      this.current_user_ident = new org.apache.doris.thrift.TUserIdentity(other.current_user_ident);
    }
    this.show_hidden_columns = other.show_hidden_columns;
    if (other.isSetCatalog()) {
      this.catalog = other.catalog;
    }
  }

  public TDescribeTableParams deepCopy() {
    return new TDescribeTableParams(this);
  }

  @Override
  public void clear() {
    this.db = null;
    this.table_name = null;
    this.user = null;
    this.user_ip = null;
    this.current_user_ident = null;
    this.show_hidden_columns = false;

    this.catalog = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDb() {
    return this.db;
  }

  public TDescribeTableParams setDb(@org.apache.thrift.annotation.Nullable java.lang.String db) {
    this.db = db;
    return this;
  }

  public void unsetDb() {
    this.db = null;
  }

  /** Returns true if field db is set (has been assigned a value) and false otherwise */
  public boolean isSetDb() {
    return this.db != null;
  }

  public void setDbIsSet(boolean value) {
    if (!value) {
      this.db = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTableName() {
    return this.table_name;
  }

  public TDescribeTableParams setTableName(@org.apache.thrift.annotation.Nullable java.lang.String table_name) {
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

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getUser() {
    return this.user;
  }

  public TDescribeTableParams setUser(@org.apache.thrift.annotation.Nullable java.lang.String user) {
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

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getUserIp() {
    return this.user_ip;
  }

  public TDescribeTableParams setUserIp(@org.apache.thrift.annotation.Nullable java.lang.String user_ip) {
    this.user_ip = user_ip;
    return this;
  }

  public void unsetUserIp() {
    this.user_ip = null;
  }

  /** Returns true if field user_ip is set (has been assigned a value) and false otherwise */
  public boolean isSetUserIp() {
    return this.user_ip != null;
  }

  public void setUserIpIsSet(boolean value) {
    if (!value) {
      this.user_ip = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public org.apache.doris.thrift.TUserIdentity getCurrentUserIdent() {
    return this.current_user_ident;
  }

  public TDescribeTableParams setCurrentUserIdent(@org.apache.thrift.annotation.Nullable org.apache.doris.thrift.TUserIdentity current_user_ident) {
    this.current_user_ident = current_user_ident;
    return this;
  }

  public void unsetCurrentUserIdent() {
    this.current_user_ident = null;
  }

  /** Returns true if field current_user_ident is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrentUserIdent() {
    return this.current_user_ident != null;
  }

  public void setCurrentUserIdentIsSet(boolean value) {
    if (!value) {
      this.current_user_ident = null;
    }
  }

  public boolean isShowHiddenColumns() {
    return this.show_hidden_columns;
  }

  public TDescribeTableParams setShowHiddenColumns(boolean show_hidden_columns) {
    this.show_hidden_columns = show_hidden_columns;
    setShowHiddenColumnsIsSet(true);
    return this;
  }

  public void unsetShowHiddenColumns() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SHOW_HIDDEN_COLUMNS_ISSET_ID);
  }

  /** Returns true if field show_hidden_columns is set (has been assigned a value) and false otherwise */
  public boolean isSetShowHiddenColumns() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SHOW_HIDDEN_COLUMNS_ISSET_ID);
  }

  public void setShowHiddenColumnsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SHOW_HIDDEN_COLUMNS_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCatalog() {
    return this.catalog;
  }

  public TDescribeTableParams setCatalog(@org.apache.thrift.annotation.Nullable java.lang.String catalog) {
    this.catalog = catalog;
    return this;
  }

  public void unsetCatalog() {
    this.catalog = null;
  }

  /** Returns true if field catalog is set (has been assigned a value) and false otherwise */
  public boolean isSetCatalog() {
    return this.catalog != null;
  }

  public void setCatalogIsSet(boolean value) {
    if (!value) {
      this.catalog = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case DB:
      if (value == null) {
        unsetDb();
      } else {
        setDb((java.lang.String)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((java.lang.String)value);
      }
      break;

    case USER:
      if (value == null) {
        unsetUser();
      } else {
        setUser((java.lang.String)value);
      }
      break;

    case USER_IP:
      if (value == null) {
        unsetUserIp();
      } else {
        setUserIp((java.lang.String)value);
      }
      break;

    case CURRENT_USER_IDENT:
      if (value == null) {
        unsetCurrentUserIdent();
      } else {
        setCurrentUserIdent((org.apache.doris.thrift.TUserIdentity)value);
      }
      break;

    case SHOW_HIDDEN_COLUMNS:
      if (value == null) {
        unsetShowHiddenColumns();
      } else {
        setShowHiddenColumns((java.lang.Boolean)value);
      }
      break;

    case CATALOG:
      if (value == null) {
        unsetCatalog();
      } else {
        setCatalog((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DB:
      return getDb();

    case TABLE_NAME:
      return getTableName();

    case USER:
      return getUser();

    case USER_IP:
      return getUserIp();

    case CURRENT_USER_IDENT:
      return getCurrentUserIdent();

    case SHOW_HIDDEN_COLUMNS:
      return isShowHiddenColumns();

    case CATALOG:
      return getCatalog();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case DB:
      return isSetDb();
    case TABLE_NAME:
      return isSetTableName();
    case USER:
      return isSetUser();
    case USER_IP:
      return isSetUserIp();
    case CURRENT_USER_IDENT:
      return isSetCurrentUserIdent();
    case SHOW_HIDDEN_COLUMNS:
      return isSetShowHiddenColumns();
    case CATALOG:
      return isSetCatalog();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TDescribeTableParams)
      return this.equals((TDescribeTableParams)that);
    return false;
  }

  public boolean equals(TDescribeTableParams that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_db = true && this.isSetDb();
    boolean that_present_db = true && that.isSetDb();
    if (this_present_db || that_present_db) {
      if (!(this_present_db && that_present_db))
        return false;
      if (!this.db.equals(that.db))
        return false;
    }

    boolean this_present_table_name = true && this.isSetTableName();
    boolean that_present_table_name = true && that.isSetTableName();
    if (this_present_table_name || that_present_table_name) {
      if (!(this_present_table_name && that_present_table_name))
        return false;
      if (!this.table_name.equals(that.table_name))
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

    boolean this_present_user_ip = true && this.isSetUserIp();
    boolean that_present_user_ip = true && that.isSetUserIp();
    if (this_present_user_ip || that_present_user_ip) {
      if (!(this_present_user_ip && that_present_user_ip))
        return false;
      if (!this.user_ip.equals(that.user_ip))
        return false;
    }

    boolean this_present_current_user_ident = true && this.isSetCurrentUserIdent();
    boolean that_present_current_user_ident = true && that.isSetCurrentUserIdent();
    if (this_present_current_user_ident || that_present_current_user_ident) {
      if (!(this_present_current_user_ident && that_present_current_user_ident))
        return false;
      if (!this.current_user_ident.equals(that.current_user_ident))
        return false;
    }

    boolean this_present_show_hidden_columns = true && this.isSetShowHiddenColumns();
    boolean that_present_show_hidden_columns = true && that.isSetShowHiddenColumns();
    if (this_present_show_hidden_columns || that_present_show_hidden_columns) {
      if (!(this_present_show_hidden_columns && that_present_show_hidden_columns))
        return false;
      if (this.show_hidden_columns != that.show_hidden_columns)
        return false;
    }

    boolean this_present_catalog = true && this.isSetCatalog();
    boolean that_present_catalog = true && that.isSetCatalog();
    if (this_present_catalog || that_present_catalog) {
      if (!(this_present_catalog && that_present_catalog))
        return false;
      if (!this.catalog.equals(that.catalog))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDb()) ? 131071 : 524287);
    if (isSetDb())
      hashCode = hashCode * 8191 + db.hashCode();

    hashCode = hashCode * 8191 + ((isSetTableName()) ? 131071 : 524287);
    if (isSetTableName())
      hashCode = hashCode * 8191 + table_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetUser()) ? 131071 : 524287);
    if (isSetUser())
      hashCode = hashCode * 8191 + user.hashCode();

    hashCode = hashCode * 8191 + ((isSetUserIp()) ? 131071 : 524287);
    if (isSetUserIp())
      hashCode = hashCode * 8191 + user_ip.hashCode();

    hashCode = hashCode * 8191 + ((isSetCurrentUserIdent()) ? 131071 : 524287);
    if (isSetCurrentUserIdent())
      hashCode = hashCode * 8191 + current_user_ident.hashCode();

    hashCode = hashCode * 8191 + ((isSetShowHiddenColumns()) ? 131071 : 524287);
    if (isSetShowHiddenColumns())
      hashCode = hashCode * 8191 + ((show_hidden_columns) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetCatalog()) ? 131071 : 524287);
    if (isSetCatalog())
      hashCode = hashCode * 8191 + catalog.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TDescribeTableParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetDb(), other.isSetDb());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDb()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.db, other.db);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = java.lang.Boolean.compare(isSetUserIp(), other.isSetUserIp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserIp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user_ip, other.user_ip);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCurrentUserIdent(), other.isSetCurrentUserIdent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrentUserIdent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.current_user_ident, other.current_user_ident);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetShowHiddenColumns(), other.isSetShowHiddenColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShowHiddenColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.show_hidden_columns, other.show_hidden_columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCatalog(), other.isSetCatalog());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatalog()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catalog, other.catalog);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TDescribeTableParams(");
    boolean first = true;

    if (isSetDb()) {
      sb.append("db:");
      if (this.db == null) {
        sb.append("null");
      } else {
        sb.append(this.db);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("table_name:");
    if (this.table_name == null) {
      sb.append("null");
    } else {
      sb.append(this.table_name);
    }
    first = false;
    if (isSetUser()) {
      if (!first) sb.append(", ");
      sb.append("user:");
      if (this.user == null) {
        sb.append("null");
      } else {
        sb.append(this.user);
      }
      first = false;
    }
    if (isSetUserIp()) {
      if (!first) sb.append(", ");
      sb.append("user_ip:");
      if (this.user_ip == null) {
        sb.append("null");
      } else {
        sb.append(this.user_ip);
      }
      first = false;
    }
    if (isSetCurrentUserIdent()) {
      if (!first) sb.append(", ");
      sb.append("current_user_ident:");
      if (this.current_user_ident == null) {
        sb.append("null");
      } else {
        sb.append(this.current_user_ident);
      }
      first = false;
    }
    if (isSetShowHiddenColumns()) {
      if (!first) sb.append(", ");
      sb.append("show_hidden_columns:");
      sb.append(this.show_hidden_columns);
      first = false;
    }
    if (isSetCatalog()) {
      if (!first) sb.append(", ");
      sb.append("catalog:");
      if (this.catalog == null) {
        sb.append("null");
      } else {
        sb.append(this.catalog);
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
    // check for sub-struct validity
    if (current_user_ident != null) {
      current_user_ident.validate();
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

  private static class TDescribeTableParamsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDescribeTableParamsStandardScheme getScheme() {
      return new TDescribeTableParamsStandardScheme();
    }
  }

  private static class TDescribeTableParamsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TDescribeTableParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDescribeTableParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.db = iprot.readString();
              struct.setDbIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table_name = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user = iprot.readString();
              struct.setUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // USER_IP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user_ip = iprot.readString();
              struct.setUserIpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CURRENT_USER_IDENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.current_user_ident = new org.apache.doris.thrift.TUserIdentity();
              struct.current_user_ident.read(iprot);
              struct.setCurrentUserIdentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SHOW_HIDDEN_COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.show_hidden_columns = iprot.readBool();
              struct.setShowHiddenColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // CATALOG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.catalog = iprot.readString();
              struct.setCatalogIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDescribeTableParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.db != null) {
        if (struct.isSetDb()) {
          oprot.writeFieldBegin(DB_FIELD_DESC);
          oprot.writeString(struct.db);
          oprot.writeFieldEnd();
        }
      }
      if (struct.table_name != null) {
        oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
        oprot.writeString(struct.table_name);
        oprot.writeFieldEnd();
      }
      if (struct.user != null) {
        if (struct.isSetUser()) {
          oprot.writeFieldBegin(USER_FIELD_DESC);
          oprot.writeString(struct.user);
          oprot.writeFieldEnd();
        }
      }
      if (struct.user_ip != null) {
        if (struct.isSetUserIp()) {
          oprot.writeFieldBegin(USER_IP_FIELD_DESC);
          oprot.writeString(struct.user_ip);
          oprot.writeFieldEnd();
        }
      }
      if (struct.current_user_ident != null) {
        if (struct.isSetCurrentUserIdent()) {
          oprot.writeFieldBegin(CURRENT_USER_IDENT_FIELD_DESC);
          struct.current_user_ident.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetShowHiddenColumns()) {
        oprot.writeFieldBegin(SHOW_HIDDEN_COLUMNS_FIELD_DESC);
        oprot.writeBool(struct.show_hidden_columns);
        oprot.writeFieldEnd();
      }
      if (struct.catalog != null) {
        if (struct.isSetCatalog()) {
          oprot.writeFieldBegin(CATALOG_FIELD_DESC);
          oprot.writeString(struct.catalog);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDescribeTableParamsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TDescribeTableParamsTupleScheme getScheme() {
      return new TDescribeTableParamsTupleScheme();
    }
  }

  private static class TDescribeTableParamsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TDescribeTableParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDescribeTableParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.table_name);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDb()) {
        optionals.set(0);
      }
      if (struct.isSetUser()) {
        optionals.set(1);
      }
      if (struct.isSetUserIp()) {
        optionals.set(2);
      }
      if (struct.isSetCurrentUserIdent()) {
        optionals.set(3);
      }
      if (struct.isSetShowHiddenColumns()) {
        optionals.set(4);
      }
      if (struct.isSetCatalog()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetDb()) {
        oprot.writeString(struct.db);
      }
      if (struct.isSetUser()) {
        oprot.writeString(struct.user);
      }
      if (struct.isSetUserIp()) {
        oprot.writeString(struct.user_ip);
      }
      if (struct.isSetCurrentUserIdent()) {
        struct.current_user_ident.write(oprot);
      }
      if (struct.isSetShowHiddenColumns()) {
        oprot.writeBool(struct.show_hidden_columns);
      }
      if (struct.isSetCatalog()) {
        oprot.writeString(struct.catalog);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDescribeTableParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.table_name = iprot.readString();
      struct.setTableNameIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.db = iprot.readString();
        struct.setDbIsSet(true);
      }
      if (incoming.get(1)) {
        struct.user = iprot.readString();
        struct.setUserIsSet(true);
      }
      if (incoming.get(2)) {
        struct.user_ip = iprot.readString();
        struct.setUserIpIsSet(true);
      }
      if (incoming.get(3)) {
        struct.current_user_ident = new org.apache.doris.thrift.TUserIdentity();
        struct.current_user_ident.read(iprot);
        struct.setCurrentUserIdentIsSet(true);
      }
      if (incoming.get(4)) {
        struct.show_hidden_columns = iprot.readBool();
        struct.setShowHiddenColumnsIsSet(true);
      }
      if (incoming.get(5)) {
        struct.catalog = iprot.readString();
        struct.setCatalogIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

