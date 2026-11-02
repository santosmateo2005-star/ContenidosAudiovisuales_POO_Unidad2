package uni1a;

public class Actor {

    private int edad;
    private String nacionalidad;
    private String nombre;

    public Actor(String nom, String nac, int ed) {
        setNombre(nom);
        setNacionalidad(nac);
        setEdad(ed);
    }

    public void mostrarInformacion() {
        String ficha = String.format(
            "Nombre: %s%nNacionalidad: %s%nEdad: %d", 
            getNombre(), 
            getNacionalidad(), 
            getEdad()
        );
        System.out.println(ficha);
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int nuevaEdad) {
        this.edad = (nuevaEdad >= 0) ? nuevaEdad : 0;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nuevaNacionalidad) {
        this.nacionalidad = (nuevaNacionalidad != null) ? nuevaNacionalidad.trim() : "Desconocida";
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = (nuevoNombre != null) ? nuevoNombre.trim() : "Sin nombre";
    }
}