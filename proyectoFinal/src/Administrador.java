public class Administrador extends Usuario{
    public Administrador(String id, String nombre, String email, String password) {
        super(id, nombre, email, password);
    }
    public void gestionarInventario(){
        System.out.println("Gestionando inventario...");
    }
    public void creandoTorneo(){
        System.out.println("Creando torneo...");
    }

    public void registrarProductos(){
        System.out.println("Registrando productos...");
    }
}

