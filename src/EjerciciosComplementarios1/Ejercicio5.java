package EjerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Este algoritmo realizara una operación de multiplicación por sumas sucesivas");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = scanner.nextInt();

        int suma = 0;
        for(int i= 0; i< b; i++){
            suma = suma + a;
        }
        System.out.println( a + "x" + b + "=" + suma);
    }
}
