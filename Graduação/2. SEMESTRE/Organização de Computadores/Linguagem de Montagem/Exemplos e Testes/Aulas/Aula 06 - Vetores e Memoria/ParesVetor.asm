.data
vetor: .word 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
pares: .asciiz "Quantidade de pares: "

.text
addi $8, $0, 0 # indice
addi $9, $0, 10 # tamanho
addi $10, $0, 0 # contador
addi $11, $0, 4 # avanco
addi $12, $0, 2  # constante para par

la $18, vetor

loop: 
mul $16, $8, $11 # indice * 4
add $21, $18, $16 # endereço base + indice
lw $17, 0($21) # carregar valor correspondente
slt $19, $8, $9
beq $19, $0, fim
addi $8, $8, 1
div $17, $12
mfhi $20
bne $20, $0, loop
addi $10, $10, 1
j loop

fim: nop




