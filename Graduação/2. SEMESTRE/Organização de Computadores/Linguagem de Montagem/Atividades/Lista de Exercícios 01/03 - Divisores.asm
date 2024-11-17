# Faça um algoritmo que receba um número e informe seus divisores.

.data
mensagem: .asciiz "Insira um numero positivo: "
quebraLinha: .asciiz "\n"

.text
addi $2, $0, 4
la $4, mensagem
syscall

addi $2, $0, 5
syscall

move $8, $2
addi $16, $0, 1

repetir: slt $17, $8, $16
bne $17, $0, fim # Se $16 > $8, pula para "fim"
div $8, $16
mfhi $18
add $19, $0, $16
addi $16, $16, 1

bne $18, $0, repetir
addi $2, $0, 1
move $4, $19
syscall 

addi $2, $0, 4
la $4, quebraLinha
syscall 
j repetir

fim: nop
