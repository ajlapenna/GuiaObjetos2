package com.utn;

import java.time.LocalDate;
import java.util.UUID;

public class Factura {
    private UUID idFactura;
    private float monto;
    private LocalDate fechaFactura;
    private Cliente cliente;
    private ItemVenta[] items;

    public Factura(Cliente cliente, float monto, ItemVenta[] items) {
        idFactura = UUID.randomUUID();
        fechaFactura = LocalDate.now();
        this.monto = monto;
        this.cliente = cliente;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public UUID getIdFactura() {
        return idFactura;
    }

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    public float calcularDescuento() {
        return monto*(1 - getCliente().getPDescuento()/100F);
    }

    @Override
    public String toString() {
        return "Factura[" +
                "idFactura=" + idFactura +
                ", monto=" + monto +
                ", montoDesc=" + calcularDescuento() +
                ", fechaFactura=" + fechaFactura +
                ", cliente=" + cliente.toString() +
                ']';
    }
}
