#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

typedef struct EstruturaTrecho
{
    float extensao;
    struct EstruturaTrecho *proximo;
} Trecho;

void imprimirMenu();
void imprimirTrechos(Trecho *filaTrechos);
float calcularExtensaoTotal(Trecho *filaTrechos);
Trecho *inserirTrecho(Trecho *filaTrechos, float extensao);
Trecho *removerTrecho(Trecho *filaTrechos);

int main()
{
    setlocale(LC_ALL, "");

    Trecho *filaTrechos = NULL;
    float extensao;
    int opcao;

    do
    {
        imprimirMenu();
        printf("Escolha a opção: ");
        scanf("%d", &opcao);

        switch(opcao)
        {
        case 1:
            printf("\nInsira a extensão do novo trecho: ");
            scanf("%f", &extensao);
            if(extensao <= 0)
            {
                printf("Extensão inserida inválida.\n");
            }
            else
            {
                filaTrechos = inserirTrecho(filaTrechos, extensao);
            }
            break;
        case 2:
            if(filaTrechos == NULL)
            {
                printf("\nSem trechos para serem retirados.\n");
            }
            else
            {
                filaTrechos = removerTrecho(filaTrechos);
            }
            break;
        case 3:
            printf("\nExtensão total a ser feita: %.2f.\n", calcularExtensaoTotal(filaTrechos));
            break;
        case 4:
            imprimirTrechos(filaTrechos);
            break;
        case 5:
            printf("\nSaindo...\n");
            break;
        default:
            printf("\nOpção inserida inválida.\n");
        }
    }
    while(opcao != 5);
}

void imprimirMenu()
{
    printf("\n==================MENU====================\n");
    printf("1. Incluir novo trecho.\n");
    printf("2. Remover trecho concluido.\n");
    printf("3. Cálcular extensão total a ser feita.\n");
    printf("4. Imprimir trechos a serem construídos.\n");
    printf("5. Sair do programa.\n");
}

void imprimirTrechos(Trecho *filaTrechos)
{
    int indice = 0;

    if(filaTrechos == NULL)
    {
        printf("\nNão há trechos a serem construídos.\n");
        return;
    }

    while(filaTrechos != NULL)
    {
        printf("\n%d: %.2f.", indice, filaTrechos->extensao);
        filaTrechos = filaTrechos->proximo;
        indice++;
    }
    printf("\n");
}

float calcularExtensaoTotal(Trecho *filaTrechos)
{
    float total = 0;

    while(filaTrechos != NULL)
    {
        total += filaTrechos->extensao;
        filaTrechos = filaTrechos->proximo;
    }
    return total;
}

Trecho *inserirTrecho(Trecho *filaTrechos, float extensao)
{
    Trecho *novoTrecho = (Trecho*) malloc(sizeof(Trecho));
    novoTrecho->extensao = extensao;
    novoTrecho->proximo = NULL;

    if(filaTrechos == NULL)
    {
        return novoTrecho;
    }

    Trecho *atual = filaTrechos;

    while(atual->proximo != NULL)
    {
        atual = atual->proximo;
    }
    atual->proximo = novoTrecho;
    return filaTrechos;
}

Trecho *removerTrecho(Trecho *filaTrechos)
{
    Trecho *novaFila = filaTrechos->proximo;
    free(filaTrechos);
    return novaFila;
}
