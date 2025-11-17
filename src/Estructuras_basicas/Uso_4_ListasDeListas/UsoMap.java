package Estructuras_basicas.Uso_4_ListasDeListas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UsoMap {
    public static void main(String[] args) {
        //HasMap: el valor tiene que ser ÚNICO, si no, el segundo lo sobreescribe
        HashMap<String, Double> notas = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n------HashMap:");
        notas.put("Roberto", 5.5);
        notas.put("Ana", 8.5);
        notas.put("Ana", 7.0); //lo sobreescribe
        notas.put("Pepe", 5.5);
        notas.put("Luis", 5.5);
        notas.put("Maria", 10.0);

        System.out.println(notas);

        for (Map.Entry<String, Double> entrada : notas.entrySet()){
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }

        //Buscar por Key:
        System.out.println("Introduce un nombre: ");
        String nombre = sc.nextLine();

        if(notas.containsKey(nombre)){
            System.out.println(nombre + " tiene una nota de: " + notas.get(nombre));
        }else {
            System.out.println("Estudiante no encontrado");
        }


        //TreeMap: ordena por la clave el HashMap
        System.out.println("\n------TreeMap:");
        TreeMap<String, Double> notasOrdenado = new TreeMap<>(notas);

        for (Map.Entry<String,Double> entrada : notasOrdenado.entrySet()){
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }


    }
}
