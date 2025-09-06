Algoritmo Ejercicio3Switch
    Definir opcion Como Entero
    Definir area, r, bt, ht, br, hr, lado Como Real
    
    Escribir "Cálculo de Áreas"
    Escribir "1. Círculo"
    Escribir "2. Triángulo"
    Escribir "3. Rectángulo"
    Escribir "4. Cuadrado"
    Escribir "Elija una opción (1-4): "
    Leer opcion
    
    Segun opcion Hacer
        Caso 1:
            Escribir "Ingrese el radio: "
            Leer r
            area = PI * r * r
            Escribir "El área del círculo es: ", area
        Caso 2:
            Escribir "Ingrese la base: "
            Leer bt
            Escribir "Ingrese la altura: "
            Leer ht
            area = (bt * ht) / 2
            Escribir "El área del triángulo es: ", area
        Caso 3:
            Escribir "Ingrese la base: "
            Leer br
            Escribir "Ingrese la altura: "
            Leer hr
            area = br * hr
            Escribir "El área del rectángulo es: ", area
        Caso 4:
            Escribir "Ingrese el lado: "
            Leer lado
            area = lado * lado
            Escribir "El área del cuadrado es: ", area
        De Otro Modo:
            Escribir "Opción inválida, debe ser entre 1 y 4."
    FinSegun
    
FinAlgoritmo
