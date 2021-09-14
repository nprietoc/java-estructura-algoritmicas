
import java.util.Scanner;


public class Main {

   public static Scanner s = new Scanner(System.in);
   public static void main(String[] args) {
        int numero = 0;
        String cantidad = "";
        System.out.println("Ingresa un numero");
        numero = s.nextInt();
        cantidad = Integer.toString(numero);        
        if(cantidad.length() > 1) {            
            System.out.println(numero + " tiene " + 2 + " dígitos");            
        }else {
            System.out.println(numero + " tiene " + 1 + " dígito");            
        }
    }
    
}
