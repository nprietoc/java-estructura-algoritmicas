
import java.util.Scanner;


public class Main {

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
       float precio = 0; 
       float cantidad = 0;       
       System.out.println("Problema Quinto");
       System.out.println("Ingrese el precio del articulo");
       precio = s.nextFloat();
       System.out.println("Ingrese la cantidad");
       cantidad = s.nextFloat();
       abono(precio, cantidad);
    }
    
    public static float abono(float a, float b) {
       float abono = a * b;
       System.out.println("El comprador debe abonar:" + abono);  
       return abono;
    }
}
