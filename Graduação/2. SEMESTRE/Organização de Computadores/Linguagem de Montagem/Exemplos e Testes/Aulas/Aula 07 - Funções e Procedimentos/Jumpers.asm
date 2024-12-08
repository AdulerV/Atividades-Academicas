# jal (função) - interrompe a execução e pula pra linha destino, mas guarda o enedereço de memoria para voltar para onde estava

# função que recebe numeros e retorna a soma deles:

.data
entrada: .asciiz "Digite um número: "
saida: .asciiz "Resultado: "

.text

#função de soma
add $20, $0, $0 #soma 
add $8, $0, $0 #contador
for: slti $9, $8, 5 
beq $9, $0, fim # enquanto (contador < 5)
addi $8, $8, 1 # contador++
jal leitura # desvia para a função de syscall
add $21, $0, $2 # adiciona o valor lido ao registrador 21
add $20, $20, $21 # faz a soma do numero
j for

fim: la $4, saida
addi $2, $0, 4 # impressao da mensagem de entrada
syscall
addi $2, $0, 1
add $4, $20, $0
syscall
j end

leitura: la $4, entrada
addi $2, $0, 4 #impressao da mensagem de entrada
syscall
addi $2, $0, 5 #leitura do inteiro
syscall
jr $31 #pula pro endereço de origem

end:nop