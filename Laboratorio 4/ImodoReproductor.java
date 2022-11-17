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
    public void SeleccionarLista(ArrayList<String> listas);

    public void CambiarCancion(ArrayList<Cancion> canciones);

    public void EscucharCancion(ArrayList<Cancion> canciones);///////
}