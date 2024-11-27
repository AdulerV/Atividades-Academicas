#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

#define TAMANHO 10

/* Faça um programa em C para encontrar o maior elemento de um vetor (lista) com n
elementos aleatórios não ordenados. Qual a complexidade de tempo? Conte as instruções
que são função de n e compare os resultados. */

int main()
{
    srand(time(NULL));
    int *vetor = (int*) malloc(sizeof(int) * TAMANHO);

    preencherVetor(vetor);
    printf("Maior elemento: %d.\n", maiorElementoVetor(vetor));
    printf("Quantidade de passos realizados: %d.\n", contarPassosMaiorElemento(vetor));

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

int encontrarMaiorElementoVetor(int *vetor)
{
    int maiorElemento = *(vetor);

    for(int i = 0; i < TAMANHO; i++)
    {
        if(*(vetor + i) > maiorElemento)
        {
            maiorElemento = *(vetor + i);
        }
    }
    return maiorElemento;
}

int contarPassosMaiorElemento(int *vetor)
{
    int maiorElemento = *(vetor), contador = 0; // 1

    for(int i = 0; i < TAMANHO; i++) // n + 1
    {
        contador++;

        if(*(vetor + i) > maiorElemento) // n
        {
            maiorElemento = *(vetor + i);
        }
    }
    return contador; // O(n)
}



