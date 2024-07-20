#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

/*Codificar uma função capaz de calcular a soma dos n primeiros termos de uma PG.*/

int calculaPG(int primeiro, int termos, int razao);

main () {
    setlocale(LC_ALL, "");
    int primeiroTermo, numTermos, razao;

    printf("Insira o primeiro termo (a1): ");
    scanf("%d", &primeiroTermo);

    printf("Insira o número de termos (n): ");
    scanf("%d", &numTermos);

    printf("Insira a razão (r): ");
    scanf("%d", &razao);

    int resultado = calculaPG(primeiroTermo, numTermos, razao);
    printf("A soma dos n primeiros termos será %d.\n", resultado);
}

int calculaPG(int primeiro, int termos, int razao) {
    int soma = 0, contador = 0;

    while(contador < termos) {
        soma += primeiro;
        primeiro *= razao;
        contador++;
    }
    return soma;
}
