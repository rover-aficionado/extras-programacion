# funciones pseudoaleatorias para el juego

import random as rd

def numero_aleatorio():
    numeros=[]
    while len(numeros) < 10:
        numero_generado = rd.randint(0,100)
        if numero_generado not in numeros:
            numeros.append(numero_generado)
    return numeros
