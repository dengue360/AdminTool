/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy;
import io.github.dengue360.etl.exceptions.TransformException;
import java.util.Date;
/**
 *
 * @author Rafael
 */
public interface ObitoDTStrategy extends Strategy<Boolean, Date>{

    @Override
    public Boolean transform(Date param) throws TransformException;   
    
}
