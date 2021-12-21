/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class IndexParams implements TBase, java.io.Serializable, Cloneable, Comparable<IndexParams> {
  private static final TStruct STRUCT_DESC = new TStruct("IndexParams");
  private static final TField COMMENT_FIELD_DESC = new TField("comment", TType.STRING, (short)1);
  private static final TField S2_MAX_LEVEL_FIELD_DESC = new TField("s2_max_level", TType.I32, (short)2);
  private static final TField S2_MAX_CELLS_FIELD_DESC = new TField("s2_max_cells", TType.I32, (short)3);

  public byte[] comment;
  public int s2_max_level;
  public int s2_max_cells;
  public static final int COMMENT = 1;
  public static final int S2_MAX_LEVEL = 2;
  public static final int S2_MAX_CELLS = 3;

  // isset id assignments
  private static final int __S2_MAX_LEVEL_ISSET_ID = 0;
  private static final int __S2_MAX_CELLS_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(COMMENT, new FieldMetaData("comment", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(S2_MAX_LEVEL, new FieldMetaData("s2_max_level", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(S2_MAX_CELLS, new FieldMetaData("s2_max_cells", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(IndexParams.class, metaDataMap);
  }

  public IndexParams() {
  }

  public IndexParams(
      byte[] comment,
      int s2_max_level,
      int s2_max_cells) {
    this();
    this.comment = comment;
    this.s2_max_level = s2_max_level;
    setS2_max_levelIsSet(true);
    this.s2_max_cells = s2_max_cells;
    setS2_max_cellsIsSet(true);
  }

  public static class Builder {
    private byte[] comment;
    private int s2_max_level;
    private int s2_max_cells;

    BitSet __optional_isset = new BitSet(2);

    public Builder() {
    }

    public Builder setComment(final byte[] comment) {
      this.comment = comment;
      return this;
    }

    public Builder setS2_max_level(final int s2_max_level) {
      this.s2_max_level = s2_max_level;
      __optional_isset.set(__S2_MAX_LEVEL_ISSET_ID, true);
      return this;
    }

    public Builder setS2_max_cells(final int s2_max_cells) {
      this.s2_max_cells = s2_max_cells;
      __optional_isset.set(__S2_MAX_CELLS_ISSET_ID, true);
      return this;
    }

    public IndexParams build() {
      IndexParams result = new IndexParams();
      result.setComment(this.comment);
      if (__optional_isset.get(__S2_MAX_LEVEL_ISSET_ID)) {
        result.setS2_max_level(this.s2_max_level);
      }
      if (__optional_isset.get(__S2_MAX_CELLS_ISSET_ID)) {
        result.setS2_max_cells(this.s2_max_cells);
      }
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public IndexParams(IndexParams other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetComment()) {
      this.comment = TBaseHelper.deepCopy(other.comment);
    }
    this.s2_max_level = TBaseHelper.deepCopy(other.s2_max_level);
    this.s2_max_cells = TBaseHelper.deepCopy(other.s2_max_cells);
  }

  public IndexParams deepCopy() {
    return new IndexParams(this);
  }

  public byte[] getComment() {
    return this.comment;
  }

  public IndexParams setComment(byte[] comment) {
    this.comment = comment;
    return this;
  }

  public void unsetComment() {
    this.comment = null;
  }

  // Returns true if field comment is set (has been assigned a value) and false otherwise
  public boolean isSetComment() {
    return this.comment != null;
  }

  public void setCommentIsSet(boolean __value) {
    if (!__value) {
      this.comment = null;
    }
  }

  public int getS2_max_level() {
    return this.s2_max_level;
  }

  public IndexParams setS2_max_level(int s2_max_level) {
    this.s2_max_level = s2_max_level;
    setS2_max_levelIsSet(true);
    return this;
  }

  public void unsetS2_max_level() {
    __isset_bit_vector.clear(__S2_MAX_LEVEL_ISSET_ID);
  }

  // Returns true if field s2_max_level is set (has been assigned a value) and false otherwise
  public boolean isSetS2_max_level() {
    return __isset_bit_vector.get(__S2_MAX_LEVEL_ISSET_ID);
  }

  public void setS2_max_levelIsSet(boolean __value) {
    __isset_bit_vector.set(__S2_MAX_LEVEL_ISSET_ID, __value);
  }

  public int getS2_max_cells() {
    return this.s2_max_cells;
  }

  public IndexParams setS2_max_cells(int s2_max_cells) {
    this.s2_max_cells = s2_max_cells;
    setS2_max_cellsIsSet(true);
    return this;
  }

  public void unsetS2_max_cells() {
    __isset_bit_vector.clear(__S2_MAX_CELLS_ISSET_ID);
  }

  // Returns true if field s2_max_cells is set (has been assigned a value) and false otherwise
  public boolean isSetS2_max_cells() {
    return __isset_bit_vector.get(__S2_MAX_CELLS_ISSET_ID);
  }

  public void setS2_max_cellsIsSet(boolean __value) {
    __isset_bit_vector.set(__S2_MAX_CELLS_ISSET_ID, __value);
  }

  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case COMMENT:
      if (__value == null) {
        unsetComment();
      } else {
        setComment((byte[])__value);
      }
      break;

    case S2_MAX_LEVEL:
      if (__value == null) {
        unsetS2_max_level();
      } else {
        setS2_max_level((Integer)__value);
      }
      break;

    case S2_MAX_CELLS:
      if (__value == null) {
        unsetS2_max_cells();
      } else {
        setS2_max_cells((Integer)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case COMMENT:
      return getComment();

    case S2_MAX_LEVEL:
      return new Integer(getS2_max_level());

    case S2_MAX_CELLS:
      return new Integer(getS2_max_cells());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof IndexParams))
      return false;
    IndexParams that = (IndexParams)_that;

    if (!TBaseHelper.equalsSlow(this.isSetComment(), that.isSetComment(), this.comment, that.comment)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetS2_max_level(), that.isSetS2_max_level(), this.s2_max_level, that.s2_max_level)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetS2_max_cells(), that.isSetS2_max_cells(), this.s2_max_cells, that.s2_max_cells)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {comment, s2_max_level, s2_max_cells});
  }

  @Override
  public int compareTo(IndexParams other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetComment()).compareTo(other.isSetComment());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(comment, other.comment);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetS2_max_level()).compareTo(other.isSetS2_max_level());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(s2_max_level, other.s2_max_level);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetS2_max_cells()).compareTo(other.isSetS2_max_cells());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(s2_max_cells, other.s2_max_cells);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case COMMENT:
          if (__field.type == TType.STRING) {
            this.comment = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case S2_MAX_LEVEL:
          if (__field.type == TType.I32) {
            this.s2_max_level = iprot.readI32();
            setS2_max_levelIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case S2_MAX_CELLS:
          if (__field.type == TType.I32) {
            this.s2_max_cells = iprot.readI32();
            setS2_max_cellsIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
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
    if (this.comment != null) {
      if (isSetComment()) {
        oprot.writeFieldBegin(COMMENT_FIELD_DESC);
        oprot.writeBinary(this.comment);
        oprot.writeFieldEnd();
      }
    }
    if (isSetS2_max_level()) {
      oprot.writeFieldBegin(S2_MAX_LEVEL_FIELD_DESC);
      oprot.writeI32(this.s2_max_level);
      oprot.writeFieldEnd();
    }
    if (isSetS2_max_cells()) {
      oprot.writeFieldBegin(S2_MAX_CELLS_FIELD_DESC);
      oprot.writeI32(this.s2_max_cells);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("IndexParams");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    if (isSetComment())
    {
      sb.append(indentStr);
      sb.append("comment");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getComment() == null) {
        sb.append("null");
      } else {
          int __comment_size = Math.min(this.getComment().length, 128);
          for (int i = 0; i < __comment_size; i++) {
            if (i != 0) sb.append(" ");
            sb.append(Integer.toHexString(this.getComment()[i]).length() > 1 ? Integer.toHexString(this.getComment()[i]).substring(Integer.toHexString(this.getComment()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getComment()[i]).toUpperCase());
          }
          if (this.getComment().length > 128) sb.append(" ...");
      }
      first = false;
    }
    if (isSetS2_max_level())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("s2_max_level");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this.getS2_max_level(), indent + 1, prettyPrint));
      first = false;
    }
    if (isSetS2_max_cells())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("s2_max_cells");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this.getS2_max_cells(), indent + 1, prettyPrint));
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
