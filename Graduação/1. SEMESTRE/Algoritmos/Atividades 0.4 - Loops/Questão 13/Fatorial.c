#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Codificar uma fun��o para calcular o fatorial de um n�mero.*/

main () {
    setlocale(LC_ALL, "");
    int numero;

    printf("Insira o n�mero desejado: ");
    scanf("%d", &numero);

    int resultado = calculaFatorial(numero);
    printf("O fatorial de %d � %d.\n", numero, resultado);
}

int calculaFatorial(int numero) {
    int contador = 1, fatorial = 1;

    while(contador <= numero) {
        fatorial *= contador;
        contador++;
    }
    return fatorial;
}
