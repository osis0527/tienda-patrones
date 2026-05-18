import factory.Producto;
import factory.ProductoFactory;
import observer.Almacen;
import observer.Gerente;
import observer.InventarioProducto;
import singleton.GestorTienda;

public class Main {
    public static void main(String[] args) {

        // =============================================
        // SINGLETON
        // =============================================
        System.out.println("\n===== PATRÓN SINGLETON =====");
        GestorTienda gestor1 = GestorTienda.getInstancia();
        GestorTienda gestor2 = GestorTienda.getInstancia();
        System.out.println("¿Son la misma instancia? " + (gestor1 == gestor2));
        gestor1.agregarRegistro("Tienda iniciada correctamente.");
        gestor2.agregarRegistro("Producto agregado al catálogo.");
        gestor1.mostrarRegistros();

        // =============================================
        // FACTORY
        // =============================================
        System.out.println("\n===== PATRÓN FACTORY =====");
        Producto teclado = ProductoFactory.crearProducto("fisico", "Teclado Mecánico", 89.99, "0.8", "35x12x3 cm");
        Producto software = ProductoFactory.crearProducto("digital", "Antivirus Pro", 29.99, "EXE", "450");

        if (teclado != null) teclado.mostrarInfo();
        if (software != null) software.mostrarInfo();

        gestor1.agregarRegistro("Producto físico creado: " + teclado.getNombre());
        gestor1.agregarRegistro("Producto digital creado: " + software.getNombre());

        // =============================================
        // OBSERVER
        // =============================================
        System.out.println("\n===== PATRÓN OBSERVER =====");
        InventarioProducto inventario = new InventarioProducto("Teclado Mecánico", 10);
        inventario.agregarObservador(new Almacen());
        inventario.agregarObservador(new Gerente());

        System.out.println("\n→ Actualizando stock a 2:");
        inventario.setStock(2);

        System.out.println("\n→ Actualizando stock a 0:");
        inventario.setStock(0);

        gestor1.agregarRegistro("Stock de Teclado Mecánico actualizado.");

        // Mostrar todos los registros finales
        gestor1.mostrarRegistros();
    }
}