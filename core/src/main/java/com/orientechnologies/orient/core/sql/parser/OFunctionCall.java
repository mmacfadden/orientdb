/* Generated By:JJTree: Do not edit this line. OFunctionCall.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import com.orientechnologies.orient.core.command.OCommandContext;
import com.orientechnologies.orient.core.db.ODatabaseDocumentInternal;
import com.orientechnologies.orient.core.db.ODatabaseRecordThreadLocal;
import com.orientechnologies.orient.core.db.record.OIdentifiable;
import com.orientechnologies.orient.core.sql.OSQLEngine;
import com.orientechnologies.orient.core.sql.functions.OIndexableSQLFunction;
import com.orientechnologies.orient.core.sql.functions.OSQLFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OFunctionCall extends SimpleNode {

  protected OIdentifier       name;
  protected boolean           star   = false;
  protected List<OExpression> params = new ArrayList<OExpression>();

  public OFunctionCall(int id) {
    super(id);
  }

  public OFunctionCall(OrientSql p, int id) {
    super(p, id);
  }

  /**
   * Accept the visitor. *
   */
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  public boolean isStar() {
    return star;
  }

  public void setStar(boolean star) {
    this.star = star;
  }

  public List<OExpression> getParams() {
    return params;
  }

  public void setParams(List<OExpression> params) {
    this.params = params;
  }

  public void toString(Map<Object, Object> params, StringBuilder builder) {
    name.toString(params, builder);
    builder.append("(");
    if (star) {
      builder.append("*");
    } else {
      boolean first = true;
      for (OExpression expr : this.params) {
        if (!first) {
          builder.append(", ");
        }
        expr.toString(params, builder);
        first = false;
      }
    }
    builder.append(")");
  }

  public Object execute(Object targetObjects, OCommandContext ctx) {
    return execute(targetObjects, ctx, name.getStringValue());
  }

  private Object execute(Object targetObjects, OCommandContext ctx, String name) {
    List<Object> paramValues = new ArrayList<Object>();
    for (OExpression expr : this.params) {
      paramValues.add(expr.execute((OIdentifiable) ctx.getVariable("$current"), ctx));
    }
    OSQLFunction function = OSQLEngine.getInstance().getFunction(name);
    if (function != null) {
      return function.execute(targetObjects, (OIdentifiable) ctx.getVariable("$current"), null, paramValues.toArray(), ctx);
    }
    throw new UnsupportedOperationException("finisho OFunctionCall implementation!");
  }

  public static ODatabaseDocumentInternal getDatabase() {
    return ODatabaseRecordThreadLocal.INSTANCE.get();
  }

  public boolean isIndexedFunctionCall() {
    OSQLFunction function = OSQLEngine.getInstance().getFunction(name.getStringValue());
    return (function instanceof OIndexableSQLFunction);
  }

  /**
   * see OIndexableSQLFunction.searchFromTarget()
   * 
   * @param target
   * @param ctx
   * @param operator
   * @param rightValue
   * @return
   */
  public Iterable<OIdentifiable> executeIndexedFunction(OFromClause target, OCommandContext ctx, OBinaryCompareOperator operator,
      Object rightValue) {
    OSQLFunction function = OSQLEngine.getInstance().getFunction(name.getStringValue());
    if (function instanceof OIndexableSQLFunction) {
      return ((OIndexableSQLFunction) function).searchFromTarget(target, operator, rightValue, ctx,
          this.getParams().toArray(new OExpression[] {}));
    }
    return null;
  }

  /**
   *
   * @param target
   *          query target
   * @param ctx
   *          execution context
   * @param operator
   *          operator at the right of the function
   * @param rightValue
   *          value to compare to funciton result
   * @return the approximate number of items returned by the condition execution, -1 if the extimation cannot be executed
   */
  public long estimateIndexedFunction(OFromClause target, OCommandContext ctx, OBinaryCompareOperator operator, Object rightValue) {
    OSQLFunction function = OSQLEngine.getInstance().getFunction(name.getStringValue());
    if (function instanceof OIndexableSQLFunction) {
      return ((OIndexableSQLFunction) function).estimate(target, operator, rightValue, ctx,
          this.getParams().toArray(new OExpression[] {}));
    }
    return -1;
  }
}
/* JavaCC - OriginalChecksum=290d4e1a3f663299452e05f8db718419 (do not edit this line) */
