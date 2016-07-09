/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy.impl;

import io.github.dengue360.etl.exceptions.TransformException;
import io.github.dengue360.etl.transform.strategy.NascimentoDTStrategy;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public class NascimentoDTStrategyImpl implements NascimentoDTStrategy{

    @Override
    public Date transform(Date param) throws TransformException{
        return param;
    }
    
}
