#include <stdio.h>
#include <locale.h>

#define CAMPO_AMOSTRAL 3

void coletaDados(int dadosColetados[CAMPO_AMOSTRAL][2]);
int encontraCasos(int dadosColetados[CAMPO_AMOSTRAL][2], int sexo, int idadeMin, int idadeMax);

int main () {
    setlocale(LC_ALL, "Portuguese");

    int dados[CAMPO_AMOSTRAL][2];
    coletaDados(dados);

    printf("%d indivíduos do sexo feminino cuja idade está entre 18 e 35 anos, inclusive, foram entrevistados.\n", encontraCasos(dados, 1, 18, 35));

    return 0;
}

void coletaDados(int dadosColetados[CAMPO_AMOSTRAL][2]) {
    // Admite-se 0 para homens, e 1 para mulheres
    for(int i = 0; i < CAMPO_AMOSTRAL; i++) {
        for(int j = 0; j <= 1; j++) {
            if(j == 0) {
                printf("O entrevistado é um homem (0) ou uma mulher (1)? ");
                scanf("%d", &dadosColetados[i][j]);
            }
            if(j == 1) {
                printf("O entrevistado tem quantos anos? ");
                scanf("%d", &dadosColetados[i][j]);
                printf("\n");
            }
        }
    }
}

int encontraCasos(int dadosColetados[CAMPO_AMOSTRAL][2], int sexo, int idadeMin, int idadeMax){
    int casosPositivos = 0;

    for(int i = 0; i < CAMPO_AMOSTRAL; i++){
        int j = 0;
        if(dadosColetados[i][j] == sexo){
            if(dadosColetados[i][++j] >= idadeMin && dadosColetados[i][j++] <= idadeMax){
                casosPositivos++;
            }
        }
    }
    return casosPositivos++;
}
