#include <stdio.h>
#include <stdlib.h>

/*Considere o saldo de uma determinada conta banc�ria que perde 1% do seu valor ao
final de cada m�s. Codificar uma fun��o que considerando um determinado saldo
inicial para essa conta banc�ria, calcule a perda total sofrida ap�s decorrer alguns
meses.*/

float calcularPerdaSaldo(float saldoInicial, float desconto, int meses);

main()
{
    printf("Valor perdido: $%.2f \n", calcularPerdaSaldo(1000.0, 1, 3));
    printf("Valor perdido: $%.2f \n", calcularPerdaSaldo(500.2, 1, 5));
    printf("Valor perdido: $%.2f \n", calcularPerdaSaldo(225.7, 1, 7));
}

float calcularPerdaSaldo(float saldoInicial, float desconto, int meses)
{
    float saldoAtual = saldoInicial;
    int contador = 0;
    desconto /= 100;

    while(contador < meses)
    {
        saldoAtual -= saldoAtual * desconto;
        contador++;
    }
    return saldoInicial - saldoAtual;
}
