#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Vamos propor uma vers�o mais flex�vel onde o usu�rio � que define
a quantidade de notas a serem manipuladas pelo programa.*/

main() {
    setlocale(LC_ALL, "");
    float nota, media = 0;
    int quantidade, contador = 1;

    printf("Insira a quantidade de notas: ");
    scanf("%d", &quantidade);

    while(contador <= quantidade) {
        printf("Insira a %d� nota: ", contador);
        scanf("%f", &nota);
        media += nota;
        contador++;
    }
    media /= quantidade;
    printf("A m�dia entre os alunos � de %.2f pontos.\n", media);
}
