package uni1a;

public class CursoOnline extends ContenidoAudiovisual {

    // Atributos propios de la clase CursoOnline
    private String instructor;
    private String areaConocimiento;
    private String nivel;
    private int numeroModulos;

    // Constructor
    public CursoOnline(String titulo, int duracionEnMinutos, String genero,
                       String instructor, String areaConocimiento,
                       String nivel, int numeroModulos) {

        super(titulo, duracionEnMinutos, genero);

        this.instructor = instructor;
        this.areaConocimiento = areaConocimiento;
        this.nivel = nivel;
        this.numeroModulos = numeroModulos;
    }

    // Getter y Setter de instructor
    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    // Getter y Setter de areaConocimiento
    public String getAreaConocimiento() {
        return areaConocimiento;
    }

    public void setAreaConocimiento(String areaConocimiento) {
        this.areaConocimiento = areaConocimiento;
    }

    // Getter y Setter de nivel
    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    // Getter y Setter de numeroModulos
    public int getNumeroModulos() {
        return numeroModulos;
    }

    public void setNumeroModulos(int numeroModulos) {
        this.numeroModulos = numeroModulos;
    }

    // Metodo para mostrar el contenido del curso
    public void mostrarContenido() {
        System.out.println("Área de conocimiento: " + areaConocimiento);
        System.out.println("Nivel del curso: " + nivel);
        System.out.println("Número de módulos: " + numeroModulos);
    }

    // Metodo para actualizar el numero de modulos
    public void actualizarModulos(int cantidad) {

        if (cantidad > 0) {
            numeroModulos = cantidad;
            System.out.println("Número de módulos actualizado correctamente.");
        } else {
            System.out.println("La cantidad de módulos debe ser mayor que cero.");
        }
    }

    // Metodo para mostrar todos los detalles del curso
    @Override
    public void mostrarDetalles() {

        System.out.println("----- INFORMACIÓN DEL CURSO ONLINE -----");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());

        System.out.println("Instructor: " + instructor);
        System.out.println("Área de conocimiento: " + areaConocimiento);
        System.out.println("Nivel: " + nivel);
        System.out.println("Número de módulos: " + numeroModulos);

        System.out.println("----------------------------------------");
    }
}