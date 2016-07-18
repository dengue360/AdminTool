/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy.impl;

import io.github.dengue360.etl.exceptions.TransformException;
import io.github.dengue360.etl.transform.strategy.GestanteStrategy;

/**
 *
 * @author Rafael
 */
public class GestanteStrategyImpl implements GestanteStrategy{

    @Override
    public String transform(String param) throws TransformException{
        if(param == null || param.trim().equals(""))
            return "";
        return convert(param);
    }
    //TODO verificar se esse metódo da pra fazer melhor
    private String convert(String param) throws TransformException {
        String result = "1";
     
        switch(param.trim()){
            case "1" : result= "1º Trimestre";
                break;
            case "2" : result= "2º Trimestre";
                break;
            case "3" : result= "3º Trimestre";
                break;
            case "4" : result= "Idade gestacional ignorada";
                break;
            case "5" : result= "Não";
                break;
            case "6" : result= "Não se aplica";
                break;
            case "9" : result= "Ignorado";
                break;
        }
        
        return result;
    }
}
