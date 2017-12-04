/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;

/**
 *
 * @author USER
 */
@Entity
public class Cidades {
    
    private int cid_id;
    private String cid_nome;

    public int getCid_id() {
        return cid_id;
    }

    public void setCid_id(int cid_id) {
        this.cid_id = cid_id;
    }

    public String getCid_nome() {
        return cid_nome;
    }

    public void setCid_nome(String cid_nome) {
        this.cid_nome = cid_nome;
    }

    public Cidades() {
    }

    public Cidades(int cid_id, String cid_nome) {
        this.cid_id = cid_id;
        this.cid_nome = cid_nome;
    }

    @Override
    public String toString() {
        return "Cidades{" + "cid_id=" + cid_id + ", cid_nome=" + cid_nome + '}';
    }
    
    
    
    
}
