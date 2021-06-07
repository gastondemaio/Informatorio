package EjerciciosComplementarios2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ejercicio7 {

    public static void main(String[] args){

        fizzBuzzFuncion(1, 5);
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer num: ");
        int prim = scan.nextInt();
        System.out.print("Ingrese el limite num: ");
        int lim = scan.nextInt();

        fizzBuzzFuncion(prim, lim);

    }

    public static void fizzBuzzFuncion(int prim, int lim){

        List<String> buzz =   new ArrayList<String>();
        for (int i=prim; i<lim; i++){
            if( ((i % 2) == 0) && ((i%3)== 0) ){
                buzz.add("FizzBuzz");

            }else if ( (i%3)== 0){
                buzz.add("Buzz");

            }else if ( (i % 2) == 0){
                buzz.add("Fizz");
            }else{
                buzz.add(String.valueOf(i));
            }
        }
        System.out.println(buzz);

    }
}