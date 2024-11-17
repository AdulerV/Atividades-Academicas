.data
cabecalho: .asciiz "A capital do Brasil e: \n"
opcao1:  .asciiz "1. Salvador.\n"
opcao2: .asciiz "2. Rio de Janeiro.\n"
opcao3: .asciiz "3. Brasilia.\n"
opcao4: .asciiz "4. Sao Paulo.\n"
resposta: .asciiz "Insira a opcao correta: "
msgIncorreto: "Resposta incorreta.\n"
msgCorreto: "Resposta correta!\n"

.text
# Imprimindo a questao e suas alternativas
addi $2, $0, 4
la $4, cabecalho
syscall

addi $2, $0, 4
la $4, opcao1
syscall

addi $2, $0, 4
la $4, opcao2
syscall

addi $2, $0, 4
la $4, opcao3
syscall

addi $2, $0, 4
la $4, opcao4
syscall

# Programando a questao
addi $9, $0, 1
addi $10, $0, 2
addi $11, $0, 3
addi $12, $0, 4

retornar: 
addi $2, $0, 4
la $4, resposta
syscall

addi $2, $0, 5
syscall

move $16, $2
addi $8, $0, 999

beq $16, $8, finalizar

beq $16, $9, incorreto
beq $16, $10, incorreto
beq $16, $11, correto
beq $16, $12, incorreto

incorreto: addi $2, $0, 4
la $4, msgIncorreto
syscall
j retornar

correto: addi $2, $0, 4
la $4, msgCorreto
syscall
j retornar

finalizar: nop



