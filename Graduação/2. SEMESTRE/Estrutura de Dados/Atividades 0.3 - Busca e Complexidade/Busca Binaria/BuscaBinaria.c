#include <stdlib.h>
#include <stdio.h>
#include <locale.h>
#include <time.h>

#define TAMANHO 1024

/* Respostas:

3. Qual a complexidade do algoritmo de busca binária?
R: A complexidade do algoritmo é dada por O(log n)).*/

int main()
{
    setlocale(LC_ALL, "");
    srand(time(NULL));

    int *vetor = (int*) malloc(sizeof(int) * TAMANHO);
    float resultado = 0;

    preencherVetores(vetor);
    imprimirVetor(vetor);

    ordenarBubbleSort(vetor);
    imprimirVetor(vetor);

    for(int i = 0; i < 1000; i++)
    {
        resultado += contarBuscaBinaria(vetor, rand() % (TAMANHO * 1000));
    }

    printf("Resultado: %.2f.\n", resultado / 1000);

    free(vetor);
    return 0;
}

void imprimirVetor(int *vetor)
{
    for(int i = 0; i < TAMANHO; i++)
    {
        printf("vetor[%d] = %d.\n", i, *(vetor + i));
    }
    printf("\n");
}

void preencherVetores(int *vetor)
{
    for(int i = 0; i < TAMANHO; i++)
    {
        *(vetor + i) = rand() % (TAMANHO * 1000);
    }
}

void ordenarBubbleSort(int *vetor)
{
    int auxiliar;

    for(int i = 0; i < TAMANHO; i++)
    {
        for(int j = 0; j < TAMANHO - 1 - i; j++)
        {
            if(vetor[j] > vetor[j + 1])
            {
                auxiliar = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = auxiliar;
            }
        }
    }
}

int buscaBinaria(int *vetor, int chave)
{
    int inicio = 0;
    int fim = TAMANHO - 1;
    int meio;

    while(inicio < fim)
    {
        meio = (inicio + fim) / 2;

        if(chave < vetor[meio])
        {
            fim = meio - 1;
        }

        if(chave > vetor[meio])
        {
            inicio = meio + 1;
        }

        if(chave == vetor[meio])
        {
            return meio;
        }
    }
    return -1;
}

int contarBuscaBinaria(int *vetor, int chave)
{
    int inicio = 0;
    int fim = TAMANHO - 1;
    int meio;
    int contador = 0;

    while(inicio <= fim)
    {
        contador++;
        meio = (inicio + fim) / 2;

        if(chave < vetor[meio])
        {
            fim = meio - 1;
        }

        if(chave > vetor[meio])
        {
            inicio = meio + 1;
        }

        if(chave == vetor[meio])
        {
            return contador;
        }
    }
    return contador;
}

