Algoritmo Ejercicio4
    Definir h Como Entero
    
    Escribir "Introduce la hora (0 - 23): "
    Leer h
    
    Si h < 0 O h > 23 Entonces
        Escribir "La hora debe estar entre 0 y 23."
    SiNo
        Si h >= 6 Y h <= 12 Entonces
            Escribir "¡Buenos días!"
        SiNo
            Si h >= 13 Y h <= 20 Entonces
                Escribir "¡Buenas tardes!"
            SiNo
                Escribir "¡Buenas noches!"
            FinSi
        FinSi
    FinSi
    
FinAlgoritmo
