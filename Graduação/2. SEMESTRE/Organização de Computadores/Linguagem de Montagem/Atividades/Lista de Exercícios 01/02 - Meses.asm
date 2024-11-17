.data
mensagem: .asciiz "Insira o numero correspondente ao mes: "
janeiro: .asciiz "Janeiro."
fevereiro: .asciiz "Fevereiro."
marco: .asciiz "Março."
abril: .asciiz "Abril."
maio: .asciiz "Maio."
junho: .asciiz "Junho."
julho: .asciiz "Julho."
agosto: .asciiz "Agosto."
setembro: .asciiz "Setembro."
outubro: .asciiz "Outubro."
novembro: .asciiz "Novembro."
dezembro: .asciiz "Dezembro."

.text
voltar:
addi $2, $0, 4
la $4, mensagem
syscall

addi $2, $0, 5
syscall
move $8, $2

# Validando o numero inserido
slt $17, $0, $8
beq $17, $0, voltar # Se $8 <= 0, pula para 'voltar'

addi $16, $0, 12 
slt $17, $16, $8
bne $17, $0, voltar # Se $8 > 12, pula para 'voltar'

# Encontrando o mês correspondente
addi $16, $0, 1 
beq $8, $16, desviar1

addi $16, $0, 2
beq $8, $16, desviar2

addi $16, $0, 3
beq $8, $16, desviar3

addi $16, $0, 4
beq $8, $16, desviar4

addi $16, $0, 5
beq $8, $16, desviar5

addi $16, $0, 6
beq $8, $16, desviar6

addi $16, $0, 7
beq $8, $16, desviar7

addi $16, $0, 8
beq $8, $16, desviar8

addi $16, $0, 9
beq $8, $16, desviar9

addi $16, $0, 10
beq $8, $16, desviar10

addi $16, $0, 11
beq $8, $16, desviar11

addi $16, $0, 12
beq $8, $16, desviar12

# Imprimindo o mês correspondente
desviar1: addi $2, $0, 4
la $4, janeiro
syscall
j fim

desviar2: addi $2, $0, 4
la $4, fevereiro
syscall
j fim

desviar3: addi $2, $0, 4
la $4, marco
syscall
j fim

desviar4: addi $2, $0, 4
la $4, abril
syscall
j fim

desviar5: addi $2, $0, 4
la $4, maio
syscall
j fim

desviar6: addi $2, $0, 4
la $4, junho
syscall

desviar7: addi $2, $0, 4
la $4, julho
syscall
j fim

desviar8: addi $2, $0, 4
la $4, agosto
syscall

desviar9: addi $2, $0, 4
la $4, setembro
syscall
j fim

desviar10: addi $2, $0, 4
la $4, outubro
syscall
j fim
desviar11: addi $2, $0, 4
la $4, novembro
syscall
j fim

desviar12: addi $2, $0, 4
la $4, dezembro
syscall
j fim

fim: nop

