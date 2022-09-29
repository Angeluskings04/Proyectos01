/**
 * Proyecto01 
 * @author Castro Reyes Angel.
 * @version 1.0
 */ 

 public class Calculadora{

    /*
     * Metodo que pasa de Decimal a Binario.
     */
    public static void decimalABinario(int decimal){

        String binario = " ";
        int mod;
        int auxNum = decimal;

        while(auxNum>0){
        mod = (auxNum%2);
        binario = mod + binario;
        auxNum = auxNum/2; 
        }
        System.out.print("En binario del numero: " + decimal + " es: " + binario); 
    }

    public static void decimalAOctal(int decimal){
        String octal = " ";
        int mod;
        int auxNum2 = decimal;

        while(auxNum2>0){
            mod = (auxNum2%8);
            auxNum2 = auxNum2/8;
            octal = mod + octal;
        }
        System.out.print("El octal del numero: " + decimal + " es: " + octal);
    }

    //Metodo que nos ayudara como auxilar.
    public static String auxDecimalaHexadecimal(int decimal){
        String hex = "";
        if(decimal==10){
            //System.out.print("A");
            hex+="A";
        }else if(decimal==11){
            //System.out.print("B");
            hex+="B";
        }else if(decimal==12){
            //System.out.print("C");
            hex+="C";
        }else if(decimal==13){
            //System.out.print("D");
            hex+="D";
        }else if(decimal==14){
            //System.out.print("E");
            hex+="E";
        }else if(decimal==15){
            //System.out.print("F");
            hex+="F";
        }else{
            //System.out.print(decimal);
            hex+=decimal;
        }
        return hex;
    }

    public static void decimalAHexadecimal(int decimal){
        int auxNum3 = decimal;
        String hexadecimal = " ";
        int mod;
        while(auxNum3!=0){
            mod = auxNum3%16;
            auxNum3 = auxNum3/16;
            hexadecimal = auxDecimalaHexadecimal(mod) + hexadecimal;
            //System.out.print(hexadecimal);
        }
        System.out.print(hexadecimal);

    }

    public static void binarioADecimal(int b){

        int decimal = 0;
        int last;
        int binario = b;
        int cont=0;
        while(binario!=0){
            last = binario%10;
            decimal += last*Math.pow(2, cont);
            cont++;
            binario/=10;
        }
        System.out.println(decimal);
    }
 }