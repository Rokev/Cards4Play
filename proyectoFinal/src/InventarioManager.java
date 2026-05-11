import java.util.ArrayList;
import java.util.List;

public class InventarioManager {
    public List<Producto> productos;

    public InventarioManager(){
        productos=new ArrayList<>();
    }

    public void agregarCarta(Carta carta){
        System.out.println("La carta se agrego con exito");
    }

    public void agregarBooster(Booster booster){
        System.out.println("El booster se agrego con exito");
    }

    public void agregarSellado(ProductoSellado sellado){
        productos.add(sellado);
    }

    public void agregarAccesorio(Accesorio accesorio){
        productos.add(accesorio);
    }
    public Producto buscarProducto(String id){
        for(Producto p :productos){
            if (p.id.equals(id)){
                return p;
            }
        }
        return null;
    }
}
