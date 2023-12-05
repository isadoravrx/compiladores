from ply import yacc
from lexer import tokens
                                        #falta colocar as estrelas

row = 0
s = ""
# Regras de produção
def p_programa(p):
    """
    programa : declaracao
            | declaracao programa
            | RCHAVE
            | LCHAVE
            | expressao
            | RCHAVE PONTOV
    """


def p_declaracao(p):
    """
    declaracao : declaracaoVariavel
                | declaracaoFuncao
                | declaracaoEstrutura
                | comentario
                | estruturacontrole
    """


def p_declaracaoVariavel(p): 
    """
    declaracaoVariavel : TIPO ID PONTOV
                        | TIPO ID EQUALS expressao PONTOV
                        | TIPO array PONTOV
                        | TIPO array EQUALS TEXTO PONTOV  
    """

def p_declaracaoFuncao(p):
    """
    declaracaoFuncao : TIPO ID LPAREN parametros RPAREN bloco
    """


def p_parametros(p):
    """
    parametros : parametro
                | parametro VIRGULA parametros
    """

def p_parametro(p):
    """
    parametro :  TIPO ID
                | TIPO ID LCOCHETES RCOCHETES
                | TIPO RETIC ID
    """

def p_bloco(p):
    """
    bloco : LCHAVE declaracao RCHAVE
            | LCHAVE
            | STRUCT ID LCHAVE
    """


def p_comentario(p):
    """
    comentario : COMENTARIO
    """


def p_expressao(p):
    """
    expressao : expressaoLogica
                | atribuicao 
                | estruturacontrole   
                | expressaoAritmetica     
                | bloco  
    """

def p_atribuicao(p):
    """
        atribuicao : ID EQUALS expressao PONTOV
                    | ID MAISIGUAL expressao PONTOV
                    | ID MENOSIGUAL expressao PONTOV
                    | ID VEZESIGUAL expressao PONTOV
                    | ID BARRAIGUAL expressao PONTOV
                    | ID MODIGUAL expressao PONTOV 
                    | ID ANDIGUAL expressao PONTOV
                    | ID ORIGUAL expressao PONTOV
    """

def p_estruturacontrole(p):
    """
    estruturacontrole : IF LPAREN expressao RPAREN bloco
                     | IF LPAREN expressao RPAREN bloco ELSE bloco
                     | RCHAVE ELSE LCHAVE
                     | WHILE LPAREN expressao RPAREN bloco
                     | FOR LPAREN expressao PONTOV expressao PONTOV expressao RPAREN bloco
                     | SWITCH LPAREN expressao RPAREN caseLista
                     | BREAK PONTOV
                     | CONTINUE PONTOV
                     | RETURN expressao PONTOV
    """

def p_case_lista(p):
    """
    caseLista : case_decl caseLista
              | 
    """

def p_case_decl(p):
    """
    case_decl : CASE expressao DOISPONTOS bloco
             | DEFAULT DOISPONTOS bloco
    """

def p_declaracaoEstrutura(p):
    """
    declaracaoEstrutura : LCHAVE declaracaoVariavel RCHAVE PONTOV
    """

def p_array(p):
    """array : ID LCOCHETES expressao RCOCHETES
               | ID LCOCHETES RCOCHETES
    """



def p_expressaoLogica(p):
    """
    expressaoLogica : expressaoRelacional
                    | expressaoLogica AND expressaoRelacional
                    | expressaoLogica OR expressaoRelacional
                    | EXCLAMACAO expressaoRelacional
                    | ID MAIOR ID
                    | ID MENOR ID
                    | ID MAIORIGUAL ID
                    | ID MENORIGUAL ID
                    | ID DIFERENTE ID
                    | ID IGUALIGUAL ID
                    | ID MAIOR NUM_INT
                    | ID MENOR NUM_INT
                    | ID MAIORIGUAL NUM_INT
                    | ID MENORIGUAL NUM_INT
                    | ID DIFERENTE NUM_INT
                    | ID IGUALIGUAL NUM_INT
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



def p_expressaoAritmetica(p):
    """
    expressaoAritmetica : expressaoMultiplicativa
                        | expressaoMultiplicativa PLUS expressaoMultiplicativa
                        | expressaoMultiplicativa MINUS expressaoMultiplicativa
                        | 
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
                    | MAISMAIS expressaoPostfix PONTOV
                    | MENOSMENOS expressaoPostfix PONTOV
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
            | TEXTO
            | LPAREN expressao RPAREN
    """

def incrementar(s1):
    global s 
    s = s1
    global row 
    row += 1

# Manipulador de erros
def p_error(p):
        global row
        print(f'Erro de sintaxe na linha {row} : "{s}"') 

# Criar o analisador sintático
parser = yacc.yacc()