import random

cidades = {0:'Belo Horizonte', 1:'Governador Valadares', 2:'Juiz de Fora', 3:'Montes Claros', 4:'Uberlandia'}

distancias = [[9999.99, 63.60, 53.20, 90.40, 159.40],
              [63.60, 9999.99, 90.80, 106.80, 169.40],
              [53.20, 90.80, 9999.99, 135.40, 157.60],
              [90.40, 106.80, 135.40, 9999.99, 125.40],
              [159.40, 169.40, 157.60, 125.40, 9999.99]]

def encontrarAptidao(solucao, contador, melhorSolucao, menorDistancia):
    resultado = 0;
    
    for i in range(0, len(solucao) - 1):
        resultado += distancias[solucao[i]][solucao[i + 1]];

    if(contador == 0):
        melhorSolucao = solucao[:];
        menorDistancia = resultado;
    elif(menorDistancia > resultado):
        melhorSolucao = solucao[:];
        menorDistancia = resultado;
    return melhorSolucao, menorDistancia;

def imprimirMelhorCaminho(melhorSolucao):
    for indice in melhorSolucao:
        print(cidades[indice]);

contador = 0;
menorDistancia = 0;
melhorSolucao = [];

while(contador < 100):
    papeis = [1, 2, 3, 4];
    solucao = [0];

    while(len(papeis) > 0):
        indice = random.randint(0, len(papeis) - 1);
        solucao.append(papeis[indice]);
        papeis.remove(papeis[indice]);
        
    solucao.append(0);
    melhorSolucao, menorDistancia = encontrarAptidao(solucao, contador, melhorSolucao, menorDistancia);
    contador += 1;

imprimirMelhorCaminho(melhorSolucao);
print("Melhor distância:", f'{menorDistancia:.2f}');

