	    LIST	p=16F84A
	    __CONFIG	03FF1H

PORTB	    equ		06h
TRISB	    equ		06h
STATUS	    equ		03h
	    
	    org 0
	    
	    bsf		STATUS,5    ;select bank 1
	    CLRF	TRISB
	    
	    bcf		STATUS,5    ;select bank 0
	    movlw	b'00000010'
	    movwf	PORTB
	    
START	    goto	START
	    return
	    
	    end
	    