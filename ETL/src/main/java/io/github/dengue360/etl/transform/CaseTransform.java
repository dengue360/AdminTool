/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform;

import io.github.dengue360.etl.entities.CaseD;
import io.github.dengue360.etl.entities.DataSINAN;
import io.github.dengue360.etl.exceptions.TransformException;
import io.github.dengue360.etl.transform.strategy.AgravoStrategy;
import io.github.dengue360.etl.transform.strategy.ClassificacaoStrategy;
import io.github.dengue360.etl.transform.strategy.ObitoDTStrategy;
import io.github.dengue360.etl.transform.strategy.impl.AgravoStrategyImpl;
import io.github.dengue360.etl.transform.strategy.impl.ClassificacaoStrategyImpl;
import io.github.dengue360.etl.transform.strategy.impl.ObitoDTStrategyImpl;

/**
 *
 * @author Rafael
 */
public class CaseTransform implements DimensionTransform<CaseD, DataSINAN>{
    
    @Override
    public CaseD process(DataSINAN param) throws TransformException{
        /**
         * primeiro persiste as dimensões 
         * depois pega os id 
         * e persiste os casos;
         */
        CaseD c = new CaseD();
        
        ObitoDTStrategy odts = new ObitoDTStrategyImpl();
        c.setObito(odts.transform(param.getObitoDT()));
        
        AgravoStrategy as = new AgravoStrategyImpl();
        c.setAgravo(as.transform(param.getAgravo()));
        
        ClassificacaoStrategy cs = new ClassificacaoStrategyImpl();
        c.setConfirmado(cs.transform(param.getClassificacao()));
        c.setGrave(cs.isGrave());
        
        return c;
    }
}
