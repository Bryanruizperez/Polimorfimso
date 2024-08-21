/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pagos;

/**
 *
 * @author Leonidas Ruiz Perez
 */
public class ProcesadorDePagos {
    private final Pago metodoPago;

    public ProcesadorDePagos(Pago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void procesar(double monto) {
        metodoPago.procesarPago(monto);
    }
    
}
