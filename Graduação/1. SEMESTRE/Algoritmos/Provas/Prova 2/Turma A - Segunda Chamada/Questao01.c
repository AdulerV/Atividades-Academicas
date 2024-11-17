#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define NUM_ALUNOS 10

//Codificar uma função que seja capaz de calcular a quantidade de alunos que obtiveram nota igual a menor nota da turma.

main()
{
    setlocale(LC_ALL, "");

    float notas[NUM_ALUNOS] = {7.5, 8.2, 4, 1, 10, 5.9, 6, 7.1, 1, 9};

    printf("Quantidade de alunos com menor nota: %d.\n", calcularAlunosMenorNota(notas));
}

int calcularMenorNota(float notas[NUM_ALUNOS])
{
    float menorNota = notas[0];

    for(int i = 0; i < NUM_ALUNOS; i++)
    {
        if(notas[i] < menorNota)
        {
            menorNota = notas[i];
        }
    }
    return menorNota;
}

int calcularAlunosMenorNota(float notas[NUM_ALUNOS])
{
    int quantidade = 0;
    float menorNota = calcularMenorNota(notas);

    for(int i = 0; i < NUM_ALUNOS; i++)
    {
        if(notas[i] == menorNota)
        {
            quantidade++;
        }
    }
    return quantidade;
}
