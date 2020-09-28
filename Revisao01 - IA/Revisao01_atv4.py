#4. Faça um programa que leia 10 números, insira em uma pilha. O programa deve remover os dados da pilha e imprimi-los na tela.
vetor =[]
n = 10
for c in range(1, n + 1):
   vetor.append(input(f'Digite o {c}º valor da pilha: '))
print('A pilha é:\n')
for i in range(0,10):
   print(vetor.pop()) 