#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define NUM_SEMENTES 5

/* Uma empresa especializada em produtos agropecuários plantou em um viveiro 5.000
sementes de uma determinada planta e deseja contratar os seus serviços de
programador para verificar o grau de germinação de tais sementes.

Você deverá criar um programa que permita registrar o grau de germinação de cada
semente como sendo uma nota atribuída por um técnico agropecuário usando uma
escala de 0 a 10.

Ao final o programa deverá emitir um relatório contendo o percentual de sementes
que conseguiram um grau de germinação acima da média. */

typedef struct
{
    int somatorio;
    int grauMedio;
    int qtdAcimaMedia;
    float percentual;
} DadosSementes;

void imprimirDadosSementes(DadosSementes dados);
DadosSementes calcularDadosSementes(int *sementes);

int main()
{
    setlocale(LC_ALL, "");

    int *sementes = (int*) malloc(sizeof(int) * NUM_SEMENTES);

    for(int i = 0; i < NUM_SEMENTES; i++)
    {
        printf("Insira o grau de germinação da %d. semente: ", i + 1);
        scanf("%d", sementes + i);
    }
    imprimirDadosSementes(calcularDadosSementes(sementes));

    free(sementes);
    return 0;
}

void imprimirDadosSementes(DadosSementes dados)
{
    printf("\nSomatório: %d.\n", dados.somatorio);
    printf("Grau médio de germinação: %d.\n", dados.grauMedio);
    printf("Quantidade de sementes com germinação acima da média: %d.\n", dados.qtdAcimaMedia);
    printf("Percentual de sementes com grau de germinação acima da média: %.f%%.\n", dados.percentual);
}

DadosSementes calcularDadosSementes(int *sementes)
{
    DadosSementes dados = {0, 0, 0, 0};

    for(int i = 0; i < NUM_SEMENTES; i++)
    {
        dados.somatorio += *(sementes + i);
    }

    dados.grauMedio = dados.somatorio / NUM_SEMENTES;

    for(int i = 0; i < NUM_SEMENTES; i++)
    {
        if(*(sementes + i) > dados.grauMedio)
        {
            dados.qtdAcimaMedia++;
        }
    }

    dados.percentual = (dados.qtdAcimaMedia * 100) / NUM_SEMENTES;
    return dados;
}

