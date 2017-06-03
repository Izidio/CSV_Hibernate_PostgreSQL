/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Izidio
 */
public class Hibernate {

    static SessionFactory factory = new Configuration().configure().buildSessionFactory();
    static Session session;

    public static void main(String[] args) {
        start_db();
        session.flush();
        end_db();
    }

    public static void start_db() {
        session = factory.openSession();
        session.beginTransaction();
        System.out.println("Sessão Iniciada");
    }

    public static void end_db() {
        session.getTransaction().commit();
        session.close();
        factory.close();
        System.out.println("Sessão Finalizada");
    }

    public static void set_db(List lista) {
        System.out.println("Carregando...");
        int quantidade = 0;
        for (int i = 0; i < lista.size(); i++) {
            session.flush();
            session.save(lista.get(i));
            if (i == quantidade) {
                System.out.println("carregados -> "+quantidade);
                quantidade += 1000;
            }
        }
        System.out.println("Todos os " + lista.size() + " dados foram inseridos!");

    }

}
