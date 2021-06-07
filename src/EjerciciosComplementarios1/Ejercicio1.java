package EjerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        System.out.println("Ingrese su nombre: ");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.next();
        scanner.close();
        System.out.println("Hola " + nombre);

    }
}
