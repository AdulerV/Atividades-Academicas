#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//Codificar uma fun��o que imprima o m�s e a quinzena por extenso.

int calculaQuinzena(int dia, int mes);

main() {
    setlocale(LC_ALL, "");
    int dia, mes;

    printf("Insira o dia: ");
    scanf("%d", &dia);

    printf("Insira o m�s: ");
    scanf("%d", &mes);

    if((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12)) {
        calculaQuinzena(dia, mes);
    } else {
        printf("Dados Inv�lidos!");
    }
}

int calculaQuinzena(int dia, int mes) {
    if(dia >= 1 && dia <= 15) {
        printf("Primeira quinzena ");
    } else {
        printf("Segunda quinzena ");
    }

    switch(mes) {
    case 1:
        printf("de Janeiro.\n");
        break;
    case 2:
        printf("de Fevereiro.\n");
        break;
    case 3:
        printf("de Mar�o.\n");
        break;
    case 4:
        printf("de Abril.\n");
        break;
    case 5:
        printf("de Maio.\n");
        break;
    case 6:
        printf("de Junho.\n");
        break;
    case 7:
        printf("de Julho.\n");
        break;
    case 8:
        printf("de Agosto.\n");
        break;
    case 9:
        printf("de Setembro.\n");
        break;
    case 10:
        printf("de Outubro.\n");
        break;
    case 11:
        printf("de Novembro.\n");
        break;
    case 12:
        printf("de Dezembro.\n");
        break;
    }
}
