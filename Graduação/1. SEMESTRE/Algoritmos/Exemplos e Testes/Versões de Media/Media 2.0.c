#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Uma das técnicas para evitar a duplicidade de código é a modularização, mas agora utilizaremos uma estrutura de repetição.
Uma sugestão muito simples é retirar todas as linhas duplicadas e manter apenas uma linha de cada instrução e envolvê-las pelo comando while.*/

main() {
    setlocale(LC_ALL, "");
    float nota, media;
    int contador = 0;

    while(contador < 3) {
        printf("Insira a nota do primeiro aluno: ");
        scanf("%f", &nota);
        media += nota;
        contador++;
    }
    media /= contador;
    printf("A média entre os alunos será de %.2f pontos.", media);
}
