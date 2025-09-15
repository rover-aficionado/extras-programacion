#calculadora
import operaciones
import resultado

# añade las operaciones a una lista
resultados=[]
def guardar_resultados(numero_primero, operacion, numero_segundo, total):
    return f"{numero_primero} {operacion} {numero_segundo} = {total}"

def listar_resultado(valores):
    for valor in valores:
        print(valor)

salir = ""
while salir.lower()!="si":
    numero_primero=int(input("numero primero: "))
    operacion = str(input("operacion: "))
    numero_segundo = int(input("numero segundo: "))

    #ver cálculos
    if operacion == "+":
        resultado=operaciones.suma(numero_primero, numero_segundo)
        resultados.append(guardar_resultados(numero_primero, operacion, numero_segundo, resultado))
        print(resultado)
    elif operacion == "-":
        resultado= operaciones.resta(numero_primero, numero_segundo)
        resultados.append(guardar_resultados(numero_primero, operacion, numero_segundo, resultado))
        print(resultado)
    elif operacion == "*":
        resultado=operaciones.multiplicacion(numero_primero, numero_segundo)
        resultados.append(guardar_resultados(numero_primero, operacion, numero_segundo, resultado))
        print(resultado)
    elif operacion == "/":
        resultado=operaciones.division(numero_primero, numero_segundo)
        resultados.append(guardar_resultados(numero_primero, operacion, numero_segundo, resultado))
        print(resultado)
    else:
        print("ERROR: opcion no válida")
    
    salir=str(input("salir? "))

#resultado.ver_lista_resultados()
resultado.ver_lista_resultados(resultados)