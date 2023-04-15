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
public class Dia8Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         int valor =0 ;
      int num1 = sc.nextInt();
      
      System.out.println("Ingrese el segundo número: ");
     int num2 = sc.nextInt();
  
         System.out.println("Ingrese 1 para suma ");
         System.out.println("Ingrese 2 para resta ");
         System.out.println("Ingrese 3 para division ");
         System.out.println("Ingrese 4 para multi ");
        int op=sc.nextInt();
     switch(op){
            case 1:
               
                valor=suma(num1 , num2);
                System.out.println("la suma es "+valor);
                break;
            case 2:
               valor= resta (num1 , num2);
               System.out.println("la resta es "+valor);
                break;
            case 3:
             valor=div(num1 , num2);
             System.out.println("la division  es "+valor);
                break;
            case 4:
                valor= multi(num1 , num2);
                System.out.println("la multipicacion es "+valor);
                break;
            
            default:
                System.out.println("El numero ingresado no está todavia en nuestro programa");
        }            
         
        
    }
    
    public static int suma(int num1 , int num2){
        int sumado=num1+num2;
        return sumado;
        }
    public static int resta (int num1 , int num2){
        int sumado=num1 - num2;
        return sumado;
        }
    public static int div(int num1 , int num2){
        int sumado=num1/num2;
        return sumado;
        }
    public static int multi(int num1 , int num2){
        int sumado=num1+num2;
        return sumado;
        }
    
}
