package Estructuras_basicas.Uso_2_ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class UsoArrayList {
    public static void main(String[] args) {
        //Los ArrayList

        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Introduce nombres y escribe salir para finalizar:");
        Scanner entrada = new Scanner(System.in);
        String nombre;

        do {
            System.out.println("Nombre: ");
            nombre = entrada.nextLine();
            if (!nombre.equalsIgnoreCase("salir")) {
                nombres.add(nombre);

            }
        }while (!nombre.equalsIgnoreCase("salir"));

        int opcion;

        do {
            System.out.println("\nMenu de opciones");
            System.out.println("1.Mostrar todos los nombres");
            System.out.println("2.Ver posición de nombres");
            System.out.println("3.Eliminar nombre por posición");
            System.out.println("4.Eliminar nombre por nombre");

            System.out.println("0.Salir");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion){
                case 1 -> { //Ver nombres
                    if (nombres.isEmpty()){
                        System.out.println("La lista esta vacia");
                    }else {
                        for (String nom:nombres){
                            System.out.println("\t- " + nom);
                        }
                    }
                }
                case 2 ->{ //Ver posición de nombres
                    for(int i=0; i<nombres.size(); i++){
                        System.out.println("Posición: " + (i+1) + " - " + nombres.get(i));
                    }
                }
                case 3 ->{//Eliminar nombre por posición
                    System.out.println("Introduce la posición a eliminar: ");

                    int pos=entrada.nextInt();
                    entrada.nextLine();

                    if (pos >= 0 && pos<nombres.size()){
                        pos-=1;
                        nombres.remove(pos);
                        System.out.println("Nombre eliminado");
                    }
                }
                case 4->{
                    System.out.println("Introduce el nombre a eliminar: ");

                    String deleteNombre=entrada.nextLine();

                    for (String nom:nombres){
                        if (nom.equalsIgnoreCase(deleteNombre)){
                            nombres.remove(nom);
                            System.out.println("Nombre eliminado");
                        }
                    }

                }
                case 0->System.out.println("...Finalizando");
                default -> System.out.println("Opción no valida");
            }

        }while (opcion != 0);

        entrada.close();



    }
}
