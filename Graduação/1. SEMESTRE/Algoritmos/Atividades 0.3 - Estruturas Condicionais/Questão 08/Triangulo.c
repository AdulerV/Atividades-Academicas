#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Codificar uma função para verificar se 3 valores inteiros podem ser lados de um triângulo. Em caso positivo a função deverá indicar o tipo de triângulo
(escaleno, isósceles ou equilátero). A função deve retornar 0 (não é triangulo), 1 (escaleno), 2(isósceles) ou 3 (equilátero).*/

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
        printf("Trata-se de um trângulo escaleno");
        break;
    case 2:
        printf("Trata-se de um trângulo isósceles");
        break;
    case 3:
        printf("Trata-se de um trângulo equilátero");
        break;
    default:
        printf("Não é um triângulo!");
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



