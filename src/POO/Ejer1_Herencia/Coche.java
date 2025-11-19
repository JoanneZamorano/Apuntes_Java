package POO.Ejer1_Herencia;

public class Coche extends Vehiculo{
    private int caballos;
    public Coche(){

    }

    public Coche(int caballos){
        this.caballos = caballos;
    }

    public int getCaballos() {
        return caballos;
    }

    //Metodos
    @Override
    public double calcularVelocidadMaxima(){
        return this.caballos*2.0;
    }
    public double consumo(){
        return caballos * 0.05;
    }

}
