	    LIST	p=16F84A    ; controller type
	    __CONFIG	03FF1H	    ; configure controller
PORTB	    equ		06h	    ; address of PORTB register, bank 0
TRISB	    equ		06h	    ; address of TRISB register, bank 1
STATUS	    equ		03h	    ; register 
	   
	    org 0		    ; start program
	    
	    bsf		STATUS,5    ; set STATUS[5] to 1, selecet bank 1
				    ; TRISB sets port direction
	    bcf		TRISB,7	    ; bcf sets 0 to TRISB[7], direction: output
	    bcf		TRISB,6	    ; ...
	    bcf		TRISB,5
	    bcf		TRISB,4
	    
	    bcf		STATUS,5    ; set STATUS[5] to 0, select bank 0
	    
	    bsf		PORTB,7	    ; set 1 to PORTB[7], bsf(bit set f)
	    bcf		PORTB,6	    ; set 0 to PORTB[6], bcf(bit clear f)
	    bsf		PORTB,4	    ; set 1 to PORTB[4], bsf(bit set f)
	    bcf		PORTB,5	    ; set 0 to PORTB[5], bcf(bit clear f)
	    
	    bsf		TRISB,5	    ; DO NOT DO THIS!!!
				    ; is equivalent for: bsf PORTB
				    ; because TRISB is not visible in bank 0,
				    ; and sets PORTB[5] to 1 because they 
				    ; are in the same addresses
	    
LABEL	    goto	LABEL	    ; wait
	    
	    end			    ; end


