# Comando if(a!=b) ...

addi $16, $0, 8
addi $17, $0, 8

bne $16, $17, pular
addi $16, $16, 1
addi $17, $17, -1

pular: nop
