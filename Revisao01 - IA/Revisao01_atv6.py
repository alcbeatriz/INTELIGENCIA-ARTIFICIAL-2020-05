import heapq
class Tarefas: 
    def __init__ (self, descricao, prioridade):
        self.descricao=descricao
        self.prioridade=prioridade
    def setDescricao(self,descricao): 
        self.descricao=descricao
    def getDescricao(self):
        return self.descricao
    def setPrioridade(self, prioridade):
        self.prioridade=prioridade
    def getPrioridade(self):
       return self.prioridade
lista=[]
global y
for i in range (0,10):
    x=input('Digite a descrição da tarefa {}: '.format(i+1))
    y=int(input('Digite a prioridade da tarefa {}: '.format(i+1)))
    while y>5 or y<0:
       y=int(input('PRIORIDADE INVALIDA: DIGITE UM VALOR DE 0 A 5 {}: '.format(i+1)))


    t=Tarefas(x,y)
    heapq.heappush(lista,(t.prioridade, t.descricao))
for i in range (0,10):
    print(heapq.heappop(lista))





