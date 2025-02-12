#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

struct TipoPilha
{
    int info;
    struct TipoPilha *prox;
};
typedef struct TipoPilha Pilha;

Pilha *insere(Pilha *atual, int v);
Pilha *recupera(Pilha *atual);
int getTamanho(Pilha *atual);

int main()
{
    Pilha *pilha = NULL;
    printf("Tamanho: %d.\n", getTamanho(pilha));

    for(int i = 0; i < 10; i++)
    {
        pilha = insere(pilha, i);
    }

    printf("Tamanho: %d.\n", getTamanho(pilha));

    for(int i = 0; i < 9; i++)
    {
        pilha = recupera(pilha);
    }

    printf("Tamanho: %d.\n", getTamanho(pilha));
}

Pilha *recupera(Pilha *atual)
{
    Pilha *novo = atual->prox;
    free(atual);
    return novo;
}

Pilha *insere(Pilha *atual, int v)
{
    Pilha *novo = (Pilha*) malloc(sizeof(Pilha));

    if (novo == NULL)
    {
        printf("Espaço insuficiente para alocar memória.\n");
        exit(1);
    }

    novo->info = v;
    novo->prox = atual;

    return novo;
}

int getTamanho(Pilha *atual)
{
    int tamanho = 0;

    while(atual != NULL)
    {
        atual = atual->prox;
        tamanho++;
    }
    return tamanho;
}
