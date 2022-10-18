package guia06pooejaprendizaje07;

import guia06pooejaprendizaje07.Entidad.Persona;

public class Guia06POOEjAprendizaje07 {

    public static void main(String[] args) {
      
      int IMC;
      int contBajoPeso = 0, contPesoIdeal = 0, contSobrePeso = 0, contMayor = 0, contMenor = 0 ;
      boolean mayorDeEdad;

        /**
         * Crear 4 objetos de tipo Persona con distintos valores, a
         * continuación, llamaremos todos los métodos para cada objeto, deberá
         * comprobar si la persona está en su peso ideal, tiene sobrepeso o está
         * por debajo de su peso ideal e indicar para cada objeto si la persona
         * es mayor de edad.
         */
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        Persona estadistica = new Persona();

        System.out.println("Persona N° 1");
        persona1.crearPersona();
        IMC = persona1.calcularIMC();
        if(IMC < 1){
            contBajoPeso += 1;
        }else if (IMC > 1){
            contSobrePeso +=1;
        }else{
            contPesoIdeal +=1;
        }
        mayorDeEdad = persona1.esMayorDeEdad();
        if(mayorDeEdad){
            contMayor += 1;
        }else{
            contMenor += 1;
        }
        System.out.println("======");

        System.out.println("Persona N° 2");
        persona2.crearPersona();
        IMC = persona2.calcularIMC();
        if(IMC < 1){
            contBajoPeso += 1;
        }else if (IMC > 1){
            contSobrePeso +=1;
        }else{
            contPesoIdeal +=1;
        }
        mayorDeEdad = persona2.esMayorDeEdad();
         if(mayorDeEdad){
            contMayor += 1;
        }else{
            contMenor += 1;
        }
        System.out.println("======");

        System.out.println("Persona N° 3");
        persona3.crearPersona();
        IMC = persona3.calcularIMC();
        if(IMC < 1){
            contBajoPeso += 1;
        }else if (IMC > 1){
            contSobrePeso +=1;
        }else{
            contPesoIdeal +=1;
        }
        mayorDeEdad = persona3.esMayorDeEdad();
         if(mayorDeEdad){
            contMayor += 1;
        }else{
            contMenor += 1;
        }
        System.out.println("======");

        System.out.println("Persona N° 4");
        persona4.crearPersona();
        IMC = persona4.calcularIMC();
        if(IMC < 1){
            contBajoPeso += 1;
        }else if (IMC > 1){
            contSobrePeso +=1;
        }else{
            contPesoIdeal +=1;
        }
        mayorDeEdad = persona4.esMayorDeEdad();
         if(mayorDeEdad){
            contMayor += 1;
        }else{
            contMenor += 1;
        }
        System.out.println("======");
        
        /**
         * Por último, guardaremos los resultados de los métodos calcularIMC y
         * esMayorDeEdad en distintas variables, para después en el main,
         * calcular un porcentaje de esas 4 personas cuantas están por debajo de
         * su peso, cuantas en su peso ideal y cuantos, por encima, y también
         * calcularemos un porcentaje de cuantos son mayores de edad y cuantos
         * menores.
         *
         */     
        
        System.out.println("El % de personas Mayores de edad es " + (contMayor * 100) / 4 + "%");
        System.out.println("El % de personas Menores de edad es " + (contMenor * 100) / 4 + "%");
        System.out.println("El % de personas con peso ideal es " + ( contPesoIdeal * 100) / 4 + "%");
        System.out.println("El % de personas con sobrepeso es " + (contSobrePeso * 100) / 4 + "%");
        System.out.println("El % de personas con bajo peso es " + (contBajoPeso * 100) / 4 + "%");
        
    }
    
}
