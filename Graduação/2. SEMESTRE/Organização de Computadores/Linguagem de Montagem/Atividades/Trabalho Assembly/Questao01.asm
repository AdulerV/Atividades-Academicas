.data
    vetor: .word 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
    msgNatural:	.asciiz "Insira um número natural: "
    msgPosicao: .asciiz "Insira a posição do elemento: "
    msgInvalida: .asciiz "Opção inserida inválida.\n"
    msgVetorCheio: .asciiz "Impossível inserir mais elementos.\n"
    msgPosicaoInvalida: .asciiz "Esta posição já está vazia ou é inválida.\n"
    msgNumNaturais: .asciiz "\nNúmeros naturais armazenados: \n"
    msgVazio: .asciiz "Nenhum natural encontrado.\n"
    msgSair: .asciiz "\nSaindo...\n"
    quebraLinha: .asciiz "\n"
    menu: .asciiz "\n ======================= \n Menu \n ======================= \n 1 - Limpar \n 2 - Inserir \n 3 - Eliminar \n 4 - Imprimir \n 5 - Finalizar \n =======================\n Escolha uma opção: "

.text
# Função principal
    addi $8, $0, 0  
    addi $9, $0, 5  
    la $5, vetor  
    jal limparElementos

voltar:
    li $2, 4
    la $4, menu
    syscall
    li $2, 5
    syscall 
    move $8, $2  
    li $10, 1
    beq $8, $10, opcaoLimpar  
    li $10, 2
    beq $8, $10, opcaoInserir  
    li $10, 3
    beq $8, $10, opcaoEliminar  
    li $10, 4
    beq $8, $10, opcaoImprimir  
    li $10, 5
    beq $8, $10, opcaoSair
    j voltar

opcaoLimpar:
    la $4, vetor
    jal limparElementos
    j voltar

opcaoInserir:
    la $4, vetor
    jal inserirElementos
    move $12, $2
    bnez $12, posicaoValida
    li $2, 4
    la $4, msgVetorCheio
    syscall
posicaoValida:
    j voltar

opcaoEliminar:
    la $4, vetor
    jal eliminarElementos
    move $12, $2
    bnez $12, posicaoRemovida
    li $2, 4
    la $4, msgPosicaoInvalida
    syscall
posicaoRemovida:
    j voltar

opcaoImprimir:
    la $4, vetor
    jal imprimirNaturais
    j voltar

opcaoSair:
    li $2, 4
    la $4, msgSair
    syscall
    j final

# Função para limpar os números naturais
limparElementos: 
    addi $12, $0, -1
    addi $8, $0, 0
    addi $9, $0, 4
loopLimpar: 
    mul $10, $8, $9
    add $10, $10, $5
    lw $17, 0($10)
    slti $11, $8, 20
    beqz $11, fimLimpar
    sw $12, 0($10)
    addi $8, $8, 1
    j loopLimpar
fimLimpar:
    jr $31

# Função para inserir números naturais
inserirElementos: 
invalido:
    li $2, 4
    la $4, msgNatural
    syscall
    li $2, 5
    syscall 
    slti $8, $2, 0
    bnez $8, invalido
    move $18, $2
    addi $8, $0, 0
    addi $9, $0, 4
loopInserir: 
    mul $10, $8, $9
    add $10, $10, $5
    lw $17, 0($10)
    slti $11, $8, 20
    beqz $11, fimInserir
    li $13, -1
    bne $17, $13, incremento
    add $12, $0, $18
    sw $12, 0($10)
    j fimInsercao
incremento: 
    addi $8, $8, 1
    j loopInserir
fimInsercao:
    addi $2, $0, 1
    jr $31
fimInserir:
    addi $2, $0, 0
    jr $31
    
# Função para eliminar o natural específicado
eliminarElementos: 
    li $2, 4
    la $4, msgPosicao
    syscall
    li $2, 5
    syscall
    move $18, $2
    addi $8, $0, 0
    addi $9, $0, 4
    addi $20, $0, 19
    slt $10, $20, $18
    slti $11, $18, 0
    or $10, $10, $11
    bnez $10, fimEliminar
loopEliminar: 
    beq $8, $18, fimLoopEliminar
    addi $8, $8, 1
    j loopEliminar
fimLoopEliminar: 
    mul $10, $8, $9
    add $10, $10, $5
    addi $12, $0, -1
    lw $17, 0($10)
    beq $17, $12, fimEliminar
    sw $12, 0($10)
    addi $2, $0, 1
    jr $31
fimEliminar:
    addi $2, $0, 0
    jr $31

# Função para imprimir os números naturais
imprimirNaturais:
    addi $8, $0, 0
    addi $9, $0, 4
    addi $13, $0, 0
    addi $12, $0, -1
    li $2, 4
    la $4, msgNumNaturais
    syscall
loopImprimir: 
    slti $11, $8, 20
    beqz $11, fimImprimir
    mul $10, $8, $9
    add $10, $10, $5
    lw $17, 0($10)
    addi $8, $8, 1
    slti $12, $17, 0
    bnez $12, loopImprimir
    li $2, 1
    addi $4, $17, 0
    syscall
    li $2, 4
    la $4, quebraLinha
    syscall
    addi $13, $0, 1
    j loopImprimir
fimImprimir: 
    bnez $13, fimImpressao
    li $2, 4
    la $4, msgVazio
    syscall
fimImpressao:
    j voltar
final: 
    nop
