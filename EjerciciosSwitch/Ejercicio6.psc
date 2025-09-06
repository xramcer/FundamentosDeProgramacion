Algoritmo Ejercicio6
    Definir cantidad, parejas, extra Como Entero
    Definir total Como Real
    Definir dia, resp Como Cadena
    
    BASE <- 50
    MIERCOLES <- 30
    JUEVES_PAREJA <- 75
    DESCUENTO <- 0.10
    
    Escribir "Introduce el número de personas: "
    Leer cantidad
    
    Escribir "Introduce el día de la semana: "
    Leer dia
    
    Escribir "¿Tienes membresía? (s/n): "
    Leer resp
    
    Segun dia Hacer
        Caso "miércoles":
            total <- cantidad * MIERCOLES
        Caso "miercoles":
            total <- cantidad * MIERCOLES
        Caso "jueves":
            parejas <- cantidad / 2
            extra <- cantidad MOD 2
            total <- (parejas * JUEVES_PAREJA) + (extra * BASE)
        De Otro Modo:
            total <- cantidad * BASE
    FinSegun
    
    Si resp = "s" Entonces
        total <- total - (total * DESCUENTO)
    FinSi
    
    Escribir "El precio total es: $", total
    
FinAlgoritmo