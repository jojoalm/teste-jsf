/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author aluno
 */
public class HibernateUtil {

    public static HibernateUtil uniqueHU;
    private static EntityManagerFactory factory;

    public static synchronized EntityManagerFactory getEntityManagerFactory() {
        if (factory == null || !factory.isOpen()) {

            factory = Persistence.createEntityManagerFactory("testeJsfPU");

        }
        return factory;
    }

    public static synchronized HibernateUtil getInstance() {
        if (uniqueHU == null) {
            uniqueHU = new HibernateUtil();
        }
        return uniqueHU;

    }

}
