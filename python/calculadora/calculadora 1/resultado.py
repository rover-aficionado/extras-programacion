resultados = []

def guardar_resultados(numero_primero, operacion, numero_segundo, total):
    return f"{numero_primero} {operacion} {numero_segundo} = {total}"

def añadir_lista(valor):
    resultados.append(valor)

def ver_lista_resultados():
    for resultado in resultados:
        print(resultado)

