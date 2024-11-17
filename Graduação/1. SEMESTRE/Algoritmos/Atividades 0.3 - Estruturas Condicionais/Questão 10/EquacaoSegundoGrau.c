#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

/*Codificar uma função capaz de calcular as raízes de uma equação do segundo grau. Aqui será necessário o retorno de uma struct pois sabemos que há 2 possibilidades:
a)2 Raízes reais (Delta >= 0).
b)Raízes indeterminadas (Delta < 0).*/

typedef struct {
    float raiz1, raiz2, tipoRaiz;
} Raizes;

Raizes calculaEquacao(float a, float b, float c);

main() {
    setlocale(LC_ALL, "");
    float coeficienteA, coeficienteB, coeficienteC;
    Raizes raizes;

    printf("Insira o coeficiente A da equação: ");
    scanf("%f", &coeficienteA);

    printf("Insira o coeficiente B da equação: ");
    scanf("%f", &coeficienteB);

    printf("Insira o coeficiente C da equação: ");
    scanf("%f", &coeficienteC);

    raizes = calculaEquacao(coeficienteA, coeficienteB, coeficienteC);

    if(raizes.tipoRaiz) {
        printf("As raízes %f e %f são raízes reais.\n", raizes.raiz1, raizes.raiz2);
    } else {
        printf("As raízes são indeterminadas.\n");
    }
}

Raizes calculaEquacao(float a, float b, float c) {
    Raizes resultado;
    float delta = ((b * b) - (4 * a * c));

    if(delta >= 0) {
        resultado.raiz1 = (-b + sqrt(delta)) / (2 * a);
        resultado.raiz2 = (-b - sqrt(delta)) / (2 * a);
        resultado.tipoRaiz = 1;
    } else {
        resultado.tipoRaiz = 0;
    }

    return resultado;
}






