#include <stdio.h>
#include <locale.h>

//Codificar uma função para calcular a quantidade de alunos que obtiveram nota acima da média da turma.

int calcularAlunosAcimaDaMedia(int quantidadeAlunos, float notas[]);
float calcularMediaNotas(int quantidadeAlunos, float notas[]);

int main() {
    setlocale(LC_ALL, "");
    int quantidadeAlunos;

    printf("Insira a quantidade de alunos da turma: ");
    scanf("%d", &quantidadeAlunos);

    if (quantidadeAlunos <= 0) {
        printf("A quantidade de alunos deve ser maior que zero.\n");
        return 1;
    }

    float notas[quantidadeAlunos];

    for(int i = 0; i < quantidadeAlunos; i++) {
        printf("Insira a nota do %dº aluno: ", i + 1);
        scanf("%f", &notas[i]);
    }

    int alunosAcimaMedia = calcularAlunosAcimaDaMedia(quantidadeAlunos, notas);
    printf("Quantidade de alunos com nota acima da média: %d\n", alunosAcimaMedia);
    return 0;
}

int calcularAlunosAcimaDaMedia(int quantidadeAlunos, float notas[quantidadeAlunos]) {
    float media = calcularMediaNotas(quantidadeAlunos, notas);
    int qtdAlunosAcimaMedia = 0;

    for(int i = 0; i < quantidadeAlunos; i++) {
        if(notas[i] > media) {
            qtdAlunosAcimaMedia++;
        }
    }
    return qtdAlunosAcimaMedia;
}

float calcularMediaNotas(int quantidadeAlunos, float notas[quantidadeAlunos]) {
    float soma = 0;

    for(int i = 0; i < quantidadeAlunos; i++) {
        soma += notas[i];
    }

    return soma / quantidadeAlunos;
}
