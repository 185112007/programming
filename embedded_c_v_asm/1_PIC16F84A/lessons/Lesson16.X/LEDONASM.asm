	    LIST	p=16F84A
	    __CONFIG	03FF1H

PORTB	    equ		06h
TRISB	    equ		06h
PORTA	    equ		05h
TRISA	    equ		05h
STATUS	    equ		03h
Reg_1	    equ		0ch
Reg_2	    equ		0dh
	    
	    org 0
	    
	    bsf		STATUS,5    ;select bank 1
	    
	    CLRF	TRISB	    ;clear trisb(or set 0)
	    CLRF	TRISA	    ;
	    
	    bcf		STATUS,5    ;select bank 0
	    
START	    movlw	b'00000010' ; 6
	    movwf	PORTB
	    
	    movlw	b'0001'	    ; set 1 for PORTA[0]
	    movwf	PORTA
	    
	    call	delay_100
	    
	    bcf		PORTA,0	    ; clear PORTA[0]
	    
	    movlw	b'00000000' ; 8
	    movwf	PORTB
	    
	    bsf		PORTA,1	    ; set 1 for PORTA[1]
	    call	delay_100
	    bcf		PORTA,1	    ; clear PORTA[1]
	    
	    movlw	b'01111001' ; ?
	    movwf	PORTB
	    
	    bsf		PORTA,2	    ; set 1 for PORTA[1]
	    call	delay_100
	    bcf		PORTA,2	    ; clear PORTA[1]
	    
	    movlw	b'01111000' ; ?
	    movwf	PORTB
	    
	    bsf		PORTA,3	    ; set 1 for PORTA[1]
	    call	delay_100
	    bcf		PORTA,3	    ; clear PORTA[1]
	    
	    goto	START
	    
; Delay 1 000 machine cycles
; Duration of the delay 1 millisecond
; Frequency of the pulsing oscillator 4 MHZ

delay_1ms   movlw       .75
            movwf       Reg_1
            movlw       .2
            movwf       Reg_2
            decfsz      Reg_1,F
            goto        $-1
            decfsz      Reg_2,F
            goto        $-3
	    return
	    
; Delay 100 000 machine cycles
; Duration of the delay 100 millisecond
; Frequency of the pulsing oscillator 4 MHZ

delay_100   movlw       .221
            movwf       Reg_1
            movlw       .130
            movwf       Reg_2
            decfsz      Reg_1,F
            goto        $-1
            decfsz      Reg_2,F
            goto        $-3
            nop
            nop
	    
	    end