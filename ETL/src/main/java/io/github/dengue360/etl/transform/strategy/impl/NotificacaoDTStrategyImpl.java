/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy.impl;

import io.github.dengue360.etl.exceptions.TransformException;
import io.github.dengue360.etl.transform.strategy.NotificacaoDTStrategy;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public class NotificacaoDTStrategyImpl implements NotificacaoDTStrategy{
    private Date data = null;
            
    @Override
    public Date transform(Date param) throws TransformException {
        this.data = param;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDay() throws TransformException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMonth() throws TransformException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
