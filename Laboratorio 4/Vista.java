import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Vista {

    public void welcomeMessage() {
        System.out.println("Bienvenidos a nuestro programa");
    }

    public void endSystem() {
        System.out.println("Gracias por utilizar nuestro programa");
    }

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

    public int menuTelefono() {
        System.out.println(
                "------------------------------------------------------------------------------------------------------");
        String[] menuTelefono = { "\nConectar telefono", "Mostrar contactos", "Llamar a contacto", "Finalizar llamada",
                "Llamar al ultimo contacto" };

        for (int i = 0; i < menuTelefono.length; i++) {
            System.out.println((i + 1) + ". " + menuTelefono[i]);
            System.out.println(
                    "------------------------------------------------------------------------------------------------------");
        }
        return menuTelefono.length;
    }

    public int encenderRadio() {
        String[] encenderRadio = { "¿Desea Encender la radio? \n1.Si", "2.No" };
        for (int i = 0; i < encenderRadio.length; i++) {
            System.out.println(encenderRadio[i]);
        }
        return encenderRadio.length;
    }

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

    public int mostrarListas(ArrayList<String> listas) {
        for (String string : listas) {
            System.out.println(string);
        }

        return listas.size();
    }

    public void Mostrar(String texto) {
        System.out.println(texto);
    }

    public void MostarContactos(ArrayList<String> i) {
        for (String string : i) {
            System.out.println("- " + string);
        }
    }

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

    public int finalizarcall(String n) {
        System.out.println("¿Desea finalizar la llamada con " + n + "? \n 1 SI \n 2 NO");
        int selection = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las opciones"));
        return selection;
    }

    public void telconected() {
        System.out.println("Telefono conectado correctamente");
    }

    public void lastcontactcall(String n) {
        System.out.println("Llamando a " + n);
    }

    public int menumodotel() {
        System.out.println(
                "MODO TELEFONO \n ¿Que desea hacer? \n 1 Ver contactos \n 2 Llamar Contactos \n 3 Llamar Ultimo Contacto ");
        int selection = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las opciones"));
        return selection;
    }

    public int modoRadio() {
        System.out.println("-------------------------------");
        String[] modoRadio = { "FM ", "AM", "Regresar al inicio" };
        for (int i = 0; i < modoRadio.length; i++) {
            System.out.println((i + 1) + ". " + modoRadio[i]);
            System.out.println("-------------------------------");
        }
        return modoRadio.length;
    }

    public int SolicitudInt(String texto) {
        int resp = Integer.parseInt(JOptionPane.showInputDialog(null, texto));
        return resp;
    }

    public float SolicitudFloat(String texto) {
        float resp = Float.parseFloat(JOptionPane.showInputDialog(null, texto));
        return resp;
    }

    public void mostrarCanciones(Cancion cancion) {
        System.out.println(cancion);
    }
}