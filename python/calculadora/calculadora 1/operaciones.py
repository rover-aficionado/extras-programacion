#operaciones

def suma(numero_primero, numero_segundo):
    return numero_primero + numero_segundo

def resta(numero_primero, numero_segundo):
    return numero_primero + numero_segundo

def multiplicacion(numero_primero, numero_segundo):
    return numero_primero * numero_segundo

def division(numero_primero, numero_segundo):
    if numero_segundo == 0:
        return "ERROR: no se puede dividir entre 0"
    else: 
        return numero_primero/numero_segundo