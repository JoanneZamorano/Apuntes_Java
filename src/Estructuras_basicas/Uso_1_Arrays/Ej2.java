package Estructuras_basicas.Uso_1_Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        /*Buscar un elemento: Pide al usuario un número y muestra si está presente en un array, y en qué posición.*/
        Scanner sc = new Scanner(System.in);

        int[] numeros ={10,25,30,50};
        boolean encontrado = false;

        System.out.println("Introduce un numero a buscar: ");
        int buscado = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<numeros.length; i++){

            if(numeros[i] == buscado){
                System.out.println("El numero " + buscado + " esta en la posición " + (i+1));
                encontrado=true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("El numero no esta");
        }

    }
}
