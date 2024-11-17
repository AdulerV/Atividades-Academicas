addi $16, $0, 18 # a = 16
addi $17, $0, 17 # b = 17

slt $8, $16, $17 # a < b = 1 (true) ou 0 (false)
beq $8, $0, pular
addi $16, $16, 1
j final
pular: addi $17, $17, -1
final: nop
