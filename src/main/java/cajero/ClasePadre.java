
package cajero;
import java.util.Scanner;
/**
 *
 * @author Ronald
 */
public abstract class ClasePadre {
    protected int transacciones,retiro,deposito;
    private static int saldo=0;
    
    Scanner entrada = new Scanner(System.in);
    
    public void Operaciones(){
        int bandera = 0;
        int seleccion=0;
        
        do {            
            
        do {
            System.out.println("Ingrese la opción que desea efectuar");
            System.out.println("1.Consulta de saldo");
            System.out.println("2.Retiro de efectivo");
            System.out.println("3.Déposito de efectivo");
            System.out.println("4.Salir");
            seleccion=entrada.nextInt();
            
            if (seleccion>=1 && seleccion<=4) {
                bandera=1;  
            }else{
                System.out.println("--------------------------------------------");
                System.out.println("Opcion no existente, ingrese una de las que se le presentan");
                System.out.println("--------------------------------------------");
            } 
        } while (bandera==0);
        
            if (seleccion==1){
                ClasePadre mensajero_consulta = new ClaseHija_consulta();
                mensajero_consulta.transacciones();
            }else if(seleccion==2){
                ClasePadre mensajero_retiro = new ClaseHija_retiro();
                mensajero_retiro.transacciones();
            }else if (seleccion==3) {
                ClasePadre mensajero_deposito = new ClaseHija_deposito();
                mensajero_deposito.transacciones();
            }else if (seleccion==4) {
                System.out.println("--------------------------------------------");
                System.out.println("Gracias, Vuelva pronto!");
                System.out.println("--------------------------------------------");
                bandera=2;
            }
      } while (bandera!=2);
    }
    
    //Metodo para solicitar retiro
    public void Retiro(){
        retiro=entrada.nextInt();
    }
    
    //Metodo para solicitar deposito
    public void Deposito(){
        deposito=entrada.nextInt();
    }
    
    //Metodo abstracto para usar polimorfismo
    public abstract void transacciones();

    
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    
}
