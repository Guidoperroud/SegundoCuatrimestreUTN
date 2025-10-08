package practica4;

public class GuitarraElectrica extends Cuerda implements Electrico, Afinable {
    private boolean encendido=false;
    private boolean afinada=false;

    public GuitarraElectrica(Boolean encendido, boolean afinada,String nombre, String marca, double precio, int numeroCuerdas){
        super(nombre, marca, precio, numeroCuerdas);
        this.afinada=afinada;
        this.encendido=encendido;
    } 
    @Override
    public void encender() {
        encendido=true;
        System.out.println("Guitarra encendida");
    } 
    @Override
    public void Tocar(){
       if (encendido) {
            System.out.println("Guitarra electrica esta sonando.");            
        }
        else{
            System.out.println("Guitarra electrica esta apagada.");
        }
    }
    @Override
    public boolean estaEncendido() { 
        return encendido;
    }
    @Override
    public void afinarAutomaticamente() {
        afinada=true;
        System.out.println("Guitarra afinada correctamente.");
    }
    @Override
    public boolean estaAfinado() {
        return afinada;
    }
    @Override
    public void apagar() {
        encendido=false;
        System.out.println("Guitarra apagada");
    }
    @Override
    public String MostrarInfo(){
        return super.MostrarInfo() + "Esta encendida: "+ encendido + "Esta afinada: " + afinada;
    }
}
