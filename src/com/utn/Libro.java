package com.utn;

public class Libro {
    private String titulo;
    private float precio;
    private short stock;
    private Autor autor;

    public Libro(String titulo, Autor autor, short stock, float precio) {
        setTitulo(titulo);
        setPrecio(precio);
        setStock(stock);
        setAutor(autor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public short getStock() {
        return stock;
    }

    public void setStock(short stock) {
        this.stock = stock;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void mostrarLibro() {
        System.out.println("Libro[titulo=" + getTitulo()
                + ", autor=" + getAutor().getNombre() + ' ' + getAutor().getApellido()
                + ", stock=" + getStock()
                + ", precio=" + getPrecio() + "]");
    }

    public void aumentarStock(short cantidad) {
        setStock((short)(getStock() + cantidad));
    }

    public void mensajeComercial() {
        System.out.println("El libro, " + getTitulo()
                + " de " + getAutor().getNombre() + ' ' + getAutor().getApellido()
                + ". Se vende a " + getPrecio() + " pesos.");
    }
}
