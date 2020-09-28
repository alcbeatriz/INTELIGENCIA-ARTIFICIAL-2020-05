#3. Faça um programa que leia e preencha uma matriz de 10x10. No final, imprima a matriz.
n = 10
m = 10
valor = []
valor2 = []

# Preenchendo o vetor de 10 posições
for c in range(1, n + 1):
   valor.append(input(f'Digite o {c}º valor da matriz: '))
for l in range(1, m + 1):
    valor2.append(input(f'Digite o {l}º valor da matriz: '))

# Exibindo o vetor "valor":
print("\nA matriz é: ")  # imprime na mesma linha devido ao parametro end="
print (valor)
print (valor2)