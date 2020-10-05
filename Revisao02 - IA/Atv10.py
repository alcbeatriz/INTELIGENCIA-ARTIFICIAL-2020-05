#Dada o quebra-cabeça de 8 peças. Faça um programa que receba um estado do jogo e retorne
#todos estados subsequentes possíveis.
import copy



# Verifica se o jogador ganhou o jogo
def WinGame(aux):
    a = True
    if aux[0][0] != 0: a = False
    if aux[0][1] != 1: a = False
    if aux[0][2] != 2: a = False
    if aux[1][0] != 3: a = False
    if aux[1][1] != 4: a = False
    if aux[1][2] != 5: a = False
    if aux[2][0] != 6: a = False
    if aux[2][1] != 7: a = False
    if aux[2][2] != 8: a = False
    return a


# Verifica se os dois tabuleiros são iguais
def EqualGame(aux1, aux2):
    SeIgual = True
    for i in range(3):
        for j in range(3):
            if aux1[i][j] != aux2[i][j]:
                SeIgual = False
    return SeIgual


# Imprime o auxuleiro
def imprimir(aux):
    print('Profundidade do nó:', aux[3][0])
    print(aux[0])
    print(aux[1])
    print(aux[2])


def expandir(aux): 
    jogadas = []  
 
    if aux[1][1] == 0:
        # move pra baixo
        a = copy.deepcopy(aux)  
        a[1][1] = a[0][1]
        a[0][1] = 0
        a[3][0] = a[3][0] + 1  
        a[3][1] = aux  
        jogadas.append(a)
        # move pra direita
        a = copy.deepcopy(aux) 
        a[1][1] = a[1][0]
        a[1][0] = 0
        a[3][0] = a[3][0] + 1 
        a[3][1] = aux
        jogadas.append(a)
        # move pra esquerda
        a = copy.deepcopy(aux)  
        a[1][1] = a[1][2]
        a[1][2] = 0
        a[3][0] = a[3][0] + 1  
        a[3][1] = aux
        jogadas.append(a)
        # move pra cima
        a = copy.deepcopy(aux)  
        a[1][1] = a[2][1]
        a[2][1] = 0
        a[3][0] = a[3][0] + 1 
        a[3][1] = aux
        jogadas.append(a)
    # 2 se vazio esta no canto esquerdo superior
    elif aux[0][0] == 0:
        # move pra cima
        a = copy.deepcopy(aux)  
        a[0][0] = a[1][0]
        a[1][0] = 0
        a[3][0] = a[3][0] + 1  
        a[3][1] = aux
        jogadas.append(a)
        # move pra esquerda
        a = copy.deepcopy(aux)  
        a[0][0] = a[0][1]
        a[0][1] = 0
        a[3][0] = a[3][0] + 1  
        a[3][1] = aux
        jogadas.append(a)
    # 3 se vazio esta no canto direito superior
    elif aux[0][2] == 0:
        # move pra cima
        a = copy.deepcopy(aux)  
        a[0][2] = a[1][2]
        a[1][2] = 0
        a[3][0] = a[3][0] + 1  
        a[3][1] = aux
        jogadas.append(a)
        # move pra direita
        a = copy.deepcopy(aux)  
        a[0][2] = a[0][1]
        a[0][1] = 0
        a[3][0] = a[3][0] + 1 
        a[3][1] = aux
        jogadas.append(a)
    # 4 se vazio esta no canto inferior esquerdo
    elif aux[2][0] == 0:
        # move pra baixo
        a = copy.deepcopy(aux)  
        a[2][0] = a[1][0]
        a[1][0] = 0
        a[3][0] = a[3][0] + 1  
        a[3][1] = aux
        jogadas.append(a)
        # move pra esquerda
        a = copy.deepcopy(aux)  
        a[2][0] = a[2][1]
        a[2][1] = 0
        a[3][0] = a[3][0] + 1  
        a[3][1] = aux
        jogadas.append(a)
    # 5 se vazio esta no canto inferior direito
    elif aux[2][2] == 0:
        # move pra baixo
        a = copy.deepcopy(aux) 
        a[2][2] = a[1][2]
        a[1][2] = 0
        a[3][0] = a[3][0] + 1 
        a[3][1] = aux
        jogadas.append(a)
        # move pra direita
        a = copy.deepcopy(aux)  
        a[2][2] = a[2][1]
        a[2][1] = 0
        a[3][0] = a[3][0] + 1  
        a[3][1] = aux
        jogadas.append(a)
    # 6 se vazio esta no meio da linha de cima
    elif aux[0][1] == 0:
        # move pra cima
        a = copy.deepcopy(aux)  
        a[0][1] = a[1][1]
        a[1][1] = 0
        a[3][0] = a[3][0] + 1 
        a[3][1] = aux
        jogadas.append(a)
        # move pra direita
        a = copy.deepcopy(aux) 
        a[0][1] = a[0][0]
        a[0][0] = 0
        a[3][0] = a[3][0] + 1  
        a[3][1] = aux
        jogadas.append(a)
        # move pra esquerda
        a = copy.deepcopy(aux)  
        a[0][1] = a[0][2]
        a[0][2] = 0
        a[3][0] = a[3][0] + 1  
        a[3][1] = aux
        jogadas.append(a)
    # 7 se vazio esta no meio da linha de baixo
    elif aux[2][1] == 0:
        # move pra baixo
        a = copy.deepcopy(aux)  
        a[2][1] = a[1][1]
        a[1][1] = 0
        a[3][0] = a[3][0] + 1  
        a[3][1] = aux
        jogadas.append(a)
        # move pra direita
        a = copy.deepcopy(aux)  
        a[2][1] = a[2][0]
        a[2][0] = 0
        a[3][0] = a[3][0] + 1  
        a[3][1] = aux
        jogadas.append(a)
        # move pra esquerda
        a = copy.deepcopy(aux)  
        a[2][1] = a[2][2]
        a[2][2] = 0
        a[3][0] = a[3][0] + 1  
        a[3][1] = aux
        jogadas.append(a)
    # 8 se vazio esta no meio da coluna da esquerda
    elif aux[1][0] == 0:
        # move pra baixo
        a = copy.deepcopy(aux)  
        a[1][0] = a[0][0]
        a[0][0] = 0
        a[3][0] = a[3][0] + 1  
        a[3][1] = aux
        jogadas.append(a)
        # move pra cima
        a = copy.deepcopy(aux) 
        a[1][0] = a[2][0]
        a[2][0] = 0
        a[3][0] = a[3][0] + 1 
        a[3][1] = aux
        jogadas.append(a)
        # move pra esquerda
        a = copy.deepcopy(aux) 
        a[1][0] = a[1][1]
        a[1][1] = 0
        a[3][0] = a[3][0] + 1 
        a[3][1] = aux
        jogadas.append(a)
    # 9 se vazio esta no meio da coluna da direita
    elif aux[1][2] == 0:
        # move pra baixo
        a = copy.deepcopy(aux)  
        a[1][2] = a[0][2]
        a[0][2] = 0
        a[3][0] = a[3][0] + 1  
        a[3][1] = aux
        jogadas.append(a)
        # move pra cima
        a = copy.deepcopy(aux)  
        a[1][2] = a[2][2]
        a[2][2] = 0
        a[3][0] = a[3][0] + 1 
        a[3][1] = aux
        jogadas.append(a)
        # move pra direita
        a = copy.deepcopy(aux) 
        a[1][2] = a[1][1]
        a[1][1] = 0
        a[3][0] = a[3][0] + 1  
        a[3][1] = aux
        jogadas.append(a)

    # retorno do conjunto de jogadas
    return jogadas


def result(aux):
    print("\nAs jogadas foram:")
    pilha = []
    while (aux[3][1] != None):  # vai até o nó raiz
        pilha.append(aux)
        aux = aux[3][1]
    pilha.append(aux)
    while (len(pilha) > 0):
        temp = pilha.pop()
        imprimir(temp)



def heuristica(aux):
    a = 0
    if aux[0][0] != 0: a = a + 1
    if aux[0][1] != 1: a = a + 1
    if aux[0][2] != 2: a = a + 1
    if aux[1][0] != 3: a = a + 1
    if aux[1][1] != 4: a = a + 1
    if aux[1][2] != 5: a = a + 1
    if aux[2][0] != 6: a = a + 1
    if aux[2][1] != 7: a = a + 1
    if aux[2][2] != 8: a = a + 1
    return a


# Distancia Manhattan
def h2(aux):
    h = 0
    for i in range(3):
        for j in range(3):
            if (aux[i][j] == 0):
                h = h + abs(0 - i) + abs(0 - j)
            if (aux[i][j] == 1):
                h = h + abs(0 - i) + abs(1 - j)
            if (aux[i][j] == 2):
                h = h + abs(0 - i) + abs(2 - j)
            if (aux[i][j] == 3):
                h = h + abs(1 - i) + abs(0 - j)
            if (aux[i][j] == 4):
                h = h + abs(1 - i) + abs(1 - j)
            if (aux[i][j] == 5):
                h = h + abs(1 - i) + abs(2 - j)
            if (aux[i][j] == 6):
                h = h + abs(2 - i) + abs(0 - j)
            if (aux[i][j] == 7):
                h = h + abs(2 - i) + abs(1 - j)
            if (aux[i][j] == 8):
                h = h + abs(2 - i) + abs(2 - j)
    return h



# Busca em Largura/extensão
def busca_extensao(inicio):
    fila = []
    fila.append(inicio)  
    nos_exp = 0  
    while (len(fila) > 0):
        nodoTemp = fila.pop(0)  
        nos_exp = nos_exp + 1
        print('\nNó expandido:', nos_exp)
        imprimir(nodoTemp)
        if WinGame(nodoTemp) == True:
            print("\n*** Solução encontrada ***")
            result(nodoTemp)
            break;
        else:
            filhos = expandir(nodoTemp)
            for n in filhos:
                fila.append(n)


# Busca em Largura/extensão (sem nós repetidos)
def SemRepeticao(inicio):
    fila = []
    filaRepet = []  
    fila.append(inicio)  
    filaRepet.append(inicio)
    nos_exp = 0  
    while (len(fila) > 0):
        nodoTemp = fila.pop(0)  
        nos_exp = nos_exp + 1
        print('\nNó expandido:', nos_exp)
        imprimir(nodoTemp)
        if WinGame(nodoTemp) == True:
            print("\n*** Solução encontrada! Parabéns! ***")
            result(nodoTemp)
            break;
        else:
            filhos = expandir(nodoTemp)
            for nt in filhos:
                # verifica se nós já foi expandido

                existe = False
                for x in filaRepet:
                    if (EqualGame(nt, x)):
                        existe = True
                        break  
                if (existe == False):
                    fila.append(nt)
                    filaRepet.append(nt)


def SrHeuristica(inicio):
    fila = []
    filaRepet = []  
    fila.append(inicio)  
    filaRepet.append(inicio)
    nos_exp = 0  
    while (len(fila) > 0):
        nodoTemp = fila.pop(0)  
        nos_exp = nos_exp + 1
        
        print('\nNó expandido:', nos_exp)
        imprimir(nodoTemp)
        if WinGame(nodoTemp) == True:
            print("\n*** Solução encontrada! Parabéns! ***")
            result(nodoTemp)
            break;
        else:
            filhos = expandir(nodoTemp)
            filhos_nao_repet = []
            for nt in filhos:
                
                existe = False
                for x in filaRepet:
                    if (EqualGame(nt, x)):
                        existe = True
                        break  
                if (existe == False):
                    filhos_nao_repet.append(nt)
            h = 9 
            for nr in filhos_nao_repet:
                if (heuristica(nr) < h):
                    h = heuristica(nr)  
            
            for nr in filhos_nao_repet:
                if (heuristica(nr) == h):
                    fila.append(nr)
                    filaRepet.append(nr)



def SemRepeticao_h2(inicio):
    fila = []
    filaRepet = []  
    fila.append(inicio)  
    filaRepet.append(inicio)
    nos_exp = 0  
    while (len(fila) > 0):
        nodoTemp = fila.pop(0)  
        nos_exp = nos_exp + 1
        
        print('\nNó expandido:', nos_exp)
        imprimir(nodoTemp)
        if WinGame(nodoTemp) == True:
            print("\n*** Solução encontrada! Parabéns! ***")
            result(nodoTemp)
            break;
        else:
            filhos = expandir(nodoTemp)
            
            filhos_nao_repet = []
            for nt in filhos:
               
                existe = False
                for x in filaRepet:
                    if (EqualGame(nt, x)):
                        existe = True
                        break  
                if (existe == False):
                    filhos_nao_repet.append(nt)
            h = 1000  
           
            for nr in filhos_nao_repet:
                if (h2(nr) < h):
                    h = h2(nr)  
            
            for nr in filhos_nao_repet:
                if (h2(nr) == h):
                    fila.append(nr)
                    filaRepet.append(nr)


inicio = [[2, 5, 8], [1, 4, 7], [3, 0, 6], [0, None]]
print('*** IA em Quebra-cabeça de 8 peças ***')
print('O auxuleiro esta assim: ')
imprimir(inicio)
print('Informe qual algoritmo deseja utilizar: ')
print("1: Busca Cega em Extensão")
print("2: Busca Cega em Extensão sem nós repetidos")
print("3: Busca Com Informação Heurística peças fora do lugar")
print("4: Busca Com Informação Heurística Dist. Manhattan")
op = int(input('Informe uma opção:'))
if (op == 1):
    busca_extensao(inicio)
elif (op == 2):
    SemRepeticao(inicio)
elif (op == 3):
    SrHeuristica(inicio)
elif (op == 4):
    SemRepeticao_h2(inicio)