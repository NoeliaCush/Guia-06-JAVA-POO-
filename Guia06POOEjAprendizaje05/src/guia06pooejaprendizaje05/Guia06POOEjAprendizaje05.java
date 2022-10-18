package guia06pooejaprendizaje05;

import guia06pooejaprendizaje05.Entidad.Cuenta;

public class Guia06POOEjAprendizaje05 {

    public static void main(String[] args) {
        
        Cuenta cliente1 = new Cuenta();
        
        cliente1.crearCuenta();
        cliente1.ingresarDinero();
        cliente1.retirarDinero();
        cliente1.extraccionRapida();
        cliente1.consultarSaldo();
        cliente1.consultarDatos();
       
    }
    
}
