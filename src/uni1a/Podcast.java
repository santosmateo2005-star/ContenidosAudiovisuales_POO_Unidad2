package uni1a;

public class Podcast extends ContenidoAudiovisual {

    // Atributos propios de la clase Podcast
    private String nombrePresentador;
    private String tematica;
    private int numeroEpisodios;
    private String plataforma;

    // Constructor
    public Podcast(String titulo, int duracionEnMinutos, String genero,
                   String nombrePresentador, String tematica,
                   int numeroEpisodios, String plataforma) {

        super(titulo, duracionEnMinutos, genero);

        this.nombrePresentador = nombrePresentador;
        this.tematica = tematica;
        this.numeroEpisodios = numeroEpisodios;
        this.plataforma = plataforma;
    }

    // Getter y Setter de nombrePresentador
    public String getNombrePresentador() {
        return nombrePresentador;
    }

    public void setNombrePresentador(String nombrePresentador) {
        this.nombrePresentador = nombrePresentador;
    }

    // Getter y Setter de tematica
    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    // Getter y Setter de numeroEpisodios
    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    // Getter y Setter de la plataforma
    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    // Metodo para publicar un nuevo episodio
    public void publicarEpisodio() {
        numeroEpisodios++;
        System.out.println("Se ha publicado un nuevo episodio.");
    }

    // Metodo para mostrar la temática del podcast
    public void mostrarTematica() {
        System.out.println("Temática: " + tematica);
    }

    // Metodo para mostrar todos los detalles del podcast
    @Override
    public void mostrarDetalles() {

        System.out.println("----- INFORMACIÓN DEL PODCAST -----");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());

        System.out.println("Presentador: " + nombrePresentador);
        System.out.println("Temática: " + tematica);
        System.out.println("Número de episodios: " + numeroEpisodios);
        System.out.println("Plataforma: " + plataforma);

        System.out.println("-----------------------------------");
    }
}