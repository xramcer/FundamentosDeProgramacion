Algoritmo Ejercicio2
    Definir a, b Como Entero
    Definir op Como Cadena
    Definir div Como Real
    
    Escribir "Ingrese el primer n�mero entero: "
    Leer a
    
    Escribir "Ingrese el segundo n�mero entero: "
    Leer b
    
    Escribir "Ingrese la operaci�n (+, -, *, /): "
    Leer op
    
    Segun op Hacer
        Caso "+": 
            Escribir a, " + ", b, " = ", a + b
        Caso "-": 
            Escribir a, " - ", b, " = ", a - b
        Caso "*": 
            Escribir a, " * ", b, " = ", a * b
        Caso "/": 
            Si b <> 0 Entonces
                div = a / b
                Escribir a, " / ", b, " = ", div
            SiNo
                Escribir "Error: no se puede dividir entre 0."
            FinSi
        De Otro Modo:
            Escribir "Operaci�n no v�lida. Use (+, -, *, /)."
    FinSegun
    
FinAlgoritmo
