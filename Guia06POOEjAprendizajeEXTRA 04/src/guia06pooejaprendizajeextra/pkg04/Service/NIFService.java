package guia06pooejaprendizajeextra.pkg04.Service;

import guia06pooejaprendizajeextra.pkg04.Entidad.NIF;
import java.util.Scanner;

public class NIFService {
    
    Scanner leer = new Scanner(System.in);
    
    NIF digitoVerificador = new NIF();
    
    /**
     * Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
     * letra que le corresponderá. Una vez calculado, le asigna la letra que le
     * corresponde según el resultado del calculo.
     *
     * La letra correspondiente al dígito verificador se calculará a traves de
     * un método que funciona de la siguiente manera: Para calcular la letra se
     * toma el resto de dividir el número de DNI por 23 (el resultado debe ser
     * un número entre 0 y 22). El método debe buscar en un array (vector) de
     * caracteres la posición que corresponda al resto de la división para
     * obtener la letra correspondiente
     */
    
    public void crearNIF(){
        
        System.out.println("Por favor, ingrese su número de DNI");
        digitoVerificador.setDNI(leer.nextInt());
        
        String vector[] = {"T", "R" , "W", "A" , "G" , "M" , "Y", "F", "P", "D", "X" , "B", "N", "J", "Z", "S", "Q", "V", "H", "I" , "C" , "K", "E"};
        digitoVerificador.setLetra(vector[digitoVerificador.getDNI()%23]);
    }

    /**
     * Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion
     * y la letra en mayúscula; por ejemplo: 00395469-F).
     */
    
    public void mostrar(){
        
        System.out.println(digitoVerificador.getDNI() + " - " + digitoVerificador.getLetra());
    }
    
}
