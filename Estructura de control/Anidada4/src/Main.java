
import java.util.Scanner;


public class Main {

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int numero = 0;
        String cantidad = "";
        System.out.println("Ingresa un numero");
        numero = s.nextInt();
        cantidad = Integer.toString(numero);        
        if(cantidad.length() > 3) {            
            System.out.println("el número de cifras es mayor a 3");            
        }else {
            System.out.println("el numero tiene " + cantidad.length() + " cifras");            
        } 
    }
    
}
