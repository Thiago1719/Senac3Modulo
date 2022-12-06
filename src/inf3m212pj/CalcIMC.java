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
public class CalcIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         float altura, peso,  imc;
        Scanner leia  = new Scanner(System.in);
        System.out.println("IMC");
        System.out.print("Informe sua Altura: ");
        altura = leia.nextFloat();
        System.out.print("Informe ao seu Peso: ");
        peso = leia.nextFloat();
        imc =  peso/ (altura * altura);
        System.out.printf("Seu IMC foi de: %.2f" , imc);
        if (imc <18.5) {
            System.out.println("Abaixo do Peso");
        }else if (imc<24.9) {
            System.out.println("Saudável");           
        }else if (imc<29.9){
            System.out.println("SobrePeso");
        }else if(imc<34.9){
            System.out.println("Obesidade Grau 1");
         }else if(imc<39.9){
           System.out.println("Obesidade Grau 2");
       }else{
           System.out.println("Obesidade Grau 3");
       }
    }
}
