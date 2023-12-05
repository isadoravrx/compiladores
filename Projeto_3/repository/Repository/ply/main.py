from lexer import lexer
from parser_1 import parser
import parser_1


def main():
    data = ""
    with open('data2.txt', 'r') as arquivo:
        data = arquivo.read()

    codigo = [linha.strip() for linha in data.split('\n')]

    for i in codigo:
        lexer.input(i)
        parser_1.incrementar(i)
        result = parser.parse(i, lexer=lexer)

if __name__ == "__main__":
    main()
