#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

#define NUM_LETRAS 20

//Codificar uma função capaz de calcular a quantidade de vogais presentes em uma frase.

main()
{
    setlocale(LC_ALL, "");

    char frase[NUM_LETRAS] = "Ola Mundo!";

    printf("Quantidade de vogais na frase: %d.\n", calcularQuantidadeVogais(frase));
}

int calcularQuantidadeVogais(char frase[NUM_LETRAS])
{
    int quantidade = 0;

    for(int i = 0; i < strlen(frase); i++)
    {
        switch(frase[i])
        {
        case 'A':
        case 'a':
            quantidade++;
            break;
        case 'E':
        case 'e':
            quantidade++;
            break;
        case 'I':
        case 'i':
            quantidade++;
            break;
        case 'O':
        case 'o':
            quantidade++;
            break;
        case 'U':
        case 'u':
            quantidade++;
            break;
        }
    }
    return quantidade;
}
