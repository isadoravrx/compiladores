from ply import yacc
from lexer import tokens


# todas as Regras de produção
def p_programa(p):
    '''
    programa : declaracao
    '''


def p_term(p):
    '''
    term : term TIMES factor
         | term DIVIDE factor
         | factor
    '''
   
def p_factor(p):
    '''
    factor : NUMBER
           | LPAREN expression RPAREN
    '''
   
# Manipulador de erros
def p_error(p):
    print("Erro de sintaxe")

# Criar o analisador sintático
parser = yacc.yacc()
