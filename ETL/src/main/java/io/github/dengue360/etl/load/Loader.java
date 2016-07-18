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
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Loader { 
//obtem as listas provenientes da transformação e faz a carga
    //primiro das dimensões em seguida do fato e retorna o resultado.
    public void loadDW(List<CaseD> caseList, List<TimeD> timeList, 
            List<Location> locationList, List<Person> personList){
        
        for (int i = 0; i < caseList.size(); i++) {
            timeList.get(i);
        }
    }
}
