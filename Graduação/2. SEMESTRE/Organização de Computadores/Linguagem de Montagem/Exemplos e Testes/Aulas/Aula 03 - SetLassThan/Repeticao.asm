.data
entrada1: .asciiz "Digite o primeiro numero: "
entrada2: .asciiz "Digite o segundo numero: "
saida: .asciiz "Quantidade de pares:"

.text

addi $2, $0, 4
la $4, entrada1
syscall
add $16, $2, $0

addi $2, $0, 4
la $4, entrada2
syscall
add $17, $2, $0

addi $18, $0, 0
addi $19, $0, 2

voltar: slt $8, $16, $17 # (a < b)
beq $8, $0, pular # if ( c = 0) 
div $16, $19
mfhi $20

beq $20, $0, continuar
addi $16, $16, 1
addi $18, $18, 1
j voltar

continuar: addi $16, $16, 1
j voltar

pular: nop

