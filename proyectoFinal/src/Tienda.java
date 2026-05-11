import java.util.ArrayList;
import java.util.List;

public class Tienda {
    public String nombre;
    public String directorioBase;
    public String apiUrlDivisas;
    public List<Usuario> usuarios;
    public List<Torneo> torneos;
    public InventarioManager inventario;

    public Tienda(String nombre, String directorioBase, String apiUrlDivisas, List<Usuario> usuarios, List<Torneo> torneos, InventarioManager inventario) {
        this.nombre = nombre;
        this.directorioBase = directorioBase;
        this.apiUrlDivisas = apiUrlDivisas;
        this.usuarios = new ArrayList<>();
        this.torneos = new ArrayList<>();
        this.inventario = new InventarioManager();
    }
    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    public Usuario autenticarUsuario(String email, String pass) {

        for (Usuario u : usuarios) {

            if (u.autenticar(email, pass)) {
                return u;
            }
        }

        return null;
    }

    public InventarioManager getInventario() {
        return inventario;
    }

    public List<Torneo> getTorneos() {
        return torneos;
    }

    public double obtenerTasaCambio() {
        return 4000;
    }

    public double convertirUSDaCOP(double usd) {
        return usd * obtenerTasaCambio();
    }
}
