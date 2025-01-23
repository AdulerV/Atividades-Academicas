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

int main()
{
    srand(time(NULL));

    Fila *fila1 = NULL;
    Fila *fila2 = NULL;
    Fila *filaPreferencial = NULL;
    int contador = 1;
    int identificador = 1;

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
    }
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
    Fila *nova = fila->proxima;
    free(fila);
    return nova;
}

