/**
 * Clase CuentaInverison 
 */
public class CuentaInversion {
    // Atributos
    private String id;
    private double balance;
    private double tarifa;
    private String nombre;

    // Metodos
    // Metodo Constructor
    CuentaInversion(String id, double balance, double tarifa, String nombre){
        this.id = id;
        this.balance = balance;
        this.tarifa = tarifa;
        this.nombre = nombre;
    }
    
    // Calcula el interés y lo suma al balance
    public double calcularIntereses() {
        double interes = balance * tarifa;
        balance += interes;
        return interes;
    }
    
    // Devuelve el balance actual
    public double obtenerBalance() {
        return balance;
    }
}


