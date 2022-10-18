package guia06pooejaprendizaje09;

import guia06pooejaprendizaje09.Entidad.Matemática;

public class Guia06POOEjAprendizaje09 {

    public static void main(String[] args) {
     
     /**
     * En el main se creará el objeto y se usará el Math.random para generar los
     * dos números y se guardaran en el objeto con su respectivos set.
     */
        
        Matemática op = new Matemática();
        
        System.out.println("Los números se generarán de forma aleatoria");
        op.setNumero1(Math.random()*10);
        op.setNumero2(Math.random()*10);
        System.out.println("Los números son " + op.getNumero1() + " y " +  op.getNumero2());
            
        op.devolverMayor();
        op.calcularPotenia();
        op.calcularRaiz();
        

    }
    

}
