/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy;

import io.github.dengue360.etl.exceptions.TransformException;

/**
 * principio do aberto-fechado dentro da implementação 
 * do padrão de projeto strategy
 * 
 * @author Rafael
 * @param <T>
 * @param <P>
 */
public interface Strategy <T,P> {
    T transform(P param) throws TransformException;
}
