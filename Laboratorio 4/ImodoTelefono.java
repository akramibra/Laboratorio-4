/**
 * ImodoTelefono
 * Interfaz que da un formato para el modo telpefono del programa.
 */
public interface ImodoTelefono {
    /**
     * Conectar o desconectar el teléfono del radio
     */
    public void Conectar();

    /**
     * Imprimir los contactos guardados
     */
    public void MostrarContactos();

    /**
     * Simular la llamada a un contacto específico
     */
    public void Llamar();

    /**
     * Terminar la llamada actual
     */
    public void FinalizarLlamada();

    /**
     * Llamar al contacto con el que se interactuó de último
     */
    public void LlamarUltimo();

}