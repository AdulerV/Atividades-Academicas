#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 20

/* Codificar uma fun��o de nome 'tamanhoString' que seja capaz de calcular o tamanho de uma
string. Use aritm�tica de ponteiros para percorrer a string. Sugest�o de prot�tipo:

int tamanhoString(char *s);

Codificar tamb�m a fun��o main para que seja poss�vel testar o funcionamento da fun��o
tamanhoString. */

int tamanhoString(char *string);

int main()
{
    setlocale(LC_ALL, "");
    char *string = (char*) malloc(sizeof(char) * MAX);

    printf("Insira uma string: ");
    gets(string);

    printf("Tamanho da string: %d\n", tamanhoString(string));
    free(string);
    return 0;
}

int tamanhoString(char *string) {
    int contador = 0;

    while(*(string + contador) != '\0') {
        contador++;
    }
    return contador;
}

