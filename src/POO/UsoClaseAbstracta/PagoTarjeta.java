package POO.UsoClaseAbstracta;

public class PagoTarjeta extends Pago{
    private String numTarjeta; //Tipado como String porque es para guardar dato, no se va a operar con el numTrajeta

    public PagoTarjeta(String numTarjeta, double cantidad) {
        super(cantidad);
        this.numTarjeta = numTarjeta;
    }


    @Override
    public void procesarPago(){
        System.out.println("\tProcesar pago con Tarjeta " + this.numTarjeta + "\n\tCantidad: " + this.cantidad);
    }
    @Override
    public void mostrarCantidad(){

    }

}
