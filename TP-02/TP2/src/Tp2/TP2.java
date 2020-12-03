package Tp2;
import java.util.ArrayList;

/**
 *
 * @author Beatriz
 */
public class TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int estadoInicial [][]={{4,1,3},{7,2,5},{8,6,0}};
         Estado e = new Estado(estadoInicial);
          e.printEstado();
        
        No noInicial = new No(e,0,-1);
          Profundidade profundidade = new Profundidade();
          profundidade.busca(noInicial);
      
          Aestrela ae = new Aestrela();
          ae.busca(noInicial);
              
       
    }
    
}
