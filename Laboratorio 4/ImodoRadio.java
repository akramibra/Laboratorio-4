/**
 * ImodoRadio
 * Interfaz que da un formato para el modo radio del programa.
 */
public interface ImodoRadio {
    /**
     * Cambio de AM a FM o viceversa
     */
    public void CambiarTipo();

    /**
     * Cambiar a un siguiente número de emisora
     */
    public void CambiarEmisora();

    /**
     * Registrar el dato de una emisora
     */
    public void GuardarEmisora();

    /**
     * Seleccionar una emisora para hacer sonar
     */
    public void CargarEmisora();

}