addi $8, $0, 15
addi $9, $0, 16

# portas logicas

or $10, $8, $9  #
and $11, $8, $9 #
nor $12, $8, $9 #
xor $13, $8, $9 #or exclusivo - as duas var tem q ser diferente (0 e 1)

# SHIFTS  

sll $14, $8, 2 # 00001111 -> 00111100
srl $15, $8, 2 # 00001111 -> 00000011
