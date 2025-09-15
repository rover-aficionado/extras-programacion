# archivo principal del ahorcado

import tkinter as tk
import aleatorio as al
import bbdd

ventana = tk.Tk()
ventana.title("ahorcado")
ventana.geometry("400x400")

# Crear el lienzo donde dibujaremos las figuras
figuras = tk.Canvas(ventana, width=200, height=400, bg="white")
figuras.pack(side="left")  # Muestra el canvas en la ventana

# Dibujar un círculo (óvalo con coordenadas completas)
figuras.create_oval(50, 20, 100, 70, outline="black", width=2)

ventana.mainloop()