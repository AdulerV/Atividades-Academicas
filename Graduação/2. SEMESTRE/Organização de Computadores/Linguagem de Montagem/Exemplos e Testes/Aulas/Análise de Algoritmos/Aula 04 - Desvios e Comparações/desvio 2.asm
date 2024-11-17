# DESVIO 2: sinal >= (se $16 é maior ou igual que $17, $16-- até $17)

addi $16, $0, 20
addi $17, $0, 10

volta: slt $18, $16, $17
bne $18, $0, desvio

addi $16, $16, -1
j volta

desvio: nop