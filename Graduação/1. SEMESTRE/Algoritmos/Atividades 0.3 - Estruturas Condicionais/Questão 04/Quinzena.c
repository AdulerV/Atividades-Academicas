#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//Codificar uma fun��o para calcular a quinzena a que pertence um determinado dia do m�s.

int calculaQuinzena(int dia);

int main() {
    setlocale(LC_ALL, "");
    int dia, resultado;

    printf("Insira o dia do m�s: ");
    scanf("%d", &dia);

    resultado = calculaQuinzena(dia);

    if(resultado == 1) {
        printf("O dia %d pertence a primeira quinzena.\n", dia);
    } else if(resultado == 2) {
        printf("O dia %d pertence a segunda quinzena.\n", dia);
    } else {
        printf("Dia inv�lido!\n");
    }
}

int calculaQuinzena(int dia) {
    if(dia >= 1 && dia <= 15) {
        return 1;
    } else if (dia >= 16 && dia <= 31) {
        return 2;
    }
}
