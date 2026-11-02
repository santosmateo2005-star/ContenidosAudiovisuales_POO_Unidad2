package uni1a;

public class Investigador {

    private String institucion;
    private String especialidad;
    private String nombre;

    public Investigador(String nom, String esp, String inst) {
        setNombre(nom);
        setEspecialidad(esp);
        setInstitucion(inst);
    }

    public void mostrarInformacion() {
        String datos = String.format(
            "Nombre: %s%nEspecialidad: %s%nInstitucion: %s",
            getNombre(),
            getEspecialidad(),
            getInstitucion()
        );
        System.out.println(datos);
    }

    public String getInstitucion() {
        return this.institucion;
    }

    public void setInstitucion(String nuevaInstitucion) {
        this.institucion = (nuevaInstitucion != null && !nuevaInstitucion.isEmpty()) 
                ? nuevaInstitucion.trim() 
                : "Sin institucion";
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String nuevaEspecialidad) {
        this.especialidad = (nuevaEspecialidad != null && !nuevaEspecialidad.isEmpty()) 
                ? nuevaEspecialidad.trim() 
                : "General";
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = (nuevoNombre != null && !nuevoNombre.isEmpty()) 
                ? nuevoNombre.trim() 
                : "Desconocido";
    }
}