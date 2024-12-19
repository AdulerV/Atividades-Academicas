#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define QTD_ALUNOS 5

typedef struct
{
    char *nome;
    int matricula;
    float nota;
} Aluno;

void inserirDadosAlunos(Aluno *alunos);
float calcularMediaAlunos(Aluno *alunos);
int imprimirAlunosAcimaMedia(Aluno *alunos);

int main()
{
    setlocale(LC_ALL, "");
    Aluno *alunos = (Aluno*) malloc(sizeof(Aluno) * QTD_ALUNOS);

    inserirDadosAlunos(alunos);
    calcularMediaAlunos(alunos);
    imprimirAlunosAcimaMedia(alunos);

    free(alunos);
}

void inserirDadosAlunos(Aluno *alunos)
{
    for(int i = 0; i < QTD_ALUNOS; i++)
    {
        (alunos + i)->nome = (char*) malloc(sizeof(char) * 255);
        printf("Insira o nome do %d. aluno: ", i + 1);
        scanf("%s", (alunos + i)->nome);

        printf("Insira a matrícula de %s: ", (alunos + i)->nome);
        scanf("%d", &((alunos + i)->matricula));

        printf("Insira a nota de %s: ", (alunos + i)->nome);
        scanf("%f", &((alunos + i)->nota));

        printf("\n");
    }
}

float calcularMediaAlunos(Aluno *alunos)
{
    float media = 0;

    for(int i = 0; i < QTD_ALUNOS; i++)
    {
        media += (alunos + i)->nota;
    }
    return media / QTD_ALUNOS;
}

int imprimirAlunosAcimaMedia(Aluno *alunos)
{
    int quantidade = 0;
    float media = calcularMediaAlunos(alunos);

    printf("Lista de alunos acima da média: ");

    for(int i = 0; i < QTD_ALUNOS; i++)
    {
        if((alunos + i)->nota >= media)
        {
            printf("\n%d - %s - %.2f", (alunos + i)->matricula, (alunos + i)->nome, (alunos + i)->nota);
        }
    }
    printf("\n");
}
