#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Fa�a uma fun��o que verifique se um valor (inteiro) � perfeito ou n�o.
Um valor � dito perfeito quando ele � igual � soma dos seus divisores, excluindo-o.
(Ex: 6 � perfeito porque 6 = 1 + 2 + 3, que s�o seus divisores).
A fun��o deve retornar verdadeiro ou falso.*/

int verificaPerfeito(int numero);

main () {
    setlocale(LC_ALL, "");
    int numero;

    printf("Insira o valor: ");
    scanf("%d", &numero);

    int resultado = verificaPerfeito(numero);

    if(resultado) {
        printf("O n�mero %d � um valor perfeito", numero);
    } else {
        printf("O n�mero %d n�o � um valor perfeito", numero);
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
