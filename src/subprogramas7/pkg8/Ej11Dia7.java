/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramas7.pkg8;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Ej11Dia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa una frase ");
       String frase = leer.nextLine();
      
        
        frase = convertir(frase);
        
        System.out.println(frase);
    }
    
public static String convertir(String frase){
    String op;
    String fraseC="";
    for(int i=0;i<frase.length();i++){
        op=frase.substring(i, i+1);
     switch(op) {
     case "a": 
        op=  "@";
     break;
     case "e":
         op= "#";
     break;
     case "i": 
         op= "$";
     break;
     case "o":
        op=  "%";
     break;
     case "u":
         op=    "*";
     }
     fraseC = fraseC + op;
}
        return fraseC;
    

}
}

    

