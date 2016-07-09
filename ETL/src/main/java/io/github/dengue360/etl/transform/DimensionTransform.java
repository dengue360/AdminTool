/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform;

import io.github.dengue360.etl.exceptions.TransformException;

/**
 * Interface de marcação, para os tipos de classe de transformação
 * @author Rafael
 */
public interface DimensionTransform <T,P>{
    public T process(P param)throws TransformException;
}
