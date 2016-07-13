/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author Rafael
 */
@Entity
public class CaseD implements Serializable{
    
    @EmbeddedId
    private CasePK id;
    private Boolean confirmado;
    private Boolean grave;
    private String agravo;

    public CaseD() {
    }

    public CaseD(CasePK id, Boolean confirmado, Boolean grave, String agravo) {
        this.id = id;
        this.confirmado = confirmado;
        this.grave = grave;
        this.agravo = agravo;
    }

    public CasePK getId() {
        return id;
    }

    public void setId(CasePK id) {
        this.id = id;
    }

    public Boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(Boolean confirmado) {
        this.confirmado = confirmado;
    }

    public Boolean isGrave() {
        return grave;
    }

    public void setGrave(Boolean grave) {
        this.grave = grave;
    }

    public String getAgravo() {
        return agravo;
    }

    public void setAgravo(String agravo) {
        this.agravo = agravo;
    }
    
}
