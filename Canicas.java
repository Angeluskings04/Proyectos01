/**
 * Proyecto01 
 * @author Castro Reyes Angel.
 * @version 1.0
 */ 

//Importamos las librerias necesarias.
 import java.util.Scanner;
 import java.util.Random;

public class Canicas{

    //Atributos
    int canicasUsuario;
    int canicasCPU;

    public Canicas(int a, int b){

        canicasUsuario = a;
        canicasCPU = b;

    }

    public Canicas(){
        canicasUsuario = 10;
        canicasCPU = 10;
    }

    /**
    * Método que permite conocer la cantidad de canicas del usuario
    * 
    * @return int La canitdad de canicas
    */
    public int getCanicasUsuario() {
      return canicasUsuario;
    }

    /**
    * Método que permite conocer la cantidad de canicas de la cpu
    * 
    * @return int La canitdad de canicas
    */
    public int getCanicasCPU() {
        return canicasCPU;
    }

    /**
    * Método que permite modificar la la cantidad de canicas de usuario
    * 
    * @param int El nuevo valor para las canicas del usuatio
    */
    public void setCanicasUsuario(int a) {
        this.canicasUsuario = a;
    }

    /**
    * Método que permite modificar la la cantidad de canicas de cpu
    * 
    * @param int El nuevo valor para las canicas de cpu
    */
    public void setCanicasCPU(int b) {
        this.canicasCPU = b;
    }

    /**
     * Metodo que recibir a la apuesta del usuario contra la de la cpu
     * @param p son las canicas que el usuario apostara.
     * @param c es la prediccion del usuario, 0 es par y 1 es impar
     * @param f es la apuesta del 
     * @return
     */
    public void apuestaUsuario(int p, int c, int f){

        if(p <= this.getCanicasUsuario()){
            if (c== f % 2){
                // La preccion es correcta se le sumara la apuesta de la cpu.
                int nuevasCanicasUsuario = this.getCanicasUsuario() + f;
                // A la cpu se le restara la apuesta.
                int nuevasCanicasCPU = this.getCanicasCPU() - f;
                this.setCanicasUsuario(nuevasCanicasUsuario);
                this.setCanicasCPU(nuevasCanicasCPU);
                
            } else {
                // La preccion fue errone se le resatra al usuario su apuesta.
                int nuevasCanicas = this.getCanicasUsuario() - p;
                // A la cpu se le sumara la puesta del usuario por haber perdido.
                int nuevasCanicasCPU = this.getCanicasCPU() + p;
                this.setCanicasUsuario(nuevasCanicas);
                this.setCanicasCPU(nuevasCanicasCPU);
            }
        } else{System.out.println("Estas apostando mas de lo que tienes");}
    }

    //Metodo de apuesta para la CPU
    public void apuestaCPU(int p, int d, int f){

        if(p <= this.getCanicasCPU()){
            if(d== f%2){
                // La preccion es correcta se sumara la puesta a la cpu.
                int nuevasCanicasCPU = this.getCanicasCPU() + f;
                // Se le restara la puesta al usuario.
                int nuevasCanicasUsuario = this.getCanicasUsuario() - f;
                this.setCanicasCPU(nuevasCanicasCPU);
                this.setCanicasUsuario(nuevasCanicasUsuario);
            }else{
                int nuevasCanicasUsuario = this.getCanicasUsuario() + p;
                int nuevasCanicasCPU = this.getCanicasCPU() - p;
                this.setCanicasCPU(nuevasCanicasCPU);
                this.setCanicasUsuario(nuevasCanicasUsuario);
            }
        }

    }

    public String toString() {
		return "Canicas del jugador: " + canicasUsuario + 
        "\n" + "Canicas del contricante: " + canicasCPU;
	}

}
