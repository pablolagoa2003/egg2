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
public class dia8ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero ");
        int num=leer.nextInt();
        boolean bandera=primo(num);
        if (bandera==true){
            System.out.println("el numero: "+num+ " es primo ");
            
       }else {
            System.out.println("el numero: "+num+ " no es primo ");
        }   
    }
    public static boolean primo (int num){
        boolean f =true;
        for (int i = 2; i < num; i++) {
            if ((num%i)==0 && f==true ) {
                f=false;   
            } 
        }
        return f ;
    }
}
