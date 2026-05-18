package factory;

public class ProductoFactory {

    public static Producto crearProducto(String tipo, String nombre, double precio, String... extras) {
        switch (tipo.toLowerCase()) {
            case "fisico":
                double peso = Double.parseDouble(extras[0]);
                String dimensiones = extras[1];
                return new ProductoFisico(nombre, precio, peso, dimensiones);
            case "digital":
                String formato = extras[0];
                double tamano = Double.parseDouble(extras[1]);
                return new ProductoDigital(nombre, precio, formato, tamano);
            default:
                System.out.println("✘ Tipo de producto no válido.");
                return null;
        }
    }
}