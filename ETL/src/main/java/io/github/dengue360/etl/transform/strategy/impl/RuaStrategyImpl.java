/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy.impl;

import io.github.dengue360.etl.exceptions.TransformException;
import io.github.dengue360.etl.transform.strategy.RuaStrategy;

/**
 *
 * @author Rafael
 */
public class RuaStrategyImpl implements RuaStrategy{

    @Override
    public String transform(String param) throws TransformException {
        if(param == null)
            return "";
        //apesar das imperfeições no endereço a api do google consegue 
        //identificar mesmo assim por isso não foi meito o tratamento da string
        return param.trim();
    }
    
}
