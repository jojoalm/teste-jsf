/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Hipercom
 */


@javax.persistence.Entity

public class Promocoes implements Serializable {

    @Id
    @GeneratedValue
    private int promo_id;
    private String promo_nome;
    private String promo_descricao;
    @Lob
    @Column(name = "promo_logo")
    private byte[] promo_imagem;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date promo_dataini;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date promo_datafim;
    
    @ManyToMany
    private Set<Dias> dias = new HashSet<Dias>();

    public Promocoes() {
    }

    public Promocoes(int promo_id, String promo_nome, String promo_descricao, byte[] promo_imagem, Date promo_dataini, Date promo_datafim) {
        this.promo_id = promo_id;
        this.promo_nome = promo_nome;
        this.promo_descricao = promo_descricao;
        this.promo_imagem = promo_imagem;
        this.promo_dataini = promo_dataini;
        this.promo_datafim = promo_datafim;

    }

    public Set<Dias> getDias() {
        return dias;
    }

    public void setDias(Set<Dias> dias) {
        this.dias = dias;
    }
    
    

    public int getId() {
        return promo_id;
    }

    public String getPromo_nome() {
        return promo_nome;
    }

    public String getPromo_descricao() {
        return promo_descricao;
    }

    public byte[] getPromo_imagem() {
        return promo_imagem;
    }

    public Date getPromo_dataini() {
        return promo_dataini;
    }

    public Date getPromo_datafim() {
        return promo_datafim;
    }

    public int getPromo_id() {
        return promo_id;
    }

    public void setPromo_id(int promo_id) {
        this.promo_id = promo_id;
    }

    public void setPromo_nome(String promo_nome) {
        this.promo_nome = promo_nome;
    }

    public void setPromo_descricao(String promo_descricao) {
        this.promo_descricao = promo_descricao;
    }

    public void setPromo_imagem(byte[] promo_imagem) {
        this.promo_imagem = promo_imagem;
    }

    public void setPromo_dataini(Date promo_dataini) {
        this.promo_dataini = promo_dataini;
    }

    public void setPromo_datafim(Date promo_datafim) {
        this.promo_datafim = promo_datafim;
    }
}
