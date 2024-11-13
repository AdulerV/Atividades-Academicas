addi $16, $0, 10
addi $17, $0, 20
addi $18, $0, 0
addi $19, $0, 2

addi $16, $16, 1

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

