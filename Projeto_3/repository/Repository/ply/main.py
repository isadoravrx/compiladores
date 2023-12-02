from lexer import lexer
from parser_1 import parser

def main():
    data = "int x = 2;"
    lexer.input(data)
    result = parser.parse(data, lexer=lexer)

    #data em lista split de \n
    #passa pela lista, e ao inves de input data, passa posicao lista
    #variavel global no sintatico e funcao, sempre que for pra outra linha, variavel++
    #sempre que dá erro, printa linha(na funcao)
if __name__ == "__main__":
    main()
