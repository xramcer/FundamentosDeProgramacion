Algoritmo AhorroAnual
	Definir AH Como Real
	Definir M, CA Como Entero
	
	AH <- 0
	M <- 1
	
	Mientras M <= 12 Hacer
		Escribir "Ingrese la cantidad a ahorrar en el mes ", M, ": "
		Leer CA
		AH <- AH + CA
		Escribir "El ahorro acumulado hasta el mes ", M, " es: ", AH
		M <- M + 1
	FinMientras
	
	Escribir "-----------------------------------"
	Escribir "El ahorro total al final del año es: ", AH
FinAlgoritmo