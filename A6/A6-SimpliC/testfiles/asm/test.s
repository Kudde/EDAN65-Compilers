.global _start
buf: .skip 1024
.data

.text
_start:
call main
call _exit

main:
        movq $10, %rax
				pushq %rax
        call print
_exit:
        movq $0, %rdi
        movq $60, %rax
        syscall
print:
        pushq %rbp
        movq %rsp, %rbp
        ### Convert integer to string (itoa).
        movq 16(%rbp), %rax
        movq $(buf+1023), %rsi  # RSI = write pointer (starts at end of buffer)
        movb $0x0A, (%rsi)      # insert newline
        movq $1, %rcx           # RCX = string length
        cmpq $0, %rax
        jge itoa_loop
        negq %rax               # negate to make RAX positive
itoa_loop:                      # do.. while (at least one iteration)
        movq $10, %rdi
        movq $0, %rdx
        idivq %rdi              # divide RDX:RAX by 10
        addb $0x30, %dl         # remainder + '0'
        decq %rsi               # move string pointer
        movb %dl, (%rsi)
        incq %rcx               # increment string length
        cmpq $0, %rax
        jg itoa_loop            # produce more digits
