package com.utn;

public class Libro {
    private String titulo;
    private float precio;
    private short stock;
    private Autor[] autores;

    public Libro(String titulo, Autor[] autores, short stock, float precio) {
        setTitulo(titulo);
        setPrecio(precio);
        setStock(stock);
        setAutores(autores);
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

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    public void mostrarLibro() {
        System.out.println("Libro[titulo=" + getTitulo()
                + ", autor=" + getAutores()[0].getNombre() + ' ' + getAutores()[0].getApellido()
                + ", colaborador=" + getAutores()[1].getNombre() + ' ' + getAutores()[1].getApellido()
                + ", stock=" + getStock()
                + ", precio=" + getPrecio() + "]");
    }

    public void aumentarStock(short cantidad) {
        setStock((short)(getStock() + cantidad));
    }

    public void mensajeComercial() {
        System.out.println("El libro, " + getTitulo()
                + " de " + getAutores()[0].getNombre() + ' ' + getAutores()[0].getApellido()
                + ". Se vende a " + getPrecio() + " pesos.");
    }
}
