/* Assumindo que o endereço da variável x fora atribuído a um ponteiro px, escreva uma
expressão que não use x, mas que divida x por 5.*/

main()
{
    int x, *px = &x;

    printf("Insira o valor de x: ");
    scanf("%d", px);

    *px /= 5;
    printf("x / 5 = %d", *px);
}
