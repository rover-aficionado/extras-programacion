# en este archivo van las funcionalidades que permiten que el juego funcione

import utils.aleatorio as al
import utils.bbdd as bbdd
from datetime import datetime

# genera una pregunta en base a un numero pseudoaleatorio
def preguntas(numero):

    pregunta, respuesta = bbdd.pregunta(numero)

    inicio_temporizador = datetime.now().second # inicio del cáculo de tiempo

    #realiza la pregunta
    print(pregunta)
    respuesta_jugaor=input("respuesta: ").strip().upper()
    final_temporizador= datetime.now().second

    #calcula el tiempo empleado
    tiempo_total = final_temporizador-inicio_temporizador
    if tiempo_total >= 10:
        print("respuesta no válida: tiempo excedido")
        return False
    elif str(respuesta) == str(respuesta_jugaor):
        print("respuesta correcta. se añade un punto a tu puntuación")
        return True
    else:
        print("respuesta incorecta")
        return False

