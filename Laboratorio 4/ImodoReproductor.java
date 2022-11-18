import java.util.ArrayList;

/**
 * ImodoReproductor
 */
public interface ImodoReproductor {
    /**
     * Muestra las distintas listas de reproducción existentes y registradas
     * Permite seleccionar una de ellas al usuario.
     * 
     * @param listas
     */
    /** Imprime la lista de canciones dada y devuelve la cancion seleccionada */
    public void SeleccionarLista(ArrayList<String> listas);

    /* Se podra cambiar tanto para adelante como para atrás */
    public void CambiarCancion(ArrayList<Cancion> canciones);

    /* Mostrara el nombre de la cancion que se esta reproduciendo */
    public void EscucharCancion(ArrayList<Cancion> canciones);

}