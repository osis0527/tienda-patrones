package factory;

public class ProductoDigital extends Producto {

    private String formato;
    private double tamanoMB;

    public ProductoDigital(String nombre, double precio, String formato, double tamanoMB) {
        super(nombre, precio);
        this.formato = formato;
        this.tamanoMB = tamanoMB;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("────────────────────────────");
        System.out.println("Tipo:    Producto Digital");
        System.out.println("Nombre:  " + nombre);
        System.out.println("Precio:  " + precio + " €");
        System.out.println("Formato: " + formato);
        System.out.println("Tamaño:  " + tamanoMB + " MB");
    }
}