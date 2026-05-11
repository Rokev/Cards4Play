public class Carta {
    public String rareza;

    public Carta(String rareza){
        this.rareza=rareza;
    }
    public double getPrecioCOP(double tasa){
        return tasa * 10;
    }
    public String getRareza(){
        return rareza;
    }
}
