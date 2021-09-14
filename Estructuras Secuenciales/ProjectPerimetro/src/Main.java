import java.util.Scanner;

public class Main {

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int lado = 0;
        int perimetro = 4;
        System.out.println("Problema dos");
        System.out.println("Ingrese el lado del cuadrado");
        lado = s.nextInt();
        cuadrado(lado, perimetro);       
    }
    
    public static void cuadrado(int a, int b){
        int cuadrado = a * b;
        System.out.println("El Perimetro del cuadrado es:" + cuadrado);
    }
} 
