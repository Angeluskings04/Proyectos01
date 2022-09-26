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
    Random aleatorios = new Random();
    Scanner sc = new Scanner(System.in);
    String usuario;
    String contrasena;
    
    //Ademas de contruir un objeto de clase canicas, tambien se inicialia el juego con 10 canicas cada quien.
    Canicas ca = new Canicas();

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
            
            int opcion = sc.nextInt();
            
            if(opcion == 1){

                System.out.print("Bienvenido al juego de canicas!");
                System.out.println("Tu contricante de hoy sera la PC");

                //Imprime que cada uno de los jugadores tiene 10 canicas cada quien.
                System.out.println("El juego inicia con: " + "\n" + ca);

                int canicasPC;
                int canicasUs;

                while(canicasPC < 20 || canicasUs < 20){

                    canicasPC = this.getCanicasCPU();
                    canicasUs = this.getCanicasUsuario(); 

                    System.out.println("Momento de apostar");
                    System.out.print("Ingresa tu apuesta: ");
                    int apuestaDelUsuario = sc.nextInt();
                    System.out.print("\n");
                    System.out.print("Tu prediccion sera par o impar(0 para par y 1 para impar)");
                    int decisionUsuario = sc.nextInt();
                    
                    //Apuesta de la pc.
                    int apuestaDeLaPC = aleatorios.nextInt(canicasPC) + 1;

                    ca.apuestaUsuario(apuestaDelUsuario, decisionUsuario, apuestaDeLaPC);

                    System.out.println(ca);
                    

                    

                }

            }
        

        }else {System.out.println("Acceso Denegado");}
    }
}