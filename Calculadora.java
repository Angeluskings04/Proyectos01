import javax.sql.StatementEventListener;

/**
 * Proyecto01 
 * @author Castro Reyes Angel.
 * @version 1.0
 */ 

 public class Calculadora{

    /*
     * Metodo que pasa de Decimal a Binario.
     */
    public static String decimalABinario(int decimal){

        String binario = " ";
        int mod;
        int auxNum = decimal;

        while(auxNum>0){
        mod = (auxNum%2);
        binario = mod + binario;
        auxNum = auxNum/2; 
        }
        System.out.print("En binario es: " + binario); 
        return binario;
    }

    public static String decimalAOctal(int decimal){
        String octal = " ";
        int mod;
        int auxNum2 = decimal;

        while(auxNum2>0){
            mod = (auxNum2%8);
            auxNum2 = auxNum2/8;
            octal = mod + octal;
        }
        System.out.print("El octal es: " + octal);
        return octal;
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

    public static String decimalAHexadecimal(int decimal){
        int auxNum3 = decimal;
        String hexadecimal = " ";
        int mod;
        while(auxNum3!=0){
            mod = auxNum3%16;
            auxNum3 = auxNum3/16;
            hexadecimal = auxDecimalaHexadecimal(mod) + hexadecimal;
            //System.out.print(hexadecimal);
        }
        System.out.print("El resultado es: " + hexadecimal);
        return hexadecimal;
    }

    public static int binarioADecimal(int b){

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
        return decimal;
    }

    public static String binarioAOctal(int b){
        int decimal = binarioADecimal(b);
        String octal = decimalAOctal(decimal);
        //System.out.println(octal);
        return octal;
    }

    public static String binarioAHexadecimal(int b){

        int decimal = binarioADecimal(b);
        String hexadecimal = decimalAHexadecimal(decimal);
        //System.out.println(hexadecimal);
        return hexadecimal;
    }

    public static long octalADecimal(String octal){
        long decimal = 0;
        int potencia = 0;
        for (int i = octal.length() - 1; i >= 0; i--) {
        int valorActual = Character.getNumericValue(octal.charAt(i));
        long elevado = (long) Math.pow(8, potencia) * valorActual;
        decimal += elevado;
        potencia++;
        }
    //System.out.println(decimal);
    return decimal;

    }

    public static String octalABinario(String octal){
        //String decimalS = " " + octalADecimal(octal);
        int decimal = (int) octalADecimal(octal);
        String binario = decimalABinario(decimal);
        //System.out.prinlt(binario);
        return binario;
    }

    public static String octalAHexadecimal(String octal){

        int decimal = (int) octalADecimal(octal);
        String hexadecimal = decimalAHexadecimal(decimal);
        //System.out.prinlt(hexadecimal);
        return hexadecimal;
    }

    public static int hexadecimalADecimal(String hexa){

        final String abecedarioHexa = "0123456789ABCDEF";
        hexa = hexa.toUpperCase();

        int decimal = 0;
        for(int i = 0; i<hexa.length(); i++){
            char car = hexa.charAt(i);
            int digito = abecedarioHexa.indexOf(car);

            decimal = 16 * decimal + digito;

        }
        //System.out.println("El resultado es: " + decimal);
        return decimal;

    }

    public static String hexadecimalABinario(String hexa){
        int decimal = hexadecimalADecimal(hexa);
        String binario = decimalABinario(decimal);
        return binario;
    }

    public static String hexadecimalAOctal(String hexa){
        int decimal = hexadecimalADecimal(hexa);
        String octal = decimalAOctal(decimal);
        return octal;
    }

    public static boolean comprobarBinario(int binario){
        String revision = " " + binario;
        boolean bd = true;
        for(int i=0; i<revision.length(); i++){
            char x = revision.charAt(i);
            if(x!='1' && x!='0'){
                //System.out.println("El numero introduccion no es un binario");
                bd = false;
            }

        }
        return bd;
    }

    public static boolean comprobarOctal(String octal){
        String revision = octal;
        boolean bH = true;
        for(int i=0; i<revision.length(); i++){
            char x = revision.charAt(i);
            if(x!='0' && x!='1' && x!='2' && x!='3' && x!='4'&& x!='5'&& x!='6'&& x!='7'){
                //System.out.println("El numero introduccion no es un binario");
                bH = false;
            }
        }
        return bH;
    }

    public static boolean comprobarHexadecimal(String hexa){
        String revision = hexa.toUpperCase();
        boolean bj = true;
        for(int i=0; i<revision.length(); i++){
            char x = revision.charAt(i);
            if(x!='0' && x!='1' && x!='2' && x!='3' && x!='4'&& x!='5'&& x!='6'&& x!='7' && x!='8' && x!='9'){
                //System.out.println("El numero introduccion no es un binario");
                bj = false;
            }else if(x!='A' && x!='B' && x!='C'&& x!='D'&& x!='E'&& x!='F'){
                bj = false;
            }
        }
        return bj;

    }

 }