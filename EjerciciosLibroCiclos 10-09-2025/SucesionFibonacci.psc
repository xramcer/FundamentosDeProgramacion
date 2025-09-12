Algoritmo SucesionFibonacci
	Definir A, B, C, M, N Como Entero
	
//Mientras 
	Escribir "Ingrese la cantidad de elementos de la serie Fibonacci:"
	Leer N
	
	A <- 0
	B <- 1
	M <- 3  
	
	Escribir A
	Escribir B
	
	Mientras M <= N Hacer
		C <- A + B
		Escribir C
		A <- B
		B <- C
		M <- M + 1
	FinMientras

//Repetir
	Escribir "Ingrese la cantidad de elementos de la serie Fibonacci:"
	Leer N
	
	A <- 0
	B <- 1
	M <- 3
	
	Escribir A
	Escribir B
	
	Repetir
		C <- A + B
		Escribir C
		A <- B
		B <- C
		M <- M + 1
	Hasta Que M > N

//Para
	Escribir "Ingrese la cantidad de elementos de la serie Fibonacci:"
	Leer N
	
	A <- 0
	B <- 1
	
	Escribir A
	Escribir B
	
	Para I <- 3 Hasta N Hacer
		C <- A + B
		Escribir C
		A <- B
		B <- C
	FinPara

FinAlgoritmo