/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.farmaciagi_subsistemagestorinventario;

import BO.GestorInvetario;
import Enums.TipoProductoDTO;
import conversores.ConversorLote;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Lote;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Producto;
import org.itson.disenosoftware.farmaciagi_dtos.LoteDTO;
import org.itson.disenosoftware.farmaciagi_dtos.ProductoDTO;

/**
 *
 * @author Dell
 */
public class FarmaciaGI_SubsistemaGestorInventario {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        
        GestorInvetario gi = new GestorInvetario();
        conversores.ConversorProducto cvp= new conversores.ConversorProducto();
        conversores.ConversorLote cvl = new conversores.ConversorLote();
        
        ProductoDTO p1 = new ProductoDTO("12345", " ", 0.00F);
        ProductoDTO p2 = new ProductoDTO("Paracetamol", "Similares", 5.00F, "0123", TipoProductoDTO.Medicamento);
        
        LoteDTO l = gi.editarLote_Para_Venta(1, p1);
        
        System.out.println(l.toString());
        
//        
//        ProductoDTO pDTO = new ProductoDTO("pasta", "colgate", 115.00F, "123456", TipoProductoDTO.Variado);
//        Producto p = cvp.conversor_DTO_A_Entidad(pDTO);
//        System.out.println(p.toString());
//        ProductoDTO pconvert = cvp.conversor_Entidad_A_DTO(p);
//        System.out.println(pconvert.toString());
//        
//        LoteDTO lDTO = new LoteDTO(Instant.now(), 10, pDTO);
//        Lote l = cvl.convertir_DTO_A_Entidad(lDTO);
//        System.out.println(l.toString());
//        LoteDTO loteConvert = cvl.convertir_Entidad_A_DTO(l);
//        System.out.println(loteConvert.toString());
        
        
//        gi.agregar_Producto_Y_Lote(
//                new ProductoDTO("pasta", "colgate", 115.00F, "0123", TipoProductoDTO.Variado), 
//                new LoteDTO(Instant.now(), 15, null));
    }
}
