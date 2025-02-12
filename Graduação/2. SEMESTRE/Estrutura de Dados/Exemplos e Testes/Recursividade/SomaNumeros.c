#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    printf("Soma: %d", somarNumeros(5));
}

int somarNumeros(int n)
{
    if(n == 1)
    {
        return 1;
    }
    return somarNumeros(n - 1) + n;
}
