package Clase6;

import java.util.Scanner;

public class MainClase6 {
    public static void main(String[] args) {

/** Ejercicio 1 – Salir de un bucle while con break
* Haz un programa que pida al usuario números enteros positivos.
* El programa debe terminar cuando el usuario introduzca el número 0.
* Usa un bucle while con break.*/

    Scanner sc = new Scanner(System.in);
    int numeroPositivo;
        System.out.println("Ejercicio 1. Salir de un bucle while con break. ");
    while (true){
        System.out.println("Introduce un numero o pon 0 para salir: ");
        numeroPositivo = sc.nextInt();;
        if(numeroPositivo == 0){ //si es 0 sale del bucle
            break;
        }
        System.out.println("Has introducido: " + numeroPositivo);
    }
        System.out.println("Programa finalizado.");
    //sc.close();


/** Ejercicio 2 – Saltarse los múltiplos de 3 con continue:
 * Escribe un programa que muestre los números del 1 al 10, excepto los múltiplos de 3.
 * Usa un bucle for con continue.
 */
        System.out.println("Ejercicio2 – Saltarse los múltiplos de 3 con continue:");

    for (int i = 1; i <= 10; i++){
        if(i%3==0){  //Si es múltiplo de 3, salta al siguiente
            continue;
        }
        System.out.println(i);
    }


/** Ejercicio 3 – Finalizar un bucle for al encontrar un número concreto
 * Haz un programa que busque el número 7 entre los números del 1 al 20.
 * Cuando lo encuentre, debe mostrar un mensaje y terminar el bucle con break.
 */
        System.out.println("Ejercicio 3 – Finalizar un bucle for al encontrar un número concreto (el 7)");
    for (int i = 1; i <=20; i++){
        if (i==7){
            System.out.println("7. Felicidades! Lo has encontrado!");
            break;
        }
        System.out.println(i);
    }


/** Ejercicio 4 – Evitar mostrar letras vocales con continue
 * Muestra las letras de la palabra "PROGRAMACION", pero omite las vocales usando continue.
 */
        System.out.println("Ejercicio 4 – Evitar mostrar letras vocales con continue");
        String palabra= "PROGRAMACION";

        for (int i = 0; i < palabra.length(); i++){
            char letra = palabra.charAt(i);

            if(letra == 'A'
                    || letra == 'E'
                    || letra == 'I'
                    || letra == 'O'
                    || letra == 'U'){
                continue;
            }
            System.out.println(letra);
        }

/** Ejercicio 5 – Dividir dos números con try-catch
 * Haz un programa que divida dos números enteros introducidos por el usuario.
 * Usa try-catch para evitar que el programa se rompa si el divisor es 0.
 */
        System.out.println("Ejercicio 5 – Dividir dos números con try-catch");

/** Ejercicio 6 – Acceder a una posición no válida de una cadena (charAt) con control de excepción
 * Solicita una palabra al usuario y pide una posición.
 * Intenta mostrar el carácter en esa posición usando try-catch.
 * Si se produce un error, muestra un mensaje.
 */
        System.out.println("Ejercicio 6 – Acceder a una posición no válida de una cadena (charAt) con control de excepción");

/** Ejercicio 7 – Mensaje de fin con finally
 * Haz un programa que intente dividir dos números.
 * Usa try-catch-finally para mostrar siempre un mensaje final que diga "Operación terminada".
 */
        System.out.println("Ejercicio 7 – Mensaje de fin con finally");

/** Ejercicio 8 – Leer números y sumar los positivos, ignorando los negativos con continue
 * Pide al usuario 5 números enteros.
 * Suma solo los positivos usando continue para ignorar los negativos.
 */
        System.out.println("Ejercicio 8 – Leer números y sumar los positivos, ignorando los negativos con continue");




    }
}
