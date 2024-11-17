#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Imagine uma turma com 3 alunos, onde cada aluno realiza uma prova no valor de 100 pontos.
Vamos codificar um programa para calcular a média das notas da turma.*/

main() {
    setlocale(LC_ALL, "");
    float nota, media;

    printf("Insira a nota do primeiro aluno: ");
    scanf("%f", &nota);
    media += nota;

    printf("Insira a nota do segundo aluno: ");
    scanf("%f", &nota);
    media += nota;

    printf("Insira a nota do terceiro aluno: ");
    scanf("%f", &nota);
    media += nota;

    media /= 3;
    printf("\nA média entre os alunos é de %.2f pontos.", media);
}
