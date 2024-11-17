#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX 30

int main()
{
    setlocale(LC_ALL, "");
    char frase[MAX];

    printf("Insira uma frase com até 30 caracteres: ");
    gets(frase);

    printf("A frase informada possui %d vogais.", calcularQuantidadeVogais(frase));
    return 0;
}

int calcularQuantidadeVogais(char frase[MAX])
{
    int vogais = 0;

    for(int i = 0; i < MAX && frase[i] != '/0'; i++)
    {
        switch(frase[i])
        {
        case 'a':
        case 'A':
            vogais++;
            break;
        case 'e':
        case 'E':
            vogais++;
            break;
        case 'i':
        case 'I':
            vogais++;
            break;
        case 'o':
        case 'O':
            vogais++;
            break;
        case 'u':
        case 'U':
            vogais++;
            break;
        }
    }
    return vogais;
}
