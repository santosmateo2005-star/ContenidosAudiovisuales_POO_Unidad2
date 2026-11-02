package uni1a;

public class Temporada {

    private int numeroEpisodios;
    private int añoEstreno;
    private int numeroTemporada;

    public Temporada(int numTemp, int año, int cantEpisodios) {
        setNumeroTemporada(numTemp);
        setAñoEstreno(año);
        setNumeroEpisodios(cantEpisodios);
    }

    public void mostrarInformacion() {
        String resumen = String.format(
            "Numero de temporada: %d%nAño de estreno: %d%nNumero de episodios: %d",
            getNumeroTemporada(),
            getAñoEstreno(),
            getNumeroEpisodios()
        );
        System.out.println(resumen);
    }

    public int getNumeroEpisodios() {
        return this.numeroEpisodios;
    }

    public void setNumeroEpisodios(int episodios) {
        this.numeroEpisodios = Math.max(1, episodios);
    }

    public int getAñoEstreno() {
        return this.añoEstreno;
    }

    public void setAñoEstreno(int año) {
        this.añoEstreno = (año > 1900) ? año : 2000;
    }

    public int getNumeroTemporada() {
        return this.numeroTemporada;
    }

    public void setNumeroTemporada(int temporada) {
        this.numeroTemporada = Math.max(1, temporada);
    }
}