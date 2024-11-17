#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Vamos propor uma versão mais flexível onde o usuário é que define
a quantidade de notas a serem manipuladas pelo programa.*/

main() {
    setlocale(LC_ALL, "");
    float nota, media = 0;
    int quantidade, contador = 1;

    printf("Insira a quantidade de notas: ");
    scanf("%d", &quantidade);

    while(contador <= quantidade) {
        printf("Insira a %d° nota: ", contador);
        scanf("%f", &nota);
        media += nota;
        contador++;
    }
    media /= quantidade;
    printf("A média entre os alunos é de %.2f pontos.\n", media);
}
