.data
mensagem: .asciiz "Insira um numero positivo: "
fatorial: .asciiz "Fatorial: "

.text

voltar:
addi $2, $0, 4
la $4, mensagem
syscall

addi $2, $0, 5
syscall 

slt $8, $2, $0 
bne $8, $0, voltar

move $16, $2

addi $17, $0, 1 
addi $18, $0, 1 

repetir: slt $8, $16, $18
bne $8, $0, fim
mult $17, $18
mflo $17
addi $18, $18, 1
j repetir

fim: addi $2, $0, 4
la $4, fatorial
syscall 

addi $2, $0, 1
move $4, $17
syscall

sair: nop


