package EjerciciosComplementarios1;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int totalS;
        int totals;
        int totalM;
        int totalD;
        int totalm;
        System.out.println("This program will calculate five operations: sum, subtraction, multiplication, division and the module.");
        System.out.println("Please, enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();
        totalS = A + B;
        System.out.println("This will be your total sum: " + totalS);
        totals = A - B;
        System.out.println("This will be your total subtraction: " + totals);
        totalM = A * B;
        System.out.println("This will be your total multiplication: " + totalM);
        totalD = A / B;
        System.out.println("This will be your total division: " + totalD);
        totalm = A % B;
        System.out.println("This will be your total module: " + totalm);
    }
}
