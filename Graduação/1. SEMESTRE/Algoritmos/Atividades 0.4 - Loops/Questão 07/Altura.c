#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/* Chico tem 1,50 metro de altura e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metro e cresce 3 centímetros por ano.
Codificar uma função para calcular quantos anos serão necessários para que Zé alcance uma altura maior que a do Chico. */

int calculaAltura(float alturaChico, float alturaZe);

main () {
    setlocale(LC_ALL, "");
    int resultado = calculaAltura(1.50, 1.10);
    printf("Serão necessários %d anos para que Zé seja maior que Chico.\n", resultado);
}

int calculaAltura(float alturaChico, float alturaZe) {
    int anos = 0;
    while(alturaZe <= alturaChico) {
        alturaChico += 0.02;
        alturaZe += 0.03;
        anos++;
    }
    return anos;
}
