# Multiplicação de dois números

addi $8, $0, 5
addi $9, $0, -3
mult $8, $9
mfhi $11 # Move a parte alta do resultado (overflow) para $11
mflo $10 # Move a parte baixa do resultado (produto) para $10