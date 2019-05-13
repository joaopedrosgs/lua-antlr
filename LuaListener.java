// Generated from Lua.g4 by ANTLR 4.7.2
package t1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LuaParser}.
 */
public interface LuaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LuaParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(LuaParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(LuaParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#codigo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo(LuaParser.CodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#codigo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo(LuaParser.CodigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(LuaParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(LuaParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(LuaParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(LuaParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(LuaParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(LuaParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(LuaParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(LuaParser.FuncnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(LuaParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(LuaParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#namelist}.
	 * @param ctx the parse tree
	 */
	void enterNamelist(LuaParser.NamelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#namelist}.
	 * @param ctx the parse tree
	 */
	void exitNamelist(LuaParser.NamelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#listaExpr}.
	 * @param ctx the parse tree
	 */
	void enterListaExpr(LuaParser.ListaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#listaExpr}.
	 * @param ctx the parse tree
	 */
	void exitListaExpr(LuaParser.ListaExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(LuaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(LuaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opLogica}.
	 * @param ctx the parse tree
	 */
	void enterOpLogica(LuaParser.OpLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opLogica}.
	 * @param ctx the parse tree
	 */
	void exitOpLogica(LuaParser.OpLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opComparacao}.
	 * @param ctx the parse tree
	 */
	void enterOpComparacao(LuaParser.OpComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opComparacao}.
	 * @param ctx the parse tree
	 */
	void exitOpComparacao(LuaParser.OpComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opBin}.
	 * @param ctx the parse tree
	 */
	void enterOpBin(LuaParser.OpBinContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opBin}.
	 * @param ctx the parse tree
	 */
	void exitOpBin(LuaParser.OpBinContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opSomaSub}.
	 * @param ctx the parse tree
	 */
	void enterOpSomaSub(LuaParser.OpSomaSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opSomaSub}.
	 * @param ctx the parse tree
	 */
	void exitOpSomaSub(LuaParser.OpSomaSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opDivMult}.
	 * @param ctx the parse tree
	 */
	void enterOpDivMult(LuaParser.OpDivMultContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opDivMult}.
	 * @param ctx the parse tree
	 */
	void exitOpDivMult(LuaParser.OpDivMultContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opConcat}.
	 * @param ctx the parse tree
	 */
	void enterOpConcat(LuaParser.OpConcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opConcat}.
	 * @param ctx the parse tree
	 */
	void exitOpConcat(LuaParser.OpConcatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opUnario}.
	 * @param ctx the parse tree
	 */
	void enterOpUnario(LuaParser.OpUnarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opUnario}.
	 * @param ctx the parse tree
	 */
	void exitOpUnario(LuaParser.OpUnarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#opPower}.
	 * @param ctx the parse tree
	 */
	void enterOpPower(LuaParser.OpPowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#opPower}.
	 * @param ctx the parse tree
	 */
	void exitOpPower(LuaParser.OpPowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixexp(LuaParser.PrefixexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#prefixexp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixexp(LuaParser.PrefixexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(LuaParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(LuaParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#varOrExp}.
	 * @param ctx the parse tree
	 */
	void enterVarOrExp(LuaParser.VarOrExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#varOrExp}.
	 * @param ctx the parse tree
	 */
	void exitVarOrExp(LuaParser.VarOrExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(LuaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(LuaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#varSuffix}.
	 * @param ctx the parse tree
	 */
	void enterVarSuffix(LuaParser.VarSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#varSuffix}.
	 * @param ctx the parse tree
	 */
	void exitVarSuffix(LuaParser.VarSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#nameAndArgs}.
	 * @param ctx the parse tree
	 */
	void enterNameAndArgs(LuaParser.NameAndArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#nameAndArgs}.
	 * @param ctx the parse tree
	 */
	void exitNameAndArgs(LuaParser.NameAndArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(LuaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(LuaParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondef(LuaParser.FunctiondefContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#functiondef}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondef(LuaParser.FunctiondefContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void enterFuncbody(LuaParser.FuncbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#funcbody}.
	 * @param ctx the parse tree
	 */
	void exitFuncbody(LuaParser.FuncbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#parlist}.
	 * @param ctx the parse tree
	 */
	void enterParlist(LuaParser.ParlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#parlist}.
	 * @param ctx the parse tree
	 */
	void exitParlist(LuaParser.ParlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#tableconstructor}.
	 * @param ctx the parse tree
	 */
	void enterTableconstructor(LuaParser.TableconstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#tableconstructor}.
	 * @param ctx the parse tree
	 */
	void exitTableconstructor(LuaParser.TableconstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#fieldlist}.
	 * @param ctx the parse tree
	 */
	void enterFieldlist(LuaParser.FieldlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#fieldlist}.
	 * @param ctx the parse tree
	 */
	void exitFieldlist(LuaParser.FieldlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(LuaParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(LuaParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link LuaParser#fieldsep}.
	 * @param ctx the parse tree
	 */
	void enterFieldsep(LuaParser.FieldsepContext ctx);
	/**
	 * Exit a parse tree produced by {@link LuaParser#fieldsep}.
	 * @param ctx the parse tree
	 */
	void exitFieldsep(LuaParser.FieldsepContext ctx);
}