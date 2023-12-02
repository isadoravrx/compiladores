from lexer import lexer
from parser_1 import parser

def main():
    data = ""
    with open('data.txt', 'r') as arquivo:
        data = arquivo.read()

    codigo = [linha.strip() for linha in data.split('\n')]

    for i in codigo:
        lexer.input(i)
        result = parser.parse(i, lexer=lexer)
        
   
   
    #variavel global no sintatico e funcao, sempre que for pra outra linha, variavel++
    #sempre que dá erro, printa linha(na funcao)
if __name__ == "__main__":
    main()
