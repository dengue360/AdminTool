/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl;

import io.github.dengue360.etl.entities.DataSINAN;
import io.github.dengue360.etl.extract.SINANReader;
import io.github.dengue360.etl.load.Loader;
import io.github.dengue360.etl.transform.Transformer;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe que funciona como um gatilho para a execução do processo de etl
 * @author Rafael
 */
public class Trigger {
    //deve executar as ações, controlar os erros e se comunicar com a UI
    public static void main(String[] args) {
        SINANReader r = new SINANReader();
        Transformer t = new Transformer();
        Loader      l = new Loader();
        try {
            List<DataSINAN> listDataSinan =  r.process("C:/Users/Rafael/Desktop/Rafael/TCC/DENGON436247_00.dbf");
            
            for (DataSINAN dataSINAN : listDataSinan) {
                System.out.println(dataSINAN.getCodMunicip());
            }
            
            t.transformAll(listDataSinan);
            
            l.loadDW(t.getCaseList(),t.getTimeList(),t.getLocationList(),t.getPersonList());
            
        } catch (Exception ex) {
            Logger.getLogger(LoaderTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
