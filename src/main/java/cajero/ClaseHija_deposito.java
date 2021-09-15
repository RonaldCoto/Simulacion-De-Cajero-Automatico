
package cajero;

/**
 *
 * @author Ronald
 */
public class ClaseHija_deposito extends ClasePadre{
    @Override
    public void transacciones(){
        System.out.println("Cuanto deseas depositar?");
        Deposito();
        transacciones=getSaldo();
        if (deposito<=0) {
            System.out.println("El deposito debe ser mayor a $0.00");
        }else{
            setSaldo(transacciones+deposito);
            System.out.println("------------------------------------------------"); 
            System.out.println("Depositaste: $"+deposito);
            System.out.println("Tu saldo actual es: $"+ getSaldo());
            System.out.println("------------------------------------------------");
        }
    }
}
