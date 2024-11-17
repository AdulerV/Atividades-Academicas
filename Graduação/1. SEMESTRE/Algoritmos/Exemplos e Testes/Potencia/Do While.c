#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

main() {
    setlocale(LC_ALL, "");
    int base, expoente;

    printf("Insira a base: ");
    scanf("%d", &base);

    printf("Insira a expoente: ");
    scanf("%d", &expoente);

    int resultado = calculaPotencia(base, expoente);
    printf("%d^%d = %d", base, expoente, resultado);
}

int calculaPotencia(int base, int expoente) {
    int contador = 1, resultado = 1;
    do {
        resultado *= base;
        contador++;
    } while(contador <= expoente);
    return resultado;
}


