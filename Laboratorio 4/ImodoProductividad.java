import java.util.ArrayList;

/**
 * ImodoProductividad
 * Interfaz que da un formato para el modo productividad del programa.
 */
public interface ImodoProductividad {
    ArrayList<String> tarjetas = new ArrayList<>();

    /* Imprime las tarjetas en tarjetas[] */
    public void verTarjetas(ArrayList<String> tarjetas);
}
