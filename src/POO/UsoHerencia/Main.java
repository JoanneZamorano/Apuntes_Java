package POO.UsoHerencia;

public class Main {
    public static void main(String[] args) {
        Usuario admin = new Administrador("Joa", "joa@mail.com", "alto");
        Usuario user = new Usuario("Pepe", "pepe@mail.com");
        Usuario clien = new Cliente("Maria", "maria@mail.com", 20);

        Usuario[] usuarios = {user, admin, clien};
        for(Usuario u:usuarios){
            u.mostrarInfo();
        }
    }
}
