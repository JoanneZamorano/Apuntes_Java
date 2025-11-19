package POO.UsoHerencia;

public class Cliente extends Usuario{
    private int puntosFidelidad;

    public Cliente(String nombre, String email, int puntosFidelidad){
        super(nombre, email);
        this.puntosFidelidad = puntosFidelidad;
    }

    //Metodos
    public int getPuntosFidalidad(){
        return this.puntosFidelidad;
    }

    public void mostrarInfo(){
        System.out.println("Usuario Administrador: " + this.nombre + " --- " + this.email);
        System.out.println("\tPuntos fidelidad: " + this.puntosFidelidad);
    }

}
