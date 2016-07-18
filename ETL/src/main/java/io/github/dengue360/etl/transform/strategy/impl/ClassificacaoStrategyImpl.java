/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy.impl;

import io.github.dengue360.etl.exceptions.TransformException;
import io.github.dengue360.etl.transform.strategy.ClassificacaoStrategy;

/**
 *
 * @author Rafael
 */
public class ClassificacaoStrategyImpl implements ClassificacaoStrategy{
    private Boolean grave;

    public ClassificacaoStrategyImpl() {
        this.grave = Boolean.FALSE;
    }
    
    @Override
    public Boolean transform(String param) throws TransformException {
        Boolean confirmado = Boolean.FALSE;
        if(!param.trim().equals("5")){
            if(param.trim().equals("8"))
                confirmado= Boolean.TRUE;
            else
                grave = Boolean.TRUE;
        }    
        return confirmado;
    }

    @Override
    public Boolean isGrave() {
        return grave;
    }
    
}
