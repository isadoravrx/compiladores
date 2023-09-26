import java.util.Scanner;
public class analisadorLexico{
    int[] num_int;
    double[] num_dec;
    String[] id;
    String[] constantes_de_texto;
    String[] palavras_reservadas;
    String[] operadores;
    String[] simbolos_especiais;

    //primeiro problema : como saber onde acaba um comentário
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        String temp = "";
        for(int i = 0; i < s.length(); i++){
            temp += s[i];
            if(s.substring(i, i) != " "){
                verificar(temp);
            }
        }
    }

    private static void verificar() {

    }
}