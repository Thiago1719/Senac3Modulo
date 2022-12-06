/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 181810045
 */
public class NotasEscolaresArrayListMenu {
    static ArrayList <String> alunosA =new ArrayList <>();
    static String alunos[];
    static float notas[][];
    static int nAlunos, nNotas, contAlunos;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        System.out.println("Notas Escolares Matriz");
        System.out.print("Qauntos Alunos:");
        nAlunos = (int) leiaFloat();
        System.out.print("Qauntas Notas:");
        nNotas = (int) leiaFloat();
        int opM;

        alunos = new String[nAlunos];
        notas = new float[nAlunos][nNotas + 1];

        do {
            menu();
            opM = (int) leiaFloat();
            switch (opM) {
                case 1:
                    insertAlunoNotas();
                    break;
                case 2:
                    imprimirAlunosNotas();
                    break;
                case 0:
                    System.out.println("Aplicação encerrada pelo Usário");
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente");
                    break;

            }

        } while (opM != 0);

        for (int i = 0; i < nAlunos; i++) {
            System.out.println("Nome do Aluno");
            alunos[i] = leia.next();
            for (int j = 0; j < nNotas; j++) {
                do {
                    System.out.print("\tDigite a " + (j + 1) + " ° nota");
                    notas[i][j] = leiaFloat();
                    if (validaNota(notas[i][j])) {
                        System.out.println("Nota Inválida, tente novamente");

                    }
                } while (validaNota(notas[i][j]));
                notas[i][nNotas] += notas[i][j];
            }
            notas[i][nNotas] = notas[i][nNotas] / nNotas;

        }

        System.out.println("\n -- Resultado --\n");
        for (int i = 0; i < nAlunos; i++) {
            System.out.printf(alunos[i] + " sua média foi de %.2f", notas[i][nNotas]);
            if (notas[i][nNotas] >= 7) {
                System.out.println("Você está aprovado");
            } else {
                System.out.println("Você está Reprovado");
            }

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

    public static void menu() {
        System.out.println("1 - Inserir notas do Alunos");
        System.out.println("2 - Imprimir Notas:");
        System.out.print("0 - Sair");
        System.out.print("Digite Aqui:");

    }

    public static void insertAlunoNotas() {
        Scanner leia = new Scanner(System.in);
        if (contAlunos < nAlunos) {
            System.out.println("Nome do Aluno");
            alunos[contAlunos] = leia.next();
            for (int j = 0; j < nNotas; j++) {
                do {
                    System.out.print("\tDigite a " + (j + 1) + " ° nota");
                    notas[contAlunos][j] = leiaFloat();
                    if (validaNota(notas[contAlunos][j])) {
                        System.out.println("Nota Inválida, tente novamente");

                    }
                } while (validaNota(notas[contAlunos][j]));
                notas[contAlunos][nNotas] += notas[contAlunos][j];
            }
            notas[contAlunos][nNotas] = notas[contAlunos][nNotas] / nNotas;
            contAlunos++;
        } else {
            System.out.println("Não é possivel lançar notasl"
                    + "\nTodas posições ocupadas");
        }
    }

    public static void imprimirAlunosNotas() {
        System.out.println("\n -- Resultado --\n");
        for (int i = 0; i < contAlunos; i++) {
            System.out.printf(alunos[i] + " sua média foi de %.2f", notas[i][nNotas]);
            if (notas[i][nNotas] >= 7) {
                System.out.println("Você está aprovado");
            } else {
                System.out.println("Você está Reprovado");
            }

        }

    }

}
