import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class analisador_Lexico { //grupo : Isadora Vitória e Zhihang Lin
    public static void main(String[] args) throws Exception {
    	 String caminho = "/home/isadoravrx/compiladores/Projeto_1/in8.txt";
         String input;
        
        try {
            input = new String(Files.readAllBytes(Paths.get(caminho)));
            compiler(input);
        } catch (IOException io) {
            System.out.println("ERROR");
        }
    }
        public static void compiler(String input) throws Exception {
        List<String> PV = Arrays.asList("println","int", "float", "char", "boolean",
                    "void", "if", "else", "for", "while", "scanf",
                    "main", "return", "abstract","volatile",
                    "assert","break","byte","case","catch", "class",
                    "const","continue","default","do","double","extends",
                    "final","finally","goto","implements","import","instanceof","interface",
                    "long","native","new","packge","private","protected","public","short","static",
                    "strictfp","super","switch","synchronized","this","Scanner","throw","throws","transient","try","void");
        
        List<String> Op = Arrays.asList("+", "-", "*", "/", "=", ">", "<", "==", "!=", ">=", "<=", "%", "&&", "||", "!");
        List<String> simbolo = Arrays.asList(";", "{", "}", "(", ")", "[", "]", ",");
        List<String> palavrasReservadas = new ArrayList<>();
        List<String> operadores = new ArrayList<>();
        List<String> simbolosEspeciais = new ArrayList<>();
        List<String> decimais = new ArrayList<>();
        List<String> inteiros = new ArrayList<>();
        List<String> id = new ArrayList<>();
        List<String> textos = new ArrayList<>();
        
        String[] tokens = input.split("\\s+|(?<=[\r\n])|(?<=[;])|(?=[;])|(?<=[,])|(?=[,])|(?<=[\\(\\)])|(?=[\\(\\)])|(?<=[\\[\\]])|(?=[\\[\\]])|(?<=[\\{\\}])|(?=[\\{\\}])|(?<=[+\\-*/=><==!=>=<=%&&||!])|(?=[+;\\-*/=><==!=>=<=%&&||!])");
          /*
          \\s+ é para separar entre espaços
          \r\n é enter
           (?<=[;]) é um lookbehind, ele separa tudas as condições dentro do [] que vem depois da String
          (?=[]) é um lookhead, ele separa tudas as condições dentro do [] que vem antes da String 
          */
        
        int i;
        //Juntando Strings entre aspas duplas
        for (i = 0; i < tokens.length; i++) {
	        if (tokens[i].startsWith("\"") && !tokens[i].endsWith("\"")) {
	        	int k = i+1;
	        		while(!tokens[k].endsWith("\"")) {
	        			tokens[i] = tokens[i] + " " + tokens[k];
	        			tokens[k] = "";
	        			k++;
	        		}
	        		tokens[i] = tokens[i] + " " + tokens[k];
        			tokens[k] = "";
	        }
        }
      //Juntando Strings de comentarios múltiplas linhas
        for (i = 0; i < tokens.length; i++) {
	        if (tokens[i].startsWith("/") && !tokens[i].endsWith("/")) {
	        	int k = i+1;
	        		while(!tokens[k].endsWith("*/")) {
	        			tokens[i] = tokens[i] + " " + tokens[k];
	        			tokens[k] = "";
	        			k++;
	        		}
	        		tokens[i] = tokens[i] + " " + tokens[k];
        			tokens[k] = "";
	        		break;
	        }
        }
      //Juntando Strings de comentarios de linha
        for (i = 0; i < tokens.length; i++) {
	        if (tokens[i].startsWith("//")) {
	        	int k = i+1;
	        		while(!(tokens[k].equals(""))) {
	        			tokens[i] = tokens[i] + " " + tokens[k];
	        			tokens[k] = "";
	        			k++;
	        		}
	        		tokens[i] = tokens[i] + " " + tokens[k];
        			tokens[k] = "";
	        		break;
	        }
        }
        //imprimindo cada casa de vetor para checar se separou tudo que pedi corretamente
        //for(int j = 0; j<= tokens.length -1; j++) {
        	//System.out.println(tokens[j]);
        //}
        //verificando e armazenando os tokens em suas listas especificas
        for (String token : tokens) {
            if (!token.isEmpty()) {
            	if(token == ""){
            		continue;
            	}else if(token.startsWith("/*")) {
            		continue;
            	}else if(token.startsWith("//")) {
            		continue;
            	}else if (PV.contains(token)) {
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
                    if(istoken(token)){
                        id.add(token);
                    }else{
                        throw new Exception("lexema não identificado! Erro no código em " + token);
                    }
                }
            }
        }
      //exibindo cada lista 
        System.out.println("Decimais: " + decimais);
        System.out.println("Inteiros: " + inteiros);
        System.out.println("Identificadores: " + id);
        System.out.println("Textos: " + textos);
        System.out.println("Palavras Reservadas: " + palavrasReservadas);
        System.out.println("Operadores: " + operadores);
        System.out.println("Símbolos Especiais: " + simbolosEspeciais);
    }
    
    private static boolean istoken(String s){
        if(!Character.isLetter(s.charAt(0))){
            return false;
        }

        for(int i = 1; i < s.length(); i++){
            if(!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i))){
                return false;
            }
        }

        return true;
    }
}