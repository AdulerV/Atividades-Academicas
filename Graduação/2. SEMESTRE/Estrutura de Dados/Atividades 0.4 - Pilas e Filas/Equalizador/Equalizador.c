#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>
#include <windows.h>

#define TAMANHO_PILHA 8
#define MAX_CARACTERES 255

typedef struct EstruturaPilha
{
    char *valor;
    struct EstruturaPilha *proximo;
} Pilha;

char* gerarElementos(char caractere);
Pilha *push(Pilha *atual, char *valor);
Pilha *pop(Pilha *atual);

int main()
{
    Pilha *pilha = NULL;
    srand(time(NULL));

    imprimirPilha(pilha);

    for(int i = 0; i < TAMANHO_PILHA; i++)
    {
        pilha = push(pilha, gerarElementos('#'));
    }
    imprimirPilha(pilha);

    for(int i = 0; i < TAMANHO_PILHA; i++)
    {
        pilha = pop(pilha);
    }
    imprimirPilha(pilha);
}

char* gerarElementos(char caractere)
{
    int aleatorio = rand() % 30 + 2;
    char *valor = (char*) malloc(sizeof(char) * aleatorio);

    for(int i = 0; i < aleatorio; i++)
    {
        valor[i] = '#';
    }
    valor[aleatorio - 1] = '\0';
    return valor;
}

void imprimirPilha(Pilha *atual)
{
    while(atual != NULL)
    {
        printf("%s\n", atual->valor);
        atual = atual->proximo;
    }
    Sleep(200);
}

Pilha *push(Pilha *atual, char *valor)
{
    Pilha *novo = (Pilha*) malloc(sizeof(Pilha));

    if(novo == NULL)
    {
        printf("Erro ao alocar memória.\n");
        exit(1);
    }

    novo->valor = valor;
    novo->proximo = atual;
    return novo;
}

Pilha *pop(Pilha *atual)
{
    Pilha *nova = atual;
    nova = atual->proximo;

    free(atual->valor);
    free(atual);
    return nova;
}
