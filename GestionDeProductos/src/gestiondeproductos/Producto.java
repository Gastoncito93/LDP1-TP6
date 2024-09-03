package gestiondeproductos;



public class Producto implements Comparable<Producto> {
    private Categoria categoria;
    private String nombre;
    private double precio;

    public Producto(Categoria categoria, String nombre, double precio) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public int compareTo(Producto o) {
        // Define tu criterio de comparación
        return Double.compare(this.precio, o.precio);
    }

    @Override
    public String toString() {
        return nombre + " (" + categoria + ") - $" + precio;
    }

}

