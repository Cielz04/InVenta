/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.AsistenciaDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IComprasDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IDetalleDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IEntradaDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.ILoteDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IProductosDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IPromocionesDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IProveedoresDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IUsuarioDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IVentasDAO;

/**
 *
 * @author jl4ma
 */
public abstract class AbstractDAOFactory {
    
    public abstract IComprasDAO getComprasDAO();
    public abstract IDetalleDAO getDetalleDAO();
    public abstract IEntradaDAO getEntradaDAO();
    public abstract ILoteDAO getLoteAO();
    public abstract IProductosDAO getProductosDAO();
    public abstract IPromocionesDAO getPromocionesDAO();
    public abstract IProveedoresDAO getProovedoresDAO();
    public abstract IUsuarioDAO getUsuarioDAO();
    public abstract IVentasDAO getVentasDAO();

    public AsistenciaDAO getAsistenciaDAO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
