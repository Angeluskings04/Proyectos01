/**
 * Proyecto01 
 * @author Castro Reyes Angel.
 * @version 1.0
 */ 

//Importamos las librerias necesarias.
 import java.util.Scanner;
 import java.util.Random;

public class Main{
    public static void main(String[] args){

    // Declaración e inicialización de variables.
    Scanner sc = new Scanner(System.in);
    String usuario;
    String contrasena;

    //Variables que nos ayudara a verificar usuarios
    String accesoUsuario1 = "Miguel";
    String accesoContrasena1 = "yomero";

    String accesoUsuario2 = "icc";
    String accesoContrasena2 = "profesor";

    System.out.print("Ingrese tu usuario: ");
    usuario = sc.nextLine();
    System.out.println(" ");
    System.out.print("Ingrese la contraseña: ");
    contrasena = sc.nextLine();
    System.out.println(" ");


    if(accesoUsuario2.equals(usuario) && accesoContrasena2.equals(contrasena)){

        System.out.println("Bienvenido a Calculadora");
        
    }else if(accesoUsuario1.equals(usuario) && accesoContrasena1.equals(contrasena)){

        System.out.println("Opciones disponibles para ejecutar. " +
                            "\n" + "Para juego de las Canicas oprima 1" + 
                            "\n" + "Para Calculadora oprima 2");

        }else {System.out.println("Acceso Denegado");}
    }
}