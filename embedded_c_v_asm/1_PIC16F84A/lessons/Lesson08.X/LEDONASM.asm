	    LIST	p=16F84A    ; controller type
	    __CONFIG	03FF1H	    ; configure controller
PORTB	    equ		06h	    ; address of PORTB register, bank 0
TRISB	    equ		06h	    ; address of TRISB register, bank 1
STATUS	    equ		03h	    ; register 
Reg_1	    equ		10h	
Reg_2	    equ		11h
Reg_3	    equ		12h
	   
	    org 0		    ; start program
	    
	    bsf		STATUS,5    ; Bit set f(register file address); selecet bank 1
				    ; TRISB sets port direction
	    CLRF	TRISB	    ; clear f: setting PORTB to output
	    
	    bcf		STATUS,5    ; set 0 to STATUS[5]; select bank 0
	    
START	    movlw	b'10000000'
	    movwf	PORTB
	    
	    call	delay
	    
	    movlw	b'01000000'
	    movwf	PORTB
	    
	    call	delay
	    
	    movlw	b'00100000'
	    movwf	PORTB
	    
	    call	delay
	    
	    movlw	b'00010000'
	    movwf	PORTB
	    
	    call	delay
	    
	    goto	START	    ; goto na 12 instruksiy nazad
	    
	    
delay	    movlw	.173
	    movwf	Reg_1
	    movlw	.19
	    movwf	Reg_2
	    movlw	.6
	    movwf	Reg_3
	    decfsz	Reg_1,F
	    goto	$-1
	    decfsz	Reg_2,F
	    goto	$-3
	    decfsz	Reg_3,F
	    goto	$-5
	    nop
	    nop
	    return
	    
	    end			    ; end
	    

; 4MHz - 1micro second for each instruction like bcf, bsf


