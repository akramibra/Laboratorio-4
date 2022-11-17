
public class Controller {
    private static Vista view = new Vista();
    private static Radio radio = new Radio();

    public static void startRadio() {
        int opcion = 0;
        int selection = 1;
        while (opcion != selection) {
            opcion = view.encenderRadio();
            selection = view.notAnOption(opcion);
            switch (selection) {
                case 1:
                    Start();
                    break;
                case 2:
                    System.out.println("No se logro encender la radio, muchas gracias por utilizar nuestro programa");
                    break;
            }
        }
    }

    public static void Start() {
        int opcion = 0;
        int selection = 1;
        while (opcion != selection) {
            opcion = view.menu();
            selection = view.notAnOption(opcion);
            switch (selection) {
                case 1:
                    modoRadio();
                    break;
                case 2:
                    modoReproduccion();
                    break;
                case 3:
                    modoTelefono();
                    break;
                case 4:
                    modoProductividad();
                    break;
                case 5:

                    break;

            }
        }
    }

    public static void modoRadio() {
        int opcion = 0;
        int selection = 1;
        while (opcion != selection) {
            opcion = view.menuModoRadio();
            selection = view.notAnOption(opcion);
            switch (selection) {
                case 1:
                    radio.setModoemisora("FM");
                    System.out.println("Se ha cambiado exitosamente la emisora a FM");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }

    }

    public static void modoReproduccion() {
        int opcion = 0;
        int selection = 1;
        while (opcion != selection){
            opcion = view.menuReproduccion();
            selection = view.notAnOption(opcion);
        }

    }

    public static void modoTelefono() {
        int opcion = 0;
        int selection = 1;
        while (opcion != selection) {
            opcion = view.menuTelefono();
            selection = view.notAnOption(opcion);
            switch (selection) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;

            }
        }
    }

    public static void modoProductividad() {

    }
}