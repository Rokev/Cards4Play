import java.util.ArrayList;
import java.util.List;

public class Booster {
    public List<Carta> cartas;
    public boolean abierto;

    public Booster(){
        cartas=new ArrayList<>();
        abierto=false;
    }
    public void generarCartas(){
        cartas.add(new Carta("Comum"));
        cartas.add(new Carta("Rara"));
        cartas.add(new Carta("Epica"));
    }
    public List<Carta> abrir(){
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
