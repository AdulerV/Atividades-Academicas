#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

#define MAX 50

char* inverterPalavra(char palavra[MAX]);

int main() {
    setlocale(LC_ALL, "");

    char palavra[MAX];

    printf("Insira uma palavra: ");
    gets(palavra);

    int ultimaPosicao = strlen(palavra) - 1;

    for(int i = ultimaPosicao; i >= 0; i--) {
        printf("%c", palavra[i]);
    }
    return 0;
}


