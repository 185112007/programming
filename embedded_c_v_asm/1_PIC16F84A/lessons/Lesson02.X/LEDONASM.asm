	LIST		p=16F84A
	__CONFIG	03FF1H
STATUS	equ		03h
PORTB	equ		06h
TRISB	equ		06h
        
;***************************************************************************	
	org		0		; start
	
	bsf		STATUS, 5	; set STATUS for TRISB settings
    
	bcf		TRISB, 4	; TRISB controlles PORTB
	bcf		TRISB, 5	; we must turn on first
	bcf		TRISB, 6
	bcf		TRISB, 7
	bcf		TRISB, 1
	; after instructions 4 above we can control pins:4,5,6,7 of PORTB
    
	bcf		STATUS, 5	; set STATUS for PORTB settings
	
	; bsf vklyucatel
	bcf		PORTB, 7	; bsf f,b  : set bit b in f
	bsf		PORTB, 5
	bsf		PORTB, 1
    
	; bcf vyklyucatel
	bcf		PORTB, 4	; bcf f,b  : clear bit b in f
	bcf		PORTB, 6
LABEL	goto		LABEL
	end				; end
