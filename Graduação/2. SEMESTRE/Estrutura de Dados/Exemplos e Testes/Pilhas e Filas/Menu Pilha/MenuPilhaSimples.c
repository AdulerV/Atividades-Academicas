#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define QTD_ELEMENTOS_PILHA 20

typedef struct
{
    int vetor[QTD_ELEMENTOS_PILHA];
    int topo;
} Pilha;

void imprimirMenu();
void push(Pilha *pilha, int valor);
int isCheia(Pilha *pilha);
void pop(Pilha *pilha);
int isVazia(Pilha *pilha);
void imprimirElementos(Pilha *pilha);
int calcularNumerosElementos(Pilha *pilha);

int main()
{
    setlocale(LC_ALL, "");

    Pilha *pilha = (Pilha*) malloc(sizeof(Pilha));
    pilha->topo = 0;
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
            push(pilha, valor);
            break;
        case 'r':
            pop(pilha);
            break;
        case 's':
            imprimirElementos(pilha);
            break;
        case 't':
            printf("Quantidade de elementos: %d.\n", calcularNumerosElementos(pilha));
            break;
        case 'x':
            break;
        default:
            printf("\nOpção inserida inválida.\n");
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

void push(Pilha *pilha, int valor)
{
    if(isCheia(pilha))
    {
        printf("A pilha já está cheia.\n");
    }
    else
    {
        pilha->vetor[pilha->topo] = valor;
        pilha->topo++;
    }
}

int isCheia(Pilha *pilha)
{
    if(pilha->topo >= QTD_ELEMENTOS_PILHA)
    {
        return 1;
    }
    return 0;
}

void pop(Pilha *pilha)
{
    if(isVazia(pilha))
    {
        printf("A pilha já está vazia.\n");
    }
    else
    {
        pilha->topo--;
    }
}

int isVazia(Pilha *pilha)
{
    return pilha->topo == 0;
}

void imprimirElementos(Pilha *pilha)
{
    if(isVazia(pilha))
    {
        printf("Não há elementos na pilha.\n");
    }
    else
    {
        for(int i = (pilha->topo - 1); i >= 0; i--)
        {
            printf("%d: %d.\n", i, pilha->vetor[i]);
        }
    }
}

int calcularNumerosElementos(Pilha *pilha)
{
    return pilha->topo;
}

