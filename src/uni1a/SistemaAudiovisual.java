package uni1a;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SistemaAudiovisual {

    private static final List<ContenidoAudiovisual> catalogo = new LinkedList<>();
    private static final Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        boolean ejecutando = true;

        while (ejecutando) {
            desplegarOpciones();
            int seleccion = solicitarEntero("Seleccione una opcion: ");

            switch (seleccion) {
                case 1:
                    crearPelicula();
                    break;
                case 2:
                    crearSerie();
                    break;
                case 3:
                    crearDocumental();
                    break;
                case 4:
                    crearPodcast();
                    break;
                case 5:
                    crearCursoOnline();
                    break;
                case 6:
                    listarCatalogo();
                    break;
                case 7:
                    consultarPorId();
                    break;
                case 8:
                    borrarPorId();
                    break;
                case 0:
                    System.out.println("Gracias por utilizar el sistema.");
                    ejecutando = false;
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }
    }

    private static void desplegarOpciones() {
        StringBuilder menu = new StringBuilder();
        menu.append("\n======================================\n")
            .append("      SISTEMA DE GESTION AUDIOVISUAL\n")
            .append("======================================\n")
            .append("1. Registrar pelicula\n")
            .append("2. Registrar serie de television\n")
            .append("3. Registrar documental\n")
            .append("4. Registrar podcast\n")
            .append("5. Registrar curso online\n")
            .append("6. Mostrar todos los contenidos\n")
            .append("7. Buscar contenido por ID\n")
            .append("8. Eliminar un contenido\n")
            .append("0. Salir\n")
            .append("======================================");
        System.out.println(menu.toString());
    }

    private static void crearPelicula() {
        System.out.println("\n--- REGISTRO DE PELICULA ---");

        String tit = solicitarCadena("Titulo: ");
        int dur = solicitarMayorACero("Duracion en minutos: ");
        String gen = solicitarCadena("Genero: ");
        String est = solicitarCadena("Estudio cinematografico: ");

        Pelicula nuevaPeli = new Pelicula(tit, dur, gen, est);
        int totalActores = solicitarNoNegativo("Cantidad de actores: ");

        int contador = 1;
        while (contador <= totalActores) {
            System.out.println("\nDatos del actor " + contador);
            String nom = solicitarCadena("Nombre: ");
            String nac = solicitarCadena("Nacionalidad: ");
            int ed = solicitarMayorACero("Edad: ");

            nuevaPeli.agregarActor(new Actor(nom, nac, ed));
            contador++;
        }

        catalogo.add(nuevaPeli);
        System.out.printf("%nPelicula registrada correctamente.%nID asignado: %d%n", nuevaPeli.getId());
    }

    private static void crearSerie() {
        System.out.println("\n--- REGISTRO DE SERIE ---");

        String tit = solicitarCadena("Titulo: ");
        int dur = solicitarMayorACero("Duracion en minutos: ");
        String gen = solicitarCadena("Genero: ");

        SerieDeTV nuevaSerie = new SerieDeTV(tit, dur, gen);
        int totalTemporadas = solicitarNoNegativo("Cantidad de temporadas: ");

        int contador = 1;
        while (contador <= totalTemporadas) {
            System.out.println("\nDatos de la temporada " + contador);
            int num = solicitarMayorACero("Numero de temporada: ");
            int año = solicitarMayorACero("Año de estreno: ");
            int eps = solicitarMayorACero("Numero de episodios: ");

            nuevaSerie.agregarTemporada(num, año, eps);
            contador++;
        }

        catalogo.add(nuevaSerie);
        System.out.printf("%nSerie registrada correctamente.%nID asignado: %d%n", nuevaSerie.getId());
    }

    private static void crearDocumental() {
        System.out.println("\n--- REGISTRO DE DOCUMENTAL ---");

        String tit = solicitarCadena("Titulo: ");
        int dur = solicitarMayorACero("Duracion en minutos: ");
        String gen = solicitarCadena("Genero: ");
        String tem = solicitarCadena("Tema del documental: ");

        Documental nuevoDoc = new Documental(tit, dur, gen, tem);
        int totalInv = solicitarNoNegativo("Cantidad de investigadores: ");

        int contador = 1;
        while (contador <= totalInv) {
            System.out.println("\nDatos del investigador " + contador);
            String nom = solicitarCadena("Nombre: ");
            String esp = solicitarCadena("Especialidad: ");
            String inst = solicitarCadena("Institucion: ");

            nuevoDoc.agregarInvestigador(new Investigador(nom, esp, inst));
            contador++;
        }

        catalogo.add(nuevoDoc);
        System.out.printf("%nDocumental registrado correctamente.%nID asignado: %d%n", nuevoDoc.getId());
    }

    private static void crearPodcast() {
        System.out.println("\n--- REGISTRO DE PODCAST ---");

        String tit = solicitarCadena("Titulo: ");
        int dur = solicitarMayorACero("Duracion en minutos: ");
        String gen = solicitarCadena("Genero o categoria: ");
        String anf = solicitarCadena("Anfitrion principal: ");
        String plat = solicitarCadena("Plataforma de emision: ");
        int año = solicitarMayorACero("Año de lanzamiento: ");

        Podcast nuevoPodcast = new Podcast(tit, dur, gen, anf, plat, año);
        int totalParticipantes = solicitarNoNegativo("Cantidad de invitados/participantes: ");

        int contador = 1;
        while (contador <= totalParticipantes) {
            System.out.println("\nDatos del participante " + contador);
            String nom = solicitarCadena("Nombre: ");
            String nac = solicitarCadena("Nacionalidad: ");
            int ed = solicitarMayorACero("Edad: ");

            nuevoPodcast.agregarActor(new Actor(nom, nac, ed));
            contador++;
        }

        catalogo.add(nuevoPodcast);
        System.out.printf("%nPodcast registrado correctamente.%nID asignado: %d%n", nuevoPodcast.getId());
    }

    private static void crearCursoOnline() {
        System.out.println("\n--- REGISTRO DE CURSO ONLINE ---");

        String tit = solicitarCadena("Titulo: ");
        int dur = solicitarMayorACero("Duracion en minutos: ");
        String gen = solicitarCadena("Area de estudio (Genero): ");
        String plat = solicitarCadena("Plataforma educativa: ");
        String niv = solicitarCadena("Nivel del curso: ");

        CursoOnline nuevoCurso = new CursoOnline(tit, dur, gen, plat, niv);
        int totalInv = solicitarNoNegativo("Cantidad de investigadores/instructores: ");

        int contador = 1;
        while (contador <= totalInv) {
            System.out.println("\nDatos del investigador/instructor " + contador);
            String nom = solicitarCadena("Nombre: ");
            String esp = solicitarCadena("Especialidad: ");
            String instInv = solicitarCadena("Institucion: ");

            nuevoCurso.agregarInvestigador(new Investigador(nom, esp, instInv));
            contador++;
        }

        catalogo.add(nuevoCurso);
        System.out.printf("%nCurso online registrado correctamente.%nID asignado: %d%n", nuevoCurso.getId());
    }

    private static void listarCatalogo() {
        System.out.println("\n--- LISTADO DE CONTENIDOS AUDIOVISUALES ---");

        if (catalogo.size() == 0) {
            System.out.println("No existen contenidos registrados.");
            return;
        }

        catalogo.forEach(item -> {
            item.mostrarDetalles();
            System.out.println("======================================");
        });
    }

    private static void consultarPorId() {
        System.out.println("\n--- BUSCAR CONTENIDO ---");
        int idBuscado = solicitarEntero("Ingrese el ID del contenido: ");

        ContenidoAudiovisual resultado = obtenerPorId(idBuscado);

        if (resultado == null) {
            System.out.println("No se encontro un contenido con ese ID.");
        } else {
            System.out.println("\nContenido encontrado:");
            resultado.mostrarDetalles();
        }
    }

    private static void borrarPorId() {
        System.out.println("\n--- ELIMINAR CONTENIDO ---");
        int idBorrar = solicitarEntero("Ingrese el ID del contenido: ");

        boolean eliminado = catalogo.removeIf(c -> c.getId() == idBorrar);

        if (eliminado) {
            System.out.println("Contenido eliminado correctamente.");
        } else {
            System.out.println("No se encontro un contenido con ese ID.");
        }
    }

    private static ContenidoAudiovisual obtenerPorId(int id) {
        return catalogo.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    private static String solicitarCadena(String aviso) {
        while (true) {
            System.out.print(aviso);
            String entradaUsuario = teclado.nextLine().trim();
            if (!entradaUsuario.isEmpty()) {
                return entradaUsuario;
            }
            System.out.println("Este campo no puede estar vacio.");
        }
    }

    private static int solicitarEntero(String aviso) {
        while (true) {
            System.out.print(aviso);
            try {
                return Integer.parseInt(teclado.nextLine().trim());
            } catch (NumberFormatException ex) {
                System.out.println("Ingrese un numero entero valido.");
            }
        }
    }

    private static int solicitarMayorACero(String aviso) {
        while (true) {
            int valor = solicitarEntero(aviso);
            if (valor > 0) {
                return valor;
            }
            System.out.println("El valor debe ser mayor que cero.");
        }
    }

    private static int solicitarNoNegativo(String aviso) {
        while (true) {
            int valor = solicitarEntero(aviso);
            if (valor >= 0) {
                return valor;
            }
            System.out.println("La cantidad no puede ser negativa.");
        }
    }
}