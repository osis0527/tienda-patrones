package singleton;

import java.util.ArrayList;

public class GestorTienda {

    private static GestorTienda instancia;
    private String nombre;
    private ArrayList<String> registros;

    private GestorTienda() {
        this.nombre = "Tienda Tech";
        this.registros = new ArrayList<>();
    }

    public static GestorTienda getInstancia() {
        if (instancia == null) {
            instancia = new GestorTienda();
        }
        return instancia;
    }

    public void agregarRegistro(String registro) {
        registros.add(registro);
    }

    public void mostrarRegistros() {
        System.out.println("\n📋 REGISTROS DE: " + nombre);
        System.out.println("────────────────────────────");
        for (String r : registros) {
            System.out.println("→ " + r);
        }
    }

    public String getNombre() { return nombre; }
}