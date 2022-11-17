/**
 * Cancion
 */
public class Cancion {
    private static String nombre;
    private static String duracion;
    private static String autor;
    private static String genero;

    public Cancion(String Nombre, String Duracion, String Autor, String Genero) {
        nombre = Nombre;
        duracion = Duracion;
        autor = Autor;
        genero = Genero;

    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Cancion.nombre = nombre;
    }

    public static String getDuracion() {
        return duracion;
    }

    public static void setDuracion(String duracion) {
        Cancion.duracion = duracion;
    }

    public static String getAutor() {
        return autor;
    }

    public static void setAutor(String autor) {
        Cancion.autor = autor;
    }

    public static String getGenero() {
        return genero;
    }

    public static void setGenero(String genero) {
        Cancion.genero = genero;
    }

}