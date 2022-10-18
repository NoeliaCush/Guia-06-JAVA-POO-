package guia06pooejaprendizajeextra.pkg04.Entidad;

public class NIF {
    
    /**
     * Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs
     * con su correspondiente letra (NIF). Los atributos serán el número de DNI
     * (entero largo) y la letra (String o char) que le corresponde.
     */
    
    private int DNI;
    private String letra;

    public NIF() {
    }

    public NIF(int DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }
    
    //Métodos getters y setters para el número de DNI y la letra

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
    
    
}
