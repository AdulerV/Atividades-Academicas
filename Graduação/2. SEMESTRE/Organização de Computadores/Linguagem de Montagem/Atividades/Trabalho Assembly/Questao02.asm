.data
    mensagem: .asciiz "Insira um numero natural: "
    msgInvalido: .asciiz "O número não é natural.\n"
    simbolo1: .asciiz "*"
    simbolo2: .asciiz "#"
    quebraLinha: .asciiz "\n"

.text
# Função principal
    li $2, 4
    la $4, mensagem
    syscall

    li $2, 5
    syscall
    move $5, $2
    jal verificarNatural

    addi $9, $2, 0
    beqz $9, imprimirInvalido
    jal imprimirDesenho
    j fim

# Função para verificar se é natural
verificarNatural: 
    slti $8, $5, 0
    bnez $8, invalido
    addi $2, $0, 1
    j fimVerificacao
invalido:
    addi $2, $0, 0
fimVerificacao:
    jr $31

# Função para imprimir o desenho
imprimirDesenho:
    addi $16, $0, 0
    addi $17, $5, -1
    addi $18, $0, 0
    addi $19, $5, -1
forPrincipal:
    slt $8, $16, $19
    beqz $8, fimDesenho
    loopSimbolo1:
        slt $9, $16, $17
        beqz $9, fimSimbolo1
        addi $17, $17, -1
        li $2, 4
        la $4, simbolo1
        syscall
        j loopSimbolo1
    fimSimbolo1:  
        addi $17, $5, -1
    loopSimbolo2:
        slt $9, $16, $18
        bnez $9, fimSimbolo2
        addi $18, $18, 1
        li $2, 4
        la $4, simbolo2
        syscall
        j loopSimbolo2
    fimSimbolo2:
        addi $18, $0, 0
        addi $16, $16, 1
        li $2, 4
        la $4, quebraLinha
        syscall
       	j forPrincipal
fimDesenho:
    jr $31

# Função para imprimir mensagem de número inválido
imprimirInvalido:
    li $2, 4
    la $4, msgInvalido
    syscall
    j fim
fim: 
    nop
