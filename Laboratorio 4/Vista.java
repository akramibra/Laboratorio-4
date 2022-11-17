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
        String[] menuModoRadio = { "Cambiar a FM", "Cambiar emisora", "Guardar emisorias", "Cargas emisoras" };
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
}