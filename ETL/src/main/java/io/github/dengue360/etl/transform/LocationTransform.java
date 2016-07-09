/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform;

import io.github.dengue360.etl.entities.DataSINAN;
import io.github.dengue360.etl.entities.Location;
import io.github.dengue360.etl.exceptions.TransformException;

/**
 *
 * @author Rafael
 */
public class LocationTransform implements DimensionTransform<Location, DataSINAN>{

    @Override
    public Location process(DataSINAN param) throws TransformException{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
