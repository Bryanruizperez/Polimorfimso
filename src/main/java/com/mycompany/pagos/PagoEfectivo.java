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
public class PagoEfectivo implements Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago en efectivo por: Q" + monto);
    }
    
}
