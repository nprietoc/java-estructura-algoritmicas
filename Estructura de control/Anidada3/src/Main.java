
import java.util.Scanner;


public class Main {

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int numero = 0;
        System.out.println("Ingresa un numero");
        numero = s.nextInt();
        if (numero > 0){
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es nulo");
        }
    }
    
}
