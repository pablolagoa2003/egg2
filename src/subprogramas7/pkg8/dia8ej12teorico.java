/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramas7.pkg8;
import java.util.Scanner;

public class dia8ej12teorico {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero ");
        int num1=leer.nextInt();
        System.out.println("ingrese  el segundo numero ");
        int num2=leer.nextInt();
        
        EsMultiplo(num1 , num2);
    }
    public static void EsMultiplo(int num1 , int num2){
        if ((num1%num2)==0) {
            System.out.println("el numero " +num1+ " es multiplo de " +num2);
        }else  {
          System.out.println("el numero " +num1+ " no es multiplo de " +num2);  
        }                     
    }
}
