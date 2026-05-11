import java.util.ArrayList;

public class Tienda {

    private String nombre;
    private String directorioBase;
    private String apiUrlDivisas;

    private ArrayList<Usuario> usuarios;

    public Tienda(String nombre,
                  String directorioBase,
                  String apiUrlDivisas) {

        this.nombre = nombre;
        this.directorioBase = directorioBase;
        this.apiUrlDivisas = apiUrlDivisas;

        usuarios = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario) {

        usuarios.add(usuario);
    }

    public Usuario autenticarUsuario(String email,
                                     String pass) {

        for (Usuario u : usuarios) {

            if (u.autenticar(email, pass)) {
                return u;
            }
        }

        return null;
    }

    public double obtenerTasaCambio() {

        return 4000;
    }

    public double convertirUSDaCOP(double usd) {

        return usd * obtenerTasaCambio();
    }
}