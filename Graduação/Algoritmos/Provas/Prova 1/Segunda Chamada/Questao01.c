#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/*Codificar uma função que simule o jogo “Cara ou Coroa” e realize os seguintes cálculos:
a) Quantidade de vezes que foi sorteado cara: x
b) Quantidade de vezes que foi sorteado coroa: x*/

typedef struct {
    int cara;
    int coroa;
} Moeda;

Moeda simularCaraCoroa(int qtdJogadas);

main() {
    int qtdJogadas;
    Moeda resultado;

    printf("Insira a quantidade de jogadas desejadas: ");
    scanf("%d", &qtdJogadas);

    resultado = simularCaraCoroa(qtdJogadas);
    printf("Quantidade de vezes que foi sorteado cara: %d\n", resultado.cara);
    printf("Quantidade de vezes que foi sorteado coroa: %d\n", resultado.coroa);
}

Moeda simularCaraCoroa(int qtdJogadas) {
    Moeda moeda = {0, 0};
    srand(time(NULL));

    for(int contador = 0; contador < qtdJogadas; contador++) {
        int faceSorteada = rand() % 2; //Entre 0 e 1

        if(faceSorteada) {
            moeda.cara++;
        } else {
            moeda.coroa++;
        }
    }
    return moeda;
}


