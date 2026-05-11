import java.util.List;

public class Cliente extends Usuario{
    public List<Compra> historialCompra;
    public List<Booster> boosters;
    public List<Carta> cartas;
    public Cliente(String id, String nombre, String email, String password) {
        super(id, nombre, email, password);
    }
    public void realizarCompra(Producto producto){
        Compra compra= new Compra("1",this,producto,10000);
        historialCompra.add(compra);
    }
    public void inscribirseTorneo(Torneo torneo){
        torneo.inscribir(this);
        System.out.println("Se inscribio el cliente");
    }
    public void abrirBooster(Booster booster){
        booster.abrir();
    }

    public List<Compra> getHistorialCompra() {
        return historialCompra;
    }

    public List<Booster> getBoosters() {
        return boosters;
    }

    public List<Carta> getCartas() {
        return cartas;
    }
}
