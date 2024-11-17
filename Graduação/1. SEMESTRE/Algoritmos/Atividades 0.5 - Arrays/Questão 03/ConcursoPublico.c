#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 1000

/*Codificar uma função capaz de calcular a quantidade de candidatos classificados em um concurso público.
Sabe-se que são 1000 candidatos e que a pontuação necessária para classificação deve ser maior ou igual a 650.*/

int calcularQuantidadeClassificados(float pontuacoes[MAX]);

main()
{
    setlocale(LC_ALL, "");
    float pontuacoes[MAX];

    for(int i = 0; i < MAX; i++)
    {
        printf("Insira a pontuação do %d° candidato: ", i + 1);
        scanf("%f", &pontuacoes[i]);
    }
    int resultado = calcularQuantidadeClassificados(pontuacoes);
    printf("Quantidade de classificados: %d\n", resultado);
}

int calcularQuantidadeClassificados(float pontuacoes[MAX])
{
    int classificados = 0;

    for(int i = 0; i < MAX; i++)
    {
        if(pontuacoes[i] >= 650)
        {
            classificados++;
        }
    }
    return classificados;
}
