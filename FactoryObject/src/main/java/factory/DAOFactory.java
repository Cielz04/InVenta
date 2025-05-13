/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.AsistenciaDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.ComprasDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.DetalleDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.EntradaDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IAsistenciaDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IComprasDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IDetalleDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IEntradaDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.ILoteDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IProductosDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IPromocionesDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IProveedoresDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IUsuarioDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.IVentasDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.LoteDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.ProductosDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.PromocionesDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.ProveedoresDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.UsuarioDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.VentasDAO;

/**
 *
 * @author jl4ma
 */
public class DAOFactory extends AbstractDAOFactory{

    private IConexion conexion;
    
    public DAOFactory(IConexion conexion) {
        this.conexion = conexion;
    }
    @Override
    public IComprasDAO getComprasDAO() {
        return new ComprasDAO(conexion);
    }

    @Override
    public IDetalleDAO getDetalleDAO() {
        return new DetalleDAO(conexion);
    }

    @Override
    public IEntradaDAO getEntradaDAO() {
        return new EntradaDAO(conexion);
    }

    @Override
    public ILoteDAO getLoteAO() {
        return new LoteDAO(conexion);
    }

    @Override
    public IProductosDAO getProductosDAO() {
        return new ProductosDAO(conexion);
    }

    @Override
    public IPromocionesDAO getPromocionesDAO() {
        return new PromocionesDAO(conexion);
    }

    @Override
    public IProveedoresDAO getProovedoresDAO() {
        return new ProveedoresDAO(conexion);
    }
    @Override
    public IUsuarioDAO getUsuarioDAO() {
        return new UsuarioDAO(conexion);
    }

    @Override
    public IVentasDAO getVentasDAO() {
        return new VentasDAO(conexion);
    }

    @Override
    public IAsistenciaDAO getAsistenciaDAO() {
        return new AsistenciaDAO(conexion);
    }
    
}
