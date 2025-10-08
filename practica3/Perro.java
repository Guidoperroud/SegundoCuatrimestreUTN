package practica3;

public class Perro extends Animales{

    private String raza;
    
    public Perro(String nombre,int edad,String raza){
        super(nombre, edad, "Perro");
        this.raza=raza;
    }

    public Perro(String nombre) {
        super(nombre, "Perro");
        this.raza = "Desconocida";
    }

    public String getRaza(String raza){
        return raza;
    }

    public void setRaza(String raza){
        this.raza=raza;
    }
    @Override
    public String EmitirSonido(){
        return "guau guau";
    }

    public String Jugar(){
        return "El perro " + nombre + " esta jugando.";
    }
    @Override
    public String toString(){
        return super.toString()+", raza: " + raza;
    }
}
