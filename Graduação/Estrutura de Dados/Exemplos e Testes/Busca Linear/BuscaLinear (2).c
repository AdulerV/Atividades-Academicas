#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

#define TAMANHO 100
#define NUM_BUSCAS 1000

int buscarValor(int *vetor, int numero);
float calcularMedia(int *vetor, int numero);
void preencherVetor(int *vetor);


int main()
{
    setlocale(LC_ALL, "");
    srand(time(NULL));

    int *vetor = (int*) malloc(sizeof(int) * TAMANHO);
    float resultado;
    resultado = calcularMedia(vetor, 8);
    printf("Valor médio da busca: %.2f.\n", resultado);
    free(vetor);
}

void preencherVetor(int *vetor)
{
    int numero;

    for(int i = 0; i < TAMANHO; i++)
    {
        *(vetor + i) = -1;
    }

    for(int i = 0; i < TAMANHO; i++)
    {
        do
        {
            numero = rand() % TAMANHO;
        }
        while(buscarValor(vetor, numero) != -1);

        *(vetor + i) = numero;
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

float calcularMedia(int *vetor, int numero)
{
    float media = 0;
    int resultadoBusca;

    for(int i = 0; i < NUM_BUSCAS; i++)
    {
        preencherVetor(vetor);
        resultadoBusca = buscarValor(vetor, numero);

        if(resultadoBusca != -1)
        {
            media += resultadoBusca + 1;
        }
    }
    media /= NUM_BUSCAS;
    return media;
}
