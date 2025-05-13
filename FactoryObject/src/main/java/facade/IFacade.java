/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package facade;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Asistencia;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.DetalleVenta;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Lote;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Venta;

/**
 *
 * @author jl4ma
 */
public interface IFacade {

    //Métodos para el subsitema de Gestor Inventario
    public Producto buscarProducto_Codigo(Producto producto) throws Exception;

    public Map<Producto, List<Lote>> buscar_Productos_Y_Lotes() throws Exception;

    public Map<Producto, List<Lote>> buscar_Un_Producto_Y_Lotes(Producto producto) throws Exception;

    public Lote buscar_Ultimo_Lote_De_Producto(Producto producto) throws Exception;

    public Producto agregarProducto(Producto producto);

    public Producto editarProducto(Producto productoViejo, Producto productoNuevo);

    public Lote agregarLote(Lote lote);

    public Lote editarLote_Para_Venta(Integer cantidad, Producto producto) throws Exception;

    //Métodos para el subsistema de Gestor Venta
    public Venta agregarVenta(Venta venta);

    public Venta buscarVentaPorId(Integer id);

    public List<Venta> buscarTodasLasVentas();

    public List<Venta> buscarVentasPorUsuario(Usuario usuario);

    public void eliminarVenta(Integer id);

    public List<DetalleVenta> agregarDetlleVenta(DetalleVenta detalleVenta);

    //Usuario
    public Usuario buscarUsuario_ID(Usuario usuario);

    public Usuario buscarUsuario_Codigo(Usuario usuario);
    
    public void registrarEntrada(Usuario usuario);

    public void registrarSalida(Usuario usuario);

    public Asistencia buscarAsistenciaHoy(Usuario usuario);

    public List<Asistencia> buscarAsistenciasPorFecha(LocalDate fecha);

    public List<Usuario> obtenerTodosLosUsuarios();
    
    public void insercionUsuarios();

}
