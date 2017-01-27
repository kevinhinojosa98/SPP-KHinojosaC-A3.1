/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.khinojosac.a3.pkg1;
import java.util.Scanner;
/**
 *
 * @author Kevin Hinojosa
 */
public class SPPKHinojosaCA31 {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        int co, ca, op;
       
        co = solicitarDato("Cateto opuesto ");
        ca = solicitarDato("Cateto adyacente");
        op = operación (co, ca);
        
           
           // TODO code application logic here
    }
     public static int solicitarDato(String n) {
         int numero;
         Scanner teclado = new Scanner(System.in);
         System.out.println("Introduce el " + n );
         numero = teclado.nextInt();
         return numero;
         
     }
     public static int operación (int co, int ca){
         int R;
         R = (int) Math.pow(co, 2) + (int)Math.pow(ca, 2);
         System.out.println("Tu hipotenusa es = " + Math.sqrt(R));
         return R;
         
     }
    
}
