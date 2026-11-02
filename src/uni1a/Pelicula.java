package uni1a;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Pelicula extends ContenidoAudiovisual {

    private final List<Actor> actores = new LinkedList<>();
    private String estudio;

    public Pelicula(String tit, int duracion, String gen, String est) {
        super(tit, duracion, gen);
        setEstudio(est);
    }

    public void agregarActor(Actor nuevoActor) {
        if (nuevoActor == null) {
            return;
        }
        if (this.actores.indexOf(nuevoActor) == -1) {
            this.actores.add(nuevoActor);
        }
    }

    public void eliminarActor(Actor actorAEliminar) {
        if (actorAEliminar != null) {
            this.actores.removeIf(a -> a.equals(actorAEliminar));
        }
    }

    public List<Actor> getActores() {
        return Collections.unmodifiableList(this.actores);
    }

    public String getEstudio() {
        return this.estudio;
    }

    public void setEstudio(String nuevoEstudio) {
        this.estudio = (nuevoEstudio != null) ? nuevoEstudio.trim() : "Independiente";
    }

    @Override
    public void mostrarDetalles() {
        StringBuilder sb = new StringBuilder();
        sb.append("Detalles de la película:\n")
          .append("ID: ").append(getId()).append("\n")
          .append("Título: ").append(getTitulo()).append("\n")
          .append("Duración en minutos: ").append(getDuracionEnMinutos()).append("\n")
          .append("Género: ").append(getGenero()).append("\n")
          .append("Estudio: ").append(getEstudio()).append("\n")
          .append("Actores participantes:");

        System.out.println(sb.toString());

        if (this.actores.size() == 0) {
            System.out.println("No hay actores registrados.");
        } else {
            this.actores.forEach(integrante -> {
                integrante.mostrarInformacion();
                System.out.println("--------------------");
            });
        }
        
        System.out.println();
    }
}