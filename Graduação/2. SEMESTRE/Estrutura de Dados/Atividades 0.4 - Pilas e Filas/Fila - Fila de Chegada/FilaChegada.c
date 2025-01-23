#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>
#include <windows.h>

typedef struct EstruturaFila
{
    int identificador;
    struct EstruturaFila *proxima;
} Fila;

void imprimirFila(Fila *fila, int id);
Fila *push(Fila *fila, int id);
Fila *pop(Fila *fila);

int main()
{
    setlocale(LC_ALL, "");
    srand(time(NULL));

    Fila *fila1 = NULL;
    Fila *fila2 = NULL;
    Fila *filaPreferencial = NULL;

    int contador = 1;
    int identificador = 0;
    int auxiliar = 0;

    for(int i = 0; i < 10; i++)
    {
        int aleatorio = rand() % 3 + 1;

        switch(aleatorio)
        {
        case 1:
            fila1 = push(fila1, contador);
            break;
        case 2:
            fila2 = push(fila2, contador);
            break;
        case 3:
            filaPreferencial = push(filaPreferencial, contador);
            break;
        }
        contador++;
    }

    while(1)
    {
        int aleatorio = rand() % 3 + 1;

        switch(aleatorio)
        {
        case 1:
            fila1 = push(fila1, contador);
            break;
        case 2:
            fila2 = push(fila2, contador);
            break;
        case 3:
            filaPreferencial = push(filaPreferencial, contador);
            break;
        }
        contador++;

        imprimirFila(fila1, 1);
        imprimirFila(fila2, 2);
        imprimirFila(filaPreferencial, 3);
        printf("\n");

        if(identificador == 0 && auxiliar == 0)
        {
            fila1 = pop(fila1);
            identificador = 1;
            auxiliar = 1;
        }
        else if(identificador == 0 && auxiliar == 1)
        {
            fila2 = pop(fila2);
            identificador = 1;
            auxiliar = 0;
        }
        else
        {
            filaPreferencial = pop(filaPreferencial);
            identificador = 0;
        }
        Sleep(3000);
    }
}

void imprimirFila(Fila *fila, int id)
{
    printf("Fila %d: ", id);

    if(fila == NULL)
    {
        printf("Fila vazia. ");
    }
    else
    {
        while(fila != NULL)
        {
            printf("%d -> ", fila->identificador);
            fila = fila->proxima;
        }
    }
    printf("Guichê de atendimento.\n");
}

Fila *push(Fila *fila, int id)
{
    Fila *novo = (Fila*) malloc(sizeof(Fila));
    novo->identificador = id;
    novo->proxima = NULL;

    if(fila == NULL)
    {
        return novo;
    }
    Fila *temporaria = fila;

    while(temporaria->proxima != NULL)
    {
        temporaria = temporaria->proxima;
    }
    temporaria->proxima = novo;
    return fila;
}

Fila *pop(Fila *fila)
{
    if(fila == NULL)
    {
        return NULL;
    }

    Fila *nova = fila->proxima;
    free(fila);
    return nova;
}
