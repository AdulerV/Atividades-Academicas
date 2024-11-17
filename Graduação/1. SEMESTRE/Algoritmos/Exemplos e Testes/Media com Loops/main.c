#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//Imagine uma turma com 3 alunos, onde cada aluno realiza uma prova no valor de 100 pontos. Vamos codificar um programa para calcular a média das notas da turma.

int main() {
    setlocale(LC_ALL, "");
    float nota, media = 0;
    int contador = 1;

    while(contador <= 3) {
        printf("Insira a nota do %d° aluno: ", contador);
        scanf("%f", &nota);
        media += nota;
        contador++;
    }
    printf("A média das notas entre os 3 alunos é %.2f.\n", media /= 3);
    return 0;
}
