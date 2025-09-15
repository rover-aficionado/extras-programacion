# listas de los resultados

resultados=[]

#añadir los resultadod a una lista
def añadir_lista(numero_primero, operacion, numero_segundo, resultado):
    añadir = f"{numero_primero}{operacion}{numero_segundo}={resultado}"
    resultados.append(añadir)

#imprimir los resultados en las pantalla
def imprimir_resultado():
    for operacion in resultados:
        print(operacion)
