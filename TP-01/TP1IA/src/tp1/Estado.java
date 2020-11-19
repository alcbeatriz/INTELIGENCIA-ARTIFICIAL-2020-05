package tp1;

import java.io.IOException;

/**
 *
 * @author Beatriz
 */
public class Estado {
    private int matriz[][];
    private int linhaVazia;
    private int colunaVazia;
    public final int objetivo[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 0}};
    
    public Estado(int matriz[][]) {
        this.matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.matriz[i][j] = matriz[i][j];
                if (this.matriz[i][j] == 0) {
                    this.linhaVazia = i;
                    this.colunaVazia = j;
                }
            }
        }
    }

    public Estado() {
    }

    public int[][] getMatriz() {
        return matriz;
    }
    

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int getLinhaVazia() {
        return linhaVazia;
    }

    public void setLinhaVazia(int linhaVazia) {
        this.linhaVazia = linhaVazia;
    }

    public int getColunaVazia() {
        return colunaVazia;
    }

    public void setColunaVazia(int colunaVazia) {
        this.colunaVazia = colunaVazia;
    }

   
    public void imprimir() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
                System.out.println("");
        }
                System.out.println();
       
    }
    
    public boolean EhObjetivo(int mat[][]){
        int objetivo[][] = {{1,2,3},{4,5,6},{7,8,0}};
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++)
                if(this.matriz[i][j] != objetivo[i][j]){
                    return false;
            }
        }
        return true;
    }
     
    public Estado GeraSucessor(char movimento){
        Estado eSucessor = new Estado(this.getMatriz());
        int x,y;
        switch(movimento){
            case 'e':
                x=eSucessor.linhaVazia;
                y=eSucessor.colunaVazia-1;
                if(y<0) return null;
                eSucessor.matriz[eSucessor.linhaVazia][eSucessor.colunaVazia]=
                eSucessor.matriz[x][y];
                eSucessor.matriz[x][y]= 0;
                eSucessor.colunaVazia = y;
                return eSucessor;
                
            case 'd':
                x=eSucessor.linhaVazia;
                y=eSucessor.colunaVazia+1;
                if(y>2) return null;
                eSucessor.matriz[eSucessor.linhaVazia][eSucessor.colunaVazia]=
                eSucessor.matriz[x][y];
                eSucessor.matriz[x][y]= 0;
                eSucessor.colunaVazia = y;
                return eSucessor;
            
            case 'c':
                x=eSucessor.linhaVazia-1;
                y=eSucessor.colunaVazia;
                if(x<0) return null;
                eSucessor.matriz[eSucessor.linhaVazia][eSucessor.colunaVazia]=
                eSucessor.matriz[x][y];
                eSucessor.matriz[x][y]= 0;
                eSucessor.linhaVazia = x;
                return eSucessor;
           
            case 'b':
                x=eSucessor.linhaVazia+1;
                y=eSucessor.colunaVazia;
                if(x>2) return null;
                eSucessor.matriz[eSucessor.linhaVazia][eSucessor.colunaVazia]=
                eSucessor.matriz[x][y];
                eSucessor.matriz[x][y]= 0;
                eSucessor.linhaVazia = x;
                return eSucessor;
        }
       
        return null;
        
    }
    
    //confere e printa o estado em forma de matriz
    public void printEstado(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                 System.out.print(this.matriz[i][j] + "  ");
    }
    System.out.println();
    }
   
    System.out.println("Linha Vazia: " + this.linhaVazia);
    
    System.out.println("Coluna Vazia: " + this.colunaVazia);
}
 
}

