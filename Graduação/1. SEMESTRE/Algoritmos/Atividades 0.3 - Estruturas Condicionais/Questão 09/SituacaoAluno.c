#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Codificar uma fun��o para verificar se 3 valores inteiros podem ser lados de um tri�ngulo. Em caso positivo a fun��o dever� indicar o tipo de tri�ngulo
(escaleno, is�sceles ou equil�tero). A fun��o deve retornar 0 (n�o � triangulo), 1 (escaleno), 2(is�sceles) ou 3 (equil�tero).*/

typedef struct {
    int matricula, faltas;
    float nota1, nota2, media;
} Aluno;

void situacaoAluno(Aluno aluno);

main() {
    setlocale(LC_ALL, "");
    Aluno aluno;

    printf("Insira sua m�tricula: ");
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
        printf("Voc� est� aprovado!");
    } else {
        printf("Voc� est� reprovado!");
    }
}




