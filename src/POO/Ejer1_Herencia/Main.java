package POO.Ejer1_Herencia;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo coche = new Coche(90);
        Vehiculo bici = new Bicicleta(6);

        Vehiculo[] vehiculos = {vehiculo, coche, bici};
        for(Vehiculo v:vehiculos){
            if (v instanceof Coche){
                System.out.println("COCHE:");
                System.out.println("\tConsumo: " + v.consumo() + " L");
            }else if (v instanceof Bicicleta){
                System.out.println("BICICLETA");
                System.out.println("\tConsumo: " + v.consumo() + " Calorias");
            }else {
                System.out.println("Genérico:");
                System.out.println("\tConsumo: " + v.consumo() + " L");
            }
            System.out.println("\tVelocidad maxima: " + v.calcularVelocidadMaxima());

        }
    }

}
