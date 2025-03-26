package Clase5;

import java.util.Scanner;

public class MainClase5 {
    public static void main(String[] args) {

//Crear un scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un numero: ");
        int numero = sc.nextInt();

        if(numero > 0){
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El numero es negativo.");
        }else {
            System.out.println("El numero es cero.");
        }
        //sc.close(); //cierra el scanner


//Crear un switch
        Scanner sn = new Scanner(System.in);

        //Menú de opciones
        System.out.println("Menu de opciones");
        System.out.println("1. Saludar");
        System.out.println("2. Chiste del dia");
        System.out.println("3. Salir");

        System.out.println("Selecciona una opción");
        int numOp = sn.nextInt();

        switch (numOp){
            case 1:
                System.out.println("Hola!!! Bienvenido!!");
                break;
            case 2:
                System.out.println("Van dos y se cae el del medio...");
                break;
            case 3:
                System.out.println("Saliendo del programa... Gracias!");
                break;
            default:
                System.out.println("No entiendo lo que pides. Vuelve a seleccionar! ¿1, 2 o 3?");
        }
        //sn.close();

//Imprimir los numeros del 1-10 con FOR
        for(int i = 1; i<= 10 ; i++){
            System.out.println("Numero: " + i);
        }

//Usa el While hasta que ponga 0
        /**
        Scanner sca = new Scanner(System.in);

        System.out.println("Dame un numero o pon 0 para salir");
        int numero1 = sca.nextInt();

        while (numero1 != 0);{
            System.out.println("Has introducido: " + numero1);
            System.out.println("Introduce otro numero: ");
            //numero1 = wh.nextInt();
        }
    */
        //DO-WHILE
        Scanner scanner = new Scanner(System.in);
        String password;

        do{
            System.out.println("Introduce tu contraseña: ");
            password = scanner.nextLine();
        }while (!password.equals("java123"));

        System.out.println("Acceso concedido.");


    }
}
