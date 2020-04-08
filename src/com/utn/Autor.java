package com.utn;

public class Autor {
    private String nombre;
    private String apellido;
    private String email;
    private char genero; // M o F

    public Autor(String nombre, String apellido, String email, char genero) {
        setNombre(nombre);
        setApellido(apellido);
        setEmail(email);
        setGenero(genero);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void mostrarAutor() {
        System.out.println("Autor[nombre=" + getNombre()
                + ", apellido=" + getApellido()
                + ", email=" + getEmail()
                + ", genero='" + getGenero() + "']");
    }
}
