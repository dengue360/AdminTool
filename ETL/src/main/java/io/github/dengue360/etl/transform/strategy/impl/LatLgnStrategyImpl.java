/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy.impl;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;
import io.github.dengue360.etl.exceptions.TransformException;
import io.github.dengue360.etl.transform.strategy.LatLngStrategy;

/**
 *
 * @author Rafael
 */
public class LatLgnStrategyImpl implements LatLngStrategy{

    
    public LatLgnStrategyImpl(String rua, String bairro, String num, String cidade, String estado, String cep) {
    
    }

    public LatLgnStrategyImpl() {
    }

    
    @Override
    public String transform(String param) throws TransformException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLat() throws TransformException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLng() throws TransformException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void test() throws Exception{
        GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyDt2zIey06LBza7B8UlJpU5Al4YyQmlUJ4");
        GeocodingResult[] results =  GeocodingApi.geocode(context,
        "274,João de Sousa Maciel, Cajazeiras, PB").await();
        System.out.println(results[0].geometry.location.lat);
        System.out.println(results[0].geometry.location.lng);
    }    
    
    public static void main(String[] args) throws Exception {
        LatLgnStrategyImpl l = new LatLgnStrategyImpl();
        l.test();
    }
}
