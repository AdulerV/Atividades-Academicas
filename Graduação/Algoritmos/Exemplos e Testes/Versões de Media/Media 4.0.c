#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*E se o usuário não souber a quantidade de notas a serem digitadas?
E se ele souber a quantidade, mas por algum motivo quer parar de informar notas e finalizar o programa antes do planejado.
Um programa bem flexível permitiria o cálculo da média independente do usuário saber a quantidade de notas a serem informadas.*/

main() {
    setlocale(LC_ALL, "");
    float nota, media = 0;
    int contador = 0;
    char continua = 'S';

    while(continua == 'S' || continua == 's') {
        printf("\nInsira a %d° nota: ", contador);
        scanf("%f", &nota);

        printf("\nDeseja continuar? S[Sim] ou N...[Não]: ");
        continua = getche();

        media += nota;
        contador++;
    }
    media /= contador;
    printf("\nA média entre os alunos é de %.2f pontos.", media);
}
