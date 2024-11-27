#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

#define DIMENSAO 2

void preencherMatriz(int **matriz);
void imprimirMatriz(int **matriz);
void obterProdutoMatriz(int **matriz1, int **matriz2, int **produto);

/*  Faça um programa em C que calcule o produto de matrizes quadradas de ordem n. Qual
a complexidade de tempo? Conte as instruções que são função de n e compare os
resultados. */

int main()
{
    srand(time(NULL));
    setlocale(LC_ALL, "");

    int **matriz1 = (int*) malloc(sizeof(int*) * DIMENSAO);
    int **matriz2 = (int*) malloc(sizeof(int*) * DIMENSAO);
    int **produto = (int*) malloc(sizeof(int*) * DIMENSAO);

    printf("Matriz A: \n");
    preencherMatriz(matriz1);
    imprimirMatriz(matriz1);

    printf("Matriz B: \n");
    preencherMatriz(matriz2);
    imprimirMatriz(matriz2);

    printf("Matriz A x B: \n");
    preencherMatrizNula(produto);
    obterProdutoMatriz(matriz1, matriz2, produto);
    imprimirMatriz(produto);

    printf("Quantidade de passos realizados: %d.\n", contarPassosProdutoMatriz(matriz1, matriz2, produto));
    free(matriz1);
    free(matriz2);
    free(produto);
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
            printf("Insira o elemento a%d%d da matriz: ", i + 1, j + 1);
            scanf("%d", (*(matriz + i) + j));
        }
    }
}

void preencherMatrizNula(int **matriz)
{
    for(int i = 0; i < DIMENSAO; i++)
    {
        *(matriz + i) = (int*) malloc(sizeof(int) * DIMENSAO);
    }

    for(int i = 0; i < DIMENSAO; i++)
    {
        for(int j = 0; j < DIMENSAO; j++)
        {
            *(*(matriz + i) + j) = 0;
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

void obterProdutoMatriz(int **matriz1, int **matriz2, int **produto)
{
    for(int i = 0; i < DIMENSAO; i++)
    {
        for(int j = 0; j < DIMENSAO; j++)
        {
            for(int k = 0; k < DIMENSAO; k++)
            {
                *(*(produto + i) + j) += (*(*(matriz1 + i) + k)) * (*(*(matriz2 + k) + j));
            }
        }
    }
}

int contarPassosProdutoMatriz(int **matriz1, int **matriz2, int **produto)
{
    int soma = 0, contador = 0;

    for(int i = 0; i < DIMENSAO; i++) // n + 1
    {
        for(int j = 0; j < DIMENSAO; j++) // n + 1
        {
            for(int k = 0; k < DIMENSAO; k++) // n + 1
            {
                contador++;
                *(*(produto + i) + j) += *(*(matriz1 + i) + k) * *(*(matriz2 + k) + j);
            }
        }
    }
    return contador; //O(n^3)
}

