import javax.swing.JOptionPane;

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
                    radio.setModoemisora("FM");
                    System.out.println("Se ha cambiado exitosamente la emisora a FM");
                    break;
                case 2:
                    int option = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Para adelante \n2. Para Atras"));
                    if (option == 1){
                        float iEmisora = radio.getiEmisora() + (float) 0.5;
                        radio.setiEmisora(iEmisora);
                        System.out.println("Usted esta actualmente en la emisora " + iEmisora);
                        
                    }else if(option ==2){
                        float iEmisora = radio.getiEmisora() - (float)0.5;
                        radio.setiEmisora(iEmisora);
                        System.out.println("Usted esta actualmente en la emisora " + iEmisora);
                    }
                    break;
                case 3:
                    float gEmisoria = Float.parseFloat(JOptionPane.showInputDialog(null, "Que emisora desea guardar"));
                    if(gEmisoria >0){
                        radio.getEmisorasG().add(gEmisoria);
                        System.out.println(radio.getEmisorasG());
                    }else if(gEmisoria<0){
                        System.out.println("No se pueden numeros negativos");
                    }else if(NumberFormatException == true){
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

                case 2: // Cambiar canción
                    break;
                case 3: // Elegir canción
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
            if (selection == 1){
                radio.MostrarContactos();
            }
            else if (selection == 2){ 
                radio.Llamar();
                while(radio.isLlamadaactive() == true){
                    radio.FinalizarLlamada();
                }
            }
            else if (selection == 3){ 
                radio.LlamarUltimo();
                while(radio.isLlamadaactive() == true){
                    radio.FinalizarLlamada();
                }
            }
            else if (selection == 4){
                break;
            }
        }
    }

    public static void modoProductividad() {

    }
}