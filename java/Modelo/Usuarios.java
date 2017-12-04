/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Hipercom
 */
@javax.persistence.Entity
public class Usuarios implements Serializable {

    @Id
    @GeneratedValue
    private int usu_id;
    private String usu_nome;
    private String usu_email;
    private String usu_username;
    private String usu_password;
    private String usu_nickname;

    public int getUsu_id() {
        return usu_id;
    }

    public void setUsu_id(int usu_id) {
        this.usu_id = usu_id;
    }

    public String getUsu_nome() {
        return usu_nome;
    }

    public void setUsu_nome(String usu_nome) {
        this.usu_nome = usu_nome;
    }

    public String getUsu_email() {
        return usu_email;
    }

    public void setUsu_email(String usu_email) {
        this.usu_email = usu_email;
    }

    public String getUsu_username() {
        return usu_username;
    }

    public void setUsu_username(String usu_username) {
        this.usu_username = usu_username;
    }

    public String getUsu_password() {
        return usu_password;
    }

    public void setUsu_password(String usu_password) {
        this.usu_password = usu_password;
    }

    public String getUsu_nickname() {
        return usu_nickname;
    }

    public void setUsu_nickname(String usu_nickname) {
        this.usu_nickname = usu_nickname;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usu_id=" + usu_id + ", usu_nome=" + usu_nome + ", usu_email=" + usu_email + ", usu_username=" + usu_username + ", usu_password=" + usu_password + ", usu_nickname=" + usu_nickname + '}';
    }

    
}
