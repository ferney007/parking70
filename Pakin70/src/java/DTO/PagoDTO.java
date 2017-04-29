/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author David
 */
public class PagoDTO {
  String tipoPago;
  double valor;
  String numeroDePago;  

    public PagoDTO(String tipoPago, double valor, String numeroDePago) {
        this.tipoPago = tipoPago;
        this.valor = valor;
        this.numeroDePago = numeroDePago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public double getValor() {
        return valor;
    }

    public String getNumeroDePago() {
        return numeroDePago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setNumeroDePago(String numeroDePago) {
        this.numeroDePago = numeroDePago;
    }




}
