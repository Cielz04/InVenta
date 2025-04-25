/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import factory.AbstractDAOFactory;
import factory.DAOFactory;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;

/**
 *
 * @author jl4ma
 */
public class Facade implements IFacade{
    
    private IConexion conexion;
    private AbstractDAOFactory fabrica;
    
    public Facade() {
        conexion = new Conexion();
        fabrica = new DAOFactory(conexion);
    }
    
    
}
