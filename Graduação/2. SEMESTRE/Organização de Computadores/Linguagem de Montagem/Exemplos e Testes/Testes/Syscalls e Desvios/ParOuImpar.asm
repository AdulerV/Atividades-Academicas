.data 
mensagem:  .asciiz "Digite um numero: "
saidaPar: .asciiz "O numero inserido e par."
saidaImpar: .asciiz "O numero inserido e impar."

.text

la $4, mensagem
addi $2, $0, 4
syscall

addi $2, $0, 5
syscall

move $16, $2
addi $17, $0, 2

div $16, $17
mfhi $8

bne $8, $0, else
la $4, saidaPar
addi $2, $0, 4
syscall
j fim

else: la $4, saidaImpar
addi $2, $0, 4
syscall

fim: nop

