package uni1a;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {

    private final List<Temporada> listaTemporadas = new LinkedList<>();

    public SerieDeTV(String tit, int duracion, String gen) {
        super(tit, duracion, gen);
    }

    public void agregarTemporada(int numTemp, int añoEstreno, int cantEpisodios) {
        boolean datosValidos = (numTemp > 0) && (añoEstreno > 0) && (cantEpisodios > 0);
        if (!datosValidos) {
            System.out.println("Los datos de la temporada no son validos.");
            return;
        }

        boolean yaExiste = this.listaTemporadas.stream()
                .anyMatch(t -> t.getNumeroTemporada() == numTemp);

        if (yaExiste) {
            System.out.println("La temporada ya existe.");
            return;
        }

        this.listaTemporadas.add(new Temporada(numTemp, añoEstreno, cantEpisodios));
    }

    public void eliminarTemporada(int numTemp) {
        this.listaTemporadas.removeIf(t -> t.getNumeroTemporada() == numTemp);
    }

    public int getTemporadas() {
        return this.listaTemporadas.size();
    }

    public List<Temporada> getListaTemporadas() {
        return Collections.unmodifiableList(this.listaTemporadas);
    }

    @Override
    public void mostrarDetalles() {
        StringBuilder sb = new StringBuilder();
        sb.append("Detalles de la serie de television:\n")
          .append("ID: ").append(getId()).append("\n")
          .append("Titulo: ").append(getTitulo()).append("\n")
          .append("Duracion en minutos: ").append(getDuracionEnMinutos()).append("\n")
          .append("Genero: ").append(getGenero()).append("\n")
          .append("Cantidad de temporadas: ").append(getTemporadas()).append("\n\n")
          .append("Informacion de las temporadas:");

        System.out.println(sb.toString());

        if (this.listaTemporadas.size() == 0) {
            System.out.println("No hay temporadas registradas.");
        } else {
            this.listaTemporadas.forEach(temp -> {
                temp.mostrarInformacion();
                System.out.println("-------------------------");
            });
        }

        System.out.println();
    }
}