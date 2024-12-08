.data 
mensagem:  .asciiz "Digite um numero positivo ou 0 para sair: "
saidaPar: .asciiz "O numero inserido e par.\n"
saidaImpar: .asciiz "O numero inserido e impar.\n"

.text

retorna:
la $4, mensagem
addi $2, $0, 4
syscall

addi $2, $0, 5
syscall

move $16, $2
beq $16, $0, fim

addi $17, $0, 2

div $16, $17
mfhi $8

bne $8, $0, else
la $4, saidaPar
addi $2, $0, 4
syscall
j retorna

else: la $4, saidaImpar
addi $2, $0, 4
syscall
j retorna

fim: nop

