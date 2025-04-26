/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import com.mycompany.factoryobject.FactoryObject;
import conversores.ConversorProducto;
import facade.Facade;
import facade.IFacade;
import interfaces.IGestorInventario;
import java.util.List;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;

/**
 *
 * @author Dell
 */
public class GestorInvetario implements IGestorInventario{
    private ConversorProducto conversorProducto;
    private IFacade facade;
    
    public GestorInvetario() {
        this.conversorProducto = new ConversorProducto();
        this.facade = new Facade();
    }
    
    public List<ProductoDTO> buscar_Productos(){
        facade.
    }
    
    
}
