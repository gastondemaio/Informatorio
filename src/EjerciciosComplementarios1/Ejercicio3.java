package EjerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int j = 0;

        while(numero != j){
            for (int i=0; i<=j; i++){
                System.out.print(i+1);
            }
            System.out.println();
            j = j + 1;
        }
        scanner.close();
    }
}
