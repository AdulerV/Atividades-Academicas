#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

void imprimeGraficoTemperatura(int temperatura);

main () {
    int temperatura;

    printf("Insira a temperatura: ");
    scanf("%d", &temperatura);

    imprimeGraficoTemperatura(temperatura);
}

void imprimeGraficoTemperatura(int temperatura) {
    int contador = 1;

    do {
        printf("O");
        contador++;
    } while(contador <= temperatura);
}
