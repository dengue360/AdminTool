/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.load;

import io.github.dengue360.etl.entities.CaseD;
import io.github.dengue360.etl.entities.Location;
import io.github.dengue360.etl.entities.Person;
import io.github.dengue360.etl.entities.TimeD;
import io.github.dengue360.etl.dao.DAO;
import io.github.dengue360.etl.dao.DAOFactory;
import io.github.dengue360.etl.entities.CasePK;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Loader { 
//obtem as listas provenientes da transformação e faz a carga
    //primiro das dimensões em seguida do fato e retorna o resultado.
    private DAO dao;

    public Loader() {
        dao = DAOFactory.createObjectDao();
    }
    
    public void loadDW(List<CaseD> caseList, List<TimeD> timeList, 
            List<Location> locationList, List<Person> personList){
        
        for (int i = 0; i < caseList.size(); i++) {
            TimeD t = timeList.get(i);
            Location l = locationList.get(i);
            Person p = personList.get(i);
            
            dao.salvar(t);
            dao.salvar(l);
            dao.salvar(p);
            
            CasePK cpk = new CasePK(p.getId(), l.getId(), t.getId());
            
            CaseD c = caseList.get(i);
            c.setId(cpk);
            
            dao.salvar(c);
        }
    }
}
