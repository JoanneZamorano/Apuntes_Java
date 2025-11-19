package POO.UsoClaseAbstracta;

public class Paypal extends Pago{

    private String email; //Tipado como String porque es para guardar dato, no se va a operar con el numTrajeta

    public Paypal(String email, double cantidad) {
        super(cantidad);
        this.email = email;
    }

    @Override
    public void procesarPago(){
        System.out.println("\tProcesar pago con Paypal " + this.email + "\n\tCantidad: " + this.cantidad);
    }
    @Override
    public void mostrarCantidad(){
    }


}
