#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

typedef struct EstruturaPilha
{
    int informacao;
    struct EstruturaPilha *proximo;
} Pilha;

void imprimirMenu();
Pilha *push(Pilha *pilha, int valor);
int isCheia(Pilha *pilha);
Pilha *pop(Pilha *pilha);
int isVazia(Pilha *pilha);
void imprimirElementos(Pilha *pilha);
int calcularNumerosElementos(Pilha *pilha);

int main()
{
    setlocale(LC_ALL, "");

    Pilha *pilha = NULL;
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
            pilha = push(pilha, valor);
            break;
        case 'r':
            pilha = pop(pilha);

            if(pilha == NULL)
            {
                printf("A pilha está vazia.\n");
            }
            break;
        case 's':
            imprimirElementos(pilha);
            break;
        case 't':
            if(calcularNumerosElementos(pilha))
            {
                printf("Quantidade de elementos: %d.\n", calcularNumerosElementos(pilha));
            }
            else
            {
                printf("Não há elementos na pilha.\n");
            }
            break;
        case 'x':
            printf("\nSaindo...\n");
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

Pilha *push(Pilha *pilha, int valor)
{
    Pilha *novoNo = (Pilha*) malloc(sizeof(Pilha));

    novoNo->informacao = valor;
    novoNo->proximo = pilha;
    return novoNo;
}

Pilha *pop(Pilha *pilha)
{
    if(isVazia(pilha))
    {
        return NULL;
    }
    else
    {
        Pilha *nova = pilha->proximo;
        free(pilha);
        return nova;
    }
}

int isVazia(Pilha *pilha)
{
    return pilha == NULL;
}

void imprimirElementos(Pilha *pilha)
{
    int indice = 0;

    if(isVazia(pilha))
    {
        printf("Não há elementos na pilha.\n");
    }
    else
    {
        while(pilha != NULL)
        {
            printf("%d: %d.\n", indice, pilha->informacao);
            pilha = pilha->proximo;
            indice++;
        }
    }
}

int calcularNumerosElementos(Pilha *pilha)
{
    int indice = 0;

    while(pilha != NULL)
    {
        indice++;
        pilha = pilha->proximo;
    }

    return indice;
}

