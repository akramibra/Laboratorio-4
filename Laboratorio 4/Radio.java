
/**
 * Radio
 */
import java.util.ArrayList;

public class Radio {
    private static boolean encendido;
    private static int volumen;
    private static int modo;
    private static String modoemisora;
    private static Float emisoraA;
    private static ArrayList<Float> EmisorasG;
    private static ArrayList<Cancion> ListaR;
    private static ArrayList<String> Contactos;
    private static String LastContact;

    public Radio() {
        encendido = false;
        volumen = 0;
        modo = 0;
        modoemisora = "AM";
        EmisorasG = new ArrayList<Float>();
        crearCanciones();
        Contactos = new ArrayList<>();
        crearContacts();
    }

    public void crearCanciones() {
        Cancion cancion1 = new Cancion("La forma en que me miras", "5:07", "Super Yei, Myke Towers, Lenny Tavárez",
                "Pop Latino");
        Cancion cancion2 = new Cancion("Prohibidox", "2:46", "Feid", "Urbano Latino");
        Cancion cancion3 = new Cancion("Dancing Queen", "3:50", "ABBA", "Disco");
        ListaR = new ArrayList<Cancion>();
        ListaR.add(cancion1);
        ListaR.add(cancion2);
        ListaR.add(cancion3);
    }

    public void crearContacts() {
        Contactos.add("Diego");
        Contactos.add("Fabiola");
        Contactos.add("Akram");
        Contactos.add("Ludwing");
        Contactos.add("Dominos Pizza");
    }

    public static boolean isEncendido() {
        return encendido;
    }

    public static void setEncendido(boolean encendido) {
        Radio.encendido = encendido;
    }

    public static int getVolumen() {
        return volumen;
    }

    public static void setVolumen(int volumen) {
        Radio.volumen = volumen;
    }

    public static int getModo() {
        return modo;
    }

    public static void setModo(int modo) {
        Radio.modo = modo;
    }

    public static String getModoemisora() {
        return modoemisora;
    }

    public static void setModoemisora(String modoemisora) {
        Radio.modoemisora = modoemisora;
    }

    public static Float getEmisoraA() {
        return emisoraA;
    }

    public static void setEmisoraA(Float emisoraA) {
        Radio.emisoraA = emisoraA;
    }

    public static ArrayList<Float> getEmisorasG() {
        return EmisorasG;
    }

    public static void setEmisorasG(ArrayList<Float> emisorasG) {
        EmisorasG = emisorasG;
    }

    public static ArrayList<Cancion> getListaR() {
        return ListaR;
    }

    public static void setListaR(ArrayList<Cancion> listaR) {
        ListaR = listaR;
    }

    public static ArrayList<String> getContactos() {
        return Contactos;
    }

    public static void setContactos(ArrayList<String> contactos) {
        Contactos = contactos;
    }

    public static String getLastContact() {
        return LastContact;
    }

    public static void setLastContact(String lastContact) {
        LastContact = lastContact;
    }
}