#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

/*Jogo de adivinha��o contra o computador. Criar um programa que sorteie um n�mero e permita que o usu�rio tente acertar.
Caso n�o acerte, o programa deve imprimir uma mensagem informando se o n�mero sorteado � maior ou menor que a tentativa
feita e permitir ao usu�rio realizar nova tentativa. Ao acertar o n�mero, o programa deve finalizar e imprimir a
quantidade de tentativas realizadas.*/

main() {
    setlocale(LC_ALL, "");
    int numeroSorteado, resultado;

    numeroSorteado = sortearNumero();
    resultado = jogar(numeroSorteado);
    printf("Parab�ns, voc� acertou! Realizou %d tentativa(s).\n", resultado);
}

int sortearNumero() {
    srand(time(NULL));
    return (rand() % 5) + 1;
}

int jogar(int numeroSorteado) {
    int numero, tentativas = 0;

    do {
        printf("Insira um n�mero entre 1 e 5: ");
        scanf("%d", &numero);
        tentativas++;

        if (numeroSorteado > numero) {
            printf("O n�mero sorteado � maior que o n�mero inserido.\n\n");
        } else if (numeroSorteado < numero) {
            printf("O n�mero sorteado � menor que o n�mero inserido.\n\n");
        }
    } while (numero != numeroSorteado);

    return tentativas;
}

