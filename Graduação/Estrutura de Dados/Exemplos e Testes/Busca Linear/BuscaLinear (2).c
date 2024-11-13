#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

#define TAMANHO 1000
#define NUM_BUSCAS 5

int buscarValor(int vetor[], int numero);
int calcularMedia(int vetor[], int numero);
void preencherVetor(int vetor[]);


int main()
{
    setlocale(LC_ALL, "");

    int *vetor = (int*) malloc(sizeof(int) * TAMANHO), resultado;

    preencherVetor(vetor);
    resultado = calcularMedia(vetor, 8);
    printf("Valor médio da busca: %d", resultado);

    free(vetor);
}

void preencherVetor(int *vetor)
{
    srand(time(NULL));
    int numero;

    for(int i = 0; i < TAMANHO; i++)
    {
        *(vetor + i) = -1;
    }

    for(int i = 0; i < TAMANHO; i++)
    {
        numero = rand() % TAMANHO;

        if(buscarValor(vetor, numero) == -1)
        {
            *(vetor + i) = numero;
        }
    }
}

int buscarValor(int *vetor, int numero)
{
    for(int i = 0; i < TAMANHO; i++)
    {
        if(*(vetor + i) == numero)
        {
            return i;
        }
    }
    return -1;
}

int calcularMedia(int *vetor, int numero)
{
    int media = 0, resultadoBusca;

    for(int i = 0; i < NUM_BUSCAS; i++)
    {
        resultadoBusca = buscarValor(vetor, numero);

        if(resultadoBusca != -1)
        {
            media += resultadoBusca;
        }
    }
    media /= NUM_BUSCAS;
    return media;
}
