
public class Controller {
    private static boolean NumberFormatException = false;
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
                    opcion = view.modoRadio();
                    selection = view.notAnOption(opcion);
                    if (selection == 1) {
                        radio.setModoemisora("FM");
                        System.out.println("Se ha cambiado exitosamente la emisora a FM");
                    } else if (selection == 2) {
                        radio.setModoemisora("AM");
                        view.Mostrar("Se ha cambiado exitosamente la emisoar a AM");
                    }

                    break;
                case 2:
                    int option = view.SolicitudInt("1. Para adelante \n2. Para Atras");
                    if (option == 1) {
                        float iEmisora = Radio.getiEmisora() + (float) 0.5;
                        Radio.setiEmisora(iEmisora);
                        System.out.println("Usted esta actualmente en la emisora " + iEmisora);

                    } else if (option == 2) {
                        float iEmisora = Radio.getiEmisora() - (float) 0.5;
                        Radio.setiEmisora(iEmisora);
                        System.out.println("Usted esta actualmente en la emisora " + iEmisora);
                    }
                    break;
                case 3:
                    float gEmisoria = view.SolicitudFloat("Que emisora desea guardar");
                    if (gEmisoria > 0) {
                        Radio.getEmisorasG().add(gEmisoria);
                        System.out.println(Radio.getEmisorasG());
                    } else if (gEmisoria < 0) {
                        System.out.println("No se pueden numeros negativos");
                    } else if (NumberFormatException == true) {
                        System.out.println("Ingrese un numero porfavor");
                    }

                    break;
                case 4:

                    break;
            }
        }

    }

    public static void modoReproduccion() {
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
                    radio.CambiarCancion(Radio.getListaR());
                    break;
                case 3: // Elegir canción
                    radio.EscucharCancion(Radio.getListaR());
                    break;

            }
        }

    }

    public static void modoTelefono() {
        int opcion = 0;
        int selection = 1;

        while (opcion != selection) {
            opcion = view.menumodotel();
            selection = view.notAnOption(opcion);
            if (selection == 1) {
                radio.MostrarContactos();
            } else if (selection == 2) {
                radio.Llamar();
                while (Radio.isLlamadaactive() == true) {
                    radio.FinalizarLlamada();
                }
            } else if (selection == 3) {
                radio.LlamarUltimo();
                while (Radio.isLlamadaactive() == true) {
                    radio.FinalizarLlamada();
                }
            } else if (selection == 4) {
                break;
            }
        }
    }

    public static void modoProductividad() {

    }
}