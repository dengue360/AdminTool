/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform;

import io.github.dengue360.etl.entities.DataSINAN;
import io.github.dengue360.etl.entities.TimeD;
import io.github.dengue360.etl.exceptions.TransformException;
import io.github.dengue360.etl.transform.strategy.AnoStrategy;
import io.github.dengue360.etl.transform.strategy.EncerramentoDTStrategy;
import io.github.dengue360.etl.transform.strategy.NotificacaoDTStrategy;
import io.github.dengue360.etl.transform.strategy.ObitoDTStrategy;
import io.github.dengue360.etl.transform.strategy.SemEpdemStrategy;
import io.github.dengue360.etl.transform.strategy.impl.AnoStrategyImpl;
import io.github.dengue360.etl.transform.strategy.impl.EncerramentoDTStrategyImpl;
import io.github.dengue360.etl.transform.strategy.impl.NotificacaoDTStrategyImpl;
import io.github.dengue360.etl.transform.strategy.impl.ObitoDTStrategyImpl;
import io.github.dengue360.etl.transform.strategy.impl.SemEpdemStrategyImpl;

/**
 *
 * @author Rafael
 */
public class TimeTransform implements DimensionTransform <TimeD, DataSINAN>{

    @Override
    public TimeD process(DataSINAN param) throws TransformException{
        TimeD t = new TimeD();
        
        NotificacaoDTStrategy ndts = new NotificacaoDTStrategyImpl();
        t.setNoteDate(ndts.transform(param.getNotificacaoDT()));
        t.setDia(ndts.getDay());
        t.setMes(ndts.getMonth());
        
        AnoStrategy as = new AnoStrategyImpl();
        t.setAno(as.transform(param.getAno()));
        
        SemEpdemStrategy ses = new SemEpdemStrategyImpl();
        t.setSemanaEpdem(ses.transform(param.getSemEpid()));
        
        EncerramentoDTStrategy edts = new EncerramentoDTStrategyImpl();
        t.setEncerrDate(edts.transform(param.getEncerramentoDT()));
        
        ObitoDTStrategy odts = new ObitoDTStrategyImpl();
        t.setObitoDate(odts.transform(param.getObitoDT()));
        
        return t;
    }

}
