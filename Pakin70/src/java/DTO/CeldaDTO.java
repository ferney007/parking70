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
public class CeldaDTO {
    
String tipoCelda;
String numeroCelda;
String estadoCelda;
String idUsuario;
String placaVehivulo;

    public CeldaDTO(String tipoCelda, String numeroCelda, String estadoCelda, String idUsuario, String placaVehivulo) {
        this.tipoCelda = tipoCelda;
        this.numeroCelda = numeroCelda;
        this.estadoCelda = estadoCelda;
        this.idUsuario = idUsuario;
        this.placaVehivulo = placaVehivulo;
    }

    public void setTipoCelda(String tipoCelda) {
        this.tipoCelda = tipoCelda;
    }

    public void setNumeroCelda(String numeroCelda) {
        this.numeroCelda = numeroCelda;
    }

    public void setEstadoCelda(String estadoCelda) {
        this.estadoCelda = estadoCelda;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setPlacaVehivulo(String placaVehivulo) {
        this.placaVehivulo = placaVehivulo;
    }

    public String getTipoCelda() {
        return tipoCelda;
    }

    public String getNumeroCelda() {
        return numeroCelda;
    }

    public String getEstadoCelda() {
        return estadoCelda;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getPlacaVehivulo() {
        return placaVehivulo;
    }




}
