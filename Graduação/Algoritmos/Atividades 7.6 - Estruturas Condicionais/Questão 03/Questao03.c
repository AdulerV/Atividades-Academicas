//3. Quais as saídas produzidas pelo trecho de programa abaixo.

main() {
    int a=10, b=10, c=2;

    if (a) {
        printf("\num"); //um
    } else {
        printf("\ndois");
    }

    if (a-b) {
        printf("\ntres");
    } else {
        printf("\nquatro"); //quatro
    }

    if (a>b) {
        printf("\ncinco");
    } else {
        printf("\nseis"); //seis
    }

    if (!(a>b)) {
        printf("\nsete"); //sete
    } else {
        printf("\noito");
    }

    if (a == b && c > a) {
        printf("\nnove");
    } else {
        printf("\ndez"); //dez
    }

    if (a == b || c > a) {
        printf("\nonze"); //onze
    } else {
        printf("\ndoze");
    }
}
