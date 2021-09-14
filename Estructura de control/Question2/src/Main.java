
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
            System.out.println(uno + "es el mayor de los numeros");
        }else {
            System.out.println(dos + "es el mayor de los numeros");
        }
    }
        
}
