/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy.impl;

import io.github.dengue360.etl.exceptions.TransformException;
import io.github.dengue360.etl.transform.strategy.AnoStrategy;

/**
 *
 * @author Rafael
 */
public class AnoStrategyImpl implements AnoStrategy{

    @Override
    public Integer transform(Integer param) throws TransformException {
        return param;
    }
    
}
