#2. Faça um programa que leia 10 números e os armazene em um vetor. Imprima o vetor.
n = 10
valor = []
# Preenchendo o vetor de 10 posições
for c in range(1, n + 1):
   valor.append(input(f'Digite o {c}º valor: '))

# Exibindo a lista "valor":
print("\nO vetor é: ", end="")  # imprime na mesma linha devido ao parametro end="
print (valor)