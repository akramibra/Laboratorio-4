
public class Controller {
    private Vista view = new Vista();
    private Radio radio = new Radio();

    public void startRadio() {
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
                    view.Mostrar("No se logro encender la radio, muchas gracias por utilizar nuestro programa");
                    break;
            }
        }
    }

    public void Start() {
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

    public void modoRadio() {
        int opcion = 0;
        int selection = 1;
        while (opcion != selection) {
            opcion = view.menuModoRadio();
            selection = view.notAnOption(opcion);
            switch (selection) {
                case 1:
                    radio.CambiarTipo();
                    break;
                case 2:
                    radio.CambiarEmisora();
                    break;
                case 3:
                    radio.GuardarEmisora();
                    break;
                case 4:

                    break;
            }
        }

    }

    public void modoReproduccion() {
        int opcion = 0;
        int selection = 1;

        while (opcion != selection) {
            opcion = view.menuReproduccion();
            selection = view.notAnOption(opcion);
            switch (selection) {
                case 1: // Seleccionar lista
                    radio.SeleccionarLista(radio.getListas_de_Reproduccion());
                    break;
                case 2: // Cambiar canción
                    radio.CambiarCancion(radio.getListaR());
                    break;
                case 3: // Elegir canción
                    radio.EscucharCancion(radio.getListaR());
                    break;

            }
        }

    }

    public void modoTelefono() {
        int opcion = 0;
        int selection = 1;

        while (opcion != selection) {
            opcion = view.menumodotel();
            selection = view.notAnOption(opcion);
            if (selection == 1) {
                radio.MostrarContactos();
            } else if (selection == 2) {
                radio.Llamar();
                while (radio.isLlamadaactive() == true) {
                    radio.FinalizarLlamada();
                }
            } else if (selection == 3) {
                radio.LlamarUltimo();
                while (radio.isLlamadaactive() == true) {
                    radio.FinalizarLlamada();
                }
            } else if (selection == 4) {
                break;
            }
        }
    }

    public void modoProductividad() {

        int opcion = 0;
        int selection = 1;

        while (opcion != selection) {
            view.Mostrar("Modo Productividad activo\n¿Desea ver las tarjetas de presentación guardadas?\n1. Si, 2. No");
            selection = view.notAnOption(2);
            switch (selection) {
                case 1: // Mostrar tarjetas
                    radio.verTarjetas(radio.getTarjetasPresentacion());
                    break;
                case 2: // No mostrar tarjetas
                    view.Mostrar("Regresando al menú inicial...");
                    break;

            }
        }

    }
}