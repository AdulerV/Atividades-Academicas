#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Uma professora do Ensino Fundamental solicitou sua ajuda. Ela deseja um programa que possa transformar o aprendizado da tabuada de multiplicação em um jogo.
O programa deve solicitar um número de 1 a 10, em seguida apresentar a tabuada de multiplicação desse número no formato abaixo:
n x 1 = ?
n x 2 = ?
n x 3 = ?
n x 4 = ?
n x 5 = ?
n x 6 = ?
n x 7 = ?
n x 8 = ?
n x 9 = ?
n x 10 = ?
Atenção:
1.Antes de apresentar o resultado de cada operação o programa deverá solicitar ao aluno que informe o valor da operação. Para cada acerto o aluno ganha um ponto.
2.Ao final da tabuada o programa deverá informar a pontuação total obtida pelo aluno, seguida de uma dessas mensagens:
a.“Excelente” para alunos com nenhum erro.
b.“Estude mais um pouquinho” para alunos com 1 erro.
c.“Estude mais” para alunos com 2 erros.
d.“Estude muito mais” para alunos com 3 erros ou mais.*/

main() {
    setlocale(LC_ALL, "");
    int numero, erros;

    printf("Insira um número entre 1 e 10: ");
    scanf("%d", &numero);

    imprimirTabuada(numero);
    erros = calcularTabuada(numero);
    imprimirResultadoFinal(erros);
}

void imprimirTabuada(int numero) {
    for(int contador = 1; contador <= 10; contador++) {
        printf("%d x %d = ?\n", numero, contador);
    }
}

int calcularTabuada(numero) {
    int erros = 0, acertos = 0, resultado;

    for(int contador = 1; contador <= 10; contador++) {
        printf("\nInsira o resultado da operação (%d x %d = ?): ", numero, contador);
        scanf("%d", &resultado);

        if(resultado == (numero * contador)) {
            printf("Parabéns! %d x %d = %d. Acertos: %d.\n", numero, contador, contador * numero, ++acertos);
        } else {
            printf("Errou! %d x %d = %d.\n", numero, contador, contador * numero);
            erros++;
        }
    }
    return erros;
}

void imprimirResultadoFinal(int erros) {
    switch(erros) {
    case 0:
        printf("\nExcelente!\n");
        break;
    case 1:
        printf("\nEstude mais um pouquinho.\n");
        break;
    case 2:
        printf("\nEstude mais.\n");
    default:
        printf("\nEstude muito mais!\n");
    }
}
