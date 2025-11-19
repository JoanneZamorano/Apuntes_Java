package POO.Ejer1_Herencia;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo coche = new Coche(90);
        Vehiculo bici = new Bicicleta(6);

        Vehiculo[] vehiculos = {vehiculo, coche, bici};
        for(Vehiculo v:vehiculos){
            if (v instanceof Coche c){
                System.out.println("COCHE:\n\tConsumo: " + v.consumo() + " L/KM");
            }else if (v instanceof Bicicleta b){
                System.out.println("BICICLETA\n\tConsumo: " + v.consumo() + " Calorías");
            }else {
                System.out.println("Genérico:\n\tConsumo: " + v.consumo() + " L");
            }
            System.out.println("\tVelocidad maxima: " + v.calcularVelocidadMaxima());

        }
    }

}
