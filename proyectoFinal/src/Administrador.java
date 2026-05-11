import java.util.ArrayList;

public class Administrador extends Usuario {

    private InventarioManager inventario;
    private ArrayList<Torneo> torneos;

    public Administrador(String id, String nombre,
                 String email, String password) {

        super(id, nombre, email, password);

        inventario = new InventarioManager();
        torneos = new ArrayList<>();
    }

    public InventarioManager getInventarioManager() {
        return inventario;
    }

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void crearTorneo(Torneo torneo) {
        torneos.add(torneo);
    }
}