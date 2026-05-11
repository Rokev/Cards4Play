public class Accesorio extends Producto{
    public String tipo;
    public Accesorio(String id, String nombre, double precio, double precioUSD,String tipo) {
        super(id, nombre, precio, precioUSD);
        this.tipo=tipo;
    }
    public String getTipo(){
        return tipo;
    }

}
