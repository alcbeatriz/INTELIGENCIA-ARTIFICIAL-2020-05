#5. Faça um programa que leia 10 números, insira em uma fila. O programa deve remover os dados da fila e imprimi-los na tela.
from collections import deque
vector=deque([])
n = 10
for c in range(1, n + 1):
   vector.append(input(f'Digite o {c}º valor da fila: '))
print('A fila é:\n')
for i in range(0,10):
    print(vector.popleft())