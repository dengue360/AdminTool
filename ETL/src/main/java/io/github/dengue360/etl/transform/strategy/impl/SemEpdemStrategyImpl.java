/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy.impl;

import io.github.dengue360.etl.exceptions.TransformException;
import io.github.dengue360.etl.transform.strategy.SemEpdemStrategy;

/**
 *
 * @author Rafael
 */
public class SemEpdemStrategyImpl implements SemEpdemStrategy{

    @Override
    public String transform(String param) throws TransformException {
        return param;
    }
    
}
