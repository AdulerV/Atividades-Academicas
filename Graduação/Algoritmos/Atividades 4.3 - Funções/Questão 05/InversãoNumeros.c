#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int inverteNumero(int numero);

int main() {
    setlocale(LC_ALL,"");
    int numero, resultado;

    printf("Insira um número inteiro de 3 algarismos: ");
    scanf("%d", &numero);

    resultado = inverteNumero(numero);
    printf("O número %03d invertido é %03d\n.", numero, resultado);
    return 0;
}

int inverteNumero(int numero) {
    int unidade, dezena, centena, invertido;
    centena = (numero % 10) * 100;
    dezena = (numero % 100) - (numero % 10);
    unidade = numero / 100;
    invertido = centena + dezena + unidade;
    return invertido;
}
