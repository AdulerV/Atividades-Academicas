.data
mensagem: .asciiz "Insira um numero positivo maior que zero: "
quadrado: .asciiz "\nQuadrado do numero: "
cubo: .asciiz "\nCubo do numero: "
metade: .asciiz "\nMetade do numero: "
sucessor: .asciiz "\nSucessor do n�mero: "

.text
voltar:
addi $2, $0, 4
la $4, mensagem
syscall

addi $2, $0, 5
syscall

move $8, $2
slt $9, $0, $8
beq $9, $0, voltar

# a) O n�mero digitado ao quadrado;
mult $8, $8
mflo $16

addi $2, $0, 4
la $4, quadrado
syscall

addi $2, $0, 1
move $4, $16
syscall 

# b) O n�mero digitado ao cubo;
mult $8, $8
mflo $16
mult $16, $8
mflo $16

addi $2, $0, 4
la $4, cubo
syscall

addi $2, $0, 1
move $4, $16
syscall

# c) A metade do n�mero digitado;
addi $17, $0, 2
div $8, $17
mflo $16

addi $2, $0, 4
la $4, metade
syscall

addi $2, $0, 1
move $4, $16
syscall

# d) O sucessor do n�mero digitado. 
addi $16, $8, 1

addi $2, $0, 4
la $4, sucessor
syscall

addi $2, $0, 1
move $4, $16
syscall