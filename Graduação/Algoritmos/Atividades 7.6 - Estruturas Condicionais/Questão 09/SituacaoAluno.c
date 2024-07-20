#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Codificar uma função para verificar se 3 valores inteiros podem ser lados de um triângulo. Em caso positivo a função deverá indicar o tipo de triângulo
(escaleno, isósceles ou equilátero). A função deve retornar 0 (não é triangulo), 1 (escaleno), 2(isósceles) ou 3 (equilátero).*/

typedef struct {
    int matricula, faltas;
    float nota1, nota2, media;
} Aluno;

void situacaoAluno(Aluno aluno);

main() {
    setlocale(LC_ALL, "");
    Aluno aluno;

    printf("Insira sua mátricula: ");
    scanf("%d", &aluno.matricula);

    printf("Insira sua primeira nota: ");
    scanf("%f", &aluno.nota1);

    printf("Insira sua segunda nota: ");
    scanf("%f", &aluno.nota2);

    printf("Insira suas faltas: ");
    scanf("%d", &aluno.faltas);

    aluno.media = (aluno.nota1 + aluno.nota2) / 2;
    situacaoAluno(aluno);
}

void situacaoAluno(Aluno aluno) {
    printf("Aluno %d, suas notas:\n", aluno.matricula);
    printf("Nota1: %.1f\n", aluno.nota1);
    printf("Nota2: %.1f\n", aluno.nota2);
    printf("Quantidade de faltas: %d\n", aluno.faltas);

    if(aluno.faltas < 15 && aluno.media >= 6) {
        printf("Você está aprovado!");
    } else {
        printf("Você está reprovado!");
    }
}




