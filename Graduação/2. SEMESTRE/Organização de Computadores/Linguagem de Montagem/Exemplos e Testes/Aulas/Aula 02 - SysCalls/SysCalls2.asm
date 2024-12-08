.data
entrada: .asciiz "Digite o ano que voce nasceu: "
saida: .asciiz "Sua idade em 2024: "

.text
addi $2, $0, 4
la $4, entrada
syscall

addi $2, $0, 5
syscall
add $16, $2, $0 #ano digitado vai para $16

addi $17, $0, 2024
sub $17, $17, $16

addi $2, $0, 4
la $4, saida
syscall

addi $2, $0, 1
add $4, $0, $17
syscall
