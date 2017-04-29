/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DTO.VehiculoDTO;
import Dominio.Vehiculo;
/**
 *
 * @author David
 */
public class VehiculoDAO {
    
    public VehiculoDTO buscarVehiculo(String placa){
        VehiculoDTO vehiculo = Vehiculo.consultarVehiculo(placa);
        return vehiculo;
    }
    public void actualizarVehiculo(VehiculoDTO dto){
        
    }
    public void eliminarVehiculo(VehiculoDTO dto){}
    
    
}
