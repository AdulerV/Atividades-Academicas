#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define NUM_PONTUACOES 10

/* Crie um programa para registrar as pontuações que juízes de uma determinada prova
esportiva atribuíram a um atleta (valores compreendidos entre 0 e 10 inclusive). Crie
funções para determinar os seguintes valores:
a. A média obtida pelo atleta.
b. A melhor pontuação obtida pelo atleta.
c. A pior pontuação obtida pelo atleta.
d. A porcentagem de pontuações acima da média do atleta.
e. A porcentagem de pontuações abaixo da média do atleta.
f. Determine a quantidade de juízes que atribuíram a melhor nota ao atleta.
g. Determine a quantidade de juízes que atribuíram a pior nota ao atleta. */

void imprimirEstatisticasAtleta(int *pontuacoes);
float calcularPontuacaoMedia(int *pontuacoes);
int calcularMelhorPontuacao(int *pontuacoes);
int calcularPiorPontuacao(int *pontuacoes);
int calcularPorcentagemAcimaMedia(int *pontuacoes);
int calcularPorcentagemAbaixoMedia(int *pontuacoes);
int calcularQtdJuizesMelhorNota(int *pontuacoes);
int calcularQtdJuizesPiorNota(int *pontuacoes);

int main()
{
    setlocale(LC_ALL, "");
    int *pontuacoes = (int*) malloc(sizeof(int) * NUM_PONTUACOES);

    for(int i = 0; i < NUM_PONTUACOES; i++)
    {
        printf("%d. Juíz: Insira uma pontuação entre 0 e 10: ", i + 1);
        scanf("%d", pontuacoes + i);

        if(*(pontuacoes + i) < 0 || *(pontuacoes + i) > 10)
        {
            printf("Pontuação inválida.\n");
            return 1;
        }
    }

    imprimirEstatisticasAtleta(pontuacoes);
    free(pontuacoes);
    return 0;
}

void imprimirEstatisticasAtleta(int *pontuacoes)
{
    printf("\nMédia obtida pelo atleta: %.2f.\n", calcularPontuacaoMedia(pontuacoes));
    printf("Melhor pontuação obtida pelo atleta: %d.\n", calcularMelhorPontuacao(pontuacoes));
    printf("Pior pontuação obtida pelo atleta: %d.\n", calcularPiorPontuacao(pontuacoes));
    printf("Porcentagem de pontuações acima da média: %d%%.\n", calcularPorcentagemAcimaMedia(pontuacoes));
    printf("Porcentagem de pontuações abaixo da média: %d%%.\n", calcularPorcentagemAbaixoMedia(pontuacoes));
    printf("Quantidade de juízes que atribuíram a melhor nota: %d%.\n", calcularQtdJuizesMelhorNota(pontuacoes));
    printf("Quantidade de juízes que atribuíram a pior nota: %d%.\n", calcularQtdJuizesPiorNota(pontuacoes));
}

float calcularPontuacaoMedia(int *pontuacoes)
{
    float media = 0;

    for(int i = 0; i < NUM_PONTUACOES; i++)
    {
        media += *(pontuacoes + i);
    }
    media /= NUM_PONTUACOES;
    return media;
}

int calcularMelhorPontuacao(int *pontuacoes)
{
    int melhorPontuacao = *(pontuacoes);

    for(int i = 1; i < NUM_PONTUACOES; i++)
    {
        if(*(pontuacoes + i) > melhorPontuacao)
        {
            melhorPontuacao = *(pontuacoes + i);
        }
    }
    return melhorPontuacao;
}

int calcularPiorPontuacao(int *pontuacoes)
{
    int piorPontuacao = *(pontuacoes);

    for(int i = 1; i < NUM_PONTUACOES; i++)
    {
        if(*(pontuacoes + i) < piorPontuacao)
        {
            piorPontuacao = *(pontuacoes + i);
        }
    }
    return piorPontuacao;
}

int calcularPorcentagemAcimaMedia(int *pontuacoes)
{
    int porcentagem = 0;
    float media = calcularPontuacaoMedia(pontuacoes);

    for(int i = 0; i < NUM_PONTUACOES; i++)
    {
        if(*(pontuacoes + i) > media)
        {
            porcentagem++;
        }
    }
    porcentagem *= 100 / NUM_PONTUACOES;
    return porcentagem;
}

int calcularPorcentagemAbaixoMedia(int *pontuacoes)
{
    int porcentagem = 0;
    float media = calcularPontuacaoMedia(pontuacoes);

    for(int i = 0; i < NUM_PONTUACOES; i++)
    {
        if(*(pontuacoes + i) < media)
        {
            porcentagem++;
        }
    }
    porcentagem *= 100 / NUM_PONTUACOES;
    return porcentagem;
}

int calcularQtdJuizesMelhorNota(int *pontuacoes)
{
    int quantidade = 0;
    int melhorPontuacao = calcularMelhorPontuacao(pontuacoes);

    for(int i = 0; i < NUM_PONTUACOES; i++)
    {
        if(*(pontuacoes + i) == melhorPontuacao)
        {
            quantidade++;
        }
    }
    return quantidade;
}

int calcularQtdJuizesPiorNota(int *pontuacoes)
{
    int quantidade = 0;
    int piorPontuacao = calcularPiorPontuacao(pontuacoes);

    for(int i = 0; i < NUM_PONTUACOES; i++)
    {
        if(*(pontuacoes + i) == piorPontuacao)
        {
            quantidade++;
        }
    }
    return quantidade;
}
