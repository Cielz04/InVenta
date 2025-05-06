/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factoryobject;

import Enums.TipoProducto;
import facade.Facade;
import factory.AbstractDAOFactory;
import factory.DAOFactory;
import java.util.List;
import java.util.Map;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Lote;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;

/**
 *
 * @author jl4ma
 */
public class FactoryObject {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        
        Facade facade = new Facade();
        IConexion conexion = new Conexion();
        factory.AbstractDAOFactory factory = new DAOFactory(conexion);
        Producto pro = new Producto("12345");
        
//        Lote l = facade.editarLote_Para_Venta(2, pro);
        
//        Producto p = new Producto(" ", 0.00F, "0123");
//        Map<Producto, List<Lote>> busca = facade.buscar_Un_Producto_Y_Lotes(p);
//        Producto p2 = new Producto("caca", "ck", 15.00F, "01234", TipoProducto.Variado);
//        
//        Producto update = facade.editarProducto(p, p2);
//        System.out.println(l.toString());
        
    }
    
}
