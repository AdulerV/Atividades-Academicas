#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/* Codifique uma fun��o capaz de imprimir um gr�fico de temperatura. Para melhor
entendimento veja algumas poss�veis situa��es:
Para 5� a sa�da ser�: +++++
Para -5� a sa�da ser�: -----
Para 0� a sa�da ser�: 0 */

main() {
    setlocale(LC_ALL, "");
    int temperatura;

    printf("Digite a temperatura: ");
    scanf("%d", &temperatura);

    imprimeTemperatura(temperatura);
}

void imprimeTemperatura(int temperatura) {
    int contador = 0;

    while(contador != temperatura || temperatura == 0) {
        if(temperatura > 0) {
            printf("+");
            contador++;
        } else if (temperatura < 0) {
            printf("-");
            contador--;
        } else {
            printf("0");
            contador++;
            temperatura++;
        }
    }
}

