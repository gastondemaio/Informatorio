package EjerciciosComplementarios2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Cree un ranking de sus provincias favoritas");
        Scanner scanner = new Scanner(System.in);
        String[] ciudades = new String[5];
        ArrayList<String> listas = new ArrayList<String>();
        boolean opcion = true;
        int i = 0;

        while(opcion && i != 5){
            System.out.println("Ingrese una ciudad");
            ciudades[i] = scanner.next();
            i = i + 1;
            System.out.println("Desea continuar? TRUE = si - FALSE = no");
            opcion = scanner.nextBoolean();
        }
        int j = ciudades.length;
        for(i=1; i-1<j; i++){
            System.out.println("#"+i+"-"+ciudades[i]);
        }

    }
}
