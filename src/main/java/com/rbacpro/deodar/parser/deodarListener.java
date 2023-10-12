// Generated from deodar.g4 by ANTLR 4.13.1

    package com.rbacpro.deodar.parser;
    import java.util.HashMap;
    import com.rbacpro.deodar.model.Statement;

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
}