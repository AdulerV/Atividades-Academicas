#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

/*Jogo de adivinhação contra o computador. Criar um programa que sorteie um número e permita que o usuário tente acertar.
Caso não acerte, o programa deve imprimir uma mensagem informando se o número sorteado é maior ou menor que a tentativa
feita e permitir ao usuário realizar nova tentativa. Ao acertar o número, o programa deve finalizar e imprimir a
quantidade de tentativas realizadas.*/

main() {
    setlocale(LC_ALL, "");
    int numeroSorteado, resultado;

    numeroSorteado = sortearNumero();
    resultado = jogar(numeroSorteado);
    printf("Parabéns, você acertou! Realizou %d tentativa(s).\n", resultado);
}

int sortearNumero() {
    srand(time(NULL));
    return (rand() % 5) + 1;
}

int jogar(int numeroSorteado) {
    int numero, tentativas = 0;

    do {
        printf("Insira um número entre 1 e 5: ");
        scanf("%d", &numero);
        tentativas++;

        if (numeroSorteado > numero) {
            printf("O número sorteado é maior que o número inserido.\n\n");
        } else if (numeroSorteado < numero) {
            printf("O número sorteado é menor que o número inserido.\n\n");
        }
    } while (numero != numeroSorteado);

    return tentativas;
}

