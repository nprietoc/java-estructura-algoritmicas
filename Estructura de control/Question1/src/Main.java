
import java.util.Scanner;


public class Main {

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
       float sueldo = 0;       
       System.out.println("Ingresa tu sueldo");        
       sueldo = s.nextFloat(); 
       if(sueldo > 3000){
           System.out.println("Usted debe abonar impuestos");
       } 
    }
}
