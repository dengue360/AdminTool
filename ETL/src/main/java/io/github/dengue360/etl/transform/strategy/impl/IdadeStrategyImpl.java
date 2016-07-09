/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy.impl;

import io.github.dengue360.etl.exceptions.TransformException;
import io.github.dengue360.etl.transform.strategy.IdadeStrategy;

/**
 *
 * @author Rafael
 */
public class IdadeStrategyImpl implements IdadeStrategy{

    @Override
    public String transform(String param) throws TransformException{
        if(param == null || param.trim().equals(""))
            return "";
        String type = param.substring(0, 1);
        String age  = param.substring(1, 4);
        
        return convertAge(age) + convertType(type);
    }

    private String convertAge(String age) {
        Integer i = Integer.parseInt(age);
        return i.toString();
    }

    private String convertType(String type) {
        String t = "";
        switch(type){
            case "1" : t= " Horas";
                break;
            case "2" : t= " Dias";
                break;
            case "3" : t= " Semanas";
                break;
            case "4" : t= " Anos";    
        }
        return t;
    }
}
