/**
 * Cancion
 */
public class Cancion {
    private String nombre;
    private String duracion;
    private String autor;
    private String genero;
    private int enlista;

    /**
     * Establece valores iniciales para la instancia creada
     * Cada parametro es el dato que sustituye al valor del atributo correspondiente
     * 
     * @param nombre
     * @param duracion
     * @param autor
     * @param genero
     * @param enlista
     */
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

    /**
     * Getters y setters de cada atributo, permite a otras clases acceder a esas
     * variables
     * 
     * @return el dato guardado en la variable de la clase
     * @param datos que se desean registrar en las variables
     */
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