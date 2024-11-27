#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

#define DIMENSAO 3

/* Faça um programa em C para calcular a matriz transposta de uma matriz quadrada de
ordem n. Qual a complexidade de tempo? Conte as instruções que são função de n e
compare os resultados. */

int main()
{
    srand(time(NULL));
    setlocale(LC_ALL, "");

    int **matriz = (int*) malloc(sizeof(int*) * DIMENSAO);

    printf("Matriz original: \n");
    preencherMatriz(matriz);
    imprimirMatriz(matriz);

    printf("Matriz transposta: \n");
    obterMatrizTransposta(matriz);
    imprimirMatriz(matriz);

    printf("Quantidade de passos realizados: %d.\n", contarPassosMatrizTransposta(matriz));
    free(matriz);
    return 0;
}

void preencherMatriz(int **matriz)
{
    for(int i = 0; i < DIMENSAO; i++)
    {
        *(matriz + i) = (int*) malloc(sizeof(int) * DIMENSAO);
    }

    for(int i = 0; i < DIMENSAO; i++)
    {
        for(int j = 0; j < DIMENSAO; j++)
        {
            *(*(matriz + i) + j) = rand() % 100;
        }
    }
}

void imprimirMatriz(int **matriz)
{
    for(int i = 0; i < DIMENSAO; i++)
    {
        for(int j = 0; j < DIMENSAO; j++)
        {
            printf("%d ", *(*(matriz + i) + j));
        }
        printf("\n");
    }
    printf("\n");
}

int obterMatrizTransposta(int **matriz)
{
    int auxiliar;

    for(int i = 0; i < DIMENSAO; i++)
    {
        for(int j = i; j < DIMENSAO; j++)
        {
            auxiliar = *(*(matriz + i) + j);
            *(*(matriz + i) + j) = *(*(matriz + j) + i);
            *(*(matriz + j) + i) = auxiliar;
        }
    }
}

int contarPassosMatrizTransposta(int **matriz)
{
    int auxiliar, contador = 0; // 1

    for(int i = 0; i < DIMENSAO; i++) // n + 1
    {
        for(int j = i; j < DIMENSAO; j++) // n / 2
        {
            contador++;
            auxiliar = *(*(matriz + i) + j);
            *(*(matriz + i) + j) = *(*(matriz + j) + i);
            *(*(matriz + j) + i) = auxiliar;
        }
    }
    return contador; // O(n^2)
}
