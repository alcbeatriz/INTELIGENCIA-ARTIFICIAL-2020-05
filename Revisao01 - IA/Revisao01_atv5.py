from collections import deque
vector=deque([])
n = 3
for c in range(1, n + 1):
   vector.append(input(f'Digite o {c}º valor da fila: '))
print('A fila é:\n')
for i in range(0,3):
    print(vector.popleft())