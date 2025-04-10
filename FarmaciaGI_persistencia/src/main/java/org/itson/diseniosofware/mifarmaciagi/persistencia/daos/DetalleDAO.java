/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.diseniosofware.mifarmaciagi.persistencia.daos;

import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;

/**
 *
 * @author jl4ma
 */
public class DetalleDAO implements IDetalleDAO{
    
    private IConexion conexion;

    public DetalleDAO(IConexion conexion) {
        this.conexion = conexion;
    }
    
}
