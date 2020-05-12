	    LIST	p=16F84A    ; controller type
	    __CONFIG	03FF1H	    ; configure controller
PORTB	    equ		06h	    ; address of PORTB register, bank 0
TRISB	    equ		06h	    ; address of TRISB register, bank 1
STATUS	    equ		03h	    ; register 
	   
	    org 0		    ; start program
	    
START	    CLRF	PORTB	    ; Clear f(or set all bits of PORTB to 0)
	    bsf		STATUS,5    ; Bit set f(register file address); selecet bank 1
				    ; TRISB sets port direction
	    CLRF	TRISB	    ; Clear f(sets all bits to 0); set portb direction to output
	    
	    bcf		STATUS,5    ; Bit clear f(register file address); select bank 0
	    
	    movlw	b'11110010' ; Move iteral to W(working register: accumulator)
	    movwf	PORTB	    ; Move W(working register) to f(register file address)
		
	    nop			    ; no operation
	    
	    goto	START	    ; wait
	    
	    end			    ; end


