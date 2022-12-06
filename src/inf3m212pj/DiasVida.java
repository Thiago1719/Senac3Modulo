/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import java.util.Scanner;

/**
 *
 * @author 181810045
 */
public class DiasVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         float idade, diasvida;
        Scanner leia  = new Scanner(System.in);
        System.out.println("DiasVida");
        System.out.print("Informe sua Idade: ");
        idade = leia.nextFloat();
        diasvida =  (idade*365);   
        System.out.println("Já viveu: " + diasvida + "dias");
  
    }
    
}
