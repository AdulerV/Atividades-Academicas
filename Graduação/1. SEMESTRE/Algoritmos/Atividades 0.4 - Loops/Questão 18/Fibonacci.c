#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Faça um programa que calcule o termo de ordem n da sequência de Fibonacci.*/

main() {
    setlocale(LC_ALL, "");
    int termo, resultado;

    printf("Insira o termo de ordem n: ");
    scanf("%d", &termo);

    resultado = calcularFibonacci(termo);
    printf("O termo de ordem n é %d. ", resultado);
}

int calcularFibonacci(int termo) {
    int valorAtual = 1, valorAnterior = 0, auxiliar;

    if(termo == 0) {
        return 0;
    }

    if(termo == 1) {
        return 1;
    }

    for(int contador = 3; contador <= termo; contador++) {
        auxiliar = valorAtual;
        valorAtual += valorAnterior;
        valorAnterior = auxiliar;
    }
    return valorAtual;
}
