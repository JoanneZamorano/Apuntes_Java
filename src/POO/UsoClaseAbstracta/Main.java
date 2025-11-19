package POO.UsoClaseAbstracta;

import POO.Ejer1_Herencia.Bicicleta;
import POO.Ejer1_Herencia.Coche;
import POO.Ejer1_Herencia.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Pago tarjeta = new PagoTarjeta("000 222 333", 20.0);
        Pago paypal = new Paypal("joa@mail.com", 50.0);

        Pago[] pagos = {tarjeta, paypal};
        for(Pago p:pagos){
            if (p instanceof PagoTarjeta t){
                System.out.println("Pago con TARJETA:");
                p.procesarPago();
            }else if (p instanceof Paypal pay){
                System.out.println("Pago con PAYPAL:");
                p.procesarPago();
            }

        }
    }
}
