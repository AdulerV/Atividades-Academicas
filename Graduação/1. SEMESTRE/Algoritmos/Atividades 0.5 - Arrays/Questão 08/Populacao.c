#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 5

/*Foi realizada uma pesquisa sobre algumas características físicas da população de uma região.
Coletaram os seguintes dados referentes a cada habitante: sexo e idade.
Faça uma função capaz de determinar a quantidade de indivíduos do sexo feminino cuja idade está entre 18 e 35 anos, inclusive.*/

typedef struct {
    char sexo;
    int idade;
} DadosHabitante;

main() {
    setlocale(LC_ALL, "");
    DadosHabitante habitantes[MAX];

    for(int i = 0; i < MAX; i++) {
        printf("Insira o sexo do %d° habitante [M ou F]: ", i + 1);
        habitantes[i].sexo = getche();

        printf("\nInsira a idade do %d° habitante: ", i + 1);
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
