package EjerciciosComplementarios2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args){

        List<Integer> numeros = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros, uno por vez: ");
        for(int i=0; i<5; i++){

            numeros.add(scan.nextInt());

        }
        IyT(numeros);

        System.out.println("Ingrese el numero que desea colocar en la primera posicion: ");
        numeros.set(0, scan.nextInt());
        System.out.println("Ingrese el numero que desea colocar en la ultima posicion: ");
        numeros.set(4, scan.nextInt());

        IyT(numeros);

    }

    public static void IyT(List<Integer> numeros){
        for(int i=1; i-1<numeros.size(); i++){
            System.out.print("#"+i);
            System.out.println(" " + numeros.get(i-1));
        }
        System.out.println("El tamaño es de: "+ numeros.size());
    }
}