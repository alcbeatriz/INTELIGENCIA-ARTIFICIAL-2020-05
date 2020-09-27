/*
Faça um programa que leia 10 tarefas. Cada tarefa contém uma descrição
(string) e uma prioridade (inteiro de 0 a 5. Utilizar classe ou estrutura para
representar a tarefa). As tarefas devem ser inseridas em uma fila de prioridade.
O programa deve imprimir as tarefas na tela de acordo com a sua prioridade.
 */


import java.util.PriorityQueue;
import java.util.Scanner;

public class Questao06 {

  
    public static void main(String[] args) {
       
         Scanner entrada = new Scanner(System.in);
         PriorityQueue<Tarefa> priorityQueue = new PriorityQueue<Tarefa>();
         
         Tarefa t = new Tarefa();
         t.setDescricao("Tarefa de IA");
         t.setPriority(0);
         
    }
    
}
