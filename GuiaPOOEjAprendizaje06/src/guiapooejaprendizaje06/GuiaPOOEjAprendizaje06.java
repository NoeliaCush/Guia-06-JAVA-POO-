package guiapooejaprendizaje06;

import guiapooejaprendizaje06.Entidad.Cafetera;

public class GuiaPOOEjAprendizaje06 {

    public static void main(String[] args) {
 
        Cafetera cafetera1 = new Cafetera();

        cafetera1.determinarCapacidadMaxima();
        System.out.println("=============");
        cafetera1.determinarCantidadActual();
        System.out.println("=============");
        cafetera1.llenarCafetera();
        System.out.println("=============");
        cafetera1.servirTaza();
        System.out.println("=============");
        cafetera1.vaciarCafetera();
        System.out.println("=============");
        cafetera1.agregarCafe();
        System.out.println("=============");
            
    }
    
}
