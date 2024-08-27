package com.mycompany.mavenprojectolamundomaisalgumascoisas;
import java.util.Scanner;
/**
 *
 * @author joped
 */
public class Mavenprojectolamundomaisalgumascoisaster {
    
    static void executafuncaonoterminal(){
        Scanner pegainformacao = new Scanner(System.in);
        System.out.println("Enter username");
        String teste = pegainformacao.nextLine();
        System.out.println("Seu nome é " +teste);
        String[] salvaosnomes = {"Joao pedro", "Marcos"};
        
    }
    
    static void todososwindows(){
        Scanner pegawindowsfavoritodousuario = new Scanner(System.in);
        System.out.println("Digite seu windows favorito e vamos julgar contamos com voce");
        String pegawindows = pegawindowsfavoritodousuario.nextLine();
        String todoswindows[] = {"Windows 7","Windows 8","Windows XP", "Windows 10", "Windows 11"};
        if(String pegawindows == String todoswindows[0]){
        for(int a; a < 10; a++){
            System.out.println("Voce e incrivel!");
        }
        }else{
                System.out.println("Vamos continuar o julgamento");
    }
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        executafuncaonoterminal();
        todososwindows();
    }
}
