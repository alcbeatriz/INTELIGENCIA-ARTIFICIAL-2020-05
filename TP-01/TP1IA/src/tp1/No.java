package tp1;

import java.util.ArrayList;

/**
 *
 * @author Beatriz
 */
public class No {
    private Estado estado; 
    private int profundidade;
    private int pai;

    public No(Estado estado, int profundidade, int pai) {
        this.estado = estado;
        this.profundidade = profundidade;
        this.pai = pai;
    }

    No() {
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

    
    
    public ArrayList<No> GeraSucessores(int pai){
        ArrayList sucessores = new ArrayList();
        Estado e;
        No noSuc;
    
        //Direita
        e = this.estado.GeraSucessor('d');
        if(e != null){
            noSuc = new No(e,pai,this.profundidade+1);
            sucessores.add(noSuc);
        }
            //Esquerda
        e = this.estado.GeraSucessor('e');
        if(e != null){
            noSuc = new No(e,pai,this.profundidade-1);
            sucessores.add(noSuc);
        }
            //Cima
            
            e = this.estado.GeraSucessor('c');
        if(e != null){
            noSuc = new No(e,pai,this.profundidade-1);
            sucessores.add(noSuc);
        }
        
        //baixo
        
           e = this.estado.GeraSucessor('b');
        if(e != null){
            noSuc = new No(e,pai,this.profundidade+1);
            sucessores.add(noSuc);
        }
  
    return sucessores;
    
}


    public void printNo(){
        System.out.println("Estado: ");
        this.estado.printEstado();
        System.out.println("Pai: " + this.pai);
        System.out.println("Profundidade: " + this.profundidade);
    
}

    }

 