# Plataforma de Administración de Contenidos Audiovisuales

## Descripción General

Esta aplicación de consola, construida íntegramente en **Java**, implementa un catálogo interactivo para la gestión de obras y producciones audiovisuales. El diseño del software se fundamenta en los pilares de la **Programación Orientada a Objetos (POO)**, aplicando mecanismos de herencia, polimorfismo, encapsulamiento y diversos tipos de relaciones entre objetos (asociación, agregación y composición).

El sistema permite dar de alta, consultar, listar y dar de baja múltiples formatos de entretenimiento, formación y divulgación, vinculando a cada obra con su respectivo reparto, expertos, participantes o estructura de episodios.

---

## Propósitos del Desarrollo

- **Modelado Orientado a Objetos:** Estructurar una jerarquía de clases sólida y escalable a partir de una superclase común.
- **Vinculación de Entidades:** Conectar las producciones con sus elementos dependientes o colaboradores (`Actor`, `Temporada`, `Investigador`).
- **Polimorfismo en Acción:** Sobrescribir comportamientos para que cada tipo de contenido formatee y despliegue sus propios detalles de manera especializada.
- **Control de Datos por Consola:** Proporcionar una interfaz interactiva robusta que valide las entradas del usuario en tiempo real.

---

## Arquitectura de Clases y Relaciones POO

El sistema se organiza dentro del paquete `uni1a` y distribuye sus responsabilidades en las siguientes entidades:

| Categoría | Clase | Rol en el Sistema | Relación POO Aplicada |
| :--- | :--- | :--- | :--- |
| **Base** | `ContenidoAudiovisual` | Superclase abstracta/padre que define los atributos esenciales (ID, título, duración y género). | Clase Padre |
| **Subclase Base** | `Pelicula` | Modela largometrajes e incluye el estudio cinematográfico. | **Herencia** de `ContenidoAudiovisual` y **Asociación** con `Actor`. |
| **Subclase Base** | `SerieDeTV` | Gestiona producciones seriadas divididas por entregas. | **Herencia** de `ContenidoAudiovisual` y **Composición** con `Temporada`. |
| **Subclase Base** | `Documental` | Representa obras de investigación en torno a una temática. | **Herencia** de `ContenidoAudiovisual` y **Agregación** con `Investigador`. |
| **Nueva Subclase** | `Podcast` | Registra programas de audio/video digital incluyendo anfitrión, plataforma o invitados. | **Herencia** de `ContenidoAudiovisual` y **Asociación** con `Actor`. |
| **Nueva Subclase** | `CursoOnline` | Administra contenidos educativos digitales, plataforma de enseñanza, nivel y especialistas. | **Herencia** de `ContenidoAudiovisual` y **Agregación** con `Investigador`. |
| **Complementaria** | `Actor` | Almacena nombre, nacionalidad y edad de los intérpretes o invitados. | Vinculada a `Pelicula` y `Podcast`. |
| **Complementaria** | `Temporada` | Define el número de entrega, año de estreno y total de episodios. | Ciclo de vida administrado por `SerieDeTV`. |
| **Complementaria** | `Investigador` | Registra nombre, especialidad e institución del especialista o instructor. | Vinculada a `Documental` y `CursoOnline`. |
| **Principal** | `SistemaAudiovisual` | Punto de entrada (`main`) que ejecuta el menú interactivo y controla el catálogo. | Gestiona la colección polimórfica de `ContenidoAudiovisual`. |

---

## Capacidades del Sistema

A través del menú interactivo en consola, el usuario dispone de las siguientes operaciones:

- **Altas de catálogo:**
  - Registro de **Películas** junto con su elenco de actores.
  - Registro de **Series de TV** definiendo cada una de sus temporadas.
  - Registro de **Documentales** asignando su equipo de investigadores.
  - Registro de **Podcasts** incorporando los datos del programa y sus participantes/invitados.
  - Registro de **Cursos Online** vinculando la información académica y sus investigadores/instructores.
- **Consultas y Mantenimiento:**
  - Visualización completa de todas las producciones almacenadas en memoria.
  - Localización específica de cualquier obra mediante su número de identificación único (`ID`).
  - Eliminación directa de registros del catálogo a partir de su `ID`.
- **Control de Errores:** Verificación automática en la entrada de datos para impedir textos en blanco, formatos numéricos inválidos o valores negativos.

---

## Organización de Directorios

El repositorio está dividido en tres secciones principales:

- **Directorio de código fuente (`src/uni1a/`):** Contiene los diez archivos `.java` que conforman la lógica del negocio, las entidades del modelo y la clase ejecutable `SistemaAudiovisual.java`.
- **Directorio de documentación (`docs/`):** Aloja el modelado visual de la arquitectura UML tanto en formato editable (`.drawio`) como en imagen (`.png`).
- **Archivos raíz:** Incluye la configuración de control de versiones (`.gitignore`) y este documento descriptivo (`README.md`).




