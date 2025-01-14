#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

struct TipoPilha
{
    int info;
    struct TipoPilha *prox;
};
typedef struct TipoPilha Pilha;

/* inser��o de um elemento no topo da pilha. */
Pilha *insere(Pilha *atual, int v);
/* recupera um elemento do topo da pilha.*/
Pilha *recupera(Pilha *atual);
/* retorna o tamanho da pilha. */
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
        printf("Espa�o insuficiente para alocar mem�ria.\n");
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
