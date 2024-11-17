#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 10 //Poderia ser os 193 países, mas seria díficil de testar o código.

/*Codificar uma função capaz de calcular a quantidade de países com IDH (indice de desenvolvimento humano) inferior à média geral.
A ONU, junto aos 193 países participantes, é responsável pelo registro desse índice para cada país membro.*/

main()
{
    setlocale(LC_ALL, "");

    float indiceDesenvolvimento[MAX] = {0.953, 0.944, 0.354, 0.758, 0.423, 0.929, 0.842, 0.435, 0.789, 0.404};
    int resultado = calcularQuantidadePaises(indiceDesenvolvimento);

    printf("Quantidade de países com IDH inferior à média geral: %d.\n", resultado);
}

int calcularQuantidadePaises(float indiceDesenvolvimento[MAX])
{
    float media = 0;
    int quantidade = 0;

    for(int i = 0; i < MAX; i++)
    {
        media += indiceDesenvolvimento[i];
    }
    media /= MAX;

    for(int i = 0; i < MAX; i++)
    {
        if(indiceDesenvolvimento[i] < media)
        {
            quantidade++;
        }
    }
    return quantidade;
}
