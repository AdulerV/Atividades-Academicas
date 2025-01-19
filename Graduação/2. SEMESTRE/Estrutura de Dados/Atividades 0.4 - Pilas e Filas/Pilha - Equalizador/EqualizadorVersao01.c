#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>
#include <windows.h>

#define TAMANHO_PILHA 8
#define MAX_CARACTERES 255
#define REPETICOES_EQUALIZADOR 50

typedef struct EstruturaPilha
{
    char *valor;
    struct EstruturaPilha *proximo;
} Pilha;

void imprimirEqualizador(Pilha *pilha);
void imprimirPilha(Pilha *atual);
char* gerarElementos(char caractere);
Pilha *push(Pilha *atual, char *valor);
Pilha *pop(Pilha *atual);

int main()
{
    Pilha *pilha = NULL;
    srand(time(NULL));
    imprimirEqualizador(pilha);
}

void imprimirEqualizador(Pilha *pilha)
{
    for(int i = 0; i < REPETICOES_EQUALIZADOR; i++)
    {
        for(int i = 0; i < TAMANHO_PILHA; i++)
        {
            pilha = push(pilha, gerarElementos('#'));
        }

        imprimirPilha(pilha);
        Sleep(100);
        system("cls");

        for(int i = 0; i < TAMANHO_PILHA; i++)
        {
            pilha = pop(pilha);
        }
    }
}

void imprimirPilha(Pilha *atual)
{
    while(atual != NULL)
    {
        printf("%s\n", atual->valor);
        atual = atual->proximo;
    }
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

Pilha *pop(Pilha *pilha)
{
    Pilha *nova = pilha->proximo;
    free(pilha);
    return nova;
}
