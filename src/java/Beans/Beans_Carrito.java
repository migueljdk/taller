package Beans;

public class Beans_Carrito {
    int codigo_carrito;
    int codigo_producto;
    String nombre_carrito;
    int cantidad_carrito;
    double precio_carrito;
    double total_carrito;
    int codigo_usuario;

    public int getCodigo_carrito() {
        return codigo_carrito;
    }

    public void setCodigo_carrito(int codigo_carrito) {
        this.codigo_carrito = codigo_carrito;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getNombre_carrito() {
        return nombre_carrito;
    }

    public void setNombre_carrito(String nombre_carrito) {
        this.nombre_carrito = nombre_carrito;
    }

    public int getCantidad_carrito() {
        return cantidad_carrito;
    }

    public void setCantidad_carrito(int cantidad_carrito) {
        this.cantidad_carrito = cantidad_carrito;
    }

    public double getPrecio_carrito() {
        return precio_carrito;
    }

    public void setPrecio_carrito(double precio_carrito) {
        this.precio_carrito = precio_carrito;
    }

    public double getTotal_carrito() {
        return total_carrito;
    }

    public void setTotal_carrito(double total_carrito) {
        this.total_carrito = total_carrito;
    }

    public int getCodigo_usuario() {
        return codigo_usuario;
    }

    public void setCodigo_usuario(int codigo_usuario) {
        this.codigo_usuario = codigo_usuario;
    }
}
