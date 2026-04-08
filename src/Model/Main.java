import Model.Libro;
import Model.Disco;
import Model.Video;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String titulo;
        double precio;
        int anioPublicacion;
        int numeroPaginas;
        float duracionMinutos;
        float duracionHoras;
        int opcion;

        Scanner input = new Scanner(System.in);

        // Crear un Libro
        System.out.println("Bienvenido de la editorial!");
        System.out.println("vamos a crear un libro!!!");
        System.out.println("cuál es el título del libro?");
        titulo = input.nextLine();
        System.out.println("cuál es el precio del libro?");
        precio = input.nextDouble();
        System.out.println("cuál es el año de publicación del libro?");
        anioPublicacion = input.nextInt();
        System.out.println("cuál es el número de páginas del libro?");
        numeroPaginas = input.nextInt();

        Libro miLibro = new Libro(titulo, precio, anioPublicacion, numeroPaginas);
        System.out.println(miLibro);

        // Crear un Disco
        input.nextLine();
        System.out.println("vamos a crear un disco!!!");
        System.out.println("cuál es el título del disco?");
        titulo = input.nextLine();
        System.out.println("cuál es el precio del disco?");
        precio = input.nextDouble();
        System.out.println("cuál es la duración en minutos del disco?");
        duracionMinutos = input.nextFloat();

        Disco miDisco = new Disco(duracionMinutos, titulo, precio);
        System.out.println(miDisco);

        // Crear un Video
        input.nextLine();
        System.out.println("vamos a crear un video!!!");
        System.out.println("cuál es el título del video?");
        titulo = input.nextLine();
        System.out.println("cuál es el precio del video?");
        precio = input.nextDouble();
        System.out.println("cuál es la duración en horas del video?");
        duracionHoras = input.nextFloat();
        System.out.println("cuál es el idioma del video?");
        System.out.println("1. ESPAÑOL");
        System.out.println("2. INGLES");
        System.out.println("3. PORTUGUES");
        opcion = input.nextInt();

        Video.Idioma idioma;
        if (opcion == 1) {
            idioma = Video.Idioma.ESPANIOL;
        } else if (opcion == 2) {
            idioma = Video.Idioma.INGLES;
        } else {
            idioma = Video.Idioma.PORTUGUES;
        }

        Video miVideo = new Video(titulo, precio, idioma, duracionHoras);
        System.out.println(miVideo);

        input.close();
    }
}