package factory;

public class ProductoFisico extends Producto {

    private double peso;
    private String dimensiones;

    public ProductoFisico(String nombre, double precio, double peso, String dimensiones) {
        super(nombre, precio);
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("────────────────────────────");
        System.out.println("Tipo:        Producto Físico");
        System.out.println("Nombre:      " + nombre);
        System.out.println("Precio:      " + precio + " €");
        System.out.println("Peso:        " + peso + " kg");
        System.out.println("Dimensiones: " + dimensiones);
    }
}