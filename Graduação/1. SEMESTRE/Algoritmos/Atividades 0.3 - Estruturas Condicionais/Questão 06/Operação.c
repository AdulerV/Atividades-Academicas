#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//Codificar uma fun��o capaz de calcular o resultado de uma determinada opera��o (soma, subtra��o, multiplica��o e divis�o) entre dois operandos.

float calculadora(float num1, float num2, char operador);

main() {
    setlocale(LC_ALL, "");
    float num1, num2;
    char operador;

    printf("Insira o primeiro n�mero: ");
    scanf("%f", &num1);

    printf("Insira o segundo n�mero: ");
    scanf("%f", &num2);

    printf("Insira o operador aritm�tico (+, -, *, /): ");
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

