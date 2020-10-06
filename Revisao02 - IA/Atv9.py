#Faça um programa que leia 10 tarefas. Cada tarefa contém uma descricaoricaoricaorição (string) e a ordem que
#ela deve ser executada (utilizar classe ou estrutura para representar a tarefa). As tarefas devem ser
#inseridas em um vetor. O programa deve imprimir a descricaoricaoricaorição tarefas em ordem de execução.
import heapq

class Tarefas:
    def _init_ (self,descricao,prioridade):
        self.descricao = descricao
        self.prioridade = prioridade

    def getDescricao(self):
        return self.__descricao

    def setDescricao(self, descricao):
        self.__descricao = descricao

lista=[]
for i in range (0,10):
    x=input('Digite a descrição da tarefa {}: '.format(i+1))
    y=int(input('Digite a prioridade da tarefa {}: '.format(i+1)))
    while y>5 or y<0:
       y=int(input('PRIORIDADE INVALIDA: DIGITE UM VALOR DE 0 A 5 {}: '.format(i+1)))
    l=(y, x)
    heapq.heappush(lista, l)

for i in range (0, 10):
    print(lista[-i][1])
    heapq.heappop(lista)