#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 5

/*Uma empresa especializada em produtos agropecuários plantou em um viveiro 5.000 sementes de uma determinada planta e
deseja contratar os seus serviços de programador para verificar o grau de germinação de tais sementes.
Você deverá criar um programa que permita registrar o grau de germinação de cada semente como sendo
uma nota atribuída por um técnico agropecuário usando uma escala de 0 a 10. Codificar uma função para calcular o
percentual de sementes que conseguiram um grau de germinação acima da média.*/

typedef struct
{
    int somatorio;
    float media;
    int qtdAcimaMedia;
    float percentual;
} DadosSementes;

void imprimirDadosSementes(DadosSementes dados);
DadosSementes calcularDadosSementes(int sementes[MAX]);

int main()
{
    setlocale(LC_ALL, "");
    int sementes[MAX];

    for(int i = 0; i < MAX; i++)
    {
        printf("Insira o grau de germinação (De 0 a 10) da %dª semente: ", i + 1);
        scanf("%d", &sementes[i]);

        if(sementes[i] < 0 || sementes[i] > 10)
        {
            printf("Grau inserido inválido.");
            return 1;
        }
    }

    DadosSementes dados = calcularDadosSementes(sementes);
    imprimirDadosSementes(dados);
    return 0;
}

void imprimirDadosSementes(DadosSementes dados)
{
    printf("\nSomatório: %d\n", dados.somatorio);
    printf("Grau médio de germinação: %.2f\n", dados.media);
    printf("Quantidade de sementes com germinação acima da média: %d\n", dados.qtdAcimaMedia);
    printf("Percentual de sementes com grau de germinação acima da média: %.2f%%\n", dados.percentual);
}

DadosSementes calcularDadosSementes(int sementes[MAX])
{
    DadosSementes dados = {0, 0, 0, 0};

    for(int i = 0; i < MAX; i++)
    {
        dados.somatorio += sementes[i];
    }
    dados.media = dados.somatorio / MAX;

    for(int i = 0; i < MAX; i++)
    {
        if(sementes[i] > dados.media)
        {
            dados.qtdAcimaMedia++;
        }
    }
    dados.percentual = (dados.qtdAcimaMedia * 100) / MAX;
    return dados;
}
