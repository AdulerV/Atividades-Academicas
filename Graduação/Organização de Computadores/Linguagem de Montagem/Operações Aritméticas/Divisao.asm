# Divisão de dois números

addi $8, $0, 5
addi $9, $0, 3
div $8, $9
mfhi $11 # Move o resto da divisão para $11
mflo $10 # Move o quociente da divisão para $10
