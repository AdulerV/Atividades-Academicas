#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define NUM_VOLTAS 10

/*Durante uma corrida de automóveis foram registrados os tempos obtidos em cada volta, para um determinado piloto.
Codificar uma função capaz de calcular o melhor tempo obtido pelo piloto.*/

float calcularMelhorTempo(float temposObtidos[NUM_VOLTAS]);

main()
{
    setlocale(LC_ALL, "");

    float temposObtidos[NUM_VOLTAS] = {12.3, 18.3, 89.1, 71.6, 20.1, 10.2, 81.9, 41.4, 61.1, 51.7};
    float resultado = calcularMelhorTempo(temposObtidos);

    printf("Melhor tempo obtido pelo piloto: %.2f segundos.\n", resultado);
}

float calcularMelhorTempo(float temposObtidos[NUM_VOLTAS])
{
    float melhorTempo = temposObtidos[0];

    for(int i = 1; i < NUM_VOLTAS; i++)
    {
        if(temposObtidos[i] < melhorTempo)
        {
            melhorTempo = temposObtidos[i];
        }
    }
    return melhorTempo;
}
