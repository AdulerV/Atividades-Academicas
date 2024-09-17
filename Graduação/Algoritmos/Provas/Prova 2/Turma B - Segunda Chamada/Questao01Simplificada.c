#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

#define NUM_LETRAS 20

//Codificar uma função capaz de calcular a quantidade de caracteres presentes em uma frase.

main()
{
    setlocale(LC_ALL, "");

    char frase[NUM_LETRAS] = "Ola Mundo!";

    printf("Quantidade de caracteres na frase: %d.\n", calcularQuantidadeCaracteres(frase));
}

int calcularQuantidadeCaracteres(char frase[NUM_LETRAS]) {
    int quantidade = 0;

    return strlen(frase);
}


