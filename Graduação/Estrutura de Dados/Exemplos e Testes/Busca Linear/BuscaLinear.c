#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

#define MAX 10

int main()
{
    srand(time(NULL));
    int vetor = (int*) malloc(sizeof(int) * MAX);
    preencherVetor(vetor);
    imprimirVetor(vetor);
}

void imprimirVetor(int *vetor)
{
    for(int i = 0; i < MAX; i++)
    {
        printf("%d.\n", *(vetor + i));
    }

}

void preencherVetor(int *vetor)
{
    int i, valor;

    for(i = 0; i < MAX; i++)
    {
        *(vetor + i) = -1;
    }
    i = 0;
    while(i < MAX)
    {
        valor = rand() % MAX;
        if(buscarValor(vetor, valor) == -1)
        {
            *(vetor + i++) = valor;
        }
        buscaEconta(vetor, valor);
    }
}

int buscarValor(int *vetor, int valor)
{
    for(int i = 0; i < MAX; i++)
    {
        if(*(vetor + i) == valor)
        {
            return i;
        }
    }
    return -1;
}

int buscaEconta(int *vetor, int valor)
{
    int loops = 0;

    for(int i = 0; i < MAX; i++)
    {
        if(buscarValor(vetor, valor) != -1)
        {
            loops += buscarValor(vetor, valor);
        } else {
            i--;
        }
    }
    printf("%d;\n", loops);
    return loops;
}


