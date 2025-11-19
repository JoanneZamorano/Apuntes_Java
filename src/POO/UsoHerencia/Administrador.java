package POO.UsoHerencia;

public class Administrador extends Usuario{//extends Usuario -> indica que su clase padre es Usuario
    private String nivelAcceso;

    public Administrador(String nombre, String email, String nivelAcceso){
        super(nombre, email);
        this.nivelAcceso = nivelAcceso;
    }


    //Metodos
    public String getNivelAcceso(){
        return this.nivelAcceso;
    }

    public void mostrarInfo(){
        System.out.println("Usuario Administrador: " + this.nombre + " --- " + this.email);
        System.out.println("\tNivel acceso: " + this.nivelAcceso);
    }
}
