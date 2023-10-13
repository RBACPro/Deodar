// Generated from deodar.g4 by ANTLR 4.13.1

    package com.rbacpro.deodar.parser;
    import java.util.HashMap;
    import com.rbacpro.deodar.model.Statement;
    import com.rbacpro.deodar.model.Principal;
    import com.rbacpro.deodar.model.Action;
    import com.rbacpro.deodar.model.Resource;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link deodarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface deodarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link deodarParser#policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy(deodarParser.PolicyContext ctx);
	/**
	 * Visit a parse tree produced by {@link deodarParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(deodarParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link deodarParser#more_stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMore_stmts(deodarParser.More_stmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link deodarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(deodarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link deodarParser#principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrincipal(deodarParser.PrincipalContext ctx);
	/**
	 * Visit a parse tree produced by {@link deodarParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(deodarParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link deodarParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(deodarParser.ResourceContext ctx);
}