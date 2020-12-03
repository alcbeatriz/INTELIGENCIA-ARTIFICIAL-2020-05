package Tp2;

import java.util.ArrayList;
import java.util.PriorityQueue;
/*import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Beatriz
**/
public class Aestrela {
    
private PriorityQueue<No> fronteira = new PriorityQueue<>();
private ArrayList<No> removidosNo = new ArrayList<>();
    public Aestrela() {
    }
    
    public void busca(No noInicial){
                //Inserir no inicial na fronteira
        noInicial.setHeuristica(noInicial.funcaoHeuristica());
        fronteira.add(noInicial);
        No no = new No();
        ArrayList<No> sucessores = new ArrayList();
        int indice;
        
               //Enquanto a fronteira não estiver vazia..
        while(!fronteira.isEmpty()){
              //no = remover na fronteira
              no = fronteira.poll();
            
            this.removidosNo.add(no);
            indice = this.removidosNo.size()-1;
            
            
            
              //Testar se o no é objetivo
            if(no.getEstado().EhObjetivo()){
                imprimeCaminho(no);
                return;
            }
                     
                
                  //Gerar sucessores do no
            sucessores = no.GeraSucessores(indice);
            
                 //Inserir sucessores na fronteira
            fronteira.addAll(sucessores);
            }
            
       
    
    }
    
    private void imprimeCaminho(No objetivo){
        if(objetivo.getPai()!= -1)
            imprimeCaminho(removidosNo.get(objetivo.getPai()));
        objetivo.getEstado().printEstado();
    }
    
    public void caminho(No no){
        No aux = new No();
        aux.printNo();
        
        while (aux.getPai()!= -1) {            
            aux = removidosNo.get(aux.getPai());
            aux.printNo();
        }
    
    }
    
    public PriorityQueue<No> getFronteira() {
        return fronteira;
    }

    public void setFronteira(PriorityQueue<No> fronteira) {
        this.fronteira = fronteira;
    }

    public ArrayList<No> getRemovidosNo() {
        return removidosNo;
    }

    public void setRemovidosNo(ArrayList<No> removidosNo) {
        this.removidosNo = removidosNo;
    }
}

