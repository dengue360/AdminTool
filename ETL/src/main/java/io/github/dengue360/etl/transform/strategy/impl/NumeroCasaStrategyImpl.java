/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy.impl;

import io.github.dengue360.etl.exceptions.TransformException;
import io.github.dengue360.etl.transform.strategy.NumeroCasaStrategy;

/**
 *
 * @author Rafael
 */
public class NumeroCasaStrategyImpl implements NumeroCasaStrategy{

    @Override
    public String transform(String param) throws TransformException {
        if(param == null)
            return "";
        return param;
    }
    
}
