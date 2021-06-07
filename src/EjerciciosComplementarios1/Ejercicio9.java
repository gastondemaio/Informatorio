package EjerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio9 {
    public int contarLetras(String frase){
    int numeroLetrasA = 0;
    for(int i = 0; i< frase.length(); i++){
        if(frase.charAt(i) == 'a' || frase.charAt(i) == 'A' || frase.charAt(i) == 'á' || frase.charAt(i) == 'Á'){
            numeroLetrasA++;
        }

    }
    return numeroLetrasA;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;

        System.out.print("Ingrese una palabra o frase: ");
        frase = scanner.nextLine();

        Ejercicio9 contador = new Ejercicio9();
        System.out.println("La cantidad de a que se han detectado son: " + contador.contarLetras(frase));
    }
}
