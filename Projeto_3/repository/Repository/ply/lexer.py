from ply import lex

# Lista de tokens
tokens = (
    'NUMBER',
    'PLUS',
    'MINUS',
    'TIMES',
    'DIVIDE',
    'LPAREN',
    'RPAREN',
    'PONTOV',
    'EQUALS',
    'VIRGULA',  
    'LCOCHETES',
    'RCOCHETES'
    'RETIC',
    'COMENTARIO',
    'MAISIGUAL'
    'MENOSIGUAL'
    'VEZESIGUAL'
    'BARRAIGUAL'
    'MODIGUAL',
    'ANDIGUAL',
    'ORIGUAL',
    'IGUAL',
    'DOISPONTOS', #:
    'LCHAVE',
    'RCHAVE',
    'AND',
    'OR',
    'EXCLAMACAO',
    'MAIOR',
    'MAIORIGUAL',
    'MENOR',
    'MENORIGUAL',
    'DIFERENTE',
    'IGUALIGUAL',
    'MOD',
    'MAISMAIS'
    'MENOSMENOS',
    'PONTO',
    'SETA',
    'IF',
    'WHILE',
    'FOR',
    'SWITCH',
    'CASE',
    'DEFAULT',
    'BREAK',
    'CONTINUE',
    'RETURN',
    'STRUCT',
    'ID'
)

#como vou identificar os ids?? E OS NUMEROS?? NUM INT E NUM DEC?? E TEXTOS??


# Regras para cada token
t_PLUS = r'\+'
t_MINUS = r'-'
t_TIMES = r'\*'
t_DIVIDE = r'/'
t_LPAREN = r'\('
t_RPAREN = r'\)'
t_PONTOV = r';'
t_EQUALS = r'='
t_VIRGULA = r','
t_LCOCHETES = r'\['
t_RCOCHETES = r'\]'
t_RETIC = r'\.\.\.'
t_MAISIGUAL = r'\+='
t_MENOSIGUAL = r'-='
t_VEZESIGUAL = r'\*='
t_BARRAIGUAL = r'/='
t_MODIGUAL = r'%='
t_ANDIGUAL = r'&&='
t_ORIGUAL = r'\|\|='
t_IGUAL = r'='
t_DOISPONTOS = r':'
t_LCHAVE = r'\{'
t_RCHAVE = r'\}'
t_AND = r'&&'
t_OR = r'\|\|'
t_EXCLAMACAO = r'!'
t_MAIOR = r'>'
t_MAIORIGUAL = r'>='
t_MENOR = r'<'
t_MENORIGUAL = r'<='
t_DIFERENTE = r'!='
t_IGUALIGUAL = r'=='
t_MOD = r'%'
t_MAISMAIS = r'\+\+'
t_MENOSMENOS = r'--'
t_PONTO = r'\.'
t_SETA = r'->'
t_IF = r'if'
t_WHILE = r'while'
t_FOR = r'for'
t_SWITCH = r'switch'
t_CASE = r'case'
t_DEFAULT = r'default'
t_BREAK = r'break'
t_CONTINUE = r'continue'
t_RETURN = r'return'
t_STRUCT = r'struct'


tip = {
    'int',  'float', 'double', 'char', 'boolean'
}

#com outras, retorna         E ISSO???? QUAIS AS OUTRAS QUE RETORNAVAM??

def t_ID(t):
    r'[a-zA-Z_][a-zA-Z0-9_]*'
    t.type = palavras_reservadas.get(t.value, 'ID')  # Verificar palavras reservadas
    return t

palavras_resevadas = {'if': 'IF','while': 'WHILE','for': 'FOR','switch': 'SWITCH',
    'case': 'CASE','default': 'DEFAULT','break': 'BREAK','continue': 'CONTINUE',
    'return': 'RETURN', 'struct': 'STRUCT',
}


# Regra para números            ISSO TA CERTO?????
def t_NUMBER(t):
    r'\d+'
    t.value = int(t.value)
    return t


def t_COMENTARIO(t):
    r'//.*|/\*.*?\*/'
    pass
    t.lexer.lineno += t.value.count("\n")
# Ignorar caracteres em branco
t_ignore = ' \t'

def t_newline(t): #conta as linhas
    r'\n+'
    t.lexer.lineno += t.value.count("\n")

# Regra pros erros
def t_error(t):
    print(f"Caracter inesperado'{t.value[0]}' at line {t.lineno}")
    t.lexer.skip(1)

# Criar o analisador léxico
lexer = lex.lex()
