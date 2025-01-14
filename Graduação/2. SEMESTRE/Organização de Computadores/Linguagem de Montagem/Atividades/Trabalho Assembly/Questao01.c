#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define TAMANHO 20

void imprimirMenu();
void limparElementos(int vetor[TAMANHO]);
int inserirElementos(int vetor[TAMANHO]);
int eliminarElemento(int vetor[TAMANHO]);
void imprimirElementos(int vetor[TAMANHO]);

int main()
{
    setlocale(LC_ALL, "");
    int vetor[TAMANHO], opcao, validador;
    limparElementos(vetor);

    do
    {
        imprimirMenu();
        printf("Escolha uma opção: ");
        scanf("%d", &opcao);

        switch(opcao)
        {
        case 1:
            limparElementos(vetor);
            break;
        case 2:
            validador = inserirElementos(vetor);
            if(validador == 0)
            {
                printf("Impossível inserir mais elementos.\n");
            }
            break;
        case 3:
            validador = eliminarElemento(vetor);
            if(validador == 0)
            {
                printf("Esta posição já está vazia ou é inválida.\n");
            }
            break;
        case 4:
            imprimirElementos(vetor);
            break;
        case 5:
            printf("\nSaindo...\n");
            break;
        default:
            printf("Opção inserida inválida.\n");
        }
    }
    while(opcao != 5);
    return 0;
}

void imprimirMenu()
{
    printf("\n =======================");
    printf("\n Menu");
    printf("\n =======================");
    printf("\n 1 - Limpar");
    printf("\n 2 - Inserir");
    printf("\n 3 - Eliminar");
    printf("\n 4 - Imprimir");
    printf("\n 5 - Finalizar");
    printf("\n =======================\n");
}

void limparElementos(int vetor[TAMANHO])
{
    for(int i = 0; i < TAMANHO; i++)
    {
        vetor[i] = -1;
    }
}

int inserirElementos(int vetor[TAMANHO])
{
    int numero;

    do
    {
        printf("Insira um número natural: ");
        scanf("%d", &numero);
    }
    while(numero < 0);

    for(int i = 0; i < TAMANHO; i++)
    {
        if(vetor[i] == -1)
        {
            vetor[i] = numero;
            return 1;
        }
    }
    return 0;
}

int eliminarElemento(int vetor[TAMANHO])
{
    int posicao;

    printf("Insira a posição do elemento: ");
    scanf("%d", &posicao);

    if(posicao < 0 || posicao >= TAMANHO || vetor[posicao] == -1)
    {
        return 0;
    }
    else
    {
        vetor[posicao] = -1;
    }
    return 1;
}

void imprimirElementos(int vetor[TAMANHO])
{
    int elementoEncontrado = 0;

    printf("\nNúmeros naturais armazenados: \n");
    for(int i = 0; i < TAMANHO; i++)
    {
        if(vetor[i] > -1)
        {
            printf("%d: %d\n", i + 1, vetor[i]);
            elementoEncontrado = 1;
        }
    }

    if(!elementoEncontrado)
    {
        printf("Nenhum elemento encontrado.\n");
    }
}
