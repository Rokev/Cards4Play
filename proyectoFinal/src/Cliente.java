import java.util.ArrayList;

public class Cliente extends Usuario {

    private ArrayList<Compra> historialCompras;
    private ArrayList<Booster> boosters;
    private ArrayList<Carta> cartas;

    public Cliente(String id, String nombre,
                   String email, String password) {

        super(id, nombre, email, password);

        historialCompras = new ArrayList<>();
        boosters = new ArrayList<>();
        cartas = new ArrayList<>();
    }

    public void realizarCompra(Producto producto) {

        Compra compra =new Compra("1", this, producto, producto.getPrecio());
        historialCompras.add(compra);
    }

    public boolean inscribirseEnTorneo(Torneo torneo) {
        torneo.inscribir(this);
        return true;

    }

    public void abrirBooster(Booster booster) {
        ArrayList<Carta> nuevas = booster.abrir();
        cartas.addAll(nuevas);
    }

    public ArrayList<Compra> getHistorialCompras() {
        return historialCompras;
    }

    public ArrayList<Booster> getBoosters() {
        return boosters;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }
}