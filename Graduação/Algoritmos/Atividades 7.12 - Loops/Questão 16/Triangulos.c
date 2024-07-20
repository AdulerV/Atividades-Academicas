#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

// Codificar uma função para imprimir triângulos retângulos com altura definida pelo usuário.

void imprimirTriangulo(int altura);

main() {
    setlocale(LC_ALL, "");
    int altura;

    printf("Digite a altura do triângulo: ");
    scanf("%d", &altura);

    imprimirTriangulo(altura);
}

void imprimirTriangulo(int altura) {
    int linha = 1;
    while (linha <= altura) {
        int coluna = 1;

        while (coluna <= linha) {
            printf("*");
            coluna++;
        }
        printf("\n");
        linha++;
    }
}



