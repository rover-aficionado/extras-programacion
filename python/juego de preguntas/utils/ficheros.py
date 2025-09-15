import os as os
# este archivo gestiona los ficheros que devuelve el juego

ruta = "informe/partida.txt"
# genera un txt con la información de la partida
def informe(nombre_jugador, puntuacion, tiempo_empleado, fecha, preguntas):
    fichero = open(ruta, "w", encoding="utf-8")

    # crea el archivo del informe
    try:
        fichero.writelines("-------------INFORME DE LA PARTIDA-------------\n")
        fichero.writelines(f"nombre del jugador: {nombre_jugador}\n")
        fichero.writelines(f"preguntas acertadas: {puntuacion}/10\n")
        fichero.writelines(f"tiempo empleado: {tiempo_empleado} segundos\n")
        fichero.writelines(f"fecha de realización: {fecha}\n\n")
        fichero.writelines("----------------PREGUNTAS ACERTADAS----------------\n")

        # lista las preguntas acertadas
        for pregunta, respuesta in preguntas.items():
            fichero.writelines(f"pregunta: {pregunta}   ->   respuesta: {respuesta}\n")
    except Exception as e:
        print("error al escribir el fichero")
        print(e)
    finally:
        fichero.close()