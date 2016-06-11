/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.utils;

/**
 * Enumeração contendo os campos existentes no DBF geredo pelo SINAN.
 * @author Rafael
 */
public enum SINANFields {
    
    DT_ENCERRA("Data de Encerramento","Data de encerramento do caso"),
    ;
    
    
    private String description;
    private String name;

    private SINANFields(String name, String description) {
        this.description = description;
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
    
}
