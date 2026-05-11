public class Producto {
        public String id;
        public String nombre;
        public double precio;
        public double precioUSD;

        public Producto(String id, String nombre, double precio, double precioUSD) {
            this.id = id;
            this.nombre = nombre;
            this.precio = precio;
            this.precioUSD = precioUSD;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public double getPrecioUSD() {
            return precioUSD;
        }
}
