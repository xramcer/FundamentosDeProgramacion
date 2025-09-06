Algoritmo Ejercicio7Switch
    Definir precio Como Real
    Definir sabor, tipo, snacks, personalizar, nombre Como Cadena
    Definir cantidadSnacks Como Entero
    
    precio <- 0
    
    Escribir "¿De qué sabor quieres la tarta?"
    Escribir "- manzana"
    Escribir "- fresa"
    Escribir "- chocolate"
    Escribir "Elige un sabor: "
    Leer sabor
    
    Segun sabor Hacer
        Caso "manzana":
            precio <- 200
        Caso "fresa":
            precio <- 250
        Caso "chocolate":
            Escribir "¿Quieres chocolate negro o blanco?: "
            Leer tipo
            Si tipo = "negro" Entonces
                precio <- 280
            SiNo
                Si tipo = "blanco" Entonces
                    precio <- 300
                SiNo
                    Escribir "Opción inválida, se asignará chocolate negro por defecto."
                    precio <- 280
                FinSi
            FinSi
        De Otro Modo:
            Escribir "Sabor inválido, se asignará tarta de manzana por defecto."
            precio <- 200
    FinSegun
    
    Escribir "¿Deseas agregar snacks? (s/n): "
    Leer snacks
    Si snacks = "s" Entonces
        Escribir "¿Cuántos snacks deseas añadir?: "
        Leer cantidadSnacks
        precio <- precio + (cantidadSnacks * 25)
    FinSi
    
    Escribir "¿Quieres personalizar la tarta con un nombre? (s/n): "
    Leer personalizar
    Si personalizar = "s" Entonces
        Escribir "Escribe el nombre para la tarta: "
        Leer nombre
        precio <- precio + 30
    FinSi
    
    Escribir "El precio total de tu tarta es: $", precio
    
FinAlgoritmo
