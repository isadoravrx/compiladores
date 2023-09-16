package Verificacao_ID;
import java.util.Scanner;
public class token{
    public static void token(){
        String text;
        int state = 0;
        boolean finalstate = false;
        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();

        while(Character.isLetter(text.charAt(0))){
            switch(state){
                case(0):
                    state = 1;
                case(1):
                    if(Character.isLetter(text.charAt(1)) || Character.isDigit((text.charAt(1)))){
                        state = 1;
                    }else{
                        state = 2;
                    }
                case(2):
                    finalstate = true;
                    break;
            }
        }

        if(finalstate == true){
            System.out.println("A sequência foi aceita!");
        }else{
            System.out.println("A sequência não foi aceita!");
        }
    }   
}