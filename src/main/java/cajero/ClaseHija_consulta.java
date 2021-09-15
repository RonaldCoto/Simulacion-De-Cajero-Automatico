package cajero;

/**
 *
 * @author Ronald
 */
public class ClaseHija_consulta extends ClasePadre {
    
    @Override
    public void transacciones(){
        System.out.println("----------------------------------------------------");
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("----------------------------------------------------");
    }
    
}
