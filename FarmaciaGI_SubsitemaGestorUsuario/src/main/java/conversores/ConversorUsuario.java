/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversores;

import org.itson.diseniosofware.mifarmaciagi.persistencia.entidades.Usuario;
import org.itson.disenosoftware.farmaciagi_dtos.UsuarioDTO;

/**
 *
 * @author Dell
 */
public class ConversorUsuario {
    
    public Usuario conversor_DTO_A_Entidad(UsuarioDTO usuarioDTO){
        if(usuarioDTO == null){
            System.out.println("El usuarioDTO esta nulo en ConversorUsuario");
            return null;
        }
        
        Usuario usuario = new Usuario(
                usuarioDTO.getId(),
                usuarioDTO.getNombre(), 
                usuarioDTO.getCodigo(), 
                usuarioDTO.getTipo(), 
                usuarioDTO.getDireccion(), 
                usuarioDTO.getTelefono());
        
        return usuario;
    }
    
    public UsuarioDTO conversor_Entidad_A_DTO(Usuario usuario){
        if(usuario == null){
            System.out.println("El usuario esta nulo en ConversorUsuario");
            return null;
        }
        
        UsuarioDTO usuarioDTO = new UsuarioDTO(
                usuario.getId(),
                usuario.getNombre(), 
                usuario.getCodigo(), 
                usuario.getTipo(), 
                usuario.getDireccion(), 
                usuario.getTelefono());
        
        return usuarioDTO;
    }
    
    
}
