/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramas7.pkg8;
import java.util.Scanner;

public class Dia8Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         double variable ;
          System.out.println("Ingrese el valor a cambiar ");
      int num1 = sc.nextInt();
      
      System.out.println("Ingrese la moneda libra / dolar / yen ");
     String moneda = sc.next();
 
     switch(moneda){
            case "libra" :
               variable=0.86;
              cambio(num1 , variable, moneda);
                break;
            case "dolar":
               variable=1.28611;
              cambio(num1 , variable, moneda);
                break;
            case "yen" :
          variable=129852;
              cambio(num1 , variable, moneda);
      
                break;
            default:
                System.out.println("El numero ingresado no está todavia en nuestro programa");
        }            
    }
  public static void cambio(int num1 , double variable, String moneda) {
   double conversion= num1*variable;
      System.out.println("EL cambio de " +moneda+ " a euro es " +conversion);
   
   }
   
}
