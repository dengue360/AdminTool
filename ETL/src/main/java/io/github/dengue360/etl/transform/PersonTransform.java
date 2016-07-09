/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform;

import io.github.dengue360.etl.entities.DataSINAN;
import io.github.dengue360.etl.entities.Person;
import io.github.dengue360.etl.exceptions.TransformException;
import io.github.dengue360.etl.transform.strategy.GestanteStrategy;
import io.github.dengue360.etl.transform.strategy.IdadeStrategy;
import io.github.dengue360.etl.transform.strategy.NascimentoDTStrategy;
import io.github.dengue360.etl.transform.strategy.SexoStrategy;
import io.github.dengue360.etl.transform.strategy.impl.GestanteStrategyImpl;
import io.github.dengue360.etl.transform.strategy.impl.IdadeStrategyImpl;
import io.github.dengue360.etl.transform.strategy.impl.NascimentoDTStrategyImpl;
import io.github.dengue360.etl.transform.strategy.impl.SexoStrategyImpl;

/**
 *
 * @author Rafael
 */
public class PersonTransform implements DimensionTransform<Person, DataSINAN>{

    @Override
    public Person process(DataSINAN param) throws TransformException{
        Person p = new Person();
        
        IdadeStrategy is = new IdadeStrategyImpl();
        p.setIdade(is.transform(param.getIdade()));
        
        SexoStrategy ss = new SexoStrategyImpl();
        p.setSexo(ss.transform(param.getSexo()));
        
        NascimentoDTStrategy ns = new NascimentoDTStrategyImpl();
        p.setDataNasc(ns.transform(param.getNascimentoDT()));
        
        GestanteStrategy gs = new GestanteStrategyImpl();
        p.setGestante(gs.transform(param.getCodGesta()));
        
        return p;
    }
}
