Algoritmo Ejercicio5
    Definir d, m Como Entero
    
	Escribir "Introduce tu mes de nacimiento (1-12): "
    Leer m
    Escribir "Introduce tu día de nacimiento (1-31): "
    Leer d
    
    Segun m Hacer
        Caso 1:
            Si d <= 19 Entonces
                Escribir "Tu signo zodiacal es: Capricornio"
            SiNo
                Escribir "Tu signo zodiacal es: Acuario"
            FinSi
        Caso 2:
            Si d <= 18 Entonces
                Escribir "Tu signo zodiacal es: Acuario"
            SiNo
                Escribir "Tu signo zodiacal es: Piscis"
            FinSi
        Caso 3:
            Si d <= 20 Entonces
                Escribir "Tu signo zodiacal es: Piscis"
            SiNo
                Escribir "Tu signo zodiacal es: Aries"
            FinSi
        Caso 4:
            Si d <= 19 Entonces
                Escribir "Tu signo zodiacal es: Aries"
            SiNo
                Escribir "Tu signo zodiacal es: Tauro"
            FinSi
        Caso 5:
            Si d <= 20 Entonces
                Escribir "Tu signo zodiacal es: Tauro"
            SiNo
                Escribir "Tu signo zodiacal es: Géminis"
            FinSi
        Caso 6:
            Si d <= 20 Entonces
                Escribir "Tu signo zodiacal es: Géminis"
            SiNo
                Escribir "Tu signo zodiacal es: Cáncer"
            FinSi
        Caso 7:
            Si d <= 22 Entonces
                Escribir "Tu signo zodiacal es: Cáncer"
            SiNo
                Escribir "Tu signo zodiacal es: Leo"
            FinSi
        Caso 8:
            Si d <= 22 Entonces
                Escribir "Tu signo zodiacal es: Leo"
            SiNo
                Escribir "Tu signo zodiacal es: Virgo"
            FinSi
        Caso 9:
            Si d <= 22 Entonces
                Escribir "Tu signo zodiacal es: Virgo"
            SiNo
                Escribir "Tu signo zodiacal es: Libra"
            FinSi
        Caso 10:
            Si d <= 22 Entonces
                Escribir "Tu signo zodiacal es: Libra"
            SiNo
                Escribir "Tu signo zodiacal es: Escorpio"
            FinSi
        Caso 11:
            Si d <= 21 Entonces
                Escribir "Tu signo zodiacal es: Escorpio"
            SiNo
                Escribir "Tu signo zodiacal es: Sagitario"
            FinSi
        Caso 12:
            Si d <= 21 Entonces
                Escribir "Tu signo zodiacal es: Sagitario"
            SiNo
                Escribir "Tu signo zodiacal es: Capricornio"
            FinSi
        De Otro Modo:
            Escribir "Mes no válido."
    FinSegun
    
FinAlgoritmo
