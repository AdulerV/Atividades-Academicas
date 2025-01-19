#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

#define QTD_PILHAS 8
#define FREQUENCIA_MAX 31

typedef struct EstruturaPilha
{
    int informacao;
    struct EstruturaPilha *proximo;
} Pilha;

Pilha *push(Pilha *pilha);
Pilha *pop(Pilha *pilha);
void imprimirPilha(Pilha *pilha);

int main()
{
    srand(time(NULL));
    Pilha *pilha = NULL;
    int frequencia;

    while(1)
    {
        for(int i = 0; i < QTD_PILHAS; i++)
        {
            frequencia = rand() % FREQUENCIA_MAX;

            for(int i = 0; i < frequencia; i++)
            {
                pilha = push(pilha);
            }
            imprimirPilha(pilha);

            for(int i = 0; i < frequencia; i++)
            {
                pilha = pop(pilha);
            }
        }
        Sleep(100);
        system("cls");
    }
}

Pilha *push(Pilha *pilha)
{
    Pilha *novo = (Pilha*) malloc(sizeof(Pilha));

    novo->informacao = '#';
    novo->proximo = pilha;

    return novo;
}

Pilha *pop(Pilha *pilha)
{
    Pilha *nova = pilha->proximo;
    free(pilha);
    return nova;
}

void imprimirPilha(Pilha *pilha)
{
    while(pilha != NULL)
    {
        printf("%c", pilha->informacao);
        pilha = pilha->proximo;
    }
    printf("\n");
}
