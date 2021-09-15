
import java.util.Scanner;


public class Main {

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        float preguntas = 0;
        float correctas = 0;
        float porcentaje = 0;
        System.out.println("Ingresa la cantidad total de preguntas");
        preguntas = s.nextFloat();
        System.out.println("Ingresa la cantidad de preguntas contestadas correctamente");
        correctas = s.nextFloat();
        porcentaje = correctas / preguntas;
        if (porcentaje >= 0.9) {
            System.out.println("Nivel Maximo");
        } else if (porcentaje >= 0.75 && porcentaje < 0.9) {
            System.out.println("Nivel Medio");
        } else if (porcentaje >= 0.5 && porcentaje < 0.75) {
            System.out.println("Nivel Regular");
        } else {
            System.out.println("Fuera de Nivel");
        }
            
    }
    
}
