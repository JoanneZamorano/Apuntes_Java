package Clases_Iniciales.Clase8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploNullPointerException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1.Saludar\n" +
                "2.Salir");

        System.out.println("Elige una opción:");

        try{
            int opcion = sc.nextInt();

            int resultado = 5/opcion;

            switch (opcion){
                case 1 -> {
                    System.out.println("Hola");
                    System.out.println("que tal?");
                }
                case 2 -> System.out.println("Adios");
                default -> System.out.println("Opción incorrecta");
        }
        }catch (InputMismatchException e){
            System.out.println("Debes escribir un numero");
        }catch (ArithmeticException e){
            System.out.println("División por 0");
        }finally {
            System.out.println("-----FIN");
        }
        sc.close();
    }
}
