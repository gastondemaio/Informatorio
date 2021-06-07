package EjerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Este algoritmo creara una aplicación mostrara los datos de una persona");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.next();
        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.next();
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese su direccion: ");
        int direccion = scanner.nextInt();
        System.out.println("Ingrese su ciudad: ");
        String ciudad = scanner.next();

        System.out.println(ciudad + "-" + direccion + "-" + edad + "-" + apellido +" "+ nombre);

    }
}