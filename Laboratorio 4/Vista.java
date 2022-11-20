/*
 * Permite solicitar datos al usuario y mostrar elementos en consola
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Vista {

    /**
     * Muestra un mensaje de bienvenida al programa
     */
    public void welcomeMessage() {
        System.out.println("Bienvenidos a nuestro programa");
    }

    /**
     * Mensaje final a presentar en el programa
     */
    public void endSystem() {
        System.out.println("Gracias por utilizar nuestro programa");
    }

    /**
     * Muestra las opciones a realizar del inicio del programa, una vez está
     * encendido el radio
     * 
     * @return límite de opciones posibles
     */
    public int menu() {
        System.out.println(
                "------------------------------------------------------------------------------------------------------");
        String[] menu = { "Modo radio", "Modo reporoduccion", "Modo Telefono", "Modo Productividad", "Salir" };
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
            System.out.println(
                    "------------------------------------------------------------------------------------------------------");
        }
        return menu.length;
    }

    /**
     * Evita errores al recibir la selección del usuario.
     * 
     * @param amoutOptions límite de opciones posibles
     * @return dato de la selección del usuario.
     */
    public int notAnOption(int amoutOptions) {
        boolean next_step = false;
        int selection = 0;
        do {
            try {
                selection = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las opciones"));
                if (selection < 0 || selection > amoutOptions) {
                    System.err.println("DEBE INGRESAR UNA OPCION VALIDA");
                } else {
                    next_step = true;
                }
            } catch (NumberFormatException e) {
                System.err.println("INGRESE UN VALOR NUMERICO");
            }
        } while (!next_step);
        return selection;
    }

    /**
     * Menu de opciones para el modo radio del programa
     * 
     * @return límite de opciones disponibles
     */
    public int menuModoRadio() {
        System.out.println(
                "------------------------------------------------------------------------------------------------------");
        String[] menuModoRadio = { "Cambiar a FM o AM", "Cambiar emisora", "Guardar emisorias", "Cargas emisoras" };
        for (int i = 0; i < menuModoRadio.length; i++) {
            System.out.println((i + 1) + ". " + menuModoRadio[i]);
            System.out.println(
                    "------------------------------------------------------------------------------------------------------");
        }
        return menuModoRadio.length;
    }

    /**
     * Opciones por mostrar al momento de iniciar el programa, para dar
     * funcionamiento al método
     * 
     * @return límite de opciones disponibles
     */
    public int encenderRadio() {
        String[] encenderRadio = { "¿Desea Encender la radio? \n1.Si", "2.No" };
        for (int i = 0; i < encenderRadio.length; i++) {
            System.out.println(encenderRadio[i]);
        }
        return encenderRadio.length;
    }

    /**
     * Menu de opciones para el modo reproduccion del programa
     * 
     * @return límite de opciones disponibles
     */
    public int menuReproduccion() {
        String[] menuReproduccion = { "Seleccionar lista de reproduccion", "Cambiar cancion", "Escuchar cancion" };
        for (int i = 0; i < menuReproduccion.length; i++) {
            System.out.println((i + 1) + ". " + menuReproduccion[i]);
        }
        return menuReproduccion.length;
    }

    /**
     * Imprime todas las canciones que se encuentran en la lista especificada
     * 
     * @param canciones lista de todas las canciones registradas
     * @param lista     el número de lista de reproducción en la cual se desea ver
     *                  canciones
     */
    public ArrayList<Cancion> mostrarCanciones(ArrayList<Cancion> canciones, int lista, String NombreLista) {
        ArrayList<Cancion> temp = new ArrayList<Cancion>();
        int i = 1;

        System.out.println("\n***Selecciona una de las canciones de la lista***");
        System.out.println("Actualmente estas viendo la lista: '" + NombreLista + "'\n");
        for (Cancion cancion : canciones) {
            if (cancion.getEnlista() == lista) {
                System.out.println("Canción " + i);
                System.out.println(cancion + "\n");
                temp.add(cancion);
                i++;
            }
        }

        return temp;
    }

    /**
     * Permite mostrar un listado de listas de reproducción
     * 
     * @param listas a mostrar
     * @return cantidad total de listas
     */
    public int mostrarListas(ArrayList<String> listas) {
        for (String string : listas) {
            System.out.println(string);
        }

        return listas.size();
    }

    /**
     * Permite imprimir un texto específico
     * 
     * @param texto a imprimir
     */
    public void Mostrar(String texto) {
        System.out.println(texto);
    }

    /**
     * Permite imprimir un listado de contactos en orden
     * 
     * @param i listado de contactos
     */
    public void MostarContactos(ArrayList<String> i) {
        for (String string : i) {
            System.out.println("- " + string);
        }
    }

    /**
     * Muestra el listado de contactos que pueden llamarse
     * 
     * @param i listado de contactos
     * @return contacto seleccionado para llamar
     */
    public String Llamar(ArrayList<String> i) {
        System.out.println("¿A quien desea llamar?");
        int inde = 0;
        for (String string : i) {
            System.out.println(inde + string);
            inde++;
        }
        int selection = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las opciones"));
        System.out.println("Llamando a " + i.get(selection));
        return i.get(selection);
    }

    /**
     * Opciones a mostrar en el funcionamiento del método para finalizar llamada en
     * radio
     * 
     * @param nombre del contacto al que se ha llamado
     * @return la opción seleccionada por el usuario
     */
    public int finalizarcall(String n) {
        System.out.println("¿Desea finalizar la llamada con " + n + "? \n 1 SI \n 2 NO");
        int selection = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las opciones"));
        return selection;
    }

    /**
     * Mensaje a mostrar al conectar el teléfono
     */
    public void telconected() {
        System.out.println("Telefono conectado correctamente");
    }

    /**
     * Muestra el dato de la persona a quien se está llamando
     * 
     * @param nombre de la persona llamada
     */
    public void lastcontactcall(String n) {
        System.out.println("Llamando a " + n);
    }

    /**
     * menú para el funcionamiento del teléfono
     * 
     * @return elección del usuario
     */
    public int menumodotel() {
        System.out.println(
                "MODO TELEFONO \n ¿Que desea hacer? \n 1 Ver contactos \n 2 Llamar Contactos \n 3 Llamar Ultimo Contacto ");
        int selection = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las opciones"));
        return selection;
    }

    /**
     * Menu de opciones para el modificar la banda del radio
     * 
     * @return límite de opciones posibles
     */
    public int modoRadio() {
        System.out.println("-------------------------------");
        String[] modoRadio = { "FM ", "AM", "Regresar al inicio" };
        for (int i = 0; i < modoRadio.length; i++) {
            System.out.println((i + 1) + ". " + modoRadio[i]);
            System.out.println("-------------------------------");
        }
        return modoRadio.length;
    }

    /**
     * Solicita el valor de un entero
     * 
     * @param texto solicitud a realizar
     * @return selección del usuario
     */
    public int SolicitudInt(String texto) {
        int resp = Integer.parseInt(JOptionPane.showInputDialog(null, texto));
        return resp;
    }

    /**
     * Solicita el valor de un decimal en formato float
     * 
     * @param texto solicitud a realizar
     * @return selección del usuario
     */
    public float SolicitudFloat(String texto) {
        float resp = Float.parseFloat(JOptionPane.showInputDialog(null, texto));
        return resp;
    }

    /**
     * Imprime los datos de una canción
     * 
     * @param cancion a mostrar
     */
    public void mostrarCanciones(Cancion cancion) {
        System.out.println(cancion);
    }

    /**
     * Permite imprimir el valor de un float
     * 
     * @param num Dato a mostrar en consola
     */
    public void imprimirFloats(ArrayList<Float> num) {
        for (Float float1 : num) {
            System.out.println("[" + float1 + "]");
        }
    }

    /**
     * Opciones por mostrar para la función de cambiar emisora.
     * 
     * @return límite de opciones existentes
     */
    public int cambiarE() {
        System.out.println("----------------------------------------");
        String[] cambiarE = { "Para adelante", "Para atras", "Regresar al inicio" };
        for (int i = 0; i < cambiarE.length; i++) {
            System.out.println((i + 1) + ". " + cambiarE[i]);
            System.out.println("----------------------------------------");
        }
        return cambiarE.length;
    }
}