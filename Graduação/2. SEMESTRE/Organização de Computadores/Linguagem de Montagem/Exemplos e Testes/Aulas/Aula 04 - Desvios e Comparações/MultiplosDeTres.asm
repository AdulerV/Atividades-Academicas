# imprimir os multiplos de 3, de forma decrescente, de 30 até 0 
# EM C:
# for(int i = 30; i > 0; i=i-3) {
#	printf("%d\n", i);
# }

.data
espaco: .asciiz "\n"

.text
addi $16, $0, 30

voltar: slt $8, $0, $16 

beq $8, $0, desvio

addi $2, $0, 1 #cod para imprimir num
add $4, $0, $16 
syscall #imprime

addi $16, $16, -3

#separa numeros (\n)
addi $2, $0, 4
la $4, espaco
syscall 

j voltar

desvio: nop
 