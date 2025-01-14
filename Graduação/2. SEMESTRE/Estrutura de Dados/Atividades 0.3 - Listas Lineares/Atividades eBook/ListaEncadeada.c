#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define QTD_CARACTERES 255

typedef struct EstruturaAluno
{
    int matricula;
    char *nome;
    float nota;
    struct EstruturaAluno *proximo;
} Aluno;

void imprimirMenu();
void imprimirAlunos(Aluno* atual);
Aluno inserirDadosAlunos(Aluno no);
Aluno* inserirAlunoInicio(Aluno *atual, Aluno no);
Aluno* inserirAlunoFinal(Aluno *atual, Aluno no);
Aluno* removerAluno(Aluno *atual, int matricula);
Aluno* buscarAluno(Aluno *aluno, int matricula);
float calcularMediaNotas(Aluno *atual);

int main()
{
    setlocale(LC_ALL, "");

    int matricula, opcao;
    Aluno *listaAlunos = NULL, *aluno, no;

    do
    {
        imprimirMenu(&opcao);

        switch(*opcao)
        {
        case 1:
            no = inserirDadosAlunos(no);
            listaAlunos = inserirAlunoInicio(listaAlunos, no);
            break;
        case 2:
            no = inserirDadosAlunos(no);
            listaAlunos = inserirAlunoFinal(listaAlunos, no);
            break;
        case 3:
            printf("Insira a matrícula: ");
            scanf("%d", &matricula);
            listaAlunos = removerAluno(listaAlunos, matricula);
            break;
        case 4:
            printf("Insira a matrícula: ");
            scanf("%d", &matricula);
            if (aluno != NULL)
            {
                printf("%d - %s - %.1f\n", aluno->matricula, aluno->nome, aluno->nota);
            }
            else
            {
                printf("Aluno não encontrado.\n");
            }
            break;
        case 5:
            printf("Média dos alunos: %.1f\n", calcularMediaNotas(listaAlunos));
            break;
        case 6:
            imprimirAlunos(listaAlunos);
            break;
        case 7:
            printf("Saindo...\n");
            break;
        default:
            printf("Opção inserida inválida.\n");
        }
    }
    while(opcao != 7);
    return 0;
}

void imprimirMenu(int *opcao)
{
    printf("\n----- MENU DE OPÇÕES -----\n");
    printf("1. Inserir aluno no início\n");
    printf("2. Inserir aluno no final\n");
    printf("3. Remover aluno\n");
    printf("4. Buscar aluno\n");
    printf("5. Calcular média das notas\n");
    printf("6. Imprimir lista de alunos\n");
    printf("7. Sair\n");
    printf("Escolha uma opção: ");
    scanf("%d", opcao);
    printf("\n");
}

Aluno* buscarAluno(Aluno *atual, int matricula)
{
    while(atual != NULL && atual->matricula != matricula)
    {
        atual = atual->proximo;
    }

    if(atual == NULL)
    {
        return NULL;
    }
    return atual;
}

Aluno inserirDadosAlunos(Aluno no)
{
    printf("Insira a matrícula do aluno: ");
    scanf("%d", &no.matricula);

    no.nome = (char*) malloc(sizeof(char) * QTD_CARACTERES);
    printf("Insira o nome do aluno: ");
    scanf("%s", no.nome);

    printf("Insira a nota do aluno: ");
    scanf("%f", &no.nota);

    return no;
}

void imprimirAlunos(Aluno *atual)
{
    if(atual == NULL)
    {
        printf("Sem alunos na lista.\n");
        return;
    }
    printf("\nMatrícula - Nome - Nota: ");

    while(atual != NULL)
    {
        printf("\n%d - %s - %.1f", atual->matricula, atual->nome, atual->nota);
        atual = atual->proximo;
    }
    printf("\n");
}

Aluno* inserirAlunoInicio(Aluno *atual, Aluno no)
{
    Aluno *novo = (Aluno*) malloc(sizeof(Aluno));

    novo->matricula = no.matricula;
    novo->nome = no.nome;
    novo->nota = no.nota;

    if(atual == NULL)
    {
        novo->proximo = NULL;
    }
    else
    {
        novo->proximo = atual;
    }
    return novo;
}

Aluno* inserirAlunoFinal(Aluno *atual, Aluno no)
{
    Aluno *novo = (Aluno*) malloc(sizeof(Aluno));

    novo->matricula = no.matricula;
    novo->nome = no.nome;
    novo->nota = no.nota;

    Aluno *temporaria = atual;

    while(temporaria->proximo != NULL)
    {
        temporaria = temporaria->proximo;
    }

    if(atual == NULL)
    {
        return inserirAlunoInicio(atual, no);
    }
    temporaria->proximo = novo;
    return atual;
}

Aluno* removerAluno(Aluno *atual, int matricula)
{
    Aluno *temporaria = atual;
    Aluno *anterior = NULL;

    while(temporaria != NULL && temporaria->matricula != matricula)
    {
        anterior = temporaria;
        temporaria = temporaria->proximo;
    }

    if(temporaria == NULL)
    {
        printf("Matrícula não encontrada.\n");
        return atual;
    }

    if(anterior == NULL)
    {
        atual = temporaria->proximo;
    }
    else
    {
        anterior->proximo = temporaria->proximo;
    }
    free(temporaria);
    return atual;
}

float calcularMediaNotas(Aluno *atual)
{
    float media = 0, quantidade = 0;

    while(atual !=  NULL)
    {
        media += atual->nota;
        atual = atual->proximo;
        quantidade++;
    }

    if(quantidade == 0)
    {
        return 0;
    }
    media /= quantidade;
    return media;
}

