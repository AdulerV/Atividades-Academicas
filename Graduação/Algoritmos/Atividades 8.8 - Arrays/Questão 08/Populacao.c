#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 5

/*Foi realizada uma pesquisa sobre algumas caracter�sticas f�sicas da popula��o de uma regi�o.
Coletaram os seguintes dados referentes a cada habitante: sexo e idade.
Fa�a uma fun��o capaz de determinar a quantidade de indiv�duos do sexo feminino cuja idade est� entre 18 e 35 anos, inclusive.*/

typedef struct {
    char sexo;
    int idade;
} DadosHabitante;

main() {
    setlocale(LC_ALL, "");
    DadosHabitante habitantes[MAX];

    for(int i = 0; i < MAX; i++) {
        printf("Insira o sexo do %d� habitante [M ou F]: ", i + 1);
        habitantes[i].sexo = getche();

        printf("\nInsira a idade do %d� habitante: ", i + 1);
        scanf("%d", &habitantes[i].idade);
    }

    int resultado = calcularQuantidade(habitantes);
    printf("Quantidades de habitantes femininos entre 18 e 30 anos: %d", resultado);
}

int calcularQuantidade(DadosHabitante habitantes[MAX]) {
    int quantidade = 0;

    for(int i = 0; i < MAX; i++) {
        if((habitantes[i].sexo == 'F' || habitantes[i].sexo == 'f') && (habitantes[i].idade >= 18 && habitantes[i].idade <= 35)) {
            quantidade++;
        }
    }
    return quantidade;
}
