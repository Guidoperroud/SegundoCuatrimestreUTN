package practica4;

public class Revista extends Publicacion{
    private int numero;
    private String mes;

    public int getNumero(int numero){
        return numero;
    }

    public Revista(String titulo, String mes, int anio, int numero, boolean disponible){
        super(titulo, anio);
        this.mes=mes;
        this.numero=numero;
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero: " + numero);
        System.out.println("Mes: " + mes);
    }
}
