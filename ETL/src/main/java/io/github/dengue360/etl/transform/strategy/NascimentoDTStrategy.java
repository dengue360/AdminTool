/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy;

import java.util.Date;

/**
 *
 * @author Rafael
 */
public interface NascimentoDTStrategy extends Strategy<Date, Date>{

    @Override
    public Date transform(Date param);
    
}