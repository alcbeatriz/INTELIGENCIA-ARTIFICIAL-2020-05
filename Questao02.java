/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao01ia;

/**
 *
 * @author beatr
 */

import java.util.Scanner;

public class Questao02 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int n = 10; // tamanho do vetor
    int v[] = new int[n]; // declaração do vetor "v"
    int i; // índice ou posição

// Entrada de Dados
 
  for (i=0; i<n; i++) {
      System.out.printf("Informe o %2do. número do vetor: ", (i+1), n);
        v[i] = ler.nextInt(); 
    }
    // Imprime vetor
        System.out.println("\nO vetor é: ");
        for ( i = 0; i < v.length; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println();
    }
  }