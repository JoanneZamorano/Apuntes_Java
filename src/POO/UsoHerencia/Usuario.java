package POO.UsoHerencia;

public class Usuario {

    protected String nombre; //Lo puede ver Usuario y las clases hijos
    protected String email;

    //Constructor
    public Usuario(String nombre,String email){
        this.nombre = nombre;
        this.email = email;
    }

    //Metodo
    public void mostrarInfo(){
        System.out.println("Usuario Genérico: " + nombre + " --- " + email);
    }

}
