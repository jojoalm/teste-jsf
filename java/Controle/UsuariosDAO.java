/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Usuarios;
import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Hipercom
 */
@javax.faces.bean.ManagedBean //gera bean
@RequestScoped
public class UsuariosDAO {

    
    EntityManager em = HibernateUtil.getEntityManagerFactory().createEntityManager();

    Usuarios p = new Usuarios();
     List<Usuarios> lista;
    

    public Usuarios getP() {
        return p;
    }

    public void setP(Usuarios p) {
        this.p = p;
    }
    
    
    
    public String $AdicionarUsuarios() {
        this.em.getTransaction().begin();
        this.em.persist(p);
        this.em.getTransaction().commit();
        this.em.close();
       
        String s = "Inserir";
        return s;
                

        
    }

    public String $ExcluirUsuario() {
       
        this.em.getTransaction().begin();
        this.em.remove(p);
        this.em.getTransaction().commit();
        this.em.close();
        
        String s = "Remover";
        return s;
    }

    public Usuarios $RetornarUsuarios(int id) {
        this.em.getTransaction().begin();
        Usuarios usu1 = this.em.find(Usuarios.class, id);
        this.em.getTransaction().commit();
        this.em.close();
        return usu1;
    }

    public void $EditarUsuarios(Usuarios usu_new) {
        this.em.getTransaction().begin();
        this.em.merge(usu_new);
        this.em.getTransaction().commit();
        this.em.close();
    }

    public List<Usuarios> $RetornarTodosUsuarios() {
           
         Query query = em.createQuery("select p from Usuarios p");
        lista = (List<Usuarios>) query.getResultList();
        
        return lista;
    }
    
    
     public List getUsuarios() {
        return $RetornarTodosUsuarios();
    }
    
    
}
