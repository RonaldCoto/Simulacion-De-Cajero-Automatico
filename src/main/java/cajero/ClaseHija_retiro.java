
package cajero;
/**
 *
 * @author Ronald
 */
public class ClaseHija_retiro extends ClasePadre{
    public int monto=0;
    @Override
    public void transacciones(){
        System.out.println("Ingrese el monto a retirar");
        Retiro();
        
        if (retiro>getSaldo()) {
            System.out.println("------------------------------------------------");
            System.out.println("No puede retirar un monto mayor al saldo actual");
            System.out.println("------------------------------------------------");
        }else{
            transacciones=getSaldo();
            transacciones=transacciones-retiro;
            setSaldo(transacciones);
            System.out.println("------------------------------------------------"); 
            System.out.println("Retiraste: $"+ retiro);
            System.out.println("Tu saldo actual es: $"+ getSaldo());
            System.out.println("------------------------------------------------");
        }
    }
}
