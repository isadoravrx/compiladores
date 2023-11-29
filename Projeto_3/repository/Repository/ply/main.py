from lexer import lexer
from parser import parser

def main():
    data = "2 * (3 + 4)"
    lexer.input(data)
    result = parser.parse(data, lexer=lexer)
    print(f"Resultado da expressão: {result}")

if __name__ == "__main__":
    main()
