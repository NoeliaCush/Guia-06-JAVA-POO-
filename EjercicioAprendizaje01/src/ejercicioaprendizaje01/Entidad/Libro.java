package ejercicioaprendizaje01.Entidad;

import java.util.Scanner;

public class Libro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Atributos
    private String titulo;
    private String autor;
    private int ISBN;
    private int numPaginas;

    //Constructores
    public Libro() {
    }

    public Libro(String titulo, String autor, int ISBN, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numPaginas = numPaginas;
    }

    //Métodos privado
    public Libro cargaLibro() {

        System.out.println("Por favor, ingrese el título del libro");
        String titulo = leer.next();

        System.out.println("Por favor, ingrese el nombre del autor del libro");
        String autor = leer.next();

        System.out.println("Por favor, ingrese el número internacional normalizado para libros ");
        int ISBN = leer.nextInt();

        System.out.println("Por favor, ingrese el número de páginas que contiene el libro");
        int numPaginas = leer.nextInt();
        
        return new Libro();
    }

}
