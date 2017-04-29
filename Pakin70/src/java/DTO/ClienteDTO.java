/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;
import Dominio.Vehiculo;
/**
 *
 * @author David
 */
public class ClienteDTO {

String nombreCliente;
String tipoCliente;
String tipoDocumento;
String id;
String apartamento;
Vehiculo objVehiculo;    

    public ClienteDTO(String nombreCliente, String tipoCliente, String tipoDocumento, String id, String apartamento, Vehiculo objVehiculo) {
        this.nombreCliente = nombreCliente;
        this.tipoCliente = tipoCliente;
        this.tipoDocumento = tipoDocumento;
        this.id = id;
        this.apartamento = apartamento;
        this.objVehiculo = objVehiculo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getId() {
        return id;
    }

    public String getApartamento() {
        return apartamento;
    }

    public Vehiculo getObjVehiculo() {
        return objVehiculo;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public void setObjVehiculo(Vehiculo objVehiculo) {
        this.objVehiculo = objVehiculo;
    }




}
