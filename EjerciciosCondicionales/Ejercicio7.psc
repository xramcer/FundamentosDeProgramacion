Algoritmo Ejercicio7
    Definir x, a, z, suma1, suma2, suma3, resultado Como Entero
	
    Escribir "Ingresa el valor de x: "
    Leer x
	
    Escribir "Ingresa el valor de a: "
    Leer a
	
    Escribir "Ingresa el valor de z: "
    Leer z
	
    suma1 <- x + a
    suma2 <- a + z
    suma3 <- x + z
	
    Si suma1 = 10 O suma2 = 10 O suma3 = 10 Entonces
        resultado <- 10
    Sino
        Si suma1 = suma3 + 10 O suma1 = suma2 + 10 Entonces
            resultado <- 5
        Sino
            resultado <- 0
        FinSi
    FinSi
	
    Escribir "El resultado es: ", resultado
FinAlgoritmo