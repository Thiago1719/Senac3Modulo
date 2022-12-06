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
public class NotasEscolaresVetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leia = new Scanner(System.in);
        float Nnotas[] = new float[5];

        System.out.println("Notas Escolares");
        System.out.println("Quantas Notas a Inserir");
        int nNotas = (int) leiaFloat();
        float notas[] = new float[nNotas + 1];
        for (int i = 0; i < nNotas; i++) {
            do {
                System.out.print("Informe a " + (i + 1) + "° nota: ");
                notas[i] = leiaFloat();
                if (validaNota(notas[i])) {
                    System.out.println("Nota invalida");
                }
            } while (validaNota(notas[i]));
            notas[nNotas] += notas[i];

        }

        notas[nNotas] = notas[nNotas] / nNotas;
        System.out.printf("Sua média foi de %.2f", notas[nNotas]);
        if (notas[nNotas] >= 7) {
            System.out.println("\nVocê está Aprovado");
        } else {
            System.out.println("\nVocê está Reprovado");

        }
    }

    public static boolean validaNota(float nota) {
        return nota < 0 || nota > 10;

    }

    public static float leiaFloat() {
        Scanner leia = new Scanner(System.in);
        try {
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.print("Valor não é número, tente novamente: ");
            return leiaFloat();

        }
    }
}
