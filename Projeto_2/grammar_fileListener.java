// Generated from grammar_file.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammar_fileParser}.
 */
public interface grammar_fileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(grammar_fileParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(grammar_fileParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(grammar_fileParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(grammar_fileParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVariavel(grammar_fileParser.DeclaracaoVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVariavel(grammar_fileParser.DeclaracaoVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(grammar_fileParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(grammar_fileParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoFuncao(grammar_fileParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoFuncao(grammar_fileParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(grammar_fileParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(grammar_fileParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(grammar_fileParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(grammar_fileParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(grammar_fileParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(grammar_fileParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(grammar_fileParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(grammar_fileParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(grammar_fileParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(grammar_fileParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(grammar_fileParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(grammar_fileParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#estruturaControle}.
	 * @param ctx the parse tree
	 */
	void enterEstruturaControle(grammar_fileParser.EstruturaControleContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#estruturaControle}.
	 * @param ctx the parse tree
	 */
	void exitEstruturaControle(grammar_fileParser.EstruturaControleContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#caseLista}.
	 * @param ctx the parse tree
	 */
	void enterCaseLista(grammar_fileParser.CaseListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#caseLista}.
	 * @param ctx the parse tree
	 */
	void exitCaseLista(grammar_fileParser.CaseListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#caseDecl}.
	 * @param ctx the parse tree
	 */
	void enterCaseDecl(grammar_fileParser.CaseDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#caseDecl}.
	 * @param ctx the parse tree
	 */
	void exitCaseDecl(grammar_fileParser.CaseDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#declaracaoEstrutura}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoEstrutura(grammar_fileParser.DeclaracaoEstruturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#declaracaoEstrutura}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoEstrutura(grammar_fileParser.DeclaracaoEstruturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(grammar_fileParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(grammar_fileParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#arrayinicializacao}.
	 * @param ctx the parse tree
	 */
	void enterArrayinicializacao(grammar_fileParser.ArrayinicializacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#arrayinicializacao}.
	 * @param ctx the parse tree
	 */
	void exitArrayinicializacao(grammar_fileParser.ArrayinicializacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogica(grammar_fileParser.ExpressaoLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogica(grammar_fileParser.ExpressaoLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(grammar_fileParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(grammar_fileParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(grammar_fileParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(grammar_fileParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoMultiplicativa(grammar_fileParser.ExpressaoMultiplicativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoMultiplicativa(grammar_fileParser.ExpressaoMultiplicativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#expressaoUnaria}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoUnaria(grammar_fileParser.ExpressaoUnariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#expressaoUnaria}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoUnaria(grammar_fileParser.ExpressaoUnariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#expressaoPostfix}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoPostfix(grammar_fileParser.ExpressaoPostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#expressaoPostfix}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoPostfix(grammar_fileParser.ExpressaoPostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(grammar_fileParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(grammar_fileParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#expressaoLista}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLista(grammar_fileParser.ExpressaoListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#expressaoLista}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLista(grammar_fileParser.ExpressaoListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammar_fileParser#primaria}.
	 * @param ctx the parse tree
	 */
	void enterPrimaria(grammar_fileParser.PrimariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammar_fileParser#primaria}.
	 * @param ctx the parse tree
	 */
	void exitPrimaria(grammar_fileParser.PrimariaContext ctx);
}