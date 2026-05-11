import java.time.LocalDateTime;

public class Compra {
    String id;
    Cliente cliente;
    Producto producto;
    LocalDateTime fecha;
    double montoTotal;

    public Compra(String id, Cliente cliente, Producto producto, double montoTotal) {
        this.id = id;
        this.cliente = cliente;
        this.producto = producto;
        this.montoTotal = montoTotal;
    }

    public String getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public double getMontoTotal() {
        return montoTotal;
    }
}
