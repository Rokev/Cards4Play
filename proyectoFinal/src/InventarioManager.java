import java.util.ArrayList;

public class InventarioManager {

    private ArrayList<Producto> productos;

    public InventarioManager() {

        productos = new ArrayList<>();
    }

    public void agregarCarta(Carta carta) {
        productos.add(carta);
    }

    public void agregarBooster(Booster booster) {
        productos.add(booster);
    }

    public void agregarProductoSellado(ProductoSellado ps) {
        productos.add(ps);
    }

    public void agregarAccesorio(Accesorio acc) {
        productos.add(acc);
    }

    public void eliminarCarta(Carta carta) {
        productos.remove(carta);
    }

    public void eliminarBooster(Booster booster) {
        productos.remove(booster);
    }

    public void eliminarProductoSellado(ProductoSellado ps) {
        productos.remove(ps);
    }

    public void eliminarAccesorio(Accesorio acc) {
        productos.remove(acc);
    }

    public ArrayList<Producto> listarProductos() {
        return productos;
    }

    public Producto buscarProducto(String id) {

        for (Producto p : productos) {

            if (p.id.equals(id)) {
                return p;
            }
        }

        return null;
    }
}
