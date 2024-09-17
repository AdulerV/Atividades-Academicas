#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 10 //Poderia ser os 193 pa�ses, mas seria d�ficil de testar o c�digo.

/*Codificar uma fun��o capaz de calcular a quantidade de pa�ses com IDH (indice de desenvolvimento humano) inferior � m�dia geral.
A ONU, junto aos 193 pa�ses participantes, � respons�vel pelo registro desse �ndice para cada pa�s membro.*/

main()
{
    setlocale(LC_ALL, "");

    float indiceDesenvolvimento[MAX] = {0.953, 0.944, 0.354, 0.758, 0.423, 0.929, 0.842, 0.435, 0.789, 0.404};
    int resultado = calcularQuantidadePaises(indiceDesenvolvimento);

    printf("Quantidade de pa�ses com IDH inferior � m�dia geral: %d.\n", resultado);
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
