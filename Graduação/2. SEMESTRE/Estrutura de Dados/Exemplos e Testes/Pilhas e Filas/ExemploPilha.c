#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define TAMANHO_PILHA 5

typedef struct
{
    int elementos[TAMANHO_PILHA];
    int topo;
} Pilha;

void empilhar(int valor, Pilha *pilha);
void desempilhar(Pilha *pilha);
int isCheia(Pilha *pilha);
int isVazia(Pilha *pilha);

int main()
{
    setlocale(LC_ALL, "");

    Pilha pilha;
    pilha.topo = 0;

    imprimirElementos(pilha);

    for(int i = 0; i <= TAMANHO_PILHA; i++)
    {
        empilhar(i, &pilha);
    }

    imprimirElementos(pilha);

    for(int i = 0; i <= TAMANHO_PILHA; i++)
    {
        imprimirElementos(pilha);
        desempilhar(&pilha);
    }

    imprimirElementos(pilha);

}

void imprimirElementos(Pilha pilha)
{
    for(int i = pilha.topo - 1; i >= 0; i--)
    {
        printf("%d: %d.\n", i, pilha.elementos[i]);
    }
}

void empilhar(int valor, Pilha *pilha)
{
    if(isCheia(pilha))
    {
        printf("A pilha já está cheia.\n");
    }

    else
    {
        pilha->elementos[pilha->topo] = valor;
        pilha->topo++;
    }
}

void desempilhar(Pilha *pilha)
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

int isCheia(Pilha *pilha)
{
    if(pilha->topo >= TAMANHO_PILHA)
    {
        return 1;
    }
    return 0;
}

int isVazia(Pilha *pilha)
{
    if(pilha->topo == 0)
    {
        return 1;
    }
    return 0;
}
