Algoritmo Ejercicio3
    Definir vel Como Entero
    Definir cumple Como Cadena
	
    Escribir "Ingresa la velocidad: "
    Leer vel
	
    Escribir "�Es tu cumplea�os? (si/no): "
    Leer cumple
    cumple <- Min�sculas(cumple)
	
    Si cumple = "si" Entonces
        Escribir "No tienes multa."
    Sino
        Si vel < 60 Entonces
            Escribir "No tienes multa."
        Sino
            Si vel <= 80 Entonces
                Escribir "Tienes una multa peque�a."
            Sino
                Escribir "Tienes una multa grande."
            FinSi
        FinSi
    FinSi
FinAlgoritmo