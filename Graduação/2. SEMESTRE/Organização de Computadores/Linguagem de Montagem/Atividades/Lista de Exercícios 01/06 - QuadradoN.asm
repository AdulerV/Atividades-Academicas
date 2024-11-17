.data
mensagem: .asciiz "Insira um numero: "
quebraLinha: .asciiz "\n"

.text
addi $2, $0, 4
la $4, mensagem
syscall

addi $2, $0, 5
syscall
move $8, $2

addi $16, $0, 0 # i
addi $17, $0, 0 # j

loop1:
slt $18, $16, $8
beq $18, $0, sair
add $17, $0, $16 

loop2:
add $19, $8, $16
slt $18, $17, $19
beq $18, $0, final

addi $2, $0, 1
move $4, $17
addi $17, $17, 1

addi $2, $0, 1
move $4, $17
syscall
j loop2

final: 
addi $2, $0, 4
la $4, quebraLinha
addi $16, $16, 1
syscall
j loop1

sair: nop


