/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.entities;

import java.util.Date;

/**
 * Entidade que representa os dados de uma tupla do arquivo DBF, funciona como 
 * um Operational Data Store (ODS) em memória.
 * @author Rafael
 */
public class DataSINAN {
    
    private String agravo;
    private String codUF;
    private String codMunicip;
    private String semEpid;
    private String sexo;
    private String codGesta;
    private String bairro;
    private String logradouro;
    private String compleLogra;
    private String cep;
    private String codZona;
    private String idade;
    private Integer ano;
    private String numRua;
    private String classificacao;
    private Date notificacaoDT;
    private Date encerramentoDT;
    private Date nascimentoDT;
    private Date obitoDT;

    public DataSINAN() {
    }

    public String getAgravo() {
        return agravo;
    }

    public void setAgravo(String agravo) {
        this.agravo = agravo;
    }

    public String getCodUF() {
        return codUF;
    }

    public void setCodUF(String codUF) {
        this.codUF = codUF;
    }

    public String getCodMunicip() {
        return codMunicip;
    }

    public void setCodMunicip(String codMunicip) {
        this.codMunicip = codMunicip;
    }

    public String getSemEpid() {
        return semEpid;
    }

    public void setSemEpid(String semEpid) {
        this.semEpid = semEpid;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCodGesta() {
        return codGesta;
    }

    public void setCodGesta(String codGesta) {
        this.codGesta = codGesta;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCompleLogra() {
        return compleLogra;
    }

    public void setCompleLogra(String compleLogra) {
        this.compleLogra = compleLogra;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCodZona() {
        return codZona;
    }

    public void setCodZona(String codZona) {
        this.codZona = codZona;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getNumRua() {
        return numRua;
    }

    public void setNumRua(String numRua) {
        this.numRua = numRua;
    }

    public Date getNotificacaoDT() {
        return notificacaoDT;
    }

    public void setNotificacaoDT(Date notificacaoDT) {
        this.notificacaoDT = notificacaoDT;
    }

    public Date getEncerramentoDT() {
        return encerramentoDT;
    }

    public void setEncerramentoDT(Date encerramentoDT) {
        this.encerramentoDT = encerramentoDT;
    }

    public Date getNascimentoDT() {
        return nascimentoDT;
    }

    public void setNascimentoDT(Date nascimentoDT) {
        this.nascimentoDT = nascimentoDT;
    }

    public Date getObitoDT() {
        return obitoDT;
    }

    public void setObitoDT(Date obitoDT) {
        this.obitoDT = obitoDT;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    
}
