import java.util.ArrayList;

public class ModoReproductor implements ImodoReproductor {
    Vista view = new Vista(); // Uso de vista para imprimir elementos importantes
    private int lista_seleccionada = 1;
    String lista = "je";

    @Override
    public void SeleccionarLista(ArrayList<String> listas) {
        int opcion = 0;
        int selection = 1;

        while (opcion != selection) {
            opcion = view.mostrarListas(listas);
            selection = view.notAnOption(opcion);
        }

        lista_seleccionada = selection;
        switch (lista_seleccionada) {
            case 1:
                lista = "Pop latino";
            case 2:
                lista = "Urbano";
            case 3:
                lista = "Oldies";
            default:
                break;
        }

        view.Mostrar("Se ha seleccionado la lista " + lista);
    }

    @Override
    public void CambiarCancion(ArrayList<Cancion> canciones) {
        int opcion = 0;
        int selection = 1;

        if (canciones == null) {
            System.out.println("No hay canciones en la lista");
        } else {
            for (int j = 0; j < canciones.size(); j++) {
                System.out.println(canciones.get(j));

                while (opcion != selection) {
                    view.Mostrar("anterior 1, siguiente 2");
                    selection = view.notAnOption(2);
                }

                if (selection == 1) {
                    if (j != 0) {
                        j -= 2;
                    } else {
                        System.out.println("esa es la primera canción en lista");
                    }
                }
            }
        }

    }

    @Override
    public void EscucharCancion(ArrayList<Cancion> canciones) {
        ArrayList<Cancion> enLista = new ArrayList<Cancion>();
        int opcion = 0;
        int selection = 1;

        while (opcion != selection) {
            enLista = view.mostrarCanciones(canciones, lista_seleccionada, lista);
            opcion = enLista.size();
            selection = view.notAnOption(opcion);
            System.out.println("hey");
        }

    }

}
