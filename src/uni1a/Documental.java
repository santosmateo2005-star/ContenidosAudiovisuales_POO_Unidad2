package uni1a;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Documental extends ContenidoAudiovisual {

    private final List<Investigador> investigadores = new LinkedList<>();
    private String tema;

    public Documental(String tit, int duracion, String gen, String tem) {
        super(tit, duracion, gen);
        setTema(tem);
    }

    public void agregarInvestigador(Investigador nuevoInvestigador) {
        if (nuevoInvestigador == null) {
            return;
        }
        if (this.investigadores.indexOf(nuevoInvestigador) == -1) {
            this.investigadores.add(nuevoInvestigador);
        }
    }

    public void eliminarInvestigador(Investigador investigadorAEliminar) {
        if (investigadorAEliminar != null) {
            this.investigadores.removeIf(inv -> inv.equals(investigadorAEliminar));
        }
    }

    public List<Investigador> getInvestigadores() {
        return Collections.unmodifiableList(this.investigadores);
    }

    public String getTema() {
        return this.tema;
    }

    public void setTema(String nuevoTema) {
        this.tema = (nuevoTema != null && !nuevoTema.isEmpty()) 
                ? nuevoTema.trim() 
                : "General";
    }

    @Override
    public void mostrarDetalles() {
        StringBuilder sb = new StringBuilder();
        sb.append("Detalles del documental:\n")
          .append("ID: ").append(getId()).append("\n")
          .append("Titulo: ").append(getTitulo()).append("\n")
          .append("Duracion en minutos: ").append(getDuracionEnMinutos()).append("\n")
          .append("Genero: ").append(getGenero()).append("\n")
          .append("Tema: ").append(getTema()).append("\n\n")
          .append("Investigadores participantes:");

        System.out.println(sb.toString());

        if (this.investigadores.size() == 0) {
            System.out.println("No hay investigadores registrados.");
        } else {
            this.investigadores.forEach(experto -> {
                experto.mostrarInformacion();
                System.out.println("-------------------------");
            });
        }

        System.out.println();
    }
}