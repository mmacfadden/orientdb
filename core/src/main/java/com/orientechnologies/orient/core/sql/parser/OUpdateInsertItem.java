/* Generated By:JJTree: Do not edit this line. OUpdateInsertItem.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import java.util.Map;

public
class OUpdateInsertItem extends SimpleNode {
  
  OIdentifier field;
  int index;
  OExpression value;
  
  public OUpdateInsertItem(int id) {
    super(id);
  }

  public OUpdateInsertItem(OrientSql p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
  
  public void toString(Map<Object, Object> params, StringBuilder builder) {
    builder.append("INTO ");
    field.toString(params, builder);
    builder.append(" AT ");
    builder.append(index);
    builder.append(" ");
    value.toString(params, builder);
  }
}
/* JavaCC - OriginalChecksum=3cc3c0fb2e836242b7f0d3d27cf8f96c (do not edit this line) */
