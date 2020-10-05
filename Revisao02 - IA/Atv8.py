#8. Usando recursividade, faça um programa que calcule a soma dos valores de um vetor.
def SomaRecursiva(ValVector):
    if len(ValVector) == 1:
        return ValVector[0]
    else:
        return ValVector[0] + SomaRecursiva(ValVector[1:])

print(SomaRecursiva([8,7,22,3,42]))