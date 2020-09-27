/*
 Faça um programa que leia 10 números, insira em uma pilha. O programa deve
remover os dados da pilha e imprimi-los na tela.
FIFO
métodos de uma pilha
-isEmpty() verifica se a pilha ta vazia ou nao
-size()retorna o tamanho
-pop()desempilhar
-push(valor); empilha
-top()visualiza o ultimo item empilhado
 */
package revisao01ia;

import java.util.Scanner;


public class Questao04 {
  
    public Object[] vetor;
    public int ponteiro;
  
    public Questao04() {
        
        this.ponteiro = -1;
        this.vetor = new Object[10];

    }
 
    public boolean isEmpty() {
 
        if (this.ponteiro == -1) {
            return true;
        }
        return false;
    }
 
    public int size() {
  
        if (this.isEmpty()) {
            return 0;
        }
        return this.ponteiro + 1;
    }
 
    public Object top() {
     
        if (this.isEmpty()) {
            return null;
        }
        return this.vetor[this.ponteiro];
    }
 
    public Object pop() {
       
        if (isEmpty()) {
            return null;
        }
        return this.vetor[this.ponteiro--];
    }
 
    public void push(Object valor) {
        if (this.ponteiro < this.vetor.length - 1) {
            this.vetor[++ponteiro] = valor;
        }
    }
 

    public static void main(String[] args) {
       
      Scanner entrada = new Scanner(System.in);
       
      System.out.println("Quantos números você deseja empilhar?");
      int tamanho=entrada.nextInt();
      
      Questao04 p = new Questao04();
      
      for(int i=0; i<tamanho; i++){
          System.out.println("Digite o numero a ser inserido na pilha:");
          p.push(entrada.nextInt());
      }
           System.out.println("A pilha é:")
            while (p.isEmpty() == false) {
              
            System.out.println(p.pop());
        }
    }
}