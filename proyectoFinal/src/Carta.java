public class Carta extends Producto{
    public String rareza;

    public Carta(String id, String nombre, double precio, double precioUSD, String rareza) {
        super(id, nombre, precio, precioUSD);
        this.rareza = rareza;
    }
    public double getPrecioCOP(double tasa){
        return tasa * 10;
    }
    public String getRareza(){
        return rareza;
    }
}
