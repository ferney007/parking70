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
public class VehiculoDTO {
    
    String tipoVehiculo;
    String placa;

    public VehiculoDTO(String tipoVehiculo, String placa) {
        this.tipoVehiculo = tipoVehiculo;
        this.placa = placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    


}
