package Estructuras_basicas.Uso_1_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class UsoArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int indice = 0;

        for (int i=0; i<numeros.length; i++){
            System.out.println("Introduce el número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
            sc.nextLine();
        }

        //Mostrar números introducidos
        for (int num:numeros){
            System.out.println("Número: " + num);
        }

        //Otra opción mostrar numeros:
        while (indice < numeros.length) {
            System.out.println("Posicion " + (indice+1) + ": " + numeros[indice]);
            indice++;
        }

        //Otra opción mostrar numeros:
        Arrays.stream(numeros).forEach(num -> System.out.println("Elemento: " + num));

    }
}
