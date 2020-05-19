	    LIST	p=16F84A
	    __CONFIG	03FF1H
RegX	    equ		20h
RegY	    equ		21h
RegZ	    equ		22h
STATUS	    equ		03h	    
	    org		0	    ; start prog
	    
	    ; STATUS[2] is 1 if result of instruction is 0
	    ; otherwise not effect
	    
	    ; also we can change 2nd bit of STATUS manually
	    ; as follows
	    ; 1:
	    bcf		STATUS,2    ; STATUS[2]=0
	    bsf		STATUS,2    ; STATUS[2]=1
	    ; 2:
	    movlw	b'11111011' ; w = 11110111
	    movwf	STATUS	    ; STATUS = 11111111
	    
	    ; 3: result of instruction is 0
	    bcf		STATUS,2    ; STATUS[2]=0
START	    movlw	.10	    ; w = 10
	    movwf	RegX	    ; RegX = 10
	    subwf	RegX,0	    ; w = RegX-w, >> w=0
	    
	    ; 4: result of instruction is not 0
	    bcf		STATUS,2    ; STATUS[2]=0
	    movlw	.10	    ; w=10
	    movwf	RegX	    ; RegX = w
	    movlw	.11	    ; w = 11
	    subwf	RegX,0	    ; w=RegX-w, >> w=-1
	    
	    ; 5: usage for loop 10times
	    movlw	.0	    ; w=0
	    movwf	RegX	    ; RegX = w
Metka	    incf	RegX,1	    ; RegX = RegX + 1
	    bcf		STATUS,2    ; STATUS[2] = 0
	    movlw	.10	    ; w = 10
	    subwf	RegX,0	    ; w = RegX-w
	    btfsc	STATUS,2    ; if STATUS[2]=1 than continue
				    ; else skip
	    goto	Situation1
	    goto	Metka
Situation1  clrf	RegX
	    
	    ; 6: 
	    movlw	.0	    ; w=0
	    movwf	RegX	    ;RegX=w
	    movwf	RegY	    ;RegY=w
	    movwf	RegZ	    ;RegZ=w
Metka1	    incf	RegX,1	    ; RegX = RegX + 1
	    bcf		STATUS,2    ; STATUS[2] = 0
	    movlw	.10	    ; w = 10
	    subwf	RegX,0	    ; w = RegX-w
	    btfsc	STATUS,2    ; if STATUS[2]=1 than continue
				    ; else skip
	    goto	Situation11
	    goto	Metka1
Situation11 incf	RegY,1	    ; RegY=RegY+1
	    clrf	RegX	    ; RegX = 0
	    bcf		STATUS,2    ; STATUS[2] = 0
	    movlw	.10	    ; w=10
	    subwf	RegY,0	    ; w=RegY-w
	    btfsc	STATUS,2    ; if STATUS[2]=1 than continue
	    goto	Situation2
	    goto	Metka1
Situation2  clrf	RegY
	    incf	RegZ
	    movlw	.10
	    subwf	RegZ,0
	    btfss	STATUS,2
	    goto	Metka1
	    clrf	RegZ
	    goto	Metka1
	    end