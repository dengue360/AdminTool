/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy;

/**
 *
 * @author Rafael
 */
public interface GestanteStrategy extends Strategy<String, String>{

    @Override
    public String transform(String param);
    
}
