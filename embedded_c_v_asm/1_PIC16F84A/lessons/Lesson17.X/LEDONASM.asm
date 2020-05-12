	    LIST	p=16F84A
	    __CONFIG	03FF1H
PORTB	    equ		06h
TRISB	    equ		06h
PORTA	    equ		05h
TRISA	    equ		05h
STATUS	    equ		03h
Reg_X	    equ		10h
Reg_Y	    equ		11h
	    
	    org 0
	    
	    ; Reg_Y <-- Reg_X operation:
	    ; movf RegX,0 --> copy RegX to W(accumulator)
	    ; movwf RegY  --> copy W(accumulator) to RegY
	    movlw	.8	; W=8
	    movwf	Reg_X	; Reg_X=W
	    movlw	.10	; W=10
	    movwf	Reg_Y	; Reg_Y=W
	    movf	Reg_X,0	; W=Reg_X
	    movwf	Reg_Y	; Reg_Y=W
	    
	    ; subwf Reg_X,0 --> W=Reg_X-W
	    movlw	.8	; W=8
	    movwf	Reg_X	; Reg_X=W
	    movlw	.3	; W=3
	    subwf	Reg_X,0	; W=Reg_X-W, if 0 than write to W	
	    
	    ; subwf Reg_X,1 --> Reg_X=Reg_X-W
	    movlw	.8	; W=8
	    movwf	Reg_X	; Reg_X=W
	    movlw	.3	; W=3
	    subwf	Reg_X,1	; Reg_X=Reg_X-W, if 1 than write to Reg_X
	    
	    ; 2-8=?
	    movlw	.2	; W=2
	    movwf	Reg_X	; Reg_X=W
	    movlw	.8	; W=8
	    subwf	Reg_X,0	; Reg_X=Reg_X-W, if 1 than write to Reg_X
	    
	    ; addwf Reg_X,0 --> W=Reg_X-W
	    movlw	.8	; W=8
	    movwf	Reg_X	; Reg_X=W
	    movlw	.3	; W=3
	    addwf	Reg_X,0	; W=Reg_X+W, if 0 than write to W
	    
	    ; addwf Reg_X,1 --> Reg_X=Reg_X-W
	    movlw	.8	; W=8
	    movwf	Reg_X	; Reg_X=W
	    movlw	.3	; W=3
	    addwf	Reg_X,1	; Reg_X=Reg_X+W, if 1 than write to Reg_X
	    
	    ; incf Reg_X,0 --> W=Reg_X+1
	    movlw	.8	; W=8
	    movwf	Reg_X	; Reg_X=W
	    incf	Reg_X,0	; W=Reg_X+1, if 0 than write to W(W=9)
	    
	    ; incf Reg_X,1 --> Reg_X=Reg_X+1
	    movlw	.8	; W=8
	    movwf	Reg_X	; Reg_X=W
	    incf	Reg_X,1	; Reg_X=Reg_X+1, if 1 than write to Reg_X(Reg_X=9)
	    
	    ; decf Reg_X,0 --> W=Reg_X-1
	    movlw	.8	; W=8
	    movwf	Reg_X	; Reg_X=W
	    decf	Reg_X,0	; W=Reg_X-1, if 0 than write to W(W=7)
	    
	    ; decf Reg_X,1 --> Reg_X=Reg_X-1
	    movlw	.8	; W=8
	    movwf	Reg_X	; Reg_X=W
	    decf	Reg_X,1	; Reg_X=Reg_X-1, if 1 than write to Reg_X(Reg_X=7)
	    
START	    goto	START
	    
	    end


