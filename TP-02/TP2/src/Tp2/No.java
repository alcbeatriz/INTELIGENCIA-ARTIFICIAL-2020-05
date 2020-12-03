package Tp2;

import java.util.ArrayList;

/**
 *
 * @author Beatriz
 */
public class No implements Comparable<No> {
    private Estado estado; 
    private int profundidade;
    private int pai;
    private int heuristica;
    private double funcaoAvaliacao;
    private int heuristicaManhattan;

    public No(Estado estado, int profundidade, int pai) {
        this.estado = estado;
        this.profundidade = profundidade;
        this.pai = pai;
        funcaoHeuristica();
        this.funcaoAvaliacao = this.heuristica + this.profundidade;
        
                   

}
    public No() {
       
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(int profundidade) {
        this.profundidade = profundidade;
    }

    public int getPai() {
        return pai;
    }

    public void setPai(int pai) {
        this.pai = pai;
    }

    public double getFuncaoAva() {
        return funcaoAvaliacao;
    }

    public void setFuncaoAva(double funcaoAva) {
        this.funcaoAvaliacao = funcaoAvaliacao;
    }

    public int getHeuristicaManhattan() {
        return heuristicaManhattan;
    }

    public void setHeuristicaManhattan(int heuristicaManhattan) {
        this.heuristicaManhattan = heuristicaManhattan;
    }

    

    public double getHeuristica() {
        return heuristica;
    }

    public void setHeuristica(int heuristica) {
        this.heuristica = heuristica;
    }

    public double getFuncaoAvaliacao() {
        return funcaoAvaliacao;
    }

    public void setFuncaoAvaliacao(double funcaoAvaliacao) {
        this.funcaoAvaliacao = funcaoAvaliacao;
    }


     public ArrayList<No> GeraSucessores(int pai) {
        ArrayList<No> sucessores = new ArrayList<>();
        Estado e;
        No noSucessor;
       
        e = this.estado.GeraSucessor('d'); 
        if (e != null) {
            noSucessor = new No(e,this.profundidade+1, pai);
            sucessores.add(noSucessor);
        }
       
        e = this.estado.GeraSucessor('e'); 
        if (e != null) {
            noSucessor = new No(e,this.profundidade+1, pai);
            sucessores.add(noSucessor);
        }
        
        e = this.estado.GeraSucessor('c'); 
        if (e != null) {
            noSucessor = new No(e,this.profundidade+1, pai);
            sucessores.add(noSucessor);
        }
        
        e = this.estado.GeraSucessor('b'); 
        if (e != null) {
            noSucessor = new No(e,this.profundidade+1, pai);
            sucessores.add(noSucessor);
        }

        return sucessores;
    }
     
       @Override
    public int compareTo(No no){
        if(this.getFuncaoAvaliacao() > no.getProfundidade())
            return 1;
        else if(this.getFuncaoAvaliacao() < no.getProfundidade())
            return -1;
        else return 0;
    
    
    }
    
         public void printNo(){
        System.out.println("Estado: ");
        this.estado.printEstado();
        System.out.println("Pai: " + this.pai);
        System.out.println("Profundidade: " + this.profundidade);
    
    }
     
      public int funcaoHeuristica() {
        int heuristica = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.estado.getMatriz()[i][j] != this.estado.objetivo[i][j]) {
                    heuristica++;
                }
            }
        }
        return heuristica;
    }
      
      public int funcaoManhattan(){
          int heuristicaManhattan = 0;
          for (int i=0; i < 3; i++){
              for (int j=0; j < 3; j++) {
                  if(this.estado.getMatriz()[i][j]!=this.estado.objetivo[i][j]){
                      for( int m=0; m <3; m++){
                          for(int n=0; n<3; n++){
                              if(this.estado.getMatriz()[i][j] == this.estado.objetivo[m][n])
                                   heuristicaManhattan = (Math.abs(i-m)) + (Math.abs(j-n));
                                  
                                    
                      
                          }
                  }
                      
             }
              
          }
      }
           return heuristicaManhattan;
  
}
   
}

