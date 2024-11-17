int main()
{
    int fatorial = 1, numero;

    do
    {
        printf("Insira um numero positivo: ");
        scanf("%d", &numero);
    }
    while(numero < 0);

    for(int contador = 1; contador <= numero; contador++)
    {
        fatorial *= contador;
    }

    printf("Fatorial: %d.\n", fatorial);
    return 0;
}
