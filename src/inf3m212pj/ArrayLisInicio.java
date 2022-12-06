/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 181810045
 */
public class ArrayLisInicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("ArrayList Vazia");
        System.out.println(nomes.isEmpty());

        System.out.println("tamanho do Array: " + nomes.size());
        nomes.add("Billy");
        System.out.println("Tamanho do Array: " + nomes.size());

        System.out.print("Digite um nome: ");
        nomes.add(leia.next());
        System.out.println("Tamanho do Array: " + nomes.size());

        System.out.println(nomes.toString());
        System.out.println("Add Lewis Hamilton no indice 0");
        nomes.add(0, "Lewis Hamilton");
        System.out.println("Tamanho do Array: " + nomes.size());

        System.out.println(nomes.toString());
        System.out.println("Add  Felipe Massa no indice 3");
        nomes.add(3, "Felipe Massa");
        System.out.println("Tamanho do Array: " + nomes.size());

        System.out.println("Remove Indice 1");
        nomes.remove("1");
        System.out.println("Tamanho do Array: " + nomes.size());
        System.out.println(nomes.toString());

        System.out.println("Impressão do Array");
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        System.out.println("ArrayList Vazia");
        System.out.println(nomes.isEmpty());

        System.out.println("Index do Felipe Massa é" + nomes.indexOf("Felipe Massa"));

        System.out.println("Ordenação de Array");
        nomes.add("Charles Leclerc");
        nomes.add("Pierry Gasly");
        nomes.add("George Russel");
        nomes.add("Mick Schumacher");
        nomes.add("Valtteri Bottas");
        nomes.add("Carlos Sainz");
        nomes.add("Lando Norris");
        System.out.println("Sem ordenação:" + nomes.toString());

        Collections.sort(nomes);
        System.out.println("Ordenado: " + nomes.toString());

        Collections.reverse(nomes);
        System.out.println("Ordenado Reversa " + nomes.toString());

    }

}
