/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import factory.AbstractDAOFactory;
import factory.DAOFactory;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.Conexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.Conexion.IConexion;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.AsistenciaDAO;
import org.itson.diseniosofware.mifarmaciagi.persistencia.daos.ProductosDAO;
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
public class Facade implements IFacade {

    private IConexion conexion;
    private AbstractDAOFactory fabrica;

    public Facade() {
        conexion = new Conexion();
        fabrica = new DAOFactory(conexion);
    }

    //Métodos para subsistema Gestor Inventario
    public List<Producto> buscarProductos() throws Exception {

        try {
            List<Producto> lista = fabrica.getProductosDAO().findAll();
            if (lista.isEmpty()) {
                throw new Exception("La lista esta vacia");
            }
            return lista;
        } catch (Exception e) {
            System.out.println(e);
            throw new Exception(e);
        }
    }

    @Override
    public Producto buscarProducto_Codigo(Producto producto) throws Exception {

        try {
            Producto productoBuscado = fabrica.getProductosDAO().findByCodigo(producto.getCodigo());
            if (productoBuscado == null) {
                throw new Exception("El producto esta vacio");
            }
            return productoBuscado;
        } catch (Exception e) {
            System.out.println(e);
            throw new Exception(e);
        }
    }

    public List<Lote> buscar_Todos_Lotes_de_Producto(Producto producto) throws Exception {
        Producto productoBuscado = this.buscarProducto_Codigo(producto);

        List<Lote> lotes = fabrica.getLoteAO().findByProductoId(productoBuscado.getId());

        return lotes;
    }

    public List<Lote> buscar_Lotes_NoVacios_de_Producto(Producto producto) throws Exception {
        Producto productoBuscado = this.buscarProducto_Codigo(producto);

        List<Lote> lotes = fabrica.getLoteAO().findByProductoId_Plus_0(productoBuscado.getId());

        return lotes;
    }

    @Override
    public Lote agregarLote(Lote lote) {
        Lote loteCopia = lote;
        Producto productoBuscado = fabrica.getProductosDAO().findByCodigo(lote.getProducto().getCodigo());
        loteCopia.setProducto(productoBuscado);

        fabrica.getLoteAO().save(loteCopia);
        Lote loteBuscado = fabrica.getLoteAO().findByProductoId_Last(loteCopia.getProducto().getId());

        return loteBuscado;
    }

    @Override
    public Producto agregarProducto(Producto producto) {
        fabrica.getProductosDAO().save(producto);
        Producto productoBuscado = fabrica.getProductosDAO().findByCodigo(producto.getCodigo());

        return productoBuscado;
    }

    public Producto editarProducto(Producto productoViejo, Producto productoNuevo) {
        Producto productoBuscado = fabrica.getProductosDAO().findByCodigo(productoViejo.getCodigo());
        productoBuscado.setCodigo(productoNuevo.getCodigo());
        productoBuscado.setMarca(productoNuevo.getMarca());
        productoBuscado.setNombre(productoNuevo.getNombre());
        productoBuscado.setPrecio(productoNuevo.getPrecio());
        productoBuscado.setTipo(productoNuevo.getTipo());

        fabrica.getProductosDAO().update(productoBuscado);
        Producto productoActualizado = fabrica.getProductosDAO().findByCodigo(productoBuscado.getCodigo());

        return productoActualizado;
    }

    @Override
    public Map<Producto, List<Lote>> buscar_Productos_Y_Lotes() throws Exception {
        List<Producto> productos = this.buscarProductos();

        Map<Producto, List<Lote>> resultado = new HashMap<>();

        for (Producto producto : productos) {
            List<Lote> lotesDelProducto = this.buscar_Lotes_NoVacios_de_Producto(producto);

            if (lotesDelProducto != null || !lotesDelProducto.isEmpty()) {
                resultado.put(producto, lotesDelProducto);
            }

        }
        return resultado;
    }

    @Override
    public Map<Producto, List<Lote>> buscar_Un_Producto_Y_Lotes(Producto producto) throws Exception {
        Producto productoBuscado = this.buscarProducto_Codigo(producto);

        Map<Producto, List<Lote>> resultado = new HashMap<>();

        List<Lote> lotesDelProducto = this.buscar_Lotes_NoVacios_de_Producto(productoBuscado);

        if (lotesDelProducto != null || !lotesDelProducto.isEmpty()) {
            resultado.put(productoBuscado, lotesDelProducto);
        }

        return resultado;
    }

    @Override
    public Lote buscar_Ultimo_Lote_De_Producto(Producto producto) throws Exception {
        Producto productoBuscado = this.buscarProducto_Codigo(producto);

        Lote loteUltimo = fabrica.getLoteAO().findByProductoId_Last(productoBuscado.getId());

        return loteUltimo;
    }

    @Override
    public Lote editarLote_Para_Venta(Integer cantidad, Producto producto) throws Exception {
        Integer cantidadVenta = cantidad;
        Integer cantidadTotalDeProducto = 0;

        Map<Producto, List<Lote>> lotes = this.buscar_Un_Producto_Y_Lotes(producto);
        Producto p = this.buscarProducto_Codigo(producto);

        List<Lote> todos = lotes.get(p);

        for (Lote todo : todos) {
            cantidadTotalDeProducto += todo.getCantidad();
        }

        do {
            Lote lote = this.buscar_Ultimo_Lote_De_Producto(producto);
            Integer cantidadDeLote = 0;
            if (lote != null) {
                cantidadDeLote = lote.getCantidad();
            }

            if (cantidadVenta > cantidadTotalDeProducto || todos.isEmpty() || cantidadDeLote == 0) {
                System.out.println("No hay suficiente Stock. Disponible: " + cantidadTotalDeProducto);
                JOptionPane.showMessageDialog(null, "No hay suficiente Stock.\nSolo disponible: " + cantidadTotalDeProducto);
                return null;
            } else if (cantidadVenta > cantidadDeLote) {
                cantidadVenta -= cantidadDeLote;
                System.out.println("Canridad de venta" + cantidadVenta);
                cantidadDeLote = 0;
                lote.setCantidad(cantidadDeLote);
                fabrica.getLoteAO().update(lote);
            } else {
                cantidadDeLote -= cantidadVenta;
                System.out.println("Cantidad de lote" + cantidadDeLote);
                cantidadVenta = 0;
                lote.setCantidad(cantidadDeLote);
                fabrica.getLoteAO().update(lote);
            }

        } while (cantidadVenta != 0);
        return this.buscar_Ultimo_Lote_De_Producto(producto);
    }

    // Métodos para Subsistema Gestor Venta
    @Override
    public Venta agregarVenta(Venta venta) {
        try {
            fabrica.getVentasDAO().save(venta);
            return venta;
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException("Error al agregar venta: " + e.getMessage());
        }
    }

    @Override
    public Venta buscarVentaPorId(Integer id) {
        try {
            Venta venta = fabrica.getVentasDAO().findById(id);
            if (venta == null) {
                throw new RuntimeException("Venta no encontrada con ID: " + id);
            }
            return venta;
        } catch (RuntimeException e) {
            System.out.println(e);
            throw new RuntimeException("Error al buscar venta: " + e.getMessage());
        }
    }

    @Override
    public List<Venta> buscarTodasLasVentas() {
        try {
            List<Venta> ventas = fabrica.getVentasDAO().findAll();
            if (ventas.isEmpty()) {
                throw new RuntimeException("No se encontraron ventas registradas");
            }
            return ventas;
        } catch (RuntimeException e) {
            System.out.println(e);
            throw new RuntimeException("Error al buscar ventas: " + e.getMessage());
        }
    }

    @Override
    public List<Venta> buscarVentasPorUsuario(Usuario usuario) {
        try {
            List<Venta> ventas = fabrica.getVentasDAO().findByUsuario(usuario);
            if (ventas.isEmpty()) {
                throw new RuntimeException("No se encontraron ventas para el usuario ID: " + usuario.getId());
            }
            return ventas;
        } catch (RuntimeException e) {
            System.out.println(e);
            throw new RuntimeException("Error al buscar ventas por usuario: " + e.getMessage());
        }
    }

    @Override
    public void eliminarVenta(Integer id) {
        try {
            fabrica.getVentasDAO().delete(id);
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException("Error al eliminar venta: " + e.getMessage());
        }
    }

    @Override
    public List<DetalleVenta> agregarDetlleVenta(DetalleVenta detalleVenta) {
        Venta venta = fabrica.getVentasDAO().findById(detalleVenta.getVenta().getId());
        Producto producto = fabrica.getProductosDAO().findByCodigo(detalleVenta.getProductos().getCodigo());
        Usuario usuario = fabrica.getUsuarioDAO().findById(venta.getUsuarioEnTurno().getId());
        venta.setUsuarioEnTurno(usuario);
        DetalleVenta dvN = detalleVenta;
        dvN.setVenta(venta);
        dvN.setProductos(producto);
        fabrica.getDetalleDAO().save(dvN);
        List<DetalleVenta> dv = fabrica.getDetalleDAO().findByVenta(detalleVenta.getVenta().getId());
        return dv;
    }

    //Usuarios
    @Override
    public Usuario buscarUsuario_ID(Usuario usuario) {
        Usuario usuarioBuscado = fabrica.getUsuarioDAO().findById(usuario.getId());
        return usuarioBuscado;
    }

    @Override
    public Usuario buscarUsuario_Codigo(Usuario usuario) {
        Usuario usuarioBuscado = fabrica.getUsuarioDAO().findByCodigo(usuario.getCodigo());
        return usuarioBuscado;
    }

    @Override
    public void registrarEntrada(Usuario usuario) {
        try {
            AsistenciaDAO asistenciaDAO = fabrica.getAsistenciaDAO();
            Asistencia asistenciaHoy = asistenciaDAO.buscarAsistenciaHoy(usuario);

            if (asistenciaHoy == null) {
                Asistencia nueva = new Asistencia();
                nueva.setUsuario(usuario);
                nueva.setFecha(LocalDate.now());
                nueva.setHoraEntrada(LocalTime.now());
                asistenciaDAO.save(nueva);
            }
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException("Error al registrar entrada: " + e.getMessage());
        }
    }

    /**
     * Registra la hora de salida del usuario si ya existe asistencia de hoy.
     * @param usuario
     */
    @Override
    public void registrarSalida(Usuario usuario) {
        try {
            AsistenciaDAO asistenciaDAO = fabrica.getAsistenciaDAO();
            Asistencia asistenciaHoy = asistenciaDAO.buscarAsistenciaHoy(usuario);

            if (asistenciaHoy != null && asistenciaHoy.getHoraSalida() == null) {
                asistenciaHoy.setHoraSalida(LocalTime.now());
                asistenciaDAO.update(asistenciaHoy);
            }
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException("Error al registrar salida: " + e.getMessage());
        }
    }

    /**
     * Busca la asistencia de hoy para un usuario.
     * @param usuario
     * @return 
     */
    @Override
    public Asistencia buscarAsistenciaHoy(Usuario usuario) {
        try {
            return fabrica.getAsistenciaDAO().buscarAsistenciaHoy(usuario);
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException("Error al buscar asistencia de hoy: " + e.getMessage());
        }
    }

    /**
     * Busca todas las asistencias registradas en una fecha específica.
     * @param fecha
     * @return 
     */
    @Override
    public List<Asistencia> buscarAsistenciasPorFecha(LocalDate fecha) {
        try {
            return fabrica.getAsistenciaDAO().buscarPorFecha(fecha);
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException("Error al buscar asistencias por fecha: " + e.getMessage());
        }
    }

}
