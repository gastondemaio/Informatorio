package EjerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Este algoritmo solicita 2 numeros y realiza una operacion de potencia");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = scanner.nextInt();

        int total = 1;

        for(int i = 1; i<=b; i++){
            total = total * a;
        }
        System.out.println(a + "^" + b + "=" + total);

    }
}
