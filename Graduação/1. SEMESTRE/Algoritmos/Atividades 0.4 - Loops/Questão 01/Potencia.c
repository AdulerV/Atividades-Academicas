#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//Codificar um programa para calcular a potência de um número.

int calcularPotencia(int base, int expoente);

main() {
    setlocale(LC_ALL, "");
    int base, expoente, resultado;

    printf("Insira a base: ");
    scanf("%d", &base);

    printf("Insira o expoente: ");
    scanf("%d", &expoente);

    resultado = calcularPotencia(base, expoente);
    printf("%d^%d = %d\n", base, expoente, resultado);
}

int calcularPotencia(int base, int expoente) {
    int potencia = 1;
    for(int contador = 1; contador <= expoente; contador++) {
        potencia *= base;
    }
    return potencia;
}
