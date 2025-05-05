/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factoryobject;

import factory.AbstractDAOFactory;
import factory.DAOFactory;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;

/**
 *
 * @author jl4ma
 */
public class FactoryObject {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        IConexion conexion = new Conexion();
        factory.AbstractDAOFactory fabrica = new DAOFactory(conexion);
        
        Usuario usuario = fabrica.getUsuarioDAO().findByCodigo(1234);
        
        System.out.println(usuario.getNombre() + " " + usuario.getCodigo());
    }
    
}
