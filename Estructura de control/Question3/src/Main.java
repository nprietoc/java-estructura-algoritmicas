
import java.util.Scanner;


public class Main {

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        float uno = 0;
        float dos = 0;
        System.out.println("Ingresa el primer numero");
        uno = s.nextFloat();
        System.out.println("Ingresa el segundo numero");
        dos = s.nextFloat();
        if(uno >= dos) {            
            System.out.println("La suma es: " + (uno + dos));
            System.out.println("La resta es: " + (uno - dos));
        }else {
            System.out.println("El producto es: " + (uno * dos));
            System.out.println("La division es: " + (uno / dos));
        }
    }
    
}
