/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import Controle.EstabelecimentosDAO;
import Controle.UsuariosDAO;
import Modelo.Cidades;
import Modelo.Usuarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Josi
 */
public class TesteUSu {
    private static String i;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        Usuarios u = new Usuarios();
        
        u.setUsu_nome("jdsds");
        u.setUsu_password("dsds");
        u.setUsu_email("sddssd");
        u.setUsu_nickname("dssd");
        u.setUsu_username("dds");
        
        
        UsuariosDAO d = new UsuariosDAO();
//        d.$AdicionarUsuarios(u);
       EstabelecimentosDAO es = new EstabelecimentosDAO();
        
        List<Usuarios> cid = d.$RetornarTodosUsuarios();
        
      for(Usuarios e : cid ){
      System.out.println(e.toString());
      }
        
        
    }

   
}
