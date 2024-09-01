#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 3

/*A organiza��o de um evento esportivo deseja um programa que seja respons�vel por dar mais
credibilidade ao sistema de pontua��o manual atualmente usado.
Considere que cada competidor recebe uma pontua��o ao final da execu��o da prova esportiva.
Vence aquele competidor com a maior pontua��o.
O programa dever� ser capaz de exibir uma identifica��o do competidor vencedor e sua pontua��o.*/

int identificarCampeao(Competidor competidor[MAX]);

typedef struct {
    char nome[50];
    float pontuacao;
} Competidor;

main() {
    setlocale(LC_ALL, "");
    Competidor competidor[MAX];

    for(int i = 0; i < MAX; i++) {
        printf("Insira o nome do %d� competidor: ", i + 1);
        scanf("%s", competidor[i].nome);

        printf("Insira a pontua��o do %d� competidor: ", i + 1);
        scanf("%f", &competidor[i].pontuacao);
    }

    int indice = identificarCampeao(competidor);
    printf("O competidor(a) %s � o(a) campe�(o) com %.2f pontos.", competidor[indice].nome, competidor[indice].pontuacao);
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
