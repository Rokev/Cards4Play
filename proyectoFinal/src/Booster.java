import java.util.ArrayList;
import java.util.List;

public class Booster extends Producto{
    public ArrayList<Carta> cartas;
    public boolean abierto;

    public Booster(String id, String nombre, double precio, double precioUSD) {
        super(id, nombre, precio, precioUSD);
        this.cartas = new ArrayList<>();
        this.abierto = false;
    }

    public void generarCartas(InventarioManager inventario) {

        for (Producto p : inventario.listarProductos()) {

            if (p instanceof Carta) {

                cartas.add((Carta) p);
            }
        }
    }
    public ArrayList<Carta> abrir(){
        abierto=true;
        return cartas;
    }
    public boolean isAbierto(){
        return abierto;
    }
    public List<Carta> getCartas(){
        return cartas;
    }
}
