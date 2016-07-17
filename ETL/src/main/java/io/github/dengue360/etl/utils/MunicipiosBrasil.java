/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.utils;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Rafael
 */
@Entity
@Table(name = "cidades")
public class MunicipiosBrasil implements Serializable {
    @Id
    @Column(name = "Cod_Municipio_Completo")
    private Integer codMunicipio;
    @Column(name = "Municipio")
    private Integer shortCodMun;
    @Column(name = "UF")
    private Integer codEstado;
    @Column(name = "Nome_UF")
    private String nomeEstado;
    @Column(name = "Mesorregiao_Geografica")
    private Integer codMeso;
    @Column(name = "Nome_Mesorregiao")
    private String nomeMeso;
    @Column(name = "Microrregiao_Geografica")
    private Integer codMicro;
    @Column(name = "Nome_Microrregiao")
    private String nomeMicro;
    @Column(name = "Nome_Município")
    private String nomeMunicipio;

    public MunicipiosBrasil() {
    }

    public Integer getCodMunicipio() {
        return codMunicipio;
    }

    public void setCodMunicipio(Integer codMunicipio) {
        this.codMunicipio = codMunicipio;
    }

    public Integer getShortCodMun() {
        return shortCodMun;
    }

    public void setShortCodMun(Integer shortCodMun) {
        this.shortCodMun = shortCodMun;
    }

    public Integer getCodEstado() {
        return codEstado;
    }

    public void setCodEstado(Integer codEstado) {
        this.codEstado = codEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public Integer getCodMeso() {
        return codMeso;
    }

    public void setCodMeso(Integer codMeso) {
        this.codMeso = codMeso;
    }

    public String getNomeMeso() {
        return nomeMeso;
    }

    public void setNomeMeso(String nomeMeso) {
        this.nomeMeso = nomeMeso;
    }

    public Integer getCodMicro() {
        return codMicro;
    }

    public void setCodMicro(Integer codMicro) {
        this.codMicro = codMicro;
    }

    public String getNomeMicro() {
        return nomeMicro;
    }

    public void setNomeMicro(String nomeMicro) {
        this.nomeMicro = nomeMicro;
    }

    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public void setNomeMunicipio(String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }
              
    
  
}
