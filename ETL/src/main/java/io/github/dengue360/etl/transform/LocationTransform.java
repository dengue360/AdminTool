/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform;

import io.github.dengue360.etl.entities.DataSINAN;
import io.github.dengue360.etl.entities.Location;
import io.github.dengue360.etl.exceptions.TransformException;
import io.github.dengue360.etl.transform.strategy.BairroStrategy;
import io.github.dengue360.etl.transform.strategy.CidadeInfoStrategy;
import io.github.dengue360.etl.transform.strategy.LatLngStrategy;
import io.github.dengue360.etl.transform.strategy.NumeroCasaStrategy;
import io.github.dengue360.etl.transform.strategy.RuaStrategy;
import io.github.dengue360.etl.transform.strategy.ZonaStrategy;
import io.github.dengue360.etl.transform.strategy.impl.BairroStrategyImpl;
import io.github.dengue360.etl.transform.strategy.impl.CidadeInfoStrategyImpl;
import io.github.dengue360.etl.transform.strategy.impl.LatLngStrategyImpl;
import io.github.dengue360.etl.transform.strategy.impl.NumeroCasaStrategyImpl;
import io.github.dengue360.etl.transform.strategy.impl.RuaStrategyImpl;
import io.github.dengue360.etl.transform.strategy.impl.ZonaStrategyImpl;

/**
 *
 * @author Rafael
 */
public class LocationTransform implements DimensionTransform<Location, DataSINAN>{

    @Override
    public Location process(DataSINAN param) throws TransformException{
        Location l = new Location();
        
        RuaStrategy rs = new RuaStrategyImpl();
        l.setRua(rs.transform(param.getLogradouro()));
        
        BairroStrategy bs = new BairroStrategyImpl();
        l.setBairro(bs.transform(param.getBairro()));
        
        NumeroCasaStrategy ncs = new NumeroCasaStrategyImpl();
        l.setNumero(ncs.transform(param.getNumCasa()));
        
        ZonaStrategy zs = new ZonaStrategyImpl();
        l.setZona(zs.transform(param.getCodZona()));
        
        CidadeInfoStrategy cis = new CidadeInfoStrategyImpl();
        l.setCidade(cis.transform(param.getCodMunicip()));
        l.setUf(cis.getUF(param.getCodUF()));
        l.setEstado(cis.getEstado());
        l.setCep(cis.getCep(param.getCep()));
        
        LatLngStrategy lls = new LatLngStrategyImpl(l.getRua(), l.getBairro(), 
                l.getNumero(), l.getCidade(), l.getEstado());
        lls.transform("");
        l.setLat(lls.getLat());
        l.setLng(lls.getLng());
        
        return l;
    }
   
}
