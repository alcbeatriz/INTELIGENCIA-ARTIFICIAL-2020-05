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


public class Questao03 {

    public static void main(String[] args) {
 
    int [][] matriz = new int [10][10]; //declaração da matriz 10x10
    Scanner entrada = new Scanner(System.in);
            // Entrada de Dados para preenchimento da matriz
        for(int l=0; l<matriz.length; l++){
            for(int c=0; c<matriz.length; c++){
                System.out.println("Informe um número para inserção na matriz: ");
                matriz[l][c]= entrada.nextInt();
            }
        }
        // Imprime a matriz
        for(int l=0; l<matriz.length; l++){
            for(int c=0; c<matriz.length; c++){
                System.out.print(matriz[l][c]+ " ");
            }
            System.out.println(" ");
        }
        
          
        
    }
    
}

