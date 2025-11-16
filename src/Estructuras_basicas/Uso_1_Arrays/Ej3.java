package Estructuras_basicas.Uso_1_Arrays;
import java.util.Arrays;

public class Ej3 {
    public static void main(String[] args) {

        /*Ordenar el array: Declara un array con números desordenados y ordénalo de menor a mayor utilizando Arrays.sort().*/

        int[] numDesordenados = {50,6,83,15};
        Arrays.sort(numDesordenados);

        for (int num: numDesordenados){
            System.out.println(num);
        }
    }
}
