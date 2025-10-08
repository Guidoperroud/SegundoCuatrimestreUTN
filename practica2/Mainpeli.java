
public class Mainpeli {
     public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula (titulo= "Batman inicia", director= "Christofer Nolan", duracion= 125, vista=true );

        Pelicula pelicula2 = new Pelicula (titulo= "Frozen", director="Francella",duracion= 105);

        Pelicula pelicula3 = new Pelicula (titulo= "Rocky", director="Martinez");

        pelicula1.marcarcomoVista();

        System.out.println(pelicula1);
        System.out.println(pelicula2);
        System.out.println(pelicula3);
        
     }
}


