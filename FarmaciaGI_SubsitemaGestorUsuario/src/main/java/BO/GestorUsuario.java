/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import conversores.ConversorUsuario;
import facade.Facade;
import facade.IFacade;
import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;
import org.itson.disenosoftware.farmaciagi_dtos.UsuarioDTO;

/**
 *
 * @author Enrique Rodriguez
 */
public class GestorUsuario implements IGestorUsuario{
    IFacade facade;
    ConversorUsuario cu;

    public GestorUsuario() {
        this.facade = new Facade();
        this.cu = new ConversorUsuario();
    }
    
    
    
    @Override
    public UsuarioDTO buscarUsuario_id(UsuarioDTO usuarioDTO){
        Usuario usuario = new Usuario(usuarioDTO.getId());
        Usuario usuarioBuscado = facade.buscarUsuario_ID(usuario);
        UsuarioDTO usuarioBuscadoDTO = cu.conversor_Entidad_A_DTO(usuarioBuscado);
        return usuarioBuscadoDTO;
    }
    
    public UsuarioDTO buscarUsuario_Codigo(UsuarioDTO usuarioDTO){
        Usuario usuario = new Usuario(0, usuarioDTO.getCodigo());
        Usuario usuarioBuscado = facade.buscarUsuario_Codigo(usuario);
        UsuarioDTO usuarioConvert = cu.conversor_Entidad_A_DTO(usuarioBuscado);
        return usuarioConvert;
        
    }
    
}
