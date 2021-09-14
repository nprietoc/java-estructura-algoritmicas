import java.util.Scanner;

public class Main {

   public static Scanner s = new Scanner(System.in);
   public static void main(String[] args) {
       int numberOne = 0;
       int numberTwo = 0; 
       System.out.println("Problema uno");       
       System.out.println("Ingrese el primer numero");
       numberOne = s.nextInt();
       System.out.println("Ingrese el segundo numero");
       numberTwo = s.nextInt();           
       suma(numberOne, numberTwo);        
       producto(numberOne, numberTwo);       
    }
    
    public static void suma(int a,int b) {
       int suma = a + b;
       System.out.println("La suma de los enteros es: " + a +  "+"  + b + "=" + suma); 
    }
    
    public static void producto(int a,int b) {
        int producto = a * b;
        System.out.println("El producto de los enteros es: " + a + "*" + b + "=" + producto);
    }
}
