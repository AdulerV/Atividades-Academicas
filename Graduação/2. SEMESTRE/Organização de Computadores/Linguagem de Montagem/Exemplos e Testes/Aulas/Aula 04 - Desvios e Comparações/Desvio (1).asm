# DESVIO 1: sinal < (se $16 é menor que $17, $16++ até $17)

addi $16, $0, 10
addi $17, $0, 20

volta: slt $18, $16, $17
beq $18, $0, desvio

addi $16, $16, 1
j volta

desvio: nop

