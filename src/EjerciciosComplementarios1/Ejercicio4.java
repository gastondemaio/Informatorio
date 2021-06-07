package EjerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.print("Ingrese un numero: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();
        System.out.print("El factorial del numero " + numero + " es: " + factorial(numero));
    }
        public static double factorial(int n){
            double aux = 1;
            for (int i = 2; i<= n; i++){
                aux = aux * i;
            }
            return aux;
        }

    }

