/* Generated By:JavaCC: Do not edit this line. OrientSqlTreeConstants.java Version 5.0 */
package com.orientechnologies.orient.core.sql.parser;

public interface OrientSqlTreeConstants
{
  public int JJTRID = 0;
  public int JJTPARSE = 1;
  public int JJTPARSESCRIPT = 2;
  public int JJTIDENTIFIER = 3;
  public int JJTINTEGER = 4;
  public int JJTFLOATINGPOINT = 5;
  public int JJTNUMBER = 6;
  public int JJTSTATEMENT = 7;
  public int JJTSTATEMENTSEMICOLON = 8;
  public int JJTSTATEMENTINTERNAL = 9;
  public int JJTQUERYSTATEMENT = 10;
  public int JJTSELECTWITHOUTTARGETSTATEMENT = 11;
  public int JJTSELECTSTATEMENT = 12;
  public int JJTTRAVERSESTATEMENT = 13;
  public int JJTMATCHSTATEMENT = 14;
  public int JJTDELETESTATEMENT = 15;
  public int JJTDELETEVERTEXSTATEMENT = 16;
  public int JJTDELETEEDGESTATEMENT = 17;
  public int JJTDELETEEDGEBYRIDSTATEMENT = 18;
  public int JJTDELETEEDGEFROMTOSTATEMENT = 19;
  public int JJTDELETEEDGETOSTATEMENT = 20;
  public int JJTDELETEEDGEVTOSTATEMENT = 21;
  public int JJTDELETEEDGEWHERESTATEMENT = 22;
  public int JJTUPDATEEDGESTATEMENT = 23;
  public int JJTUPDATESTATEMENT = 24;
  public int JJTUPDATEOPERATIONS = 25;
  public int JJTUPDATEITEM = 26;
  public int JJTUPDATEINCREMENTITEM = 27;
  public int JJTUPDATEREMOVEITEM = 28;
  public int JJTUPDATEPUTITEM = 29;
  public int JJTUPDATEADDITEM = 30;
  public int JJTINSERTSTATEMENT = 31;
  public int JJTINSERTBODY = 32;
  public int JJTCREATEVERTEXSTATEMENTEMPTYNOTARGET = 33;
  public int JJTCREATEVERTEXSTATEMENTEMPTY = 34;
  public int JJTCREATEVERTEXSTATEMENT = 35;
  public int JJTCREATEVERTEXSTATEMENTNOTARGET = 36;
  public int JJTCREATEEDGESTATEMENT = 37;
  public int JJTINPUTPARAMETER = 38;
  public int JJTPOSITIONALPARAMETER = 39;
  public int JJTNAMEDPARAMETER = 40;
  public int JJTPROJECTION = 41;
  public int JJTPROJECTIONITEM = 42;
  public int JJTARRAYSELECTOR = 43;
  public int JJTARRAYNUMBERSELECTOR = 44;
  public int JJTARRAYSINGLEVALUESSELECTOR = 45;
  public int JJTARRAYRANGESELECTOR = 46;
  public int JJTALIAS = 47;
  public int JJTRECORDATTRIBUTE = 48;
  public int JJTFUNCTIONCALL = 49;
  public int JJTMETHODCALL = 50;
  public int JJTLEVELZEROIDENTIFIER = 51;
  public int JJTSUFFIXIDENTIFIER = 52;
  public int JJTBASEIDENTIFIER = 53;
  public int JJTMODIFIER = 54;
  public int JJTEXPRESSION = 55;
  public int JJTMATHEXPRESSION = 56;
  public int JJTMULTEXPRESSION = 57;
  public int JJTFIRSTLEVELEXPRESSION = 58;
  public int JJTPARENTHESISEXPRESSION = 59;
  public int JJTBASEEXPRESSION = 60;
  public int JJTFROMCLAUSE = 61;
  public int JJTLETCLAUSE = 62;
  public int JJTLETITEM = 63;
  public int JJTFROMITEM = 64;
  public int JJTCLUSTER = 65;
  public int JJTCLUSTERLIST = 66;
  public int JJTMETADATAIDENTIFIER = 67;
  public int JJTINDEXNAME = 68;
  public int JJTINDEXIDENTIFIER = 69;
  public int JJTWHERECLAUSE = 70;
  public int JJTORBLOCK = 71;
  public int JJTANDBLOCK = 72;
  public int JJTNOTBLOCK = 73;
  public int JJTPARENTHESISBLOCK = 74;
  public int JJTCONDITIONBLOCK = 75;
  public int JJTCOMPAREOPERATOR = 76;
  public int JJTLTOPERATOR = 77;
  public int JJTGTOPERATOR = 78;
  public int JJTNEOPERATOR = 79;
  public int JJTNEQOPERATOR = 80;
  public int JJTGEOPERATOR = 81;
  public int JJTLEOPERATOR = 82;
  public int JJTLIKEOPERATOR = 83;
  public int JJTLUCENEOPERATOR = 84;
  public int JJTNEAROPERATOR = 85;
  public int JJTWITHINOPERATOR = 86;
  public int JJTSCANDOPERATOR = 87;
  public int JJTCONTAINSKEYOPERATOR = 88;
  public int JJTCONTAINSVALUEOPERATOR = 89;
  public int JJTEQUALSCOMPAREOPERATOR = 90;
  public int JJTBINARYCONDITION = 91;
  public int JJTCONTAINSVALUECONDITION = 92;
  public int JJTINSTANCEOFCONDITION = 93;
  public int JJTINDEXMATCHCONDITION = 94;
  public int JJTBETWEENCONDITION = 95;
  public int JJTISNULLCONDITION = 96;
  public int JJTISNOTNULLCONDITION = 97;
  public int JJTISDEFINEDCONDITION = 98;
  public int JJTISNOTDEFINEDCONDITION = 99;
  public int JJTCONTAINSCONDITION = 100;
  public int JJTINOPERATOR = 101;
  public int JJTINCONDITION = 102;
  public int JJTNOTINCONDITION = 103;
  public int JJTCONTAINSALLCONDITION = 104;
  public int JJTCONTAINSTEXTCONDITION = 105;
  public int JJTMATCHESCONDITION = 106;
  public int JJTORDERBY = 107;
  public int JJTGROUPBY = 108;
  public int JJTUNWIND = 109;
  public int JJTLIMIT = 110;
  public int JJTSKIP = 111;
  public int JJTBATCH = 112;
  public int JJTTIMEOUT = 113;
  public int JJTWAIT = 114;
  public int JJTRETRY = 115;
  public int JJTCOLLECTION = 116;
  public int JJTFETCHPLAN = 117;
  public int JJTFETCHPLANITEM = 118;
  public int JJTTRAVERSEPROJECTIONITEM = 119;
  public int JJTJSON = 120;
  public int JJTMATCHEXPRESSION = 121;
  public int JJTMATCHPATHITEM = 122;
  public int JJTMATCHPATHITEMFIRST = 123;
  public int JJTMULTIMATCHPATHITEM = 124;
  public int JJTMULTIMATCHPATHITEMARROWS = 125;
  public int JJTMATCHFILTER = 126;
  public int JJTMATCHFILTERITEM = 127;
  public int JJTOUTPATHITEM = 128;
  public int JJTINPATHITEM = 129;
  public int JJTBOTHPATHITEM = 130;
  public int JJTOUTPATHITEMOPT = 131;
  public int JJTINPATHITEMOPT = 132;
  public int JJTBOTHPATHITEMOPT = 133;
  public int JJTPROFILESTORAGESTATEMENT = 134;
  public int JJTTRUNCATECLASSSTATEMENT = 135;
  public int JJTTRUNCATECLUSTERSTATEMENT = 136;
  public int JJTTRUNCATERECORDSTATEMENT = 137;
  public int JJTFINDREFERENCESSTATEMENT = 138;
  public int JJTCREATECLASSSTATEMENT = 139;
  public int JJTALTERCLASSSTATEMENT = 140;
  public int JJTDROPCLASSSTATEMENT = 141;
  public int JJTCREATEPROPERTYSTATEMENT = 142;
  public int JJTALTERPROPERTYSTATEMENT = 143;
  public int JJTDROPPROPERTYSTATEMENT = 144;
  public int JJTCREATEINDEXSTATEMENT = 145;
  public int JJTREBUILDINDEXSTATEMENT = 146;
  public int JJTDROPINDEXSTATEMENT = 147;
  public int JJTCREATECLUSTERSTATEMENT = 148;
  public int JJTALTERCLUSTERSTATEMENT = 149;
  public int JJTDROPCLUSTERSTATEMENT = 150;
  public int JJTALTERDATABASESTATEMENT = 151;
  public int JJTCOMMANDLINEOPTION = 152;
  public int JJTOPTIMIZEDATABASESTATEMENT = 153;
  public int JJTCREATELINKSTATEMENT = 154;
  public int JJTEXPLAINSTATEMENT = 155;
  public int JJTPERMISSION = 156;
  public int JJTRESOURCEPATHITEM = 157;
  public int JJTGRANTSTATEMENT = 158;
  public int JJTREVOKESTATEMENT = 159;
  public int JJTCREATEFUNCTIONSTATEMENT = 160;
  public int JJTLETSTATEMENT = 161;
  public int JJTBEGINSTATEMENT = 162;
  public int JJTCOMMITSTATEMENT = 163;
  public int JJTRETURNSTATEMENT = 164;
  public int JJTIFSTATEMENT = 165;
  public int JJTSLEEPSTATEMENT = 166;
  public int JJTCONSOLESTATEMENT = 167;
  public int JJTCREATESEQUENCESTATEMENT = 168;
  public int JJTALTERSEQUENCESTATEMENT = 169;
  public int JJTDROPSEQUENCESTATEMENT = 170;


  public String[] jjtNodeName = {
    "Rid",
    "parse",
    "parseScript",
    "Identifier",
    "Integer",
    "FloatingPoint",
    "Number",
    "Statement",
    "StatementSemicolon",
    "StatementInternal",
    "QueryStatement",
    "SelectWithoutTargetStatement",
    "SelectStatement",
    "TraverseStatement",
    "MatchStatement",
    "DeleteStatement",
    "DeleteVertexStatement",
    "DeleteEdgeStatement",
    "DeleteEdgeByRidStatement",
    "DeleteEdgeFromToStatement",
    "DeleteEdgeToStatement",
    "DeleteEdgeVToStatement",
    "DeleteEdgeWhereStatement",
    "UpdateEdgeStatement",
    "UpdateStatement",
    "UpdateOperations",
    "UpdateItem",
    "UpdateIncrementItem",
    "UpdateRemoveItem",
    "UpdatePutItem",
    "UpdateAddItem",
    "InsertStatement",
    "InsertBody",
    "CreateVertexStatementEmptyNoTarget",
    "CreateVertexStatementEmpty",
    "CreateVertexStatement",
    "CreateVertexStatementNoTarget",
    "CreateEdgeStatement",
    "InputParameter",
    "PositionalParameter",
    "NamedParameter",
    "Projection",
    "ProjectionItem",
    "ArraySelector",
    "ArrayNumberSelector",
    "ArraySingleValuesSelector",
    "ArrayRangeSelector",
    "Alias",
    "RecordAttribute",
    "FunctionCall",
    "MethodCall",
    "LevelZeroIdentifier",
    "SuffixIdentifier",
    "BaseIdentifier",
    "Modifier",
    "Expression",
    "MathExpression",
    "MultExpression",
    "FirstLevelExpression",
    "ParenthesisExpression",
    "BaseExpression",
    "FromClause",
    "LetClause",
    "LetItem",
    "FromItem",
    "Cluster",
    "ClusterList",
    "MetadataIdentifier",
    "IndexName",
    "IndexIdentifier",
    "WhereClause",
    "OrBlock",
    "AndBlock",
    "NotBlock",
    "ParenthesisBlock",
    "ConditionBlock",
    "CompareOperator",
    "LtOperator",
    "GtOperator",
    "NeOperator",
    "NeqOperator",
    "GeOperator",
    "LeOperator",
    "LikeOperator",
    "LuceneOperator",
    "NearOperator",
    "WithinOperator",
    "ScAndOperator",
    "ContainsKeyOperator",
    "ContainsValueOperator",
    "EqualsCompareOperator",
    "BinaryCondition",
    "ContainsValueCondition",
    "InstanceofCondition",
    "IndexMatchCondition",
    "BetweenCondition",
    "IsNullCondition",
    "IsNotNullCondition",
    "IsDefinedCondition",
    "IsNotDefinedCondition",
    "ContainsCondition",
    "InOperator",
    "InCondition",
    "NotInCondition",
    "ContainsAllCondition",
    "ContainsTextCondition",
    "MatchesCondition",
    "OrderBy",
    "GroupBy",
    "Unwind",
    "Limit",
    "Skip",
    "Batch",
    "Timeout",
    "Wait",
    "Retry",
    "Collection",
    "FetchPlan",
    "FetchPlanItem",
    "TraverseProjectionItem",
    "Json",
    "MatchExpression",
    "MatchPathItem",
    "MatchPathItemFirst",
    "MultiMatchPathItem",
    "MultiMatchPathItemArrows",
    "MatchFilter",
    "MatchFilterItem",
    "OutPathItem",
    "InPathItem",
    "BothPathItem",
    "OutPathItemOpt",
    "InPathItemOpt",
    "BothPathItemOpt",
    "ProfileStorageStatement",
    "TruncateClassStatement",
    "TruncateClusterStatement",
    "TruncateRecordStatement",
    "FindReferencesStatement",
    "CreateClassStatement",
    "AlterClassStatement",
    "DropClassStatement",
    "CreatePropertyStatement",
    "AlterPropertyStatement",
    "DropPropertyStatement",
    "CreateIndexStatement",
    "RebuildIndexStatement",
    "DropIndexStatement",
    "CreateClusterStatement",
    "AlterClusterStatement",
    "DropClusterStatement",
    "AlterDatabaseStatement",
    "CommandLineOption",
    "OptimizeDatabaseStatement",
    "CreateLinkStatement",
    "ExplainStatement",
    "Permission",
    "ResourcePathItem",
    "GrantStatement",
    "RevokeStatement",
    "CreateFunctionStatement",
    "LetStatement",
    "BeginStatement",
    "CommitStatement",
    "ReturnStatement",
    "IfStatement",
    "SleepStatement",
    "ConsoleStatement",
    "CreateSequenceStatement",
    "AlterSequenceStatement",
    "DropSequenceStatement",
  };
}
/* JavaCC - OriginalChecksum=645f013c99acf29fc2f43fdbc94e5861 (do not edit this line) */
