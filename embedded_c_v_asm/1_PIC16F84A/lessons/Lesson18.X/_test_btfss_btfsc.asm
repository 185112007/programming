	    LIST	p=16F84A
	    __CONFIG	03FF1H
	    
RegX	    equ		20h	
	    
	    org		0
	    
	    ; skips next instruction
START	    movlw	b'01010100'	    ; w=01010100
	    movwf	RegX		    ; RegX=w
	    btfsc	RegX,0		    ; if RegX's bit0 is 0 skip next instruction
SKIP1	    INCF	RegX,1		    ; RegX=RegX+1
	    INCF	RegX,1		    ; RegX=RegX+1
	    
	    ; does not skip
	    movlw	b'01010101'	    ; w=01010101
	    movwf	RegX		    ; RegX=w
	    btfsc	RegX,0		    ; if RegX's bit0 is 0 skip next instruction
NONSKIP1    INCF	RegX,1		    ; RegX=RegX+1
	    INCF	RegX,1		    ; RegX=RegX+1
	    
	    ; skips next instruction
	    movlw	b'01010101'	    ; w=01010101
	    movwf	RegX		    ; RegX=w
	    btfss	RegX,0		    ; if RegX's bit0 is 1 skip next instruction
SKIP2	    INCF	RegX,1		    ; RegX=RegX+1
	    INCF	RegX,1		    ; RegX=RegX+1
	    
	    ; does not skip
	    movlw	b'01010100'	    ; w=01010100
	    movwf	RegX		    ; RegX=w
	    btfss	RegX,0		    ; if RegX's bit0 is 1 skip next instruction
NONSKIP2    INCF	RegX,1		    ; RegX=RegX+1
	    INCF	RegX,1		    ; RegX=RegX+1
	    
	    goto	START
	    end