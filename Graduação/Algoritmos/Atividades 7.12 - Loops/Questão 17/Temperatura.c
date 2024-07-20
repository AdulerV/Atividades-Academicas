#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/* Codifique uma função capaz de imprimir um gráfico de temperatura. Para melhor
entendimento veja algumas possíveis situações:
Para 5º a saída será: +++++
Para -5º a saída será: -----
Para 0º a saída será: 0 */

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

