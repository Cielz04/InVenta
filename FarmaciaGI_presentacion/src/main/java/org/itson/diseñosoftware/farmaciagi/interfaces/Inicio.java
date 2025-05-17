/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.diseñosoftware.farmaciagi.interfaces;

import BO.GestorInvetario;
import BO.GestorUsuario;
import BO.IGestorUsuario;
import interfaces.IGestorInventario;
import org.itson.disenosoftware.farmaciagi_dtos.UsuarioDTO;

/**
 *
 * @author jl4ma
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Asegúrate de crear o recuperar un usuario válido
        UsuarioDTO usuario = null; // reemplaza esto según tu lógica real
        IGestorInventario inv = new GestorInvetario();
        inv.inserciones();
        IGestorUsuario subsistema = new GestorUsuario();
        subsistema.InsercionMasivaUsuarios();
        // Crear el diálogo y mostrarlo
        DlgRegistroAsistencia dlg = new DlgRegistroAsistencia(null, true, usuario);
        dlg.setVisible(true);        
    
    }
    }


