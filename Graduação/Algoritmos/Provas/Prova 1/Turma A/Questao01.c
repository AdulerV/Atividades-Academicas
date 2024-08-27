#include <stdio.h>
#include <stdlib.h>

/*Considere o saldo de uma determinada conta bancária que perde 1% do seu valor ao
final de cada mês. Codificar uma função que considerando um determinado saldo
inicial para essa conta bancária, calcule a perda total sofrida após decorrer alguns
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
