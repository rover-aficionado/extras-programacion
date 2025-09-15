# lista de numeros para sacar palabras aleatorias 

import random as ran

def numeros_aleatorios():
    numeros=[]
    for i in range(5):
        numero = ran.randint(0, 173)
        numeros.append(numero)
    return numeros

