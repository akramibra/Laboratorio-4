/**
 * Cancion
 */
public class Cancion {
    private String nombre;
    private String duracion;
    private String autor;
    private String genero;
    private int enlista;

    public Cancion(String nombre, String duracion, String autor, String genero, int enlista) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.autor = autor;
        this.genero = genero;
        this.enlista = enlista;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nAutor: " + autor + "\nGenero: " + genero + "\nDuración: " + duracion
                + " minutos.";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEnlista() {
        return enlista;
    }

    public void setEnlista(int enlista) {
        this.enlista = enlista;
    }

}