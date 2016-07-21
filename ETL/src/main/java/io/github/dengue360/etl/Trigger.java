/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl;

import com.linuxense.javadbf.DBFException;
import io.github.dengue360.etl.entities.DataSINAN;
import io.github.dengue360.etl.exceptions.TransformException;
import io.github.dengue360.etl.extract.SINANReader;
import io.github.dengue360.etl.load.Loader;
import io.github.dengue360.etl.transform.Transformer;
import java.io.IOException;
import java.util.List;



/**
 * Classe que funciona como um gatilho para a execução do processo de etl
 * @author Rafael
 */
public class Trigger {
    //deve executar as ações, controlar os erros e se comunicar com a UI
    private final String path;

    public Trigger(String path) {
        this.path = path;
    }
    
    
    public Boolean execute() throws TransformException, DBFException, IOException{
        SINANReader r = new SINANReader();
        Transformer t = new Transformer();
        Loader      l = new Loader();
        
        List<DataSINAN> listDataSinan =  r.process(path);
        
        t.transformAll(listDataSinan);
        
        l.loadDW(t.getCaseList(),t.getTimeList(),t.getLocationList(),t.getPersonList());
        
        return Boolean.TRUE;
    }
}   
