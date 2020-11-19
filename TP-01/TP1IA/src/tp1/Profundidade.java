package tp1;
import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Beatriz
 */
public class Profundidade {
    private ArrayList<No> Lista = new ArrayList();
    private Stack<No> fronteira = new Stack();
    private ArrayList<No> removidosFronteira = new ArrayList<>();
    private final int limite = 5;
    
    public void BuscaProfundidade(){
        this.fronteira = new Stack<>();
		
		this.Lista = Lista;
    }
        
    public void busca(No noInicial){
        
               
         // Iserir no na fronteira
       fronteira.add(noInicial);
       No no = new No();
       ArrayList<No> sucessores = new ArrayList();
       
         // Enquanto a fronteira nao estiver vazia
       while (!fronteira.isEmpty()){
       
         // No = remover fronteira
         no = fronteira.pop();
          removidosFronteira.add(no);
         // Testar se o no é objetivo
         if(no.getEstado().EhObjetivo(no.getEstado().getMatriz())){
             
               System.out.println("É o objetivo!");
               caminho(no);
               return;
         }
          if (no.getProfundidade() < limite) {
                
                //gera sucessores e depois insere na fronteira
                fronteira.addAll(no.GeraSucessores(removidosFronteira.size() - 1));
                               
            }
         // Gerar sucessores do no
         sucessores = no.GeraSucessores(0);
            
         // Inserir sucessores na fronteira
       fronteira.addAll(sucessores); 
       
       //leva o no da lista 
       sucessores = no.GeraSucessores(fronteira.indexOf(no)); 
       
    }
       
    }
       public void caminho(No no){
           No aux = new No();
           aux.printNo();
          
           while(aux.getPai() != -1)

          aux = Lista.get(aux.getPai());
               aux.printNo();
       }
}

    


