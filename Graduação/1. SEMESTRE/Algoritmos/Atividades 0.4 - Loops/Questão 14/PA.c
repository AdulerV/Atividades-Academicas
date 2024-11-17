#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Codificar uma função capaz de calcular a soma dos n primeiros termos de uma PA.*/

int calculaPA(int primeiro, int ultimo, int razao);

main () {
    setlocale(LC_ALL, "");
    int primeiroTermo, ultimoTermo, razao;

    printf("Insira o primeiro termo (a1): ");
    scanf("%d", &primeiroTermo);

    printf("Insira o ultimo termo (an): ");
    scanf("%d", &ultimoTermo);

    printf("Insira a razão (r): ");
    scanf("%d", &razao);

    int resultado = calculaPA(primeiroTermo, ultimoTermo, razao);
    printf("A soma dos n primeiros termos será %d.\n", resultado);
}

int calculaPA(int primeiro, int ultimo, int razao) {
    int termoAtual = primeiro, soma = 0;
    while(termoAtual <= ultimo) {
        soma += termoAtual;
        termoAtual += razao;
    }
    return soma;
}
