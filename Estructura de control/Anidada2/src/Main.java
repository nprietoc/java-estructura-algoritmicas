
import java.util.Scanner;


public class Main {

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
       int uno = 0;
       int dos = 0;
       int tres = 0;
       System.out.println("Ingresa el primer numero");
       uno = s.nextInt();
       System.out.println("Ingresa el segundo numero");
       dos = s.nextInt();
       System.out.println("Ingresa el tercer numero");
       tres = s.nextInt();
       if (uno > dos) {
           if (uno > tres) {
               System.out.println("El mayor es: " + uno);
           } else {
               System.out.println("El mayor es: " + tres);
           }
       } else if (dos > tres) {
           System.out.println("El mayor es: " + dos);
       } else {
           System.out.println("El mayor es: " + tres);
       }
       
    }
    
}
