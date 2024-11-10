# Comando if(a==b) ... else ...

addi $16, $0, 8
addi $17, $0, 8

beq $16, $17, else
addi $16, $16, 1
j endif

else: addi $17, $17, 1
endif: nop