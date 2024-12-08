# DESVIO 4: sinal <= (se $16 é menor ou igual que $17, $16++ até $17)

addi $16, $0, 10
addi $17, $0, 20

voltar: slt $8, $17, $16 
bne $8, $0, desvio

addi $16, $16, 1
j voltar

desvio: nop
 