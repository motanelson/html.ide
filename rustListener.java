// Generated from rust.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link rustParser}.
 */
public interface rustListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link rustParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(rustParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(rustParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link rustParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void enterImportDecl(rustParser.ImportDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#importDecl}.
	 * @param ctx the parse tree
	 */
	void exitImportDecl(rustParser.ImportDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link rustParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(rustParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(rustParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link rustParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(rustParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(rustParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link rustParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(rustParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(rustParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link rustParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(rustParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(rustParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link rustParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(rustParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(rustParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link rustParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(rustParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(rustParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rustParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(rustParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(rustParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link rustParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(rustParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(rustParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link rustParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(rustParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(rustParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link rustParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(rustParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(rustParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rustParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(rustParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(rustParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rustParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(rustParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(rustParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link rustParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(rustParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(rustParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link rustParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(rustParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(rustParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link rustParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(rustParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(rustParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link rustParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(rustParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(rustParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rustParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(rustParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(rustParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link rustParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(rustParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link rustParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(rustParser.LiteralContext ctx);
}