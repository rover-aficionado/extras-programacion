#!/bin/bash

fichero=/home/$USERNAME/Documents/info-samba/usuarios/listaUsuarios.txt

#nuevo usuario samba con contraseña
nuevoUsuarioSamba(){
	clear
	echo "---nuevo usuario samba---"

	read -p "nombre de usuario: " nombre
	sudo useradd -M -s /bin/false $nombre
	sudo smbpasswd -a $nombre
	sudo smbpasswd -e $nombre
	echo $nombre >> $fichero

	echo $nombre " creado con éxito"
}

#eliminar un usuario de samba
eliminarUsuarioSamba(){
	clear
	echo "---eliminar usuario samba---"

	read -p "nombre de usuario: " nombreUsuario

	#se asegura de que el usuario exista y lo elimina, en caso contrario suelta un mensaje de error
	if [ pdbedit -L | grep -q "^$nombreUsuario:" ];
	then
		sudo deluser $nombre
		echo $nombre " eliminado con éxito"
		if [ -f $fichero ];
		then
			sed -i "/^$nombreUsuario$/d" $fichero
			echo "usuario eliminado del registro"
		else
			echo "usuario no encontrado en el registro"
		fi
	else
		echo "error, usuario no encontrado en Samba"
	fi
}

# menú de opciones para la creación de un nuevo usuario
clear
while [ true ]
do
	clear
	echo "---geston de usuarios Samba---"
	echo "1- crear nuevo usuario"
	echo "2- eliminar un usuario"
	echo "3- salir"

	read -p "selecciona una opcíon: " opcion

	case $opcion in
		1) nuevoUsuarioSamba ;;
		2) eliminarUsuarioSamba ;;
		3) exit ;;
		*) echo "error, opción no válida" ;;
	esac
done

exit
