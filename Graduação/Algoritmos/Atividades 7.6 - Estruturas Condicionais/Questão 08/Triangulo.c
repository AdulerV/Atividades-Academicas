#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Codificar uma fun��o para verificar se 3 valores inteiros podem ser lados de um tri�ngulo. Em caso positivo a fun��o dever� indicar o tipo de tri�ngulo
(escaleno, is�sceles ou equil�tero). A fun��o deve retornar 0 (n�o � triangulo), 1 (escaleno), 2(is�sceles) ou 3 (equil�tero).*/

int determinaTriangulo(int lado1, int lado2, int lado3);

main() {
    setlocale(LC_ALL, "");
    int lado1, lado2, lado3, resultado;

    printf("Insira o primeiro lado: ");
    scanf("%d", &lado1);

    printf("Insira o segundo lado: ");
    scanf("%d", &lado2);

    printf("Insira o terceiro lado: ");
    scanf("%d", &lado3);

    resultado = determinaTriangulo(lado1, lado2, lado3);

    switch(resultado) {
    case 1:
        printf("Trata-se de um tr�ngulo escaleno");
        break;
    case 2:
        printf("Trata-se de um tr�ngulo is�sceles");
        break;
    case 3:
        printf("Trata-se de um tr�ngulo equil�tero");
        break;
    default:
        printf("N�o � um tri�ngulo!");
        break;
    }
}

int determinaTriangulo(int lado1, int lado2, int lado3) {
    if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
        if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
            return 3;
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return 2;
        } else if(lado1 != lado2 && lado1 != lado2 && lado2 != lado3) {
            return 1;
        }
    } else {
        return 0;
    }
}



