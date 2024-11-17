.data
mensagem: .asciiz "Insira um numero: "
msgMaior: .asciiz "\nMaior numero: "
msgMenor: .asciiz "\nMenor numero: "

.text
addi $17, $0, 0 # contador
addi $20, $0, 10 # limite
addi $16, $0, 1 # numero

retornar: 
slt $18, $17, $20
beq $18, $0, fim

addi $2, $0, 4
la $4, mensagem
syscall

addi $2, $0, 5 
syscall
move $16, $2 # numero

bne $17, $0, else
add $8, $0, $16 # maior
add $9, $0, $16 # menor
addi $17, $17, 1
j retornar

else: 
addi $17, $17, 1
slt $19, $8, $16
beq $19, $0, menor
add $8, $0, $16
j retornar

menor: slt $19, $9, $16
bne $19, $0, retornar
add $9, $0, $16
j retornar

fim: 
addi $2, $0, 4
la $4, msgMaior
syscall

addi $2, $0, 1
move $4, $8
syscall

addi $2, $0, 4
la $4, msgMenor
syscall

addi $2, $0, 1
move $4, $9
syscall
