
/**
 * Radio
 * Implementa las distintas interfaces y da funcionalidad a sus métodos. Permite que cada modo en radio tenga funciones útiles
 */
import java.util.ArrayList;

public class Radio implements ImodoRadio, ImodoReproductor, ImodoTelefono, ImodoProductividad {
    private boolean encendido;
    private int volumen;
    private int modo;
    private String modoemisora;
    private Float emisoraA;
    private ArrayList<Float> EmisorasG;
    private ArrayList<Cancion> ListaR;
    private ArrayList<String> Contactos;
    private String LastContact;
    private ArrayList<String> listas_de_Reproduccion;
    private boolean telconectado;
    private boolean llamadaactive;
    private float iEmisora;
    private ArrayList<String> tarjetasPresentacion;
    private Vista view = new Vista();
    private int lista_seleccionada;
    private String lista;

    Radio() { // Establece valores iniciales a los atributos de la clase
        iEmisora = (float) 90.0;
        encendido = false;
        volumen = 0;
        modo = 0;
        modoemisora = "AM";
        EmisorasG = new ArrayList<Float>();
        ListaR = new ArrayList<Cancion>();
        crearCanciones();
        Contactos = new ArrayList<>();
        crearContacts();
        crearListas();
        telconectado = false;
        tarjetasPresentacion = new ArrayList<String>();
        lista_seleccionada = 0;
        lista = "";
    }

    /**
     * Crea nuevas canciones para añadir a la lista
     */
    public void crearCanciones() {
        Cancion cancion1 = new Cancion("La forma en que me miras", "5:07", "Super Yei, Myke Towers, Lenny Tavárez",
                "Pop Latino", 1);
        ListaR.add(cancion1);
        Cancion cancion2 = new Cancion("Prohibidox", "2:46", "Feid", "Urbano Latino", 2);
        ListaR.add(cancion2);
        Cancion cancion3 = new Cancion("Dancing Queen", "3:50", "ABBA", "Disco", 3);
        ListaR.add(cancion3);
        Cancion cancion4 = new Cancion("Beat it", "4:16", "Michael Jackson", "Dance rock", 3);
        ListaR.add(cancion4);
        Cancion cancion5 = new Cancion("La camisa negra", "3:36", "Juanes", "Pop Latino", 1);
        ListaR.add(cancion5);

    }

    /**
     * Crea nuevos contactos para añadir a la lista en atributos
     */
    public void crearContacts() {
        Contactos.add("Diego");
        Contactos.add("Fabiola");
        Contactos.add("Akram");
        Contactos.add("Ludwing");
        Contactos.add("Dominos Pizza");
    }

    /**
     * Crea nuevas listas de reproducción para añadir a la lista de ellas en
     * atributos
     */
    public void crearListas() {
        listas_de_Reproduccion = new ArrayList<String>();
        listas_de_Reproduccion.add("Pop Latino");
        listas_de_Reproduccion.add("Urbano");
        listas_de_Reproduccion.add("Oldies");
    }

    /**
     * Crea nuevas tarjetas de contactos para añadir a la lista de ellas en
     * atributos
     */
    public void crearTarjetas() {
        tarjetasPresentacion.add("\tFabiola Contreras\ntel:22308599\temail:con22787@uvg.edu.gt");
        tarjetasPresentacion.add("\tDiego Duarte\ntel:22678430\temail:dua22075@uvg.edu.gt");
        tarjetasPresentacion.add("\tAkram Ibrahim\ntel:25981045\temail:ibr211645@uvg.edu.gt");
    }

    // MODO TELEFONO
    @Override
    public void Conectar() {
        telconectado = true;
        view.telconected();
    }

    @Override
    public void MostrarContactos() {
        view.MostarContactos(Contactos);
    }

    @Override
    public void Llamar() {
        LastContact = view.Llamar(Contactos);
        llamadaactive = true;
    }

    @Override
    public void FinalizarLlamada() {
        int selec = view.finalizarcall(LastContact);
        if (selec == 1) {
            llamadaactive = false;
        } else if (selec == 2) {
            llamadaactive = true;
        }
    }

    @Override
    public void LlamarUltimo() {
        view.lastcontactcall(LastContact);
        llamadaactive = true;
    }

    // MODO REPRODUCTOR
    @Override
    public void SeleccionarLista(ArrayList<String> listas) {
        int opcion = 0;
        int selection = 1;

        while (opcion != selection) {
            opcion = view.mostrarListas(listas);
            selection = view.notAnOption(opcion);
        }

        this.lista_seleccionada = selection;
        switch (this.lista_seleccionada) {
            case 1:
                this.lista = "Pop latino";
            case 2:
                this.lista = "Urbano";
            case 3:
                this.lista = "Oldies";
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
                view.mostrarCanciones(canciones.get(j));

                while (opcion != selection) {
                    view.Mostrar("anterior 1, siguiente 2");
                    selection = view.notAnOption(2);
                }

                if (selection == 1) {
                    if (j != 0) {
                        j -= 2;
                        view.mostrarCanciones(canciones.get(j));
                    } else {
                        view.Mostrar("esa es la primera canción en lista");
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
            if (this.lista_seleccionada == 0) {
                System.out.println("No se ha seleccionado una lista de reproducción");
            } else {
                enLista = view.mostrarCanciones(canciones, lista_seleccionada, lista);
                opcion = enLista.size();
                selection = view.notAnOption(opcion);
            }
        }

    }

    // MODO RADIO
    @Override
    public void CambiarTipo() {
        int opcion = 0;
        int selection = 1;
        while (opcion != selection) {
            opcion = view.modoRadio();
            selection = view.notAnOption(opcion);
            if (selection == 1) {
                setModoemisora("FM");
                view.Mostrar("Se ha cambiado exitosamente la emisora a FM");
            } else if (selection == 2) {
                setModoemisora("AM");
                view.Mostrar("Se ha cambiado exitosamente la emisoar a AM");
            }
        }
    }

    @Override
    public void CambiarEmisora() {
        int opcion = 0;
        int selection = 1;
        while (opcion != selection) {
            opcion = view.cambiarE();
            selection = view.notAnOption(opcion);
            // int option = view.SolicitudInt("1. Para adelante \n2. Para Atras\n3.
            // Regresar");
            switch (selection) {
                case 1:
                    float iEmisora = getiEmisora() + (float) 0.5;
                    setiEmisora(iEmisora);
                    view.Mostrar("Usted esta actualmente en la emisora " + iEmisora);
                    break;

                case 2:
                    float Emisora = getiEmisora() - (float) 0.5;
                    setiEmisora(Emisora);
                    view.Mostrar("Usted esta actualmente en la emisora " + Emisora);
                    break;
            }

        }

    }

    @Override
    public void GuardarEmisora() {
        int opcion = 0;
        int selection = 1;
        while (opcion != selection) {
            float gEmisoria = view.SolicitudFloat("Que emisora desea guardar");
            boolean NumberFormatException = false;
            if (gEmisoria > 0) {
                getEmisorasG().add(gEmisoria);
                view.imprimirFloats(getEmisorasG());
            } else if (gEmisoria < 0) {
                view.Mostrar("No se pueden numeros negativos");
            } else if (NumberFormatException == true) {
                view.Mostrar("Ingrese un numero porfavor");
            }

        }
    }

    @Override
    public void CargarEmisora() {
        // TODO Auto-generated method stub

    }

    // MODO PRODUCTIVIDAD
    @Override
    public void verTarjetas(ArrayList<String> tarjetas) {
        view.Mostrar("\n***Se muestran las tarjetas guardadas***\n");
        for (String tarjeta : tarjetas) {
            view.Mostrar(tarjeta + "\n");
        }
    }

    /**
     * 
     * Getters y setters para cada una de las variables disponibles
     * Permite a otras clases acceder a los valores guardados en radio
     * 
     */
    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getModo() {
        return modo;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }

    public String getModoemisora() {
        return modoemisora;
    }

    public void setModoemisora(String modoemisora) {
        this.modoemisora = modoemisora;
    }

    public Float getEmisoraA() {
        return emisoraA;
    }

    public void setEmisoraA(Float emisoraA) {
        this.emisoraA = emisoraA;
    }

    public ArrayList<Float> getEmisorasG() {
        return EmisorasG;
    }

    public void setEmisorasG(ArrayList<Float> emisorasG) {
        EmisorasG = emisorasG;
    }

    public ArrayList<Cancion> getListaR() {
        return ListaR;
    }

    public void setListaR(ArrayList<Cancion> listaR) {
        ListaR = listaR;
    }

    public ArrayList<String> getContactos() {
        return Contactos;
    }

    public void setContactos(ArrayList<String> contactos) {
        Contactos = contactos;
    }

    public String getLastContact() {
        return LastContact;
    }

    public void setLastContact(String lastContact) {
        LastContact = lastContact;
    }

    public ArrayList<String> getListas_de_Reproduccion() {
        return listas_de_Reproduccion;
    }

    public void setListas_de_Reproduccion(ArrayList<String> listas_de_Reproduccion) {
        this.listas_de_Reproduccion = listas_de_Reproduccion;
    }

    public boolean isTelconectado() {
        return telconectado;
    }

    public void setTelconectado(boolean telconectado) {
        this.telconectado = telconectado;
    }

    public boolean isLlamadaactive() {
        return llamadaactive;
    }

    public void setLlamadaactive(boolean llamadaactive) {
        this.llamadaactive = llamadaactive;
    }

    public ArrayList<String> getTarjetasPresentacion() {
        return tarjetasPresentacion;
    }

    public void setTarjetasPresentacion(ArrayList<String> tarjetasPresentacion) {
        this.tarjetasPresentacion = tarjetasPresentacion;
    }

    public float getiEmisora() {
        return iEmisora;
    }

    public void setiEmisora(float iEmisora) {
        this.iEmisora = iEmisora;
    }
}