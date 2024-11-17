#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

#define TAMANHO 100
#define NUM_BUSCAS 1000

void preencherVetor(int *vetor);
int buscarValor(int *vetor, int numero);
float calcularMedia(int *vetor, int numero);

/* Respostas:

10. Qual a complexidade do algoritmo de busca?
R: A complexidade do algoritmo é dada por O(n), na qual "n" é o tamanho do vetor.

11. Qual foi o valor médio encontrado pelo seu programa?
R: O valor médio encontrado é dado por n/2, pois o elemento procurado está, aproximadamente, no meio do vetor.

12. Os 2 valores acima são da mesma ordem de grandeza?
R: Sim, pois a complexidade assintótica O(n) e o valor médio n/2 são proporcionais ao vetor.

13. Se há um valor maior entre a complexidade assintótica e a média encontrada, qual a explicação?
R: Satisfazendo-se que todo valor está presente na lista, basta fazer em média n/2 comparações, não alcançando o pior caso. */

int main()
{
    setlocale(LC_ALL, "");
    srand(time(NULL));

    int *vetor = (int*) malloc(sizeof(int) * TAMANHO);

    printf("Valor médio da busca: %.2f.\n", calcularMedia(vetor, 8));
    printf("Valor médio da busca: %.2f.\n", calcularMedia(vetor, 50));
    printf("Valor médio da busca: %.2f.\n", calcularMedia(vetor, 91));
    printf("Valor médio da busca: %.2f.\n", calcularMedia(vetor, 23));

    free(vetor);
    return 0;
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
