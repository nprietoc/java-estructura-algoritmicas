import java.util.Scanner;

public class Main {

   public static Scanner s = new Scanner(System.in);
   public static void main(String[] args) {
       int numberOne = 0;
       int numberTwo = 0; 
       int numberThree = 0;
       int numberFour = 0;
       System.out.println("Problema Tres");
       System.out.println("Ingrese el primer numero");
       numberOne = s.nextInt();
       System.out.println("Ingrese el segundo numero");
       numberTwo = s.nextInt(); 
       System.out.println("Ingrese el tercer numero");
       numberThree = s.nextInt();
       System.out.println("Ingrese el cuarto numero");
       numberFour = s.nextInt();
       suma(numberOne, numberTwo);        
       producto(numberThree, numberFour);         
    }
    
    public static void suma(int a,int b) {
       int suma = a + b;
       System.out.println("Suma de los dos primeros numeros: " + a +  "+"  + b + "=" + suma); 
    }
    
    public static void producto(int a,int b) {
        int producto = a * b;
        System.out.println("Producto de los ultimos dos numeros: " + a + "*" + b + "=" + producto);
    }
}