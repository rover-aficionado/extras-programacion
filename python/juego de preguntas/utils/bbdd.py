# archivo para la identificación de los jugadores y las respuestas correctas.

import mysql.connector as conect
from mysql.connector import Error

# conexion a la base de datos
conn = conect.connect(
            host="localhost",
            user="root",
            password="100695", #AlumnoIFP
            database="juego",
        )


# verificacion de los usuarios.
def jugadores(jugador, clave_acceso):
    try:
        cursor=conn.cursor()
        sql="SELECT COUNT(*) FROM USUARIOS WHERE USUARIO='SONIAG' AND CONTRASEñA=SHA2('1234',256);"
        cursor.execute(sql)
        usuario_contraseña = cursor.fetchall()

        # verifica si el usuario y la contraseña son correctas. devuelve True en caso afirmativo
        print(usuario_contraseña[0][0])
        if usuario_contraseña[0][0] == 1:
            return True
        return False
    
    except Exception as e:
        print("error. no se pudo conectar a la base de datos")
        print(e)

# muestreo de puntuaciones
def puntuaciones(jugador):
    try:
        cursor=conn.cursor()
        sql=f"SELECT puntuacion FROM usuarios WHERE usuario='{jugador}'"
        cursor.execute(sql)
        resultado = cursor.fetchone()
        return resultado[0]
    except Exception as e:
        print("ERROR: no se pudo conectar a la base de datos")
        print(e)

# extrae una pregunta de la base de datos en base a un id pasado por parámetro
def pregunta(id):
    try:
        cursor = conn.cursor()
        sql=f"SELECT texto, respuesta FROM preguntas WHERE codigo = {id}"
        cursor.execute(sql)
        pregunta, respuesta = cursor.fetchone()
        return pregunta, respuesta

    except Exception as e:
        print("ERROR: no se pudo conectar a la base de datos")
        print(e)

# actualiza las puntuaciones de cada usuario, solo será llamado cuando el jugador optenga una puntuación más alta de la que tenia antes.
def actualiza_puntuaciones(puntuacion, usuario):
    try:
        cursor=conn.cursor()
        sql=f"UPDATE usuarios SET puntuacion = {puntuacion} WHERE usuario = '{usuario}';"
        cursor.execute(sql)
        conn.commit()
    except Exception as e:
        print("ERROR: no se pudo conectar con la base de datos")
        print(e)

# guarda la información de cada una de las partidas.
def guardar_partida(nombre, tiempo_empleado, fecha):
    try:
        # extrae el id del usuario
        cursor = conn.cursor()
        sql_usuario = f"SELECT id_usuario FROM usuarios WHERE usuario = '{nombre}';"
        cursor.execute(sql_usuario)
        id_usuario = cursor.fetchone()
        
        # añade una nueva partida
        sql_nueva_partida = f"INSERT INTO partidas (id_usuario, tiempo_empleado, fecha) VALUES ({id_usuario[0]},{tiempo_empleado},'{fecha}')"
        cursor.execute(sql_nueva_partida)
        conn.commit()
    except Exception as e:
        print("ERROR: no se pudo guardar la partida")
        print(e)

