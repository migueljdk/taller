/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Daos;

import Beans.Beans_Usuario;
import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Minguel
 */
public class Dao_Usuario {
    

    Conexion cn;
    Connection con;

    private PreparedStatement pst;
    private ResultSet rs;

    Beans_Usuario b_usuario;

    public Dao_Usuario() throws SQLException {
        this.cn = new Conexion();
    }


    public List usuario_s_all_asc_usuario() throws SQLException{
        String sql = "call usuario_s_all_asc_usuario()";
         try{
           con = cn.getConexion();   //lo recibo en un tipo Connection 
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();

            List<Beans_Usuario> lista = new ArrayList<>();

            while (rs.next()) {
                b_usuario = new Beans_Usuario();
                b_usuario.setIdusuario(rs.getInt("idusuario"));
                b_usuario.setUsuario(rs.getString("usuario"));
                b_usuario.setClave(rs.getString("clave"));
                b_usuario.setEliminar_usuario(rs.getInt("eliminar_usuario"));
                lista.add(b_usuario);
                pst.close();
                rs.close();
                con.close();
            }
            return lista;
         } catch (SQLException e) {
            throw e;
        }
    }
    
   public List usuario_s_usuario_clave(String usuario, String clave) throws SQLException {
        String sql = "call usuario_s_usuario_clave(?,?)";
        try {
            con = cn.getConexion();  //lo recibo en un tipo Connection
            pst = con.prepareStatement(sql);
            pst.setString(1, usuario);
            pst.setString(2, clave);
            rs = pst.executeQuery();

            List<Beans_Usuario> lista = new ArrayList<>();

            while (rs.next()) {
                b_usuario = new Beans_Usuario();
                b_usuario.setIdusuario(rs.getInt("idusuario"));
                b_usuario.setUsuario(rs.getString("usuario"));
                b_usuario.setClave(rs.getString("clave"));
                b_usuario.setEliminar_usuario(rs.getInt("eliminar_usuario"));
                lista.add(b_usuario);
            }
            pst.close();
            rs.close();
            con.close();
            return lista;
        } catch (SQLException e) {
            throw e;
        }

    }

}
