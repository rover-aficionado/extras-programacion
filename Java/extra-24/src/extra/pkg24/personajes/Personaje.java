/*@author rober*/

package extra.pkg24.personajes;

import extra.pkg24.armas.Armas;


public abstract class Personaje {
    String nombre;
    int salud=100;
    int defensa;
    boolean estaVivo=true;

    public Personaje(String nombre, int defensa, int salud, boolean estaVivo) {
        this.nombre = nombre;
        this.defensa = defensa;
        this.salud=salud;
        this.estaVivo=estaVivo;
    }
    
    // método  para cambiar el daño durante el combate
    public void daño(int dañoRecibido){
        int dañoReducido= salud -dañoRecibido;
    
        if (dañoReducido<=0){ // si la salud es 0 o baja de 0 es que está muerto
            System.out.println("personaje caido en combate");
            salud=0;
        } else { // el personaje recibe daño pero sigue vivo
            salud=dañoReducido;
            System.out.println(nombre + " recibe un daño de: "+dañoRecibido+" vida restante: " +salud);
        }
        
        if(salud==0){
            estaVivo=false;
        }        
    }
    
    // método para el ataque de los personajes
    
    public abstract void atacar(Personaje objetivo, Armas arma);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }
    
}
