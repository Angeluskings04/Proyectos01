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
    Canicas canicas1 = new Canicas();

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
        System.out.println("\n");
        
    }else if(accesoUsuario1.equals(usuario) && accesoContrasena1.equals(contrasena)){

            System.out.println("Opciones disponibles. " +
                                "\n" + "1: Juego de las Canicas." + 
                                "\n" + "2: Calculadora.");
            
            int opcion = sc.nextInt();
            
            if(opcion == 1){    

                System.out.print("Bienvenido al juego de canicas!");
                System.out.println("\n");
                System.out.println("Tu contricante de hoy sera: ***CPU***");

                //Imprime que cada uno de los jugadores tiene 10 canicas cada quien.
                System.out.println("El juego inicia con: " + "\n" + canicas1);
                System.out.print("\n");

                int canicasPC = 0;
                int canicasUs = 0;

                boolean centinela = true;

                while(centinela){   
                    
                    canicasPC = canicas1.getCanicasCPU();
                    canicasUs = canicas1.getCanicasUsuario();

                    System.out.println("---Momento de apostar---");
                    System.out.print("\n");

                    System.out.print("Ingresa tu apuesta: ");
                    int apuestaDelUsuario = sc.nextInt();
                    System.out.print("\n");

                    System.out.print("Tu prediccion sera par o impar(0 para par y 1 para impar): ");
                    int decisionUsuario = sc.nextInt();
                    System.out.print("\n");
                    
                    //Apuesta de la pc.
                    int apuestaDeLaPC = aleatorios.nextInt(canicasPC) + 1;
                    
                    //El usuario apuesta y se valida su apuesta si no esta postando mas de lo que tiene
                    if(apuestaDelUsuario <= canicasUs){
                    canicas1.apuestaUsuario(apuestaDelUsuario, decisionUsuario, apuestaDeLaPC);

                    System.out.println("Asi quedaron: " + "\n" + canicas1);

                    }else{
                        System.out.println("Estas apostando mas de lo que tienes");
                    }

                    canicasPC = canicas1.getCanicasCPU();
                    canicasUs = canicas1.getCanicasUsuario();

                    if(canicasUs==20 && canicasPC ==0){

                        centinela = false;
                        System.out.print("Haz ganado!!!!");
                        break;

                    }else if(canicasPC==20 && canicasUs==0){
                        centinela = false;
                        System.out.print("Haz perdido :((");
                        break;
                    }

                    System.out.println("---Momento de apostar de la CPU---");

                    int apuestaDeLaPC2 = aleatorios.nextInt(canicasPC) + 1;
                    int decisionCPU = aleatorios.nextInt(1);

                    System.out.print("Introduce una nueva apuesta");
                    int apuestaDelUsuario2 = sc.nextInt();
                    System.out.print("\n");

                    if(apuestaDelUsuario2 <= canicasUs){

                        canicas1.apuestaCPU(apuestaDeLaPC2, decisionCPU, apuestaDelUsuario2);
                        System.out.println("Asi quedaron: " + "\n" + canicas1);

                    }else {
                        System.out.println("Estas apostando mas de lo que tienes");
                    }

                    canicasPC = canicas1.getCanicasCPU();
                    canicasUs = canicas1.getCanicasUsuario();
                    
                    if(canicasUs==20 && canicasPC ==0){

                        centinela = false;
                        System.out.print("Haz ganado!!!!");
                        break;

                    }else if(canicasPC==20 && canicasUs==0){
                        centinela = false;
                        System.out.print("Toco perder :((");
                        break;
                    }

                }

            } else if(opcion == 2){

                Calculadora calculadora = new Calculadora();

                System.out.print("Calculadora lista para usar!");

                System.out.print("\n");

                System.out.println("Que accion quieres realizar?");
                System.out.print("Opciones: " + "\n" +
                                "1) Decimal a binario" + "\n" +
                                "2) Decimal a octal" + "\n" +
                                "3) Decimal a hexadecimal" + "\n" +
                                "4) Binario a decimal" + "\n" +
                                "5) Binario a octal" + "\n" +
                                "6) Binario a hexadecimal"+ "\n" +
                                "7) Octal a decimal" + "\n" +
                                "8) Octal a binario" + "\n" +
                                "9) Octal a hexadecimal" + "\n" +
                                "10) Hexadecimal a decimal" + "\n" +
                                "11) Hexadecimal a binario" + "\n" +
                                "12) Hexadecimal a octal" + "\n");
                
                int eleccion = sc.nextInt();

                switch(eleccion){

                    case 1:
                        System.out.println("Introduce el numero decimal que quieres convertir: "); 
                        int decimal = sc.nextInt();
                        calculadora.decimalABinario(decimal);
                        break;

                    case 2:
                        System.out.println("Introduce el numero decimal que quieres convertir: ");
                        int decimal2 = sc.nextInt();
                        calculadora.decimalAOctal(decimal2);
                        break; 
                    
                    case 3:
                        System.out.println("Introduce el numero decimal que quieres convertir: ");
                        int decimal3 = sc.nextInt();
                        calculadora.decimalAHexadecimal(decimal3);
                        break;

                    case 4: 
                        System.out.println("Introduce el numero decimal que quieres convertir: ");
                        int decimal4 = sc.nextInt();
                        calculadora.binarioADecimal(decimal4);
                        break;
                    
                }


            }else{System.out.println("Esa opcion no existe");}
        

        }else {System.out.println("Acceso Denegado");}
    }
}