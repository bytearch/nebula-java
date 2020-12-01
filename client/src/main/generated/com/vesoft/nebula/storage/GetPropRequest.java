/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class GetPropRequest implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("GetPropRequest");
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)1);
  private static final TField COLUMN_NAMES_FIELD_DESC = new TField("column_names", TType.LIST, (short)2);
  private static final TField PARTS_FIELD_DESC = new TField("parts", TType.MAP, (short)3);
  private static final TField VERTEX_PROPS_FIELD_DESC = new TField("vertex_props", TType.LIST, (short)4);
  private static final TField EDGE_PROPS_FIELD_DESC = new TField("edge_props", TType.LIST, (short)5);
  private static final TField EXPRESSIONS_FIELD_DESC = new TField("expressions", TType.LIST, (short)6);
  private static final TField DEDUP_FIELD_DESC = new TField("dedup", TType.BOOL, (short)7);
  private static final TField ORDER_BY_FIELD_DESC = new TField("order_by", TType.LIST, (short)8);
  private static final TField LIMIT_FIELD_DESC = new TField("limit", TType.I64, (short)9);
  private static final TField FILTER_FIELD_DESC = new TField("filter", TType.STRING, (short)10);

  public int space_id;
  public List<byte[]> column_names;
  public Map<Integer,List<com.vesoft.nebula.Row>> parts;
  public List<VertexProp> vertex_props;
  public List<EdgeProp> edge_props;
  public List<Expr> expressions;
  public boolean dedup;
  public List<OrderBy> order_by;
  public long limit;
  public byte[] filter;
  public static final int SPACE_ID = 1;
  public static final int COLUMN_NAMES = 2;
  public static final int PARTS = 3;
  public static final int VERTEX_PROPS = 4;
  public static final int EDGE_PROPS = 5;
  public static final int EXPRESSIONS = 6;
  public static final int DEDUP = 7;
  public static final int ORDER_BY = 8;
  public static final int LIMIT = 9;
  public static final int FILTER = 10;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __SPACE_ID_ISSET_ID = 0;
  private static final int __DEDUP_ISSET_ID = 1;
  private static final int __LIMIT_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(COLUMN_NAMES, new FieldMetaData("column_names", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    tmpMetaDataMap.put(PARTS, new FieldMetaData("parts", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new ListMetaData(TType.LIST, 
                new StructMetaData(TType.STRUCT, com.vesoft.nebula.Row.class)))));
    tmpMetaDataMap.put(VERTEX_PROPS, new FieldMetaData("vertex_props", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, VertexProp.class))));
    tmpMetaDataMap.put(EDGE_PROPS, new FieldMetaData("edge_props", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, EdgeProp.class))));
    tmpMetaDataMap.put(EXPRESSIONS, new FieldMetaData("expressions", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, Expr.class))));
    tmpMetaDataMap.put(DEDUP, new FieldMetaData("dedup", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMetaDataMap.put(ORDER_BY, new FieldMetaData("order_by", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, OrderBy.class))));
    tmpMetaDataMap.put(LIMIT, new FieldMetaData("limit", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(FILTER, new FieldMetaData("filter", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(GetPropRequest.class, metaDataMap);
  }

  public GetPropRequest() {
    this.dedup = false;

  }

  public GetPropRequest(
    int space_id,
    List<byte[]> column_names,
    Map<Integer,List<com.vesoft.nebula.Row>> parts,
    boolean dedup)
  {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.column_names = column_names;
    this.parts = parts;
    this.dedup = dedup;
    setDedupIsSet(true);
  }

  public GetPropRequest(
    int space_id,
    List<byte[]> column_names,
    Map<Integer,List<com.vesoft.nebula.Row>> parts,
    List<VertexProp> vertex_props,
    List<EdgeProp> edge_props,
    List<Expr> expressions,
    boolean dedup,
    List<OrderBy> order_by,
    long limit,
    byte[] filter)
  {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.column_names = column_names;
    this.parts = parts;
    this.vertex_props = vertex_props;
    this.edge_props = edge_props;
    this.expressions = expressions;
    this.dedup = dedup;
    setDedupIsSet(true);
    this.order_by = order_by;
    this.limit = limit;
    setLimitIsSet(true);
    this.filter = filter;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetPropRequest(GetPropRequest other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    if (other.isSetColumn_names()) {
      this.column_names = TBaseHelper.deepCopy(other.column_names);
    }
    if (other.isSetParts()) {
      this.parts = TBaseHelper.deepCopy(other.parts);
    }
    if (other.isSetVertex_props()) {
      this.vertex_props = TBaseHelper.deepCopy(other.vertex_props);
    }
    if (other.isSetEdge_props()) {
      this.edge_props = TBaseHelper.deepCopy(other.edge_props);
    }
    if (other.isSetExpressions()) {
      this.expressions = TBaseHelper.deepCopy(other.expressions);
    }
    this.dedup = TBaseHelper.deepCopy(other.dedup);
    if (other.isSetOrder_by()) {
      this.order_by = TBaseHelper.deepCopy(other.order_by);
    }
    this.limit = TBaseHelper.deepCopy(other.limit);
    if (other.isSetFilter()) {
      this.filter = TBaseHelper.deepCopy(other.filter);
    }
  }

  public GetPropRequest deepCopy() {
    return new GetPropRequest(this);
  }

  @Deprecated
  public GetPropRequest clone() {
    return new GetPropRequest(this);
  }

  public int  getSpace_id() {
    return this.space_id;
  }

  public GetPropRequest setSpace_id(int space_id) {
    this.space_id = space_id;
    setSpace_idIsSet(true);
    return this;
  }

  public void unsetSpace_id() {
    __isset_bit_vector.clear(__SPACE_ID_ISSET_ID);
  }

  // Returns true if field space_id is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_id() {
    return __isset_bit_vector.get(__SPACE_ID_ISSET_ID);
  }

  public void setSpace_idIsSet(boolean value) {
    __isset_bit_vector.set(__SPACE_ID_ISSET_ID, value);
  }

  public List<byte[]>  getColumn_names() {
    return this.column_names;
  }

  public GetPropRequest setColumn_names(List<byte[]> column_names) {
    this.column_names = column_names;
    return this;
  }

  public void unsetColumn_names() {
    this.column_names = null;
  }

  // Returns true if field column_names is set (has been assigned a value) and false otherwise
  public boolean isSetColumn_names() {
    return this.column_names != null;
  }

  public void setColumn_namesIsSet(boolean value) {
    if (!value) {
      this.column_names = null;
    }
  }

  public Map<Integer,List<com.vesoft.nebula.Row>>  getParts() {
    return this.parts;
  }

  public GetPropRequest setParts(Map<Integer,List<com.vesoft.nebula.Row>> parts) {
    this.parts = parts;
    return this;
  }

  public void unsetParts() {
    this.parts = null;
  }

  // Returns true if field parts is set (has been assigned a value) and false otherwise
  public boolean isSetParts() {
    return this.parts != null;
  }

  public void setPartsIsSet(boolean value) {
    if (!value) {
      this.parts = null;
    }
  }

  public List<VertexProp>  getVertex_props() {
    return this.vertex_props;
  }

  public GetPropRequest setVertex_props(List<VertexProp> vertex_props) {
    this.vertex_props = vertex_props;
    return this;
  }

  public void unsetVertex_props() {
    this.vertex_props = null;
  }

  // Returns true if field vertex_props is set (has been assigned a value) and false otherwise
  public boolean isSetVertex_props() {
    return this.vertex_props != null;
  }

  public void setVertex_propsIsSet(boolean value) {
    if (!value) {
      this.vertex_props = null;
    }
  }

  public List<EdgeProp>  getEdge_props() {
    return this.edge_props;
  }

  public GetPropRequest setEdge_props(List<EdgeProp> edge_props) {
    this.edge_props = edge_props;
    return this;
  }

  public void unsetEdge_props() {
    this.edge_props = null;
  }

  // Returns true if field edge_props is set (has been assigned a value) and false otherwise
  public boolean isSetEdge_props() {
    return this.edge_props != null;
  }

  public void setEdge_propsIsSet(boolean value) {
    if (!value) {
      this.edge_props = null;
    }
  }

  public List<Expr>  getExpressions() {
    return this.expressions;
  }

  public GetPropRequest setExpressions(List<Expr> expressions) {
    this.expressions = expressions;
    return this;
  }

  public void unsetExpressions() {
    this.expressions = null;
  }

  // Returns true if field expressions is set (has been assigned a value) and false otherwise
  public boolean isSetExpressions() {
    return this.expressions != null;
  }

  public void setExpressionsIsSet(boolean value) {
    if (!value) {
      this.expressions = null;
    }
  }

  public boolean  isDedup() {
    return this.dedup;
  }

  public GetPropRequest setDedup(boolean dedup) {
    this.dedup = dedup;
    setDedupIsSet(true);
    return this;
  }

  public void unsetDedup() {
    __isset_bit_vector.clear(__DEDUP_ISSET_ID);
  }

  // Returns true if field dedup is set (has been assigned a value) and false otherwise
  public boolean isSetDedup() {
    return __isset_bit_vector.get(__DEDUP_ISSET_ID);
  }

  public void setDedupIsSet(boolean value) {
    __isset_bit_vector.set(__DEDUP_ISSET_ID, value);
  }

  public List<OrderBy>  getOrder_by() {
    return this.order_by;
  }

  public GetPropRequest setOrder_by(List<OrderBy> order_by) {
    this.order_by = order_by;
    return this;
  }

  public void unsetOrder_by() {
    this.order_by = null;
  }

  // Returns true if field order_by is set (has been assigned a value) and false otherwise
  public boolean isSetOrder_by() {
    return this.order_by != null;
  }

  public void setOrder_byIsSet(boolean value) {
    if (!value) {
      this.order_by = null;
    }
  }

  public long  getLimit() {
    return this.limit;
  }

  public GetPropRequest setLimit(long limit) {
    this.limit = limit;
    setLimitIsSet(true);
    return this;
  }

  public void unsetLimit() {
    __isset_bit_vector.clear(__LIMIT_ISSET_ID);
  }

  // Returns true if field limit is set (has been assigned a value) and false otherwise
  public boolean isSetLimit() {
    return __isset_bit_vector.get(__LIMIT_ISSET_ID);
  }

  public void setLimitIsSet(boolean value) {
    __isset_bit_vector.set(__LIMIT_ISSET_ID, value);
  }

  public byte[]  getFilter() {
    return this.filter;
  }

  public GetPropRequest setFilter(byte[] filter) {
    this.filter = filter;
    return this;
  }

  public void unsetFilter() {
    this.filter = null;
  }

  // Returns true if field filter is set (has been assigned a value) and false otherwise
  public boolean isSetFilter() {
    return this.filter != null;
  }

  public void setFilterIsSet(boolean value) {
    if (!value) {
      this.filter = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case SPACE_ID:
      if (value == null) {
        unsetSpace_id();
      } else {
        setSpace_id((Integer)value);
      }
      break;

    case COLUMN_NAMES:
      if (value == null) {
        unsetColumn_names();
      } else {
        setColumn_names((List<byte[]>)value);
      }
      break;

    case PARTS:
      if (value == null) {
        unsetParts();
      } else {
        setParts((Map<Integer,List<com.vesoft.nebula.Row>>)value);
      }
      break;

    case VERTEX_PROPS:
      if (value == null) {
        unsetVertex_props();
      } else {
        setVertex_props((List<VertexProp>)value);
      }
      break;

    case EDGE_PROPS:
      if (value == null) {
        unsetEdge_props();
      } else {
        setEdge_props((List<EdgeProp>)value);
      }
      break;

    case EXPRESSIONS:
      if (value == null) {
        unsetExpressions();
      } else {
        setExpressions((List<Expr>)value);
      }
      break;

    case DEDUP:
      if (value == null) {
        unsetDedup();
      } else {
        setDedup((Boolean)value);
      }
      break;

    case ORDER_BY:
      if (value == null) {
        unsetOrder_by();
      } else {
        setOrder_by((List<OrderBy>)value);
      }
      break;

    case LIMIT:
      if (value == null) {
        unsetLimit();
      } else {
        setLimit((Long)value);
      }
      break;

    case FILTER:
      if (value == null) {
        unsetFilter();
      } else {
        setFilter((byte[])value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SPACE_ID:
      return new Integer(getSpace_id());

    case COLUMN_NAMES:
      return getColumn_names();

    case PARTS:
      return getParts();

    case VERTEX_PROPS:
      return getVertex_props();

    case EDGE_PROPS:
      return getEdge_props();

    case EXPRESSIONS:
      return getExpressions();

    case DEDUP:
      return new Boolean(isDedup());

    case ORDER_BY:
      return getOrder_by();

    case LIMIT:
      return new Long(getLimit());

    case FILTER:
      return getFilter();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case SPACE_ID:
      return isSetSpace_id();
    case COLUMN_NAMES:
      return isSetColumn_names();
    case PARTS:
      return isSetParts();
    case VERTEX_PROPS:
      return isSetVertex_props();
    case EDGE_PROPS:
      return isSetEdge_props();
    case EXPRESSIONS:
      return isSetExpressions();
    case DEDUP:
      return isSetDedup();
    case ORDER_BY:
      return isSetOrder_by();
    case LIMIT:
      return isSetLimit();
    case FILTER:
      return isSetFilter();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetPropRequest)
      return this.equals((GetPropRequest)that);
    return false;
  }

  public boolean equals(GetPropRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_space_id = true;
    boolean that_present_space_id = true;
    if (this_present_space_id || that_present_space_id) {
      if (!(this_present_space_id && that_present_space_id))
        return false;
      if (!TBaseHelper.equalsNobinary(this.space_id, that.space_id))
        return false;
    }

    boolean this_present_column_names = true && this.isSetColumn_names();
    boolean that_present_column_names = true && that.isSetColumn_names();
    if (this_present_column_names || that_present_column_names) {
      if (!(this_present_column_names && that_present_column_names))
        return false;
      if (!TBaseHelper.equalsSlow(this.column_names, that.column_names))
        return false;
    }

    boolean this_present_parts = true && this.isSetParts();
    boolean that_present_parts = true && that.isSetParts();
    if (this_present_parts || that_present_parts) {
      if (!(this_present_parts && that_present_parts))
        return false;
      if (!TBaseHelper.equalsNobinary(this.parts, that.parts))
        return false;
    }

    boolean this_present_vertex_props = true && this.isSetVertex_props();
    boolean that_present_vertex_props = true && that.isSetVertex_props();
    if (this_present_vertex_props || that_present_vertex_props) {
      if (!(this_present_vertex_props && that_present_vertex_props))
        return false;
      if (!TBaseHelper.equalsNobinary(this.vertex_props, that.vertex_props))
        return false;
    }

    boolean this_present_edge_props = true && this.isSetEdge_props();
    boolean that_present_edge_props = true && that.isSetEdge_props();
    if (this_present_edge_props || that_present_edge_props) {
      if (!(this_present_edge_props && that_present_edge_props))
        return false;
      if (!TBaseHelper.equalsNobinary(this.edge_props, that.edge_props))
        return false;
    }

    boolean this_present_expressions = true && this.isSetExpressions();
    boolean that_present_expressions = true && that.isSetExpressions();
    if (this_present_expressions || that_present_expressions) {
      if (!(this_present_expressions && that_present_expressions))
        return false;
      if (!TBaseHelper.equalsNobinary(this.expressions, that.expressions))
        return false;
    }

    boolean this_present_dedup = true;
    boolean that_present_dedup = true;
    if (this_present_dedup || that_present_dedup) {
      if (!(this_present_dedup && that_present_dedup))
        return false;
      if (!TBaseHelper.equalsNobinary(this.dedup, that.dedup))
        return false;
    }

    boolean this_present_order_by = true && this.isSetOrder_by();
    boolean that_present_order_by = true && that.isSetOrder_by();
    if (this_present_order_by || that_present_order_by) {
      if (!(this_present_order_by && that_present_order_by))
        return false;
      if (!TBaseHelper.equalsNobinary(this.order_by, that.order_by))
        return false;
    }

    boolean this_present_limit = true && this.isSetLimit();
    boolean that_present_limit = true && that.isSetLimit();
    if (this_present_limit || that_present_limit) {
      if (!(this_present_limit && that_present_limit))
        return false;
      if (!TBaseHelper.equalsNobinary(this.limit, that.limit))
        return false;
    }

    boolean this_present_filter = true && this.isSetFilter();
    boolean that_present_filter = true && that.isSetFilter();
    if (this_present_filter || that_present_filter) {
      if (!(this_present_filter && that_present_filter))
        return false;
      if (!TBaseHelper.equalsSlow(this.filter, that.filter))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_space_id = true;
    builder.append(present_space_id);
    if (present_space_id)
      builder.append(space_id);

    boolean present_column_names = true && (isSetColumn_names());
    builder.append(present_column_names);
    if (present_column_names)
      builder.append(column_names);

    boolean present_parts = true && (isSetParts());
    builder.append(present_parts);
    if (present_parts)
      builder.append(parts);

    boolean present_vertex_props = true && (isSetVertex_props());
    builder.append(present_vertex_props);
    if (present_vertex_props)
      builder.append(vertex_props);

    boolean present_edge_props = true && (isSetEdge_props());
    builder.append(present_edge_props);
    if (present_edge_props)
      builder.append(edge_props);

    boolean present_expressions = true && (isSetExpressions());
    builder.append(present_expressions);
    if (present_expressions)
      builder.append(expressions);

    boolean present_dedup = true;
    builder.append(present_dedup);
    if (present_dedup)
      builder.append(dedup);

    boolean present_order_by = true && (isSetOrder_by());
    builder.append(present_order_by);
    if (present_order_by)
      builder.append(order_by);

    boolean present_limit = true && (isSetLimit());
    builder.append(present_limit);
    if (present_limit)
      builder.append(limit);

    boolean present_filter = true && (isSetFilter());
    builder.append(present_filter);
    if (present_filter)
      builder.append(filter);

    return builder.toHashCode();
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case SPACE_ID:
          if (field.type == TType.I32) {
            this.space_id = iprot.readI32();
            setSpace_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case COLUMN_NAMES:
          if (field.type == TType.LIST) {
            {
              TList _list49 = iprot.readListBegin();
              this.column_names = new ArrayList<byte[]>(Math.max(0, _list49.size));
              for (int _i50 = 0; 
                   (_list49.size < 0) ? iprot.peekList() : (_i50 < _list49.size); 
                   ++_i50)
              {
                byte[] _elem51;
                _elem51 = iprot.readBinary();
                this.column_names.add(_elem51);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PARTS:
          if (field.type == TType.MAP) {
            {
              TMap _map52 = iprot.readMapBegin();
              this.parts = new HashMap<Integer,List<com.vesoft.nebula.Row>>(Math.max(0, 2*_map52.size));
              for (int _i53 = 0; 
                   (_map52.size < 0) ? iprot.peekMap() : (_i53 < _map52.size); 
                   ++_i53)
              {
                int _key54;
                List<com.vesoft.nebula.Row> _val55;
                _key54 = iprot.readI32();
                {
                  TList _list56 = iprot.readListBegin();
                  _val55 = new ArrayList<com.vesoft.nebula.Row>(Math.max(0, _list56.size));
                  for (int _i57 = 0; 
                       (_list56.size < 0) ? iprot.peekList() : (_i57 < _list56.size); 
                       ++_i57)
                  {
                    com.vesoft.nebula.Row _elem58;
                    _elem58 = new com.vesoft.nebula.Row();
                    _elem58.read(iprot);
                    _val55.add(_elem58);
                  }
                  iprot.readListEnd();
                }
                this.parts.put(_key54, _val55);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case VERTEX_PROPS:
          if (field.type == TType.LIST) {
            {
              TList _list59 = iprot.readListBegin();
              this.vertex_props = new ArrayList<VertexProp>(Math.max(0, _list59.size));
              for (int _i60 = 0; 
                   (_list59.size < 0) ? iprot.peekList() : (_i60 < _list59.size); 
                   ++_i60)
              {
                VertexProp _elem61;
                _elem61 = new VertexProp();
                _elem61.read(iprot);
                this.vertex_props.add(_elem61);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EDGE_PROPS:
          if (field.type == TType.LIST) {
            {
              TList _list62 = iprot.readListBegin();
              this.edge_props = new ArrayList<EdgeProp>(Math.max(0, _list62.size));
              for (int _i63 = 0; 
                   (_list62.size < 0) ? iprot.peekList() : (_i63 < _list62.size); 
                   ++_i63)
              {
                EdgeProp _elem64;
                _elem64 = new EdgeProp();
                _elem64.read(iprot);
                this.edge_props.add(_elem64);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EXPRESSIONS:
          if (field.type == TType.LIST) {
            {
              TList _list65 = iprot.readListBegin();
              this.expressions = new ArrayList<Expr>(Math.max(0, _list65.size));
              for (int _i66 = 0; 
                   (_list65.size < 0) ? iprot.peekList() : (_i66 < _list65.size); 
                   ++_i66)
              {
                Expr _elem67;
                _elem67 = new Expr();
                _elem67.read(iprot);
                this.expressions.add(_elem67);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DEDUP:
          if (field.type == TType.BOOL) {
            this.dedup = iprot.readBool();
            setDedupIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ORDER_BY:
          if (field.type == TType.LIST) {
            {
              TList _list68 = iprot.readListBegin();
              this.order_by = new ArrayList<OrderBy>(Math.max(0, _list68.size));
              for (int _i69 = 0; 
                   (_list68.size < 0) ? iprot.peekList() : (_i69 < _list68.size); 
                   ++_i69)
              {
                OrderBy _elem70;
                _elem70 = new OrderBy();
                _elem70.read(iprot);
                this.order_by.add(_elem70);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case LIMIT:
          if (field.type == TType.I64) {
            this.limit = iprot.readI64();
            setLimitIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case FILTER:
          if (field.type == TType.STRING) {
            this.filter = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(SPACE_ID_FIELD_DESC);
    oprot.writeI32(this.space_id);
    oprot.writeFieldEnd();
    if (this.column_names != null) {
      oprot.writeFieldBegin(COLUMN_NAMES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.column_names.size()));
        for (byte[] _iter71 : this.column_names)        {
          oprot.writeBinary(_iter71);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.parts != null) {
      oprot.writeFieldBegin(PARTS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.LIST, this.parts.size()));
        for (Map.Entry<Integer, List<com.vesoft.nebula.Row>> _iter72 : this.parts.entrySet())        {
          oprot.writeI32(_iter72.getKey());
          {
            oprot.writeListBegin(new TList(TType.STRUCT, _iter72.getValue().size()));
            for (com.vesoft.nebula.Row _iter73 : _iter72.getValue())            {
              _iter73.write(oprot);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.vertex_props != null) {
      if (isSetVertex_props()) {
        oprot.writeFieldBegin(VERTEX_PROPS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.vertex_props.size()));
          for (VertexProp _iter74 : this.vertex_props)          {
            _iter74.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.edge_props != null) {
      if (isSetEdge_props()) {
        oprot.writeFieldBegin(EDGE_PROPS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.edge_props.size()));
          for (EdgeProp _iter75 : this.edge_props)          {
            _iter75.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.expressions != null) {
      if (isSetExpressions()) {
        oprot.writeFieldBegin(EXPRESSIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.expressions.size()));
          for (Expr _iter76 : this.expressions)          {
            _iter76.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldBegin(DEDUP_FIELD_DESC);
    oprot.writeBool(this.dedup);
    oprot.writeFieldEnd();
    if (this.order_by != null) {
      if (isSetOrder_by()) {
        oprot.writeFieldBegin(ORDER_BY_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.order_by.size()));
          for (OrderBy _iter77 : this.order_by)          {
            _iter77.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (isSetLimit()) {
      oprot.writeFieldBegin(LIMIT_FIELD_DESC);
      oprot.writeI64(this.limit);
      oprot.writeFieldEnd();
    }
    if (this.filter != null) {
      if (isSetFilter()) {
        oprot.writeFieldBegin(FILTER_FIELD_DESC);
        oprot.writeBinary(this.filter);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("GetPropRequest");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("space_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getSpace_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("column_names");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getColumn_names() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getColumn_names(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("parts");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getParts() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getParts(), indent + 1, prettyPrint));
    }
    first = false;
    if (isSetVertex_props())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("vertex_props");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getVertex_props() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getVertex_props(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetEdge_props())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("edge_props");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getEdge_props() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getEdge_props(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetExpressions())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("expressions");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getExpressions() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getExpressions(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("dedup");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. isDedup(), indent + 1, prettyPrint));
    first = false;
    if (isSetOrder_by())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("order_by");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getOrder_by() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getOrder_by(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetLimit())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("limit");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getLimit(), indent + 1, prettyPrint));
      first = false;
    }
    if (isSetFilter())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("filter");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getFilter() == null) {
        sb.append("null");
      } else {
          int __filter_size = Math.min(this. getFilter().length, 128);
          for (int i = 0; i < __filter_size; i++) {
            if (i != 0) sb.append(" ");
            sb.append(Integer.toHexString(this. getFilter()[i]).length() > 1 ? Integer.toHexString(this. getFilter()[i]).substring(Integer.toHexString(this. getFilter()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getFilter()[i]).toUpperCase());
          }
          if (this. getFilter().length > 128) sb.append(" ...");
      }
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}
