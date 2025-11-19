package POO.Ejer1_Herencia;

public class Bicicleta extends Vehiculo{
    private int numMarchas;

    public Bicicleta(){

    }
    public Bicicleta(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    @Override
    public double calcularVelocidadMaxima(){
        return this.numMarchas*5.0;
    }

    public double consumo(){
        return numMarchas * 10.0;
    }



}
