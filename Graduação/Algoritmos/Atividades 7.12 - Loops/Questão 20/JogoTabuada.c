#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Uma professora do Ensino Fundamental solicitou sua ajuda. Ela deseja um programa que possa transformar o aprendizado da tabuada de multiplica��o em um jogo.
O programa deve solicitar um n�mero de 1 a 10, em seguida apresentar a tabuada de multiplica��o desse n�mero no formato abaixo:
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
Aten��o:
1.Antes de apresentar o resultado de cada opera��o o programa dever� solicitar ao aluno que informe o valor da opera��o. Para cada acerto o aluno ganha um ponto.
2.Ao final da tabuada o programa dever� informar a pontua��o total obtida pelo aluno, seguida de uma dessas mensagens:
a.�Excelente� para alunos com nenhum erro.
b.�Estude mais um pouquinho� para alunos com 1 erro.
c.�Estude mais� para alunos com 2 erros.
d.�Estude muito mais� para alunos com 3 erros ou mais.*/

main() {
    setlocale(LC_ALL, "");
    int numero, erros;

    printf("Insira um n�mero entre 1 e 10: ");
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
        printf("\nInsira o resultado da opera��o (%d x %d = ?): ", numero, contador);
        scanf("%d", &resultado);

        if(resultado == (numero * contador)) {
            printf("Parab�ns! %d x %d = %d. Acertos: %d.\n", numero, contador, contador * numero, ++acertos);
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
