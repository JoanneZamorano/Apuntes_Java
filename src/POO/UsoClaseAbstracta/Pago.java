package POO.UsoClaseAbstracta;

public abstract class Pago {
    protected double cantidad;

    //Constructor
    public Pago(double cantidad){
        if(cantidad<=0){
            throw new IllegalArgumentException("La cantidad debe de ser mayor que 0");
        }
        this.cantidad = cantidad;
    }

    //Métodos
    public void mostrarCantidad(){
        System.out.println("Cantidad: " + this.cantidad);
    }
    public abstract void procesarPago(); //ABSTRACTA: No es necesario rellenar porque se rellenará en las clases hijos.

}
