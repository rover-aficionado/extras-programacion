#Números de Lychrel
#la suma de dos numeros de dos cifras deben de dar un número capicúa

def invertir_numero(numeros): # invierte el número input
    numero_invertido=""
    for numero in reversed(numeros):
        numero_invertido+=str(numero)
    return numero_invertido

def es_lychrel(a, b): #verifica si el un número de Lychrel
    resultado=a+b
    resultado_ivertido=invertir_numero(resultado) #invierte el resultado 
    if resultado == resultado_ivertido:
        return True
    
    return False


numero = str(input()) 
numero_invertido= invertir_numero(numero) # variable con el número invertido

if es_lychrel(numero, numero_invertido):
    print("es un numero de Lychrel")
else:
    print("no es un numero de lychrel")
    