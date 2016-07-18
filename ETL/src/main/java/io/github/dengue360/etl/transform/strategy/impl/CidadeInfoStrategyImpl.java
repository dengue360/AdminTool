/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy.impl;

import io.github.dengue360.etl.dao.DAO;
import io.github.dengue360.etl.dao.DAOFactory;
import io.github.dengue360.etl.exceptions.TransformException;
import io.github.dengue360.etl.transform.strategy.CidadeInfoStrategy;
import io.github.dengue360.etl.utils.MunicipiosBrasil;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Rafael
 */
public class CidadeInfoStrategyImpl implements CidadeInfoStrategy{
    private DAO<MunicipiosBrasil> dao;
    private MunicipiosBrasil municipio;
            
    public CidadeInfoStrategyImpl() {
        this.dao = DAOFactory.createMunicipiosDao();
        this.municipio = new MunicipiosBrasil();
    }
    
    
    @Override
    public String transform(String param) throws TransformException {
        Map<String, Object> map = new HashMap();
        map.put("cod", param+"%");
        municipio = dao.consultaSimples("m.get", map); // fazer consulta
        if(municipio.getNomeMunicipio() == null)
            return "";
        return municipio.getNomeMunicipio();
    }

    @Override
    public String getUF(String codUF) throws TransformException {
        if(municipio.getNomeEstado() == null)
            return "";
        String uf = "";
        switch(municipio.getNomeEstado()){
            case "Acre": uf = "AC"; break;
            case "Alagoas": uf = "AL"; break;
            case "Amapá": uf = "AP"; break;
            case "Amazonas": uf = "AM"; break;
            case "Bahia": uf = "BA"; break;
            case "Ceará": uf = "CE"; break;
            case "Distrito Federal": uf = "DF"; break;
            case "Espírito Santo": uf = "ES"; break;
            case "Goiás": uf = "GO"; break;
            case "Maranhão": uf = "MA"; break;
            case "Mato Grosso": uf = "MT"; break;
            case "Mato Grosso do Sul": uf = "MS"; break;
            case "Minas Gerais": uf = "MG"; break;
            case "Pará": uf = "PA"; break;
            case "Paraíba": uf = "PB"; break;
            case "Paraná": uf = "PR"; break;
            case "Pernambuco": uf = "PE"; break;
            case "Piauí": uf = "PI"; break;
            case "Rio de Janeiro": uf = "RJ"; break;
            case "Rio Grande do Norte": uf = "RN"; break;
            case "Rio Grande do Sul" : uf = "RS"; break;
            case "Rondônia": uf = "RO"; break;
            case "Roraima": uf = "RR"; break;
            case "Santa Catarina": uf = "SC"; break;
            case "São Paulo": uf = "SP"; break;
            case "Sergipe": uf = "SE"; break;
            case "Tocantins": uf ="TO"; break;
 
        }
        return uf;
    }

  
    @Override
    public String getEstado() throws TransformException {
        if(municipio.getNomeEstado() == null)
            return "";
        return municipio.getNomeEstado();
    }

    @Override
    public String getCep(String cep) throws TransformException {
        if(cep==null)
            return "";
        return cep;
    }

    public static void main(String[] args) throws TransformException {
        CidadeInfoStrategy c = new CidadeInfoStrategyImpl();
        System.out.println(c.transform("1100015"));
        System.out.println(c.getUF(""));
        System.out.println(c.getEstado());
    }
    
}
