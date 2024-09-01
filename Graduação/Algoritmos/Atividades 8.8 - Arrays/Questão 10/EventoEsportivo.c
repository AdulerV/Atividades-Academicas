#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 3

/*A organização de um evento esportivo deseja um programa que seja responsável por dar mais
credibilidade ao sistema de pontuação manual atualmente usado.
Considere que cada competidor recebe uma pontuação ao final da execução da prova esportiva.
Vence aquele competidor com a maior pontuação.
O programa deverá ser capaz de exibir uma identificação do competidor vencedor e sua pontuação.*/

int identificarCampeao(Competidor competidor[MAX]);

typedef struct {
    char nome[50];
    float pontuacao;
} Competidor;

main() {
    setlocale(LC_ALL, "");
    Competidor competidor[MAX];

    for(int i = 0; i < MAX; i++) {
        printf("Insira o nome do %d° competidor: ", i + 1);
        scanf("%s", competidor[i].nome);

        printf("Insira a pontuação do %d° competidor: ", i + 1);
        scanf("%f", &competidor[i].pontuacao);
    }

    int indice = identificarCampeao(competidor);
    printf("O competidor(a) %s é o(a) campeã(o) com %.2f pontos.", competidor[indice].nome, competidor[indice].pontuacao);
}

int identificarCampeao(Competidor competidor[MAX]) {
    int indiceVencedor = 0;

    for(int i = 0; i < MAX; i++) {
        if(competidor[i].pontuacao > competidor[indiceVencedor].pontuacao) {
            indiceVencedor = i;
        }
    }
    return indiceVencedor;
}
