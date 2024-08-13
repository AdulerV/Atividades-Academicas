#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//Codificar uma fun��o para calcular a quantidade de funcion�rios que possuem sal�rio igual ao maior sal�rio de uma empresa.

int calcularFuncionariosComMaiorSalario(int numFuncionarios, float salarios[numFuncionarios]);

int main()
{
    setlocale(LC_ALL, "");
    int numFuncionarios;

    printf("Insira a quantidade de funcion�rios da empresa: ");
    scanf("%d", &numFuncionarios);

    if (numFuncionarios <= 0)
    {
        printf("A quantidade de funcion�rios deve ser maior que zero.\n");
        return 1;
    }

    float salarios[numFuncionarios];

    for(int i = 0; i < numFuncionarios; i++)
    {
        printf("Insira o sal�rio do %d� funcion�rio: ", i + 1);
        scanf("%f", &salarios[i]);
    }
    int resultado = calcularFuncionariosComMaiorSalario(numFuncionarios, salarios);
    printf("Quantidade de funcion�rios com maior sal�rio: %d\n", resultado);
    return 0;
}

int calcularFuncionariosComMaiorSalario(int numFuncionarios, float salarios[numFuncionarios])
{
    float maiorSalario = 0;
    int quantidade = 0;

    for(int i = 0; i < numFuncionarios; i++)
    {
        if(salarios[i] > maiorSalario)
        {
            maiorSalario = salarios[i];
        }
    }

    for(int i = 0; i < numFuncionarios; i++)
    {
        if(salarios[i] == maiorSalario)
        {
            quantidade++;
        }
    }
    return quantidade;
}
