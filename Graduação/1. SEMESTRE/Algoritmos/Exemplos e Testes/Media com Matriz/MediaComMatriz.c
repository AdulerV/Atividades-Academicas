#define L 2
#define C 2

float calculaMediaTurma(float notas[L][C]);
float calculaMediaAluno(int numeroAluno, float notas[L][C]);

main() {
    float notas[L][C];
    int i, j;
    for (i=0; i < L; i++) {
        for (j=0; j < C; j++) {
            printf("\nNota do Aluno %d - %d Bimestre: ",i+1, j+1);
            scanf("%f", &notas[i][j]);
        }
    }

    int numeroAluno;
    printf("\nInforme o numero do aluno desejado: ");
    scanf("%d", &numeroAluno);
    printf("\nMedia do Aluno %d: %f", numeroAluno+1, calculaMediaAluno(numeroAluno, notas));
    printf("\nMedia da Turma: %f", calculaMediaTurma(notas));
}

float calculaMediaAluno(int numeroAluno, float notas[L][C]) {
    float mediaAluno = 0;
    int i;
    for (i=0; i < C; i++) {
        mediaAluno += notas[numeroAluno-1][i];
    }
    mediaAluno = mediaAluno / C;
    return mediaAluno;
}

float calculaMediaTurma(float notas[L][C]) {
    float mediaTurma = 0, mediaAluno;
    int i,j;
    for (i=0; i < L; i++) {
        mediaAluno = 0;
        for (j=0; j < C; j++) {
            mediaAluno += notas[i][j];
        }
        mediaAluno = mediaAluno / C;
        mediaTurma += mediaAluno;
    }
    mediaTurma = mediaTurma / L;
    return mediaTurma;
}
