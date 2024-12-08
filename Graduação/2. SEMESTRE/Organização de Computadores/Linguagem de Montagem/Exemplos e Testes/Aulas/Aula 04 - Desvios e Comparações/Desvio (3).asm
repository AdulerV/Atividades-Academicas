# DESVIO 3: sinal > (se $16 é maior que $17, $16-- até $17)

addi $16, $0, 20
addi $17, $0, 10

voltar: slt $8, $17, $16 
beq $8, $0, desvio
addi $16, $16, -1
j voltar

desvio: nop
 