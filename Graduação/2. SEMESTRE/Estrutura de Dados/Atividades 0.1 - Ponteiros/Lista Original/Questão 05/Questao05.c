/* Qual a instrução a ser adicionada ao programa abaixo para que ele funcione corretamente?
    int *p;
    *p = 3;
    printf("Parte de valor de p: %d", *p);
    printf("\nParte de posição de p: %d", p);*/

main()
{
    int *p = (int*) malloc(sizeof(int));
    *p = 3;
    printf("Parte de valor de p: %d", *p);
    printf("\nParte de posição de p: %d", p);
}
