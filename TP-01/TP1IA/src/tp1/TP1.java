package tp1;

/**
 *
 * @author Beatriz
 */
public class TP1 {

    /**
     * @param args the command line arguments
    **/  
    public static void main(String[] args) {
        int estadoInicial [][]={{7,2,4},{5,0,6},{8,3,1}};
        Estado e = new Estado(estadoInicial);
          e.printEstado();
          Estado sucessor = e.GeraSucessor('b');
        System.out.println();
         sucessor.printEstado();
     
}
}

