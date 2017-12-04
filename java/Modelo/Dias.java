/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Id;

/**
 *
 * @author Hipercom
 */
@javax.persistence.Entity
public class Dias implements Serializable {

    @Id
    Integer Dias_id;
    String Dias_nome;

    public String getDias_nome() {
        return Dias_nome;
    }

    public void setDias_nome(String Dias_nome) {
        this.Dias_nome = Dias_nome;
    }

    public Integer getDias_id() {
        return Dias_id;
    }

    public void setDias_id(Integer Dias_id) {
        this.Dias_id = Dias_id;
    }

    public Dias() {
    }

    public Dias(Integer Dias_id, String Dias_nome) {
        this.Dias_id = Dias_id;
        this.Dias_nome = Dias_nome;
    }
    
}
