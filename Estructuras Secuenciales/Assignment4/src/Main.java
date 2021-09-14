import java.util.Scanner;

public class Main {

   public static Scanner s = new Scanner(System.in);
   public static void main(String[] args) {
       int numberOne = 0;
       int numberTwo = 0; 
       int numberThree = 0;
       int numberFour = 0; 
       int suma = 0;
       int promedio = 4;
       System.out.println("Problema Cuatro");
       System.out.println("Ingrese el primer numero");
       numberOne = s.nextInt();
       System.out.println("Ingrese el segundo numero");
       numberTwo = s.nextInt(); 
       System.out.println("Ingrese el tercer numero");
       numberThree = s.nextInt();
       System.out.println("Ingrese el cuarto numero");
       numberFour = s.nextInt();
       suma = suma(numberOne, numberTwo, numberThree, numberFour);        
       promedio(suma, promedio);         
    }
    
    public static int suma(int a,int b, int c, int d) {
       int suma = a + b + c + d;
       System.out.println("Suma de los numeros: " + a + "+" + b + "+" + c + "+"  + d + "=" + suma); 
       return suma;
    }
    
    public static void promedio(int a,int b) {
        float promedio = (float)a / (float)b;
        System.out.println("Promedio de la suma de los cuatro numeros: " + a + "/" + b + "=" + promedio);
    }
}
