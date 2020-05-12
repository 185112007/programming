	    LIST	p=16F84A    ; controller type
	    __CONFIG	03FF1H	    ; configure controller
;idyot oblast opredeleniya imyon yaceek operativnoy pamyati
PORTB	    equ		06h	    ; address of PORTB register, bank 0
TRISB	    equ		06h	    ; address of TRISB register, bank 1
STATUS	    equ		03h	    ; register 
Reg_1	    equ		10h	
Reg_2	    equ		11h
Reg_3	    equ		12h	    ; hex number, 12h(hex) = .18(dec) = 00010010(bin)
Reg_X	    equ		13h
Reg_Y	    equ		14h
;kones oblasti opredeleniya imyon	    
	    org 0		    ; nacalo programmi
	    
	    bsf		STATUS,5    ; peresli v 1yy bank,ctoby
				    ; nastroit nojki RB0-RB7
	    CLRF	TRISB	    ; na upravlenie svetodiodami
	    
	    bcf		STATUS,5    ; Perehod v 0 bank
	    
START	    movlw	b'11110000' ; Vklyucaem svetodiyody podklyucennye k
	    movwf	PORTB	    ; nojkam RB7-RB4
	    
	    call	delay	    ; Ostavlyaem svetodiyody vklyucennymi v tecenii sekundy
	    
	    movlw	b'01100000'
	    movwf	PORTB
	    
	    call	delay
	    
	    movlw	b'00110000'
	    movwf	PORTB
	    
	    call	delay
	    
	    movlw	b'10010000'
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
	    
DELAY	    movlw	.2	    ; w = f
	    movwf	Reg_X	    ; Reg_X = w
	    movlw	.3	    ; w = f
	    movwf	Reg_Y	    ; Reg_Y = w
	    
MetD	    decfsz	Reg_X,1	    ; decrement Reg_X and write to Reg_X
	    goto	MetD
	    
	    decfsz	Reg_Y,1
	    goto	MetD
	    return
	    
	    end			    ; end


