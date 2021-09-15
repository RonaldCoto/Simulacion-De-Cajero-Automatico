package cajero;

/**
 *
 * @author Ronald
 */
public class MainClass {
    public static void main(String[] args) {
        ClasePadre correr = new ClaseHija_consulta();
        correr.setSaldo(500);
        correr.Operaciones();
    }
}
