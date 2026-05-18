package observer;

public class Almacen implements Observador {

    @Override
    public void actualizar(String producto, int stockActual) {
        System.out.println("🏭 ALMACÉN → Stock de \"" + producto + "\" actualizado a: " + stockActual + " unidades.");
        if (stockActual < 3) {
            System.out.println("🏭 ALMACÉN → ⚠️ Stock bajo, preparar reposición.");
        }
    }
}