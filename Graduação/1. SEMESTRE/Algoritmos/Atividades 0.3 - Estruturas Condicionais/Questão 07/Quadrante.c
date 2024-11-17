#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//Codificar uma função capaz de determinar o quadrante em que um ângulo está localizado no plano cartesiano.

int determinaQuadrante(int angulo);

main() {
    setlocale(LC_ALL, "");
    int angulo, resultado;

    printf("Insira o ângulo desejado: ");
    scanf("%d", &angulo);

    resultado = determinaQuadrante(angulo);

    switch(resultado) {
    case 1:
        printf("%d° pertence ao primeiro quadrante.\n", angulo);
        break;
    case 2:
        printf("%d° pertence ao segundo quadrante.\n", angulo);
        break;
    case 3:
        printf("%d° pertence ao terceiro quadrante.\n", angulo);
        break;
    case 4:
        printf("%d° pertence ao quarto quadrante.\n", angulo);
        break;
    default:
        printf("Ângulo Inválido!");
    }
}

int determinaQuadrante(int angulo) {
    if(angulo >= 0 && angulo <= 90) {
        return 1;
    } else if (angulo > 90 && angulo <= 180) {
        return 2;
    } else if (angulo > 180 && angulo <= 270) {
        return 3;
    } else if (angulo > 270 && angulo <= 360) {
        return 4;
    } else {
        return 0;
    }
}

