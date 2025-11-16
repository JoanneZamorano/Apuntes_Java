package Estructuras_basicas.Uso_1_Arrays;

import java.util.Scanner;


public class Ej1 {
    public static void main(String[] args) {
        /*Sumar elementos: Suma todos los valores de un array de enteros y muestra el total.*/

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];
        int resultado= 0;

        for (int i=0; i<numeros.length; i++){
            System.out.println("Introduce el número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
            sc.nextLine();
        }
        for (int num:numeros){
            resultado += num;
        }
        System.out.println(resultado);

    }
}
