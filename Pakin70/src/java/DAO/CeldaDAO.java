/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DTO.CeldaDTO;
import Dominio.Celda;
/**
 *
 * @author David
 */
public class CeldaDAO {
    
    public CeldaDTO buscarCelda(String numeroCelda){
        CeldaDTO celdita = Celda.consultarCelda(numeroCelda);
        return celdita;
    }

    public static void registrarCelda(String tipoCelda, String numeroCelda,String estadoCelda,String idUsuario,String placaVehivulo){
    }
    
    public void actualizarCelda(CeldaDTO dto){
    }
    public void eliminarCelda(CeldaDTO dto){
      
    }
}
