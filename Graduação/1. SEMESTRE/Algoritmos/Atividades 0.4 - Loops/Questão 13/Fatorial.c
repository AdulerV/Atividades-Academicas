#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Codificar uma função para calcular o fatorial de um número.*/

main () {
    setlocale(LC_ALL, "");
    int numero;

    printf("Insira o número desejado: ");
    scanf("%d", &numero);

    int resultado = calculaFatorial(numero);
    printf("O fatorial de %d é %d.\n", numero, resultado);
}

int calculaFatorial(int numero) {
    int contador = 1, fatorial = 1;

    while(contador <= numero) {
        fatorial *= contador;
        contador++;
    }
    return fatorial;
}
