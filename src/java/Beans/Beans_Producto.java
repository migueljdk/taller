package Beans;

import java.io.InputStream;

public class Beans_Producto {

    int codigo_producto;
    int codigo_categoria;
    String nombre_producto;
    InputStream imagen_producto;
    InputStream pdf_producto;
    String descripcion_producto;
    double precio_producto;
    int stock_producto;
    String fecha_registro;
    String hora_registro;
    int estado_producto;

    public Beans_Producto(int codigo_producto, int codigo_categoria, String nombre_producto, String descripcion_producto, double precio_producto, int stock_producto, String fecha_registro, String hora_registro, int estado_producto) {
        this.codigo_producto = codigo_producto;
        this.codigo_categoria = codigo_categoria;
        this.nombre_producto = nombre_producto;
        this.descripcion_producto = descripcion_producto;
        this.precio_producto = precio_producto;
        this.stock_producto = stock_producto;
        this.fecha_registro = fecha_registro;
        this.hora_registro = hora_registro;
        this.estado_producto = estado_producto;
    }

    public Beans_Producto() {
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public int getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(int codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public InputStream getImagen_producto() {
        return imagen_producto;
    }

    public void setImagen_producto(InputStream imagen_producto) {
        this.imagen_producto = imagen_producto;
    }

    public InputStream getPdf_producto() {
        return pdf_producto;
    }

    public void setPdf_producto(InputStream pdf_producto) {
        this.pdf_producto = pdf_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public int getStock_producto() {
        return stock_producto;
    }

    public void setStock_producto(int stock_producto) {
        this.stock_producto = stock_producto;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getHora_registro() {
        return hora_registro;
    }

    public void setHora_registro(String hora_registro) {
        this.hora_registro = hora_registro;
    }

    public int getEstado_producto() {
        return estado_producto;
    }

    public void setEstado_producto(int estado_producto) {
        this.estado_producto = estado_producto;
    }

}
