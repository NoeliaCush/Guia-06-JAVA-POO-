/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
 */
package guia06pooejaprendizaje05.Entidad;

import java.util.Scanner;

public class Cuenta {
    
    Scanner leer = new Scanner(System.in);
    
    private int numeroCuenta;
    private int dniCliente;
    private double saldoActual;
    private double interes;

    //a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int dniCliente, int saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    //b) Agregar los métodos getters y setters correspondientes  
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "leer=" + leer + ", numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }
        
    //c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public void crearCuenta() {
        System.out.println("Por favor, ingrese su número de cuenta, DNI y su saldo al día de la fecha");
        numeroCuenta = leer.nextInt();
        dniCliente = leer.nextInt();
        saldoActual = leer.nextDouble();
    }

    /**
     * d) Método ingresar(double ingreso): el método recibe una cantidad de
     * dinero a ingresar y se la sumara a saldo actual.
     * @return 
     */
    
    public double ingresarDinero(){
  
        System.out.println("Por favor, indique la cantidad de dinero que desea depositar");
        double ingreso = leer.nextDouble();

        saldoActual = (saldoActual + ingreso);
        System.out.println("Has depositado $ "+ ingreso + " Su saldo acual es $" + saldoActual);

        return ingreso;
    }
    
    /**
     * e) Método retirar(double retiro): el método recibe una cantidad de dinero
     * a retirar y se la restará al saldo actual. Si la cuenta no tiene la
     * cantidad de dinero a retirar, se pondrá el saldo actual en 0.
     */
    public double retirarDinero(){
        
        System.out.println("Por favor, indique la cantidad de dinero que desea retirar");
        double retiro = leer.nextDouble();
        
        saldoActual = (saldoActual - retiro);
        
        if(saldoActual < retiro){
            System.out.println("Usted quiso retirar $ " + retiro + "supera el valor de su saldo actual, pero podrá  retirar el total");
            saldoActual = 0;
        } else
            System.out.println("Has retirado " + retiro + " tu saldo restante es de " + saldoActual);
        
        return retiro;
    }
    
    /**
     * f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo.
     * Validar que el usuario no saque más del 20%.
     */
    public double extraccionRapida() {

        double extraccionR = 0;
        
        do {
            System.out.println("Por favor, ingrese un monto que no supere el 20% de su saldo");
            System.out.println("Por favor, digite el monto que desea retirar (en esta modalidad de extraccion rapida solo podra retiar hasta un maximo del 20% de su saldo actual)");
            extraccionR = leer.nextDouble();
           
            if (extraccionR > (saldoActual / 5)) {
                System.out.println("error no puede retirar mas que: $" + (saldoActual / 5));

            } else {
                this.saldoActual = saldoActual - extraccionR;
                System.out.println("su saldo actual es: $" + saldoActual);
                return saldoActual;
            }

        } while (extraccionR > (saldoActual / 5));
        return saldoActual;
    }

    //g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
   public double consultarSaldo(){
       
       System.out.println("En este momento, su saldo actual es de $ " + saldoActual);
       
       return saldoActual;
   }
    
  //h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
   public void consultarDatos(){
       
       System.out.println("Su número de cuenta es:");
       numeroCuenta = leer.nextInt();
       
   }
   
}
