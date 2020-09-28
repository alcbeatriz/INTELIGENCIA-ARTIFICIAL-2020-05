vetor =[]
n = 10
for c in range(1, n + 1):
   vetor.append(input(f'Digite o {c}º valor da pilha: '))
print('A pilha é:\n')
for i in range(0,10):
   print(vetor.pop()) 