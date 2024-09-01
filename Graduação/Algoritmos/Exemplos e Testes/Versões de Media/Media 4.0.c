#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*E se o usu�rio n�o souber a quantidade de notas a serem digitadas?
E se ele souber a quantidade, mas por algum motivo quer parar de informar notas e finalizar o programa antes do planejado.
Um programa bem flex�vel permitiria o c�lculo da m�dia independente do usu�rio saber a quantidade de notas a serem informadas.*/

main() {
    setlocale(LC_ALL, "");
    float nota, media = 0;
    int contador = 0;
    char continua = 'S';

    while(continua == 'S' || continua == 's') {
        printf("\nInsira a %d� nota: ", contador);
        scanf("%f", &nota);

        printf("\nDeseja continuar? S[Sim] ou N...[N�o]: ");
        continua = getche();

        media += nota;
        contador++;
    }
    media /= contador;
    printf("\nA m�dia entre os alunos � de %.2f pontos.", media);
}
