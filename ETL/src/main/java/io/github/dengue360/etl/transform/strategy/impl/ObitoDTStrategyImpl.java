/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy.impl;

import io.github.dengue360.etl.exceptions.TransformException;
import io.github.dengue360.etl.transform.strategy.ObitoDTStrategy;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public class ObitoDTStrategyImpl implements ObitoDTStrategy{

    @Override
    public Boolean transform(Date param) throws TransformException {
        if(param == null)
            return Boolean.FALSE;
        return Boolean.TRUE;
    }
    
}
