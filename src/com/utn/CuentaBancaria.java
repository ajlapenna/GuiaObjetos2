package com.utn;

import java.util.UUID;

public class CuentaBancaria {
    private UUID id;
    private Cliente duenio;
    private float balance;

    public CuentaBancaria(Cliente duenio, float balance) {
        id = UUID.randomUUID();
        this.duenio = duenio;
        this.balance = balance;
    }

    private UUID getId() {
        return id;
    }

    public float getBalance() {
        return balance;
    }

    private void setBalance(float balance) {
        this.balance = balance;
    }

    public float credito(float dineroADepositar) {
        setBalance(getBalance() + dineroADepositar);
        return balance;
    }

    public float debito(float dineroARetirar) {
        try {
            if (getBalance() - dineroARetirar >= -2000)
                setBalance(getBalance() - dineroARetirar);
            else
                throw new Exception("Fondos insuficientes.");
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return balance;
    }

    @Override
    public String toString() {
        return "CuentaBancaria[" +
                "id=" + id +
                ", dueño=" + duenio.getNombre() +
                ", balance=" + balance +
                ']';
    }
}
