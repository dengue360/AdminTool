/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy.impl;

import io.github.dengue360.etl.exceptions.TransformException;
import io.github.dengue360.etl.transform.strategy.ZonaStrategy;

/**
 *
 * @author Rafael
 */
public class ZonaStrategyImpl implements ZonaStrategy{

    @Override
    public String transform(String param) throws TransformException {
        if(param == null)
            return "";
        return getZona(param);
    }

    private String getZona(String param) {
        if(param.equals("1"))
            return "Zona Urbana";
        if(param.equals("2"))
            return "Zona Rural";
        if(param.equals("3"))
            return "Zona Periurbana";
        return "Ignorada";
    }
    
}
