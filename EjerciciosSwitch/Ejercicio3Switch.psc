Algoritmo Ejercicio3Switch
    Definir opcion Como Entero
    Definir area, r, bt, ht, br, hr, lado Como Real
    
    Escribir "C�lculo de �reas"
    Escribir "1. C�rculo"
    Escribir "2. Tri�ngulo"
    Escribir "3. Rect�ngulo"
    Escribir "4. Cuadrado"
    Escribir "Elija una opci�n (1-4): "
    Leer opcion
    
    Segun opcion Hacer
        Caso 1:
            Escribir "Ingrese el radio: "
            Leer r
            area = PI * r * r
            Escribir "El �rea del c�rculo es: ", area
        Caso 2:
            Escribir "Ingrese la base: "
            Leer bt
            Escribir "Ingrese la altura: "
            Leer ht
            area = (bt * ht) / 2
            Escribir "El �rea del tri�ngulo es: ", area
        Caso 3:
            Escribir "Ingrese la base: "
            Leer br
            Escribir "Ingrese la altura: "
            Leer hr
            area = br * hr
            Escribir "El �rea del rect�ngulo es: ", area
        Caso 4:
            Escribir "Ingrese el lado: "
            Leer lado
            area = lado * lado
            Escribir "El �rea del cuadrado es: ", area
        De Otro Modo:
            Escribir "Opci�n inv�lida, debe ser entre 1 y 4."
    FinSegun
    
FinAlgoritmo
