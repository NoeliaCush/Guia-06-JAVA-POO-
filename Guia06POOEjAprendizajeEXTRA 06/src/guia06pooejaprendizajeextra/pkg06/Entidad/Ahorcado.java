package guia06pooejaprendizajeextra.pkg06.Entidad;

public class Ahorcado {
 
    /**
     * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá
     * contener como atributos, un vector con la palabra a buscar, la cantidad
     * de letras encontradas y la cantidad jugadas máximas que puede realizar el
     * usuario
     */
    
    private String[] palabra;
    private int cantLetrasEncontradas;
    private int cantJugadasMaximas;
    
    //Constructores, tanto el vacío como el parametrizado

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantLetrasEncontradas, int cantJugadasMaximas) {
        this.palabra = palabra;
        this.cantLetrasEncontradas = cantLetrasEncontradas;
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public int getCantJugadasMaximas() {
        return cantJugadasMaximas;
    }

    public void setCantJugadasMaximas(int cantJugadasMaximas) {
        this.cantJugadasMaximas = cantJugadasMaximas;
    }
    
    
    
}

