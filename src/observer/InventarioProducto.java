package observer;

import java.util.ArrayList;

public class InventarioProducto {

    private String nombre;
    private int stock;
    private ArrayList<Observador> observadores;

    public InventarioProducto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
        this.observadores = new ArrayList<>();
    }

    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    public void setStock(int nuevoStock) {
        this.stock = nuevoStock;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observador o : observadores) {
            o.actualizar(nombre, stock);
        }
    }

    public int getStock() { return stock; }
    public String getNombre() { return nombre; }
}