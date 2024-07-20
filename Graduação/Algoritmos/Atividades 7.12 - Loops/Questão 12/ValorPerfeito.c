#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Faça uma função que verifique se um valor (inteiro) é perfeito ou não.
Um valor é dito perfeito quando ele é igual à soma dos seus divisores, excluindo-o.
(Ex: 6 é perfeito porque 6 = 1 + 2 + 3, que são seus divisores).
A função deve retornar verdadeiro ou falso.*/

int verificaPerfeito(int numero);

main () {
    setlocale(LC_ALL, "");
    int numero;

    printf("Insira o valor: ");
    scanf("%d", &numero);

    int resultado = verificaPerfeito(numero);

    if(resultado) {
        printf("O número %d é um valor perfeito", numero);
    } else {
        printf("O número %d não é um valor perfeito", numero);
    }
}

int verificaPerfeito(int numero) {
    int contador = 1, divisores = 0;

    while(contador < numero) {
        if(numero % contador == 0) {
            divisores += contador;
        }
        contador++;
    }
    return (divisores == numero);
}
