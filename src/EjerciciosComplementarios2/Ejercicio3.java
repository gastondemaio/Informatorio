package EjerciciosComplementarios2;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;


public class Ejercicio3 {

    public static void main(String[] args){
        List<Integer> naipes = new ArrayList<Integer>();

        for(int j=1; j<15; j++){
            naipes.add(j);
        }
        System.out.print("Naipes en orden: ");

        System.out.println(naipes);

        System.out.print("Napies en reversa: ");

        System.out.print("[");
        for(int j=(naipes.size()-1); j>=0; j--){

            System.out.print(naipes.get(j)+", ");

        }

        System.out.print(" ]");
        System.out.println();

        Collections.shuffle(naipes);
        Set<Integer> shuffledSet = new LinkedHashSet<Integer>();
        shuffledSet.addAll(naipes);

        System.out.print("Naipes sin orden: ");
        System.out.println(naipes);
    }
}