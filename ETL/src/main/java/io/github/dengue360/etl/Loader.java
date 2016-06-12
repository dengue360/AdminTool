/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl;

import io.github.dengue360.etl.entities.DataSINAN;
import io.github.dengue360.etl.extract.SINANReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class Loader {
    public static void main(String[] args) {
        SINANReader r = new SINANReader();
        try {
            List<DataSINAN> list =  r.process("C:/Users/Rafael/Desktop/Rafael/TCC/DENGON436247_00.dbf");
            
            for (DataSINAN d : list) {
                System.out.println(d.getLogradouro());
            }
        } catch (Exception ex) {
            Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
