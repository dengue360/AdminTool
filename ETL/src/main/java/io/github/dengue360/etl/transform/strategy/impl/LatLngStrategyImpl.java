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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class LatLngStrategyImpl implements LatLngStrategy{
    private String lat;
    private String lng;
    private String rua;
    private String bairro; 
    private String num; 
    private String cidade; 
    private String estado; 
    
    public LatLngStrategyImpl(String rua, String bairro, String num, String cidade, String estado){
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.num = num;
        this.rua = rua;
    }
    //Questionar a necessidade do bairro 
    //retirado o bairro do endereço,pois o nome do bairro informado no SINAN 
    //não codiz com o real identificado pelo google o que resulta em uma localização equivocada
    private String makeAddress()throws TransformException{
        String ad = "";
        if (rua.equals("")) //sem os dois não da pra saber uma localização precisa
            return ad;
        if (num == null)
            ad = rua + ", " + cidade + ", " + estado;
        else  
            ad = num + ", " + rua + ", " + cidade + ", " + estado;
        return ad;
    }
    
    @Override
    public String transform(String param) throws TransformException {
        GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyDt2zIey06LBza7B8UlJpU5Al4YyQmlUJ4");
        GeocodingResult[] results = null;
        try {
            results = GeocodingApi.geocode(context,
                    makeAddress()).await();
        } catch (java.net.UnknownHostException | java.net.SocketTimeoutException ex) {
            throw new TransformException(ex.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(LatLngStrategyImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(results == null || results.length < 1){
            this.lat = "";
            this.lng = "";
            return "ERROR";
        }
        this.lat = String.valueOf(results[0].geometry.location.lat);
        this.lng = String.valueOf(results[0].geometry.location.lng);
        return "SUCCESS";
    }

    @Override
    public String getLat() throws TransformException {
        return lat;
    }

    @Override
    public String getLng() throws TransformException {
        return lng;
    }   
    
    public static void main(String[] args) throws Exception {
      LatLngStrategy l = new LatLngStrategyImpl("R:João de Sousa Maciel", "Centro", "274", "Cajazeiras", "Paraíba");
        System.out.println(l.transform(""));
        System.out.println(l.getLat());
        System.out.println(l.getLng());
        //-6.8947093
        //-38.5595216
    }
}
