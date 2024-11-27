#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

#define TAMANHO 5

/* Faça um programa em C que conte quantos pares de números em um vetor (lista) de
tamanho n possuem soma igual a um valor k. Qual a complexidade de tempo? Conte as
instruções que são função de n e compare os resultados.

Exemplo: vetor = {1, 5, 7, -1, 5}
k = 6
Resposta: 3: (1, 5), (1, 5), (7, -1) */

int main()
{
    int *escalar = (int*) malloc(sizeof(int));
    int *vetor = (int*) malloc(sizeof(int) * TAMANHO);

    preencherDados(escalar, vetor);
    printf("\nQuantidade de pares iguais ao valor %d: %d.\n", *escalar, contarParesIguaisEscalar(escalar, vetor));
    printf("Quantidade de passos realizados: %d.\n", contarPassosPares(escalar, vetor));

    free(escalar);
    free(vetor);
    return 0;
}

void preencherDados(int *escalar, int *vetor)
{
    printf("Insira o valor do escalar K: ");
    scanf("%d", escalar);

    for(int i = 0; i < TAMANHO; i++)
    {
        printf("Insira o %d. elemento do vetor: ", i + 1);
        scanf("%d", vetor + i);
    }
}

int contarParesIguaisEscalar(int *escalar, int *vetor)
{
    int pares = 0;

    for(int i = 0; i < TAMANHO; i++)
    {
        for(int j = i; j < TAMANHO; j++)
        {
            if(*(vetor + i) + *(vetor + j) == *escalar)
            {
                pares++;
                printf("(%d, %d) ", vetor[i], vetor[j]);
            }
        }
    }
    return pares;
}

int contarPassosPares(int *escalar, int *vetor)
{
    int contador = 0, pares = 0; // 1

    for(int i = 0; i < TAMANHO; i++) // n + 1
    {
        for(int j = i; j < TAMANHO; j++) // n / 2
        {
            contador++;
            if(*(vetor + i) + *(vetor + j) == *escalar)
            {
                pares++;
            }
        }
    }
    return contador; // O(n^2)
}
