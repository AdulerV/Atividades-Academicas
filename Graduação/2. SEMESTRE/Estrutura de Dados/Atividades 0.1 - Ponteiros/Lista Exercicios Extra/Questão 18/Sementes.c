#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define NUM_SEMENTES 5

/* Uma empresa especializada em produtos agropecu�rios plantou em um viveiro 5.000
sementes de uma determinada planta e deseja contratar os seus servi�os de
programador para verificar o grau de germina��o de tais sementes.

Voc� dever� criar um programa que permita registrar o grau de germina��o de cada
semente como sendo uma nota atribu�da por um t�cnico agropecu�rio usando uma
escala de 0 a 10.

Ao final o programa dever� emitir um relat�rio contendo o percentual de sementes
que conseguiram um grau de germina��o acima da m�dia. */

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
        printf("Insira o grau de germina��o da %d. semente: ", i + 1);
        scanf("%d", sementes + i);
    }
    imprimirDadosSementes(calcularDadosSementes(sementes));

    free(sementes);
    return 0;
}

void imprimirDadosSementes(DadosSementes dados)
{
    printf("\nSomat�rio: %d.\n", dados.somatorio);
    printf("Grau m�dio de germina��o: %d.\n", dados.grauMedio);
    printf("Quantidade de sementes com germina��o acima da m�dia: %d.\n", dados.qtdAcimaMedia);
    printf("Percentual de sementes com grau de germina��o acima da m�dia: %.f%%.\n", dados.percentual);
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

