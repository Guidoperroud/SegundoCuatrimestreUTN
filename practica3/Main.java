package practica3;

public class Main {
    public static void main(String[] args) {
        Perro perro1= new Perro("Uma", 5, "callejera");
        Perro perro2= new Perro("Reyna");

        Gato gato1 = new Gato("Michi", 2, "Naranja");
        Gato gato2 = new Gato ("Don gato");

        System.out.println(perro1.toString());
        System.out.println(perro2.toString());
        System.out.println(gato1.toString());
        System.out.println(gato2.toString());

        System.out.println(perro1.EmitirSonido());
        System.out.println(gato1.EmitirSonido());

        System.out.println(perro2.Jugar());
        System.out.println(gato2.Ronroneo());
    }
}
