public class Main{
    public static void main(String[] args) {
        System.out.println("Practica 3");
        CuentaInversion obj1 = new CuentaInversion("1", 20, 2, "Ulises");
    }
    
    // Pedir al usuario que ingrese la cantidad de dinero a depositar
        System.out.print("Ingrese la cantidad de dinero que desea depositar: ");
        double cantidadDeposito = scanner.nextDouble();
    
    // Depositar la cantidad de dinero en la cuenta
        cuenta.deposito(cantidadDeposito);

    // Pedir al usuario que ingrese la cantidad a retirar
        System.out.print("Ingrese la cantidad a retirar: ");
        double cantidadRetiro = scanner.nextDouble();
    
    // Retirar la cantidad de dinero de la cuenta
        cuenta.retiro(cantidadRetiro);
    
    //Calcular los intereses
        double interes_calculado = obj1.calcularIntereses();
        System.out.print(interes_calculado);
    
    //Imprimir el balance de la cuenta
         double mi_balance = obj1.obtenerBalance();
         System.out.print(mi_balance);
}
