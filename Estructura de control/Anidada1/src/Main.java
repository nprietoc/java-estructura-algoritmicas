
import java.util.Scanner;


public class Main {

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
       float notaUno = 0;
       float notaDos = 0;
       float notaTres = 0; 
       float promedio = 0;
       System.out.println("Ingresa la primer nota");
       notaUno = s.nextFloat();
       System.out.println("Ingresa la segunda nota");
       notaDos = s.nextFloat();
       System.out.println("Ingresa la tercera nota");
       notaTres = s.nextFloat();
       promedio = (notaUno + notaDos + notaTres) / 3;
        if(promedio >= 7) {            
            System.out.println("Pomocionado");            
        } else if (promedio  >=4 && promedio < 7) {
            System.out.println("Regular"); 
        } else {
            System.out.println("Reprobado");
        }
    }
    
}
