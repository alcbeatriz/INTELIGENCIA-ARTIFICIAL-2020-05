
package revisao01ia;
/**
 *
 * @author beatr
 */


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Questao05 {
    

    public static void main(String[] args) {
        
    Queue<Integer> fila= new LinkedList();
     Scanner entrada = new Scanner(System.in);
    
      System.out.println("Quantos números você deseja inserir na fila?");
      int max=entrada.nextInt();
     
      
      for(int i=0; i<max; i++){
          System.out.println("Informe o número a ser inserido na fila:?");
          fila.add(entrada.nextInt());
      }
       System.out.println("A fila é:")
      for(int i=0; i<max; i++){
          System.out.println(fila.poll()+" ");
      }
      }
    }
   
