.data # �?rea de inicializacao de dados

Msg1: .asciiz "\nDigite um numero: "
Msg2: .asciiz "\nO quadrado do numero digitado e: "

 .text # �?rea de de programacao (instruções)
 # Impressao da Msg1 - Chamada de sistema
addi $2, $0, 4
la $4, Msg1
syscall   

# Liberar o teclado (inteiro) - Chamada de sistema
addi $2, $0, 5 	
syscall 
addi $10, $2, 0

mul $11, $10, $10

# Impressão da Msg2 - Chamada de sistema
addi $2, $0, 4
la $4, Msg2
syscall    

#Impressão do resultado (inteiro)
addi $2,  $0, 1
addi $4, $11, 0
syscall
