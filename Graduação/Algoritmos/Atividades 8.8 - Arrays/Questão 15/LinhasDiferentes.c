#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

#define MAX 50

/*Codificar uma fun��o para mostrar cada parte do nome de uma pessoa em linhas diferentes. Veja o exemplo abaixo.
    Entrada: Jos� da Silva Oliveira Santos
    Sa�da:  Jos�
            da
            Silva
            Oliveira
            Santos*/

void imprimirEmLinhasDiferentes(char nome[MAX]);

main() {
    setlocale(LC_ALL, "");
    char nome[MAX];

    printf("Insira o nome: ");
    gets(nome);

    imprimirEmLinhasDiferentes(nome);
}

void imprimirEmLinhasDiferentes(char nome[MAX]) {
    for(int i = 0; i < strlen(nome); i++) {
        printf("%c", nome[i]);
        if(nome[i] == ' ') {
            printf("\n");
        }
    }
}
