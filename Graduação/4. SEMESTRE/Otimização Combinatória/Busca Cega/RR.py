#Problema de Roteamento de Robo
import random;
import matplotlib.pyplot as plt;

#Ambiente
random.seed(3)  #para gerar as mesmas instâncias a partir da mesma semente
N = 30
Obs = N*10
inicio = [0, 0]
objetivo = [N-1, N-1]
obstaculos = set() #gera os obstáculos sem repetição de coordenadas
while len(obstaculos) < Obs:
    x = random.randint(0, N-1)
    y = random.randint(0, N-1)
    if (x, y) != inicio and (x, y) != objetivo:
        obstaculos.add((x, y))
obstaculos = list(obstaculos) #transformação em lista para facilitar o uso de métodos
obstaculos.sort()

print(len(obstaculos))

#Coordenadas dos movimentos possíveis: 1=Cima, 2=Direita, 3=Baixo, 4=Esquerda
movimentos = {
    1: (0, 1),   # Cima
    2: (1, 0),   # Direita
    3: (0, -1),  # Baixo
    4: (-1, 0)   # Esquerda
}

random.seed();

def imprimirGrafico(melhor_caminho, obstaculos_encontrados):

    coordenadas_a, coordenadas_b = encontrarCoordenadas(melhor_caminho);
    coordenadas_c, coordenadas_d = encontrarCoordenadas(list(obstaculos));
    coordenadas_e, coordenadas_f = encontrarCoordenadas(obstaculos_encontrados);

    plt.scatter(coordenadas_a, coordenadas_b, color='b')
    plt.scatter(coordenadas_c, coordenadas_d, color='g')
    plt.scatter(coordenadas_e, coordenadas_f, color='r')
    plt.scatter(inicio[0], inicio[1], color='y')
    plt.scatter(objetivo[0], objetivo[1], color='y')
    plt.show()
    
def encontrarCoordenadas(lista):
    coordenadas_y = [];
    coordenadas_x = [];
    
    for coordenada in lista:
        coordenadas_y.append(coordenada[0]);
        coordenadas_x.append(coordenada[1]);
    return coordenadas_y, coordenadas_x;
    
def encontrarAptidao(contador, movimentacao, melhor_caminho, menor_custo, obstaculos_atuais):
    custo = 0;
    obstaculos_encontrados = [];
    
    for movimento in movimentacao:
        for obstaculo in obstaculos:
            if(tuple(movimento) == obstaculo):
                custo += 100;
                obstaculos_encontrados.append(movimento);
        custo += 1;
                
    if(contador == 0):
        melhor_caminho = movimentacao[:];
        obstaculos_atuais = obstaculos_encontrados[:]
        menor_custo = custo;
    elif(menor_custo > custo):
        melhor_caminho = movimentacao[:];
        obstaculos_atuais = obstaculos_encontrados[:]
        menor_custo = custo;
    return melhor_caminho, menor_custo, obstaculos_atuais;

melhor_caminho = [];
obstaculos_atuais = [];
menor_custo = 0;
contador = 0;

while(contador <= 100):    
    movimentacao = [];
    coordenada_atual = inicio[:];

    while(coordenada_atual != objetivo):
        passo = [];
        indice_movimento = random.randint(1, 4);
        movimento = list(movimentos[indice_movimento]);
        passo.append(movimento[0] + coordenada_atual[0]);
        passo.append(movimento[1] + coordenada_atual[1]);
        
        if(passo[0] >= 0 and passo[0] < N and passo[1] >= 0 and passo[1] < N):
            coordenada_atual = passo;
            movimentacao.append(coordenada_atual);
        
    melhor_caminho, menor_custo, obstaculos_atuais = encontrarAptidao(contador, movimentacao, melhor_caminho, menor_custo, obstaculos_atuais);
    contador += 1;

imprimirGrafico(melhor_caminho, obstaculos_atuais);