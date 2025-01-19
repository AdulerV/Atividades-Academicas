#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define QTD_ELEMENTOS_PILHA 20

typedef struct EstruturaFila
{
    int informacao;
    struct EstruturaFila *proximo;
} Fila;

void imprimirMenu();
Fila *push(Fila *fila, int valor);
Fila *pop(Fila *fila);
int isVazia(Fila *fila);
void imprimirFila(Fila *fila);
int calcularNumerosElementos(Fila *fila);

int main()
{
    setlocale(LC_ALL, "");

    Fila *fila = NULL;
    char opcao;
    int valor;

    do
    {
        imprimirMenu();
        printf("Escolha uma opção: ");
        scanf(" %c", &opcao);

        switch(opcao)
        {
        case 'a':
            printf("Insira o valor a ser inserido: ");
            scanf("%d", &valor);
            fila = push(fila, valor);
            break;
        case 'r':
            fila = pop(fila);

            if(fila == NULL)
            {
                printf("A fila já está vazia.\n");
            }
            break;
        case 's':
            imprimirFila(fila);
            break;
        case 't':
            if(calcularNumerosElementos(fila))
            {
                printf("Quantidade de elementos: %d.\n", calcularNumerosElementos(fila));
            }
            else
            {
                printf("Não há elementos na fila.\n");
            }
            break;
        case 'x':
            printf("\nSaindo...\n");
            break;
        }
    }
    while(opcao != 'x');
}

void imprimirMenu()
{
    printf("\n =======================");
    printf("\n Menu");
    printf("\n =======================");
    printf("\n a - Inserir");
    printf("\n r - Remover");
    printf("\n s - Exibir elementos");
    printf("\n t - Exibir número de elementos");
    printf("\n x - Finalizar");
    printf("\n =======================\n");
}

Fila *push(Fila *fila, int valor)
{
    Fila *novoNo = (Fila*) malloc(sizeof(Fila));

    novoNo->informacao = valor;
    novoNo->proximo = NULL;

    if(fila == NULL)
    {
        return novoNo;
    }

    Fila *temporaria = fila;

    while(temporaria->proximo != NULL)
    {
        temporaria = temporaria->proximo;
    }

    temporaria->proximo = novoNo;
    return fila;
}

Fila *pop(Fila *fila)
{
    if(isVazia(fila))
    {
        return NULL;
    }
    else
    {
        Fila *nova = fila->proximo;
        free(fila);
        return nova;
    }
}

int isVazia(Fila *fila)
{
    return fila == NULL;
}

void imprimirFila(Fila *fila)
{
    int indice = 0;

    if(isVazia(fila))
    {
        printf("Não há elementos na fila.\n");
    }
    else
    {
        while(fila != NULL)
        {
            printf("%d: %d.\n", indice, fila->informacao);
            fila = fila->proximo;
            indice++;
        }
    }
}

int calcularNumerosElementos(Fila *fila)
{
    int indice = 0;

    while(fila != NULL)
    {
        indice++;
        fila = fila->proximo;
    }
    return indice;
}



