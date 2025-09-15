import mysql.connector as conect
from mysql.connector import Error


conn = conect.connect(
    host="localhost",
    username="root",
    password="AlumnoIFP",
    database="juego",
)

def pregunta(id):
    try:
        cursor = conn.cursor()
        sql =f"SELECT palabra FROM palabras WHERE id_palabra = {id}"
        cursor.execute(sql)
        palabra = cursor.fetchone()
        return palabra[0]
    except Exception as e:
        print(f"ERROR: {e}")
    finally:
        if cursor:
            cursor.close()
        if conn:
            conn.close()

#print(pregunta(46))
