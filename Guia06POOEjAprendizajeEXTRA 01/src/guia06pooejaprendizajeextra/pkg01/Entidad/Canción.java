package guia06pooejaprendizajeextra.pkg01.Entidad;

public class Canción {
    
    //Desarrollar una clase Cancion con los siguientes atributos: titulo y autor
    
    public String titulo;
    public String autor;
    
    //Se deberá́definir además dos constructores:
   
    // uno vacío que inicializa el titulo y el autor a cadenas vacías
    public Canción() {
    }
    
    //otro que reciba como parámetros el titulo y el autor de la canción
    public Canción(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    //definir los métodos getters y setters correspondientes.
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
    
}
