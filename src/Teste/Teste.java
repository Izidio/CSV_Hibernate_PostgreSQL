/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import hibernate.Hibernate;
import utils.CSV;
import java.io.IOException;
import utils.Salvar;

/**
 *
 * @author Izidio Carvalho
 */
public class Teste {
    public static void main(String[] args) throws IOException {
       Salvar.escrever(Salvar.create_CSV());
       Hibernate.start_db();
       Hibernate.set_db(CSV.file_CSV());
       Hibernate.end_db();
    }
}
