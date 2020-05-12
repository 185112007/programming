	    LIST        p=16F84A
            __CONFIG    03FF1H
status      equ         03h
portb       equ         06h
trisb       equ         06h
Reg_1       equ         10h
Reg_2       equ         11h
Reg_3       equ         12h
            org         0
start       bsf         status,5
            movlw       .0
            movwf       trisb
            bcf         status,5
Metka       movlw       b'01010101'
            movwf       portb
            call        delay
            movlw       b'10101010'
            movwf       portb
            call        delay
            goto        Metka
delay       movlw       .221
            movwf       Reg_1
            movlw       .130
            movwf       Reg_2
            decfsz      Reg_1,F
            goto        $-1
            decfsz      Reg_2,F
            goto        $-3
            nop
            nop
            return
            end