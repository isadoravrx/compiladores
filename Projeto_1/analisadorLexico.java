import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class analisadorLexico {
	private int i = 0;
    public static void main(String[] args) {
        String input = "int main() {\r\n"
        		+ "    int num1 = 123;\r\n"
        		+ "    float num2 = 45.67;\r\n"
        		+ "    char letra = 'A';\r\n"
        		+ "    if (num1 > 100) {\r\n"
        		+ "        println(\"Número maior que 100\");\r\n"
        		+ "    }\r\n"
        		+ "    return 0;\r\n"
        		+ "}";

        List<String> PV = Arrays.asList("int", "float", "char", "boolean", "void", "if", "else", "for", "while", "scanf", "println", "main", "return");
        List<String> Op = Arrays.asList("+", "-", "*", "/", "=", ">", "<", "==", "!=", ">=", "<=", "%", "&&", "||", "!");
        List<String> simbolo = Arrays.asList(";", "{", "}", "(", ")", "[", "]", ",");
        List<String> palavrasReservadas = new ArrayList<>();
        List<String> operadores = new ArrayList<>();
        List<String> simbolosEspeciais = new ArrayList<>();
        List<String> decimais = new ArrayList<>();
        List<String> inteiros = new ArrayList<>();
        List<String> id = new ArrayList<>();
        List<String> textos = new ArrayList<>();
        
        String[] tokens = input.split("\\s+|(?<=[;])|(?=[;])|(?<=[,])|(?=[,])|(?<=[\\(\\)])|(?=[\\(\\)])|(?<=[\\[\\]])|(?=[\\[\\]])|(?<=[\\{\\}])|(?=[\\{\\}])|(?<=[+\\-/=><==!=>=<=%&&||!])|(?=[+;\\-/=><==!=>=<=%&&||!])");
   
        for (int i = 0; i < tokens.length; i++){
        	verificar(tokens);
        }
        for(int i = 0; i<= tokens.length -1; i++) {
        	System.out.println(tokens[i]);
        }
        for (String token : tokens) {
            if (!token.isEmpty()) {
                if (PV.contains(token)) {
                    palavrasReservadas.add(token);
                } else if (Op.contains(token)) {
                    operadores.add(token);
                } else if (simbolo.contains(token)) {
                    simbolosEspeciais.add(token);
                } else if (token.matches("\\d+\\.\\d+")) {
                    decimais.add(token);
                } else if (token.matches("\\d+")) {
                    inteiros.add(token);
                } else if (token.matches("\"[^\"]*\"")) {
                    textos.add(token);
                } else {
                    id.add(token);
                }
            }
        }

        System.out.println("Decimais: " + decimais);
        System.out.println("Inteiros: " + inteiros);
        System.out.println("Identificadores: " + id);
        System.out.println("Textos: " + textos);
        System.out.println("Palavras Reservadas: " + palavrasReservadas);
        System.out.println("Operadores: " + operadores);
        System.out.println("Símbolos Especiais: " + simbolosEspeciais);
    }
    public static void verificar(String[] tokens) {
    	 for (int i = 0; i < tokens.length; i++) {
    	        String parteAtual = tokens[i];
    	        if (parteAtual.startsWith("\"") && !parteAtual.endsWith("\"")) {
    	        		tokens[i] = tokens[i] + " " + tokens[++i];
    	        }
    	 }
    }
    public static void mudar(String[] tokens, int i) {
    	tokens[i++] = tokens[i+1+1];
    }
}