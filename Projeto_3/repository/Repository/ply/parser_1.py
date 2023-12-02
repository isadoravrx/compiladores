from ply import yacc
from lexer import tokens


# Regras de produção
def p_programa(p):
    """
    programa : declaracao
            | declaracao programa
    """


def p_declaracao(p):
    """
    declaracao : declaracaoVariavel
                | declaracaoFuncao
                | declaracaoEstrutura
                | comentario
    """


def p_declaracaoVariavel(p):
    """
    declaracaoVariavel : TIPO ID PONTOV
                        | TIPO ID EQUALS expressao PONTOV
                        | TIPO array PONTOV
                        | TIPO array EQUALS TEXTO PONTOV
    """


def p_array(p):
    """array : ID LCOCHETES RCOCHETES"""


def p_declaracaoFuncao(p):
    """
    declaracaoFuncao : TIPO ID LPAREN parametros RPAREN bloco
    """


def p_parametros(p):
    """
    parametros : PARAMETRO
                | PARAMETRO VIRGULA parametros
                | TIPO ID
                | TIPO ID LCOCHETES RCOCHETES
                | TIPO RETIC ID
    """


def p_comentario(p):
    """
    comentario : COMMENT
    """


def p_bloco(p):
    """
    bloco : LCHAVE declaracao RCHAVE
    """


def p_declaracaoEstrutura(p):
    """
    declaracaoEstrutura : LCHAVE declaracaoVariavel RCHAVE PONTOV
    """


def p_expressaoLogica(p):
    """
    expressaoLogica : expressaoRelacional
                    | expressaoLogica OR expressaoRelacional
                    | expressaoLogica AND expressaoRelacional
                    | EXCLAMACAO expressaoRelacional
    """

def p_expressaoRelacional(p):
    """
    expressaoRelacional : expressaoAritmetica
                        | expressaoAritmetica MAIOR expressaoAritmetica
                        | expressaoAritmetica MENOR expressaoAritmetica
                        | expressaoAritmetica MAIORIGUAL expressaoAritmetica
                        | expressaoAritmetica MENORIGUAL expressaoAritmetica
                        | expressaoAritmetica DIFERENTE expressaoAritmetica
                        | expressaoAritmetica IGUALIGUAL expressaoAritmetica
    """


def p_expressao(p):
    """
    expressao : expressaoLogica
    """


def p_expressaoAritmetica(p):
    """
    expressaoAritmetica : expressaoMultiplicativa
                        | expressaoMultiplicativa PLUS expressaoMultiplicativa
                        | expressaoMultiplicativa MINUS expressaoMultiplicativa
    """


def p_expressaoMultiplicativa(p):
    """
    expressaoMultiplicativa : expressaoMultiplicativa TIMES expressaoUnaria
                            | expressaoMultiplicativa DIVIDE expressaoUnaria
                            | expressaoMultiplicativa MOD expressaoUnaria
                            | expressaoUnaria

    """


def p_expressaoUnaria(p):
    """
    expressaoUnaria : expressaoPostfix
                    | MINUS expressaoPostfix
                    | PLUS PLUS expressaoPostfix
                    | MINUS MINUS expressaoPostfix
    """


def p_expressaoPostfix(p):
    """
    expressaoPostfix : primaria
                    | primaria LCOCHETES expressao RCOCHETES
                    | primaria LPAREN argumentos RPAREN
                    | primaria PONTO ID
                    | primaria SETA ID
    """


def p_argumentos(p):
    """
    argumentos :
    """


def p_primaria(p):
    """
    primaria : ID
            | NUM_INT
            | NUM_DEC
            | LPAREN expressao LPAREN
    """


# Manipulador de erros
def p_error(p):
    print(f"Erro de sintaxe: {p}")


# Criar o analisador sintático
parser = yacc.yacc()