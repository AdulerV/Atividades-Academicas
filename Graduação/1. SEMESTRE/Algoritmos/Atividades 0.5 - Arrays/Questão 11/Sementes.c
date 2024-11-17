#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 5

/*Uma empresa especializada em produtos agropecu�rios plantou em um viveiro 5.000 sementes de uma determinada planta e
deseja contratar os seus servi�os de programador para verificar o grau de germina��o de tais sementes.
Voc� dever� criar um programa que permita registrar o grau de germina��o de cada semente como sendo
uma nota atribu�da por um t�cnico agropecu�rio usando uma escala de 0 a 10. Codificar uma fun��o para calcular o
percentual de sementes que conseguiram um grau de germina��o acima da m�dia.*/

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
        printf("Insira o grau de germina��o (De 0 a 10) da %d� semente: ", i + 1);
        scanf("%d", &sementes[i]);

        if(sementes[i] < 0 || sementes[i] > 10)
        {
            printf("Grau inserido inv�lido.");
            return 1;
        }
    }

    DadosSementes dados = calcularDadosSementes(sementes);
    imprimirDadosSementes(dados);
    return 0;
}

void imprimirDadosSementes(DadosSementes dados)
{
    printf("\nSomat�rio: %d\n", dados.somatorio);
    printf("Grau m�dio de germina��o: %.2f\n", dados.media);
    printf("Quantidade de sementes com germina��o acima da m�dia: %d\n", dados.qtdAcimaMedia);
    printf("Percentual de sementes com grau de germina��o acima da m�dia: %.2f%%\n", dados.percentual);
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
