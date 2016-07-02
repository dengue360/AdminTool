/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform;

import io.github.dengue360.etl.entities.DataSINAN;
import io.github.dengue360.etl.entities.Person;
import io.github.dengue360.etl.transform.strategy.IdadeStrategy;
import io.github.dengue360.etl.transform.strategy.impl.IdadeStrategyImpl;

/**
 *
 * @author Rafael
 */
public class PersonTransform implements DimensionTransform<Person, DataSINAN>{

    @Override
    public Person process(DataSINAN paran) {
        Person p = new Person();
        
        IdadeStrategy is = new IdadeStrategyImpl();
        p.setIdade(is.transform(paran.getIdade()));
        
        
        
        return p;
    }
 
}
