#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*Uma das t�cnicas para evitar a duplicidade de c�digo � a modulariza��o, mas agora utilizaremos uma estrutura de repeti��o.
Uma sugest�o muito simples � retirar todas as linhas duplicadas e manter apenas uma linha de cada instru��o e envolv�-las pelo comando while.*/

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
    printf("A m�dia entre os alunos ser� de %.2f pontos.", media);
}
