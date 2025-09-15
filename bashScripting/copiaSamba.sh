#!/bin/bash

samba=/home/recursos
backup=/home/$USER/info-samba/backupArchivos

#hace una copia de seguridad en el directorio backups
hacerCopia(){
	clear
	echo "copiando archivos"
	
	if [ -d $backup ];
	then
		rm -r $backup
		mkdir $backup

	fi
	
	echo "copiando archivos"
	cp $samba $backup
	echo "archivos copiados"
	sleep 3

}

#recupera los datos de Samba
recuperacion(){
	cp -r $backup $samba
	echo "archivos recuperados"
}

while [ true ]
do
#	clear
	echo "---sistema de recuperación y copias de seguridad---"
	echo "1- hacer una copia de seguridad"
	echo "2- recuperar archivos"
	echo "3- salir"
	
	read -p "dime una opcion" opcion
	
	case $opcion in
		1) hacerCopia ;;
		2) recuperacion ;;
		3) exit ;;
		*) echo "error, opción no válida" ;;
	esac
done
