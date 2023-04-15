/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramas7.pkg8;

/**
 *
 * @author pablo
 */
import java.util.Scanner;
public class Dia8Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Scanner leer = new Scanner(System.in);
       int bandera =0;
        
        do {
            
           nombre();
            System.out.println("desea seguir ingresando nombres Si/No"); 
    String Va = leer.nextLine();
    if(Va.equals("No")){

        bandera=1;
    }
      
            
            
        } while (bandera!= 1);
        
    }
    public static void nombre(){
       
      Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un nombre");
        String nom = leer.nextLine();
        System.out.println("ingrese la edad");
        int edad = leer.nextInt();
        if (edad>=18 ) {
            System.out.println(" nombre: " +nom+ "edad " +edad+ " es mayor ");
        
        }else {
            
            System.out.println(" nombre: " +nom+ "edad " +edad+ " es menor ");
        
        }
        
        
   
        
    }
}
