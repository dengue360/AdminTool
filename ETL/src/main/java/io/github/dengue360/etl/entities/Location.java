/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Rafael
 */
@Entity 
public class Location implements Serializable{
    @Id
    private Long id;
    private String rua;
    private Integer numero;
    private String bairro;
    private String complem;
    private String zona;
    private String cidade;
    private String estado;
    private String uf;
    private String cep;
    private String lat;
    private String lng;

    public Location() {
    }

    public Location(String rua, Integer numero, String bairro, String complem, String zona, String cidade, String estado, String uf, String cep, String lat, String lng) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.complem = complem;
        this.zona = zona;
        this.cidade = cidade;
        this.estado = estado;
        this.uf = uf;
        this.cep = cep;
        this.lat = lat;
        this.lng = lng;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplem() {
        return complem;
    }

    public void setComplem(String complem) {
        this.complem = complem;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
    
}
