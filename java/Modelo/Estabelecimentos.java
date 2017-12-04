/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

/**
 *
 * @author Hipercom
 */
@javax.persistence.Entity
public class Estabelecimentos implements Serializable {

    @Id
    @GeneratedValue
    private int est_id;
    private Integer est_cidades;
    private Integer est_numero;
    private String est_nome, est_desc, est_rua, est_bairro, est_uf;
  

    public Estabelecimentos() {
    }
    


    public Estabelecimentos( int est_cidade, String est_nome, String est_desc, String est_rua, String est_bairro, String est_uf) {
        
        this.est_cidades = est_cidade;
        this.est_nome = est_nome;
        this.est_desc = est_desc;
        this.est_rua = est_rua;
        this.est_bairro = est_bairro;
        this.est_uf = est_uf;
      
        
    }

    public Integer getEst_numero() {
        return est_numero;
    }

    public void setEst_numero(Integer est_numero) {
        this.est_numero = est_numero;
    }
    
    
    public Integer getEst_cidades() {
        return est_cidades;
    }

    public void setEst_cidades(Integer est_cidades) {
        this.est_cidades = est_cidades;
    }
    
   
    @Override
    public String toString() {
        return "Estabelecimentos{" + "est_id=" + est_id + ", est_cidades=" + est_cidades + ", est_nome=" + est_nome + ", est_desc=" + est_desc + ", est_rua=" + est_rua + ", est_bairro=" + est_bairro + ", est_uf=" + est_uf + ", imagem="  + '}';
    }

    

    public String getEst_nome() {
        return est_nome;
    }

    public void setEst_nome(String est_nome) {
        this.est_nome = est_nome;
    }

    public String getEst_desc() {
        return est_desc;
    }

    public void setEst_desc(String est_desc) {
        this.est_desc = est_desc;
    }

    public String getEst_rua() {
        return est_rua;
    }

    public void setEst_rua(String est_rua) {
        this.est_rua = est_rua;
    }

    public String getEst_bairro() {
        return est_bairro;
    }

    public void setEst_bairro(String est_bairro) {
        this.est_bairro = est_bairro;
    }

    public String getEst_uf() {
        return est_uf;
    }

    public void setEst_uf(String est_uf) {
        this.est_uf = est_uf;
    }

   

    public int getEst_id() {
        return est_id;
    }

    public void setEst_id(int est_id) {
        this.est_id = est_id;
    }
}
