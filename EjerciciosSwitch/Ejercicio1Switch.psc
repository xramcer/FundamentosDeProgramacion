Algoritmo Ejercicio1Switch
    Definir numeroMes, totalDias Como Entero
    Definir mesNombre Como Cadena
	
    Escribir "Introduce el número del mes (1 - 12): "
    Leer numeroMes
	
    Si numeroMes >= 1 Y numeroMes <= 12 Entonces
        Segun numeroMes Hacer
            Caso 1: mesNombre <- "Enero"; totalDias <- 31
            Caso 2: mesNombre <- "Febrero"; totalDias <- 28
            Caso 3: mesNombre <- "Marzo"; totalDias <- 31
            Caso 4: mesNombre <- "Abril"; totalDias <- 30
            Caso 5: mesNombre <- "Mayo"; totalDias <- 31
            Caso 6: mesNombre <- "Junio"; totalDias <- 30
            Caso 7: mesNombre <- "Julio"; totalDias <- 31
            Caso 8: mesNombre <- "Agosto"; totalDias <- 31
            Caso 9: mesNombre <- "Septiembre"; totalDias <- 30
            Caso 10: mesNombre <- "Octubre"; totalDias <- 31
            Caso 11: mesNombre <- "Noviembre"; totalDias <- 30
            Caso 12: mesNombre <- "Diciembre"; totalDias <- 31
        FinSegun
		
        Escribir "El mes seleccionado es: ", mesNombre
        Escribir "Tiene ", totalDias, " días."
    Sino
        Escribir "Número de mes inválido. Debe estar entre 1 y 12."
    FinSi
FinAlgoritmo
