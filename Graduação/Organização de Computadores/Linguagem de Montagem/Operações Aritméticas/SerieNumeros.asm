# Série de Números: (e = (a + b) * (b - a) / 2

addi $8, $0, 5
addi $9, $0, 3

add $10, $8, $9
sub $11, $9, $8

mult $10, $11
mflo $10

addi $12, $0, 2
div $10, $12
mflo $10
