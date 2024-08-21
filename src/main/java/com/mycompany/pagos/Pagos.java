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
public class Pagos {
    public static void main(String[] args){
        Pago pagoTarjeta = new PagoTarjeta(){};
        Pago pagoPaypal = new PagoPaypal();
        Pago pagoEfectivo = new PagoEfectivo();
         ProcesadorDePagos procesador = new ProcesadorDePagos(pagoTarjeta);
        procesador.procesar(100.0);

        procesador = new ProcesadorDePagos(pagoPaypal);
        procesador.procesar(200.0);

        procesador = new ProcesadorDePagos(pagoEfectivo);
        procesador.procesar(50.0);
    }
}
