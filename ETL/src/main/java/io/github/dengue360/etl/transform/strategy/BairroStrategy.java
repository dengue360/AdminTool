/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy;

import io.github.dengue360.etl.exceptions.TransformException;

/**
 *
 * @author Rafael
 */
public interface BairroStrategy extends Strategy<String, String>{

    @Override
    public String transform(String param) throws TransformException;
    
}
