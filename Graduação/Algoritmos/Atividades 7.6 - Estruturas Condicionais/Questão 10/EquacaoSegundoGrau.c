#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

/*Codificar uma fun��o capaz de calcular as ra�zes de uma equa��o do segundo grau. Aqui ser� necess�rio o retorno de uma struct pois sabemos que h� 2 possibilidades:
a)2 Ra�zes reais (Delta >= 0).
b)Ra�zes indeterminadas (Delta < 0).*/

typedef struct {
    float raiz1, raiz2, tipoRaiz;
} Raizes;

Raizes calculaEquacao(float a, float b, float c);

main() {
    setlocale(LC_ALL, "");
    float coeficienteA, coeficienteB, coeficienteC;
    Raizes raizes;

    printf("Insira o coeficiente A da equa��o: ");
    scanf("%f", &coeficienteA);

    printf("Insira o coeficiente B da equa��o: ");
    scanf("%f", &coeficienteB);

    printf("Insira o coeficiente C da equa��o: ");
    scanf("%f", &coeficienteC);

    raizes = calculaEquacao(coeficienteA, coeficienteB, coeficienteC);

    if(raizes.tipoRaiz) {
        printf("As ra�zes %f e %f s�o ra�zes reais.\n", raizes.raiz1, raizes.raiz2);
    } else {
        printf("As ra�zes s�o indeterminadas.\n");
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






