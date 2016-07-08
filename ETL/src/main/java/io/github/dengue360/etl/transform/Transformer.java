/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform;

import io.github.dengue360.etl.entities.CaseD;
import io.github.dengue360.etl.entities.DataSINAN;
import io.github.dengue360.etl.entities.Location;
import io.github.dengue360.etl.entities.Person;
import io.github.dengue360.etl.entities.Time;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Transformer {
    //Obtem a lista de DATASINAN proveniente da extração 
    //Intera sobre os objetos e divide cada instancia entre as classes de 
    //transformação especificas depois repassa os resultados obtidos para a carga
    private List<CaseD> caseList;
    private List<Person> personList;
    private List<Location> locationList;
    private List<Time> timeList;

    public Transformer() {
        this.caseList = new ArrayList<>();
        this.locationList = new ArrayList<>();
        this.personList = new ArrayList<>();
        this.timeList = new ArrayList<>();
    }
    
    public void transformAll(List<DataSINAN> list){
        LocationTransform lcTrans = new LocationTransform();
        PersonTransform prTrans = new PersonTransform();
        TimeTransform tmTrans = new TimeTransform();
        CaseTransform csTrans = new CaseTransform();
        
        for (DataSINAN sinanData : list) {
            if(sinanData.getEncerramentoDT() != null){
                
                locationList.add(lcTrans.process(sinanData));
                personList.add(prTrans.process(sinanData));
                timeList.add(tmTrans.process(sinanData));
                //verificar como fazer com os casos, testar a possibilidade de fazer ele num for diferente já que ele precisa das outras listas.
                caseList.add(csTrans.process(sinanData)); 
//                locationList.add(transformLocation(sinanData, lcTrans));
//                personList.add(transformPerson(sinanData, prTrans));
//                timeList.add(transformTime(sinanData, tmTrans));
//                caseList.add(transformCase(sinanData, csTrans));
            }
        }
    }

//    private CaseD transformCase(DataSINAN data, CaseTransform trans){
//        return null;
//    }
//    
//    private Location transformLocation(DataSINAN data, LocationTransform trans){
//        return trans.process();
//    }
//    
//    private Time transformTime(DataSINAN data, TimeTransform trans){
//        return null;
//    }
//    
//    private Person transformPerson(DataSINAN data, PersonTransform trans){
//        return null;
//    }
    
    public List<CaseD> getCaseList() {
        return caseList;
    }

    public List<Location> getLocationList() {
        return locationList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public List<Time> getTimeList() {
        return timeList;
    }
    
    
}
