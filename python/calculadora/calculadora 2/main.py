#calculadora mk2

import operaciones
import listas_operaciones

salir="" #verifica si se desea salir del bucle
while salir.lower() != "si":
    try:

        numero_primero = int(input("numero primero: "))
        operacion = str(input("operacion: "))
        numero_segundo = int(input("numero segundo: "))

        #realiza las operaciones y las llamadas a los métodos necesarios para las listas
        if operacion == "+":
            resultado=operaciones.suma(numero_primero, numero_segundo) # hace la operacion
            print(resultado)
            listas_operaciones.añadir_lista(numero_primero, operacion,numero_segundo, resultado) # añade la operacion a la lista que se acaba imprimiendo
        elif operacion == "-":
            resultado=operaciones.resta(numero_primero, numero_segundo)
            print(resultado)
            listas_operaciones.añadir_lista(numero_primero, operacion,numero_segundo, resultado)
        elif operacion == "*":
            resultado=operaciones.multiplicacion(numero_primero, numero_segundo)
            print(resultado)
            listas_operaciones.añadir_lista(numero_primero, operacion,numero_segundo, resultado)
        elif operacion == "/":
            resultado=operaciones.division(numero_primero, numero_segundo)
            print(resultado)
            listas_operaciones.añadir_lista(numero_primero, operacion,numero_segundo, resultado)
        else:
            print("ERROR: operacion no válida")
    except:
        print("ERROR: solo numeros enteros")

    salir = str(input("quieres salir? "))

listas_operaciones.imprimir_resultado() #imprime todos los resultados de la calculadora
