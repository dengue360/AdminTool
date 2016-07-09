/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl;

import io.github.dengue360.etl.dao.DAO;
import io.github.dengue360.etl.dao.DAOFactory;
import io.github.dengue360.etl.entities.CaseD;
import io.github.dengue360.etl.entities.CasePK;
import io.github.dengue360.etl.entities.DataSINAN;
import io.github.dengue360.etl.entities.Location;
import io.github.dengue360.etl.entities.Person;
import io.github.dengue360.etl.entities.TimeD;
import io.github.dengue360.etl.extract.SINANReader;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class LoaderTest {
    public static void main(String[] args) {
//        SINANReader r = new SINANReader();
//        try {
//            List<DataSINAN> list =  r.process("C:/Users/Rafael/Desktop/Rafael/TCC/DENGON436247_00.dbf");
//            
//            for (DataSINAN d : list) {
//                System.out.println(d.getLogradouro() + " - " + d.getClassificacao());
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(LoaderTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
        Location l = new Location("1", 12, "centro", null, "Urbana", "Cajazeiras" , "Paraíba", "PB", "58900000",
                "12345", "12345");
        Person p = new Person("12 anos", "Masculino", null, new Date());
        
        TimeD t = new TimeD("Segunda", "Janeiro","201602", 2016, new Date(), new Date(), null);
        
        DAO dao = DAOFactory.createObjectDao();
        
        dao.salvar(l);
        dao.salvar(p);
        dao.salvar(t);
               
        CasePK cpk = new CasePK(p.getId(), l.getId(), t.getId());
        CaseD c = new CaseD(cpk, Boolean.TRUE, Boolean.FALSE);
        
        dao.salvar(c);
    }
}
