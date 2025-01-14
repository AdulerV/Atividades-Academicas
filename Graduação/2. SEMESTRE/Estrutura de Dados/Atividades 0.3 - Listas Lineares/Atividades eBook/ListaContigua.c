#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define QTD_ALUNOS 10
#define QTD_CARACTERES 255

typedef struct
{
    int matricula;
    char *nome;
    float nota;
} Aluno;

void imprimirMenu();
void inserirDadosAlunos(Aluno *listaAlunos);
float calcularMediaAlunos(Aluno *listaAlunos);
void imprimirAlunosAcimaMedia(Aluno *listaAlunos);

int main()
{
    setlocale(LC_ALL, "");

    Aluno *listaAlunos = (Aluno*) malloc(sizeof(Aluno) * QTD_ALUNOS);

    imprimirMenu();
    inserirDadosAlunos(listaAlunos);
    imprimirAlunosAcimaMedia(listaAlunos);
}

void imprimirMenu()
{
    printf("\n=============================================\n");
    printf("            Cadastro de Alunos               \n");
    printf("=============================================\n");
}

void inserirDadosAlunos(Aluno *listaAlunos)
{
    for(int i = 0; i < QTD_ALUNOS; i++)
    {
        printf("Insira a matrícula do %d. aluno: ", i + 1);
        scanf("%d", &((listaAlunos + i)->matricula));

        (listaAlunos + i)->nome = (char*) malloc(sizeof(char) * QTD_CARACTERES);
        printf("\nInsira o nome do %d. aluno: ", i + 1);
        scanf("%s", (listaAlunos + i)->nome);

        printf("Insira a nota do %d. aluno: ", i + 1);
        scanf("%f", &((listaAlunos + i)->nota));
    }
}

float calcularMediaAlunos(Aluno *listaAlunos)
{
    float media = 0;

    for(int i = 0; i < QTD_ALUNOS; i++)
    {
        media += (listaAlunos + i)->nota;
    }

    return media / QTD_ALUNOS;
}

void imprimirAlunosAcimaMedia(Aluno *listaAlunos)
{
    float media = calcularMediaAlunos(listaAlunos);
    printf("\nMatrícula - Nome - Nota: ");

    for(int i = 0; i < QTD_ALUNOS; i++)
    {
        if((listaAlunos + i)->nota >= media)
        {
            printf("\n%d - %s - %.1f", (listaAlunos + i)->matricula, (listaAlunos + i)->nome, (listaAlunos + i)->nota);
        }
    }
}
