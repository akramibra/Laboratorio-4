
/**
 * Radio
 */
import java.util.ArrayList;

import javax.swing.text.View;

public class Radio implements ImodoRadio, ImodoReproductor, ImodoTelefono{
    private static boolean encendido;
    private static int volumen;
    private static int modo;
    private static String modoemisora;
    private static Float emisoraA;
    private static ArrayList<Float> EmisorasG;
    private static ArrayList<Cancion> ListaR;
    private static ArrayList<String> Contactos;
    private static String LastContact;
    private ArrayList<String> listas_de_Reproduccion;
    private static boolean telconectado;
    private static boolean llamadaactive;
    private static float iEmisora;
    public static float getiEmisora() {
        return iEmisora;
    }

    public static void setiEmisora(float iEmisora) {
        Radio.iEmisora = iEmisora;
    }

    Vista view = new Vista();

    Radio() {
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
    }

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

    public void crearContacts() {
        Contactos.add("Diego");
        Contactos.add("Fabiola");
        Contactos.add("Akram");
        Contactos.add("Ludwing");
        Contactos.add("Dominos Pizza");
    }

    public void crearListas() {
        listas_de_Reproduccion = new ArrayList<String>();
        listas_de_Reproduccion.add("Pop Latino");
        listas_de_Reproduccion.add("Urbano");
        listas_de_Reproduccion.add("Oldies");
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

    public ArrayList<String> getListas_de_Reproduccion() {
        return listas_de_Reproduccion;
    }

    public void setListas_de_Reproduccion(ArrayList<String> listas_de_Reproduccion) {
        this.listas_de_Reproduccion = listas_de_Reproduccion;
    }

    public static boolean isTelconectado() {
        return telconectado;
    }

    public static void setTelconectado(boolean telconectado) {
        Radio.telconectado = telconectado;
    }

    public static boolean isLlamadaactive() {
        return llamadaactive;
    }

    public static void setLlamadaactive(boolean llamadaactive) {
        Radio.llamadaactive = llamadaactive;
    }
//MODO TELEFONO
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
        if (selec == 1){
            llamadaactive = false;
        }
        else if (selec == 2){
            llamadaactive = true;
        }
    }

    @Override
    public void LlamarUltimo() {
        view.lastcontactcall(LastContact);
        llamadaactive = true; 
    }
//MODO REPRODUCTOR
    @Override
    public void SeleccionarLista(ArrayList<String> listas) {    
    }

    @Override
    public void CambiarCancion(ArrayList<Cancion> canciones) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void EscucharCancion(ArrayList<Cancion> canciones) {
        // TODO Auto-generated method stub
        
    }
//MODO RADIO
    @Override
    public void CambiarTipo() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void CambiarEmisora() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void GuardarEmisora() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void CargarEmisora() {
        // TODO Auto-generated method stub
        
    }
}