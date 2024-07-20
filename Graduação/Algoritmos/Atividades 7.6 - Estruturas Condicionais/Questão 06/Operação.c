#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//Codificar uma função capaz de calcular o resultado de uma determinada operação (soma, subtração, multiplicação e divisão) entre dois operandos.

float calculadora(float num1, float num2, char operador);

main() {
    setlocale(LC_ALL, "");
    float num1, num2;
    char operador;

    printf("Insira o primeiro número: ");
    scanf("%f", &num1);

    printf("Insira o segundo número: ");
    scanf("%f", &num2);

    printf("Insira o operador aritmético (+, -, *, /): ");
    operador = getche();

    printf("\nResultado: %f\n", calculadora(num1, num2, operador));
}

float calculadora(float num1, float num2, char operador) {
    switch(operador) {
    case '+':
        return (num1 + num2);
        break;
    case '-':
        return (num1 - num2);
        break;
    case '*':
        return (num1 * num2);
        break;
    case '/':
        return (num1 / num2);
        break;
    default:
        return 0;
    }
}

