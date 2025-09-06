Algoritmo Ejercicio3
    Definir vel Como Entero
    Definir cumple Como Cadena
	
    Escribir "Ingresa la velocidad: "
    Leer vel
	
    Escribir "¿Es tu cumpleaños? (si/no): "
    Leer cumple
    cumple <- Minúsculas(cumple)
	
    Si cumple = "si" Entonces
        Escribir "No tienes multa."
    Sino
        Si vel < 60 Entonces
            Escribir "No tienes multa."
        Sino
            Si vel <= 80 Entonces
                Escribir "Tienes una multa pequeña."
            Sino
                Escribir "Tienes una multa grande."
            FinSi
        FinSi
    FinSi
FinAlgoritmo