Algoritmo ContarPositivosNegativos
	Definir C, CA, CP, CN, NU Como Entero
	
	CP <- 0
	CN <- 0
	
	Escribir "Ingrese el número de cantidades a evaluar: "
	Leer NU
	
	C <- 1
	Repetir
		Escribir "Ingrese la cantidad ", C, ": "
		Leer CA
		
		Si CA > 0 Entonces
			CP <- CP + 1
		SiNo
			CN <- CN + 1
		FinSi
		
		C <- C + 1
	Hasta Que C > NU
	
	Escribir "Cantidad de números positivos: ", CP
	Escribir "Cantidad de números menores o iguales a cero: ", CN
FinAlgoritmo