package guia06pooejaprendizajeextra.pkg05.Entidad;

public class Meses {
    
    /**
     * Crea una clase en Java donde declares una variable de tipo array de
     * Strings que contenga los doce meses del año, en minúsculas. A
     * continuación, declara una variable mesSecreto de tipo String, y hazla
     * igual a un elemento del array (por ejemplo, mesSecreto = mes[9].
     */
    
    private String mesesDelAnio[] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto = mesesDelAnio[9-1];

    public Meses() {
    }

    public String[] getMesesDelAnio() {
        return mesesDelAnio;
    }

    public void setMesesDelAnio(String[] mesesDelAnio) {
        this.mesesDelAnio = mesesDelAnio;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    
    
}
