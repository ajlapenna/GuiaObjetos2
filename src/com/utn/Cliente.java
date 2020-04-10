package com.utn;

import java.util.UUID;

public class Cliente {
    private UUID idCliente;
    private String nombre;
    private String email;
    private byte pDescuento;

    public Cliente(String nombre, String email, byte pDescuento) {
        idCliente = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.pDescuento = pDescuento;
    }

    public UUID getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getPDescuento() {
        return pDescuento;
    }

    public void setPDescuento(byte pDescuento) {
        this.pDescuento = pDescuento;
    }

    @Override
    public String toString() {
        return "Cliente[" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", pDescuento=" + pDescuento +
                ']';
    }
}
