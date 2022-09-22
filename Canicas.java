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

    public Canicas(){
        canicasUsuario = 10;
        canicasCPU = 10;
    }

    /**
    * Método que permite conocer la cantidad de canicas del usuario
    * 
    * @return int La canitdad de canicas
    */
    public double getCanicasUsuario() {
      return canicasUsuario;
    }

    /**
    * Método que permite conocer la cantidad de canicas de la cpu
    * 
    * @return int La canitdad de canicas
    */
    public double getCanicasCPU() {
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

    //Apuesta usuario.
    public int apuesta(int p){

        if(p <= this.getCanicasUsuario()){
            
        }

    }
}