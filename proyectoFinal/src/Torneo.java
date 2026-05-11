import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Torneo {
    public String id;
    public String nombre;
    public LocalDate fecha;
    public int maxParticipantes;
    public ArrayList<Cliente> participantes;

    public Torneo(String id, String nombre, LocalDate fecha, int maxParticipantes, ArrayList<Cliente> participantes) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.maxParticipantes = maxParticipantes;
        this.participantes = participantes;
    }

    public boolean hayCupo(){
        if (participantes.size()<maxParticipantes){
            return true;
        }
        return false;
    }

    public void inscribir(Cliente cliente){
        if (hayCupo()){
            participantes.add(cliente);
            System.out.println("Se agrego el cliente al torneo");
        }
        System.out.println("No se agrego el cliente");
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getMaxParticipantes() {
        return maxParticipantes;
    }

    public List<Cliente> getParticipantes() {
        return participantes;
    }
}
