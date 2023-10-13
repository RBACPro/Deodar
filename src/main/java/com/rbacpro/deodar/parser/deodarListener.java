// Generated from deodar.g4 by ANTLR 4.13.1

    package com.rbacpro.deodar.parser;
    import java.util.HashMap;
    import com.rbacpro.deodar.model.Statement;
    import com.rbacpro.deodar.model.Principal;
    import com.rbacpro.deodar.model.Action;
    import com.rbacpro.deodar.model.Resource;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link deodarParser}.
 */
public interface deodarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link deodarParser#policy}.
	 * @param ctx the parse tree
	 */
	void enterPolicy(deodarParser.PolicyContext ctx);
	/**
	 * Exit a parse tree produced by {@link deodarParser#policy}.
	 * @param ctx the parse tree
	 */
	void exitPolicy(deodarParser.PolicyContext ctx);
	/**
	 * Enter a parse tree produced by {@link deodarParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(deodarParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link deodarParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(deodarParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link deodarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(deodarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link deodarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(deodarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link deodarParser#principal}.
	 * @param ctx the parse tree
	 */
	void enterPrincipal(deodarParser.PrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link deodarParser#principal}.
	 * @param ctx the parse tree
	 */
	void exitPrincipal(deodarParser.PrincipalContext ctx);
	/**
	 * Enter a parse tree produced by {@link deodarParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(deodarParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link deodarParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(deodarParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link deodarParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(deodarParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link deodarParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(deodarParser.ResourceContext ctx);
}