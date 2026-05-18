package observer;

public class Gerente implements Observador {

    @Override
    public void actualizar(String producto, int stockActual) {
        System.out.println("👔 GERENTE → Notificado sobre \"" + producto + "\". Stock actual: " + stockActual + " unidades.");
        if (stockActual == 0) {
            System.out.println("👔 GERENTE → ⚠️ Producto agotado, revisar proveedores.");
        }
    }
}