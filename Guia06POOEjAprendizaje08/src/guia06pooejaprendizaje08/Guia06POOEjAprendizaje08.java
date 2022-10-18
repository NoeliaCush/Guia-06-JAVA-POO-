package guia06pooejaprendizaje08;

import guia06pooejaprendizaje08.Entidad.Cadena;

public class Guia06POOEjAprendizaje08 {

    public static void main(String[] args) {
      
        //En el main se creará el objeto
        Cadena frase = new Cadena();
        
        frase.crearFrase();
        frase.mostrarVocales();
        frase.invertirFrase();
        frase.vecesRepetido("o");
        frase.compararLongitud("adios");
        frase.unirFrases("buenas tardes");
        frase.reemplazar("i");
        frase.contiene("o");
        
    }
    
}
