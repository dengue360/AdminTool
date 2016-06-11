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
    ID_AGRAVO("Agravo","Nome e código do agravo notificado segundo CID-10"),
    DT_NOTIFIC("Data da Notificação", "Data de preenchimento da ficha de notificação"),
    NU_ANO("Ano da Notificação","Ano da Notificação"),
    SG_UF("Codigo da UF","Codigo do IBGE que representa a Unidade Federativa de residência do paciente por ocasião da notificação"),
    ID_MN_RESI("Codigo do Municipio","Código do município de residência do caso notificado."),
    SEM_PRI("Semana epidemiológica","Valor da semana epidemiológica dos primeiros sintomas"),
    DT_NASC("Data de Nascimento","Data de Nascimento do Paciente"),
    NU_IDADE_N("Idade","Codigo que representa a idade do Paciente"),
    CS_SEXO("Sexo","Sexo do Paciente"),
    CS_GESTANT("Gestante","Idade gestacional da paciente, caso seja mulher"),
    NM_BAIRRO("Bairro","Nome do bairro de residência"),
    NM_LOGRADO("Rua","Nome da rua de residência"),
    NU_NUMERO("Numero da Residência","Numero da Residência"),
    NM_COMPLEM("Complemento do Logradouro","Complemento do logradouro"),
    NU_CEP("CEP","Numero do CEP do municipio de residencia"),
    CS_ZONA("Zona","Zona de residência do paciente por ocasião da notificação");
    
    
    
    
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
