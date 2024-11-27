#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

#define TAMANHO 10

/* Faça um programa em C para encontrar o maior elemento de um vetor (lista) com n
elementos aleatórios ordenados de forma crescente. Qual a complexidade de tempo?
Conte as instruções que são função de n e compare os resultados. */

int main()
{
    srand(time(NULL));
    int *vetor = (int*) malloc(sizeof(int) * TAMANHO);

    preencherVetor(vetor);
    int resultado = ordenarListaElementos(vetor);

    printf("Maior elemento: %d.\n", resultado);
    printf("Quantidade de passos realizados: %d.\n", contarPassosListaOrdenada(vetor));

    free(vetor);
    return 0;
}

void preencherVetor(int *vetor)
{
    for(int i = 0; i < TAMANHO; i++)
    {
       *(vetor + i) = rand() % 100;
    }
}

int ordenarListaElementos(int *vetor)
{
    int auxiliar;

    for(int i = TAMANHO - 1; i > 0; i--)
    {
        for(int j = 0; j < i; j++)
        {
            if(vetor[j] > vetor[j + 1])
            {
                auxiliar = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = auxiliar;
            }
        }
    }
    return vetor[TAMANHO - 1];
}

int contarPassosListaOrdenada(int *vetor)
{
    int auxiliar, contador = 0; // 1

    for(int i = TAMANHO - 1; i > 0; i--) // n - 1
    {
        for(int j = 0; j < i; j++) // n - 1
        {
            contador++;

            if(vetor[j] > vetor[j + 1])
            {
                auxiliar = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = auxiliar;
            }
        }
    }
    return contador; // O(n^2)
}

