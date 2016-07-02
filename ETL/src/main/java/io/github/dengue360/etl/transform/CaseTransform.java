/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform;

import io.github.dengue360.etl.entities.Case;
import io.github.dengue360.etl.entities.DataSINAN;

/**
 *
 * @author Rafael
 */
public class CaseTransform implements DimensionTransform<Case, DataSINAN>{
    @Override
    public Case process(DataSINAN paran) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
