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
    NU_CEP("CEP","Numero do CEP do municipio de residencia"),
    CS_ZONA("Zona","Zona de residência do paciente por ocasião da notificação"),
    DT_OBITO("Data do Obito", "Data do obito, caso tenha ocorrido"),
    CLASSI_FIN("Classificação do caso","Indica se o caso foi confirmado, descartado ou é grave"),
    
    COPAISINF   ("",""),    COMUNINF    ("",""),    CODISINF    ("",""),    CO_BAINF    ("",""),	
    COUFINF     ("",""),    CRITERIO    ("",""),    DOENCA_TRA  ("",""),    CLINC_CHIK  ("",""),
    EVOLUCAO    ("",""),    ALRM_HIPOT  ("",""),    ALRM_PLAQ   ("",""),    ALRM_VOM    ("",""),
    ALRM_SANG   ("",""),    ALRM_HEMAT  ("",""),    ALRM_ABDOM  ("",""),    ALRM_LETAR  ("",""),
    ALRM_HEPAT  ("",""),    ALRM_LIQ    ("",""),    DT_ALRM     ("",""),    GRAV_PULSO  ("",""),
    GRAV_CONV   ("",""),    GRAV_ENCH	("",""),    GRAV_INSUF	("",""),    GRAV_TAQUI	("",""),
    GRAV_EXTRE	("",""),    GRAV_HIPOT	("",""),    GRAV_HEMAT	("",""),    GRAV_MELEN	("",""),
    GRAV_METRO	("",""),    GRAV_SANG	("",""),    GRAV_AST	("",""),    GRAV_MIOC	("",""),
    GRAV_CONSC	("",""),    GRAV_ORGAO	("",""),    DT_GRAV	("",""),    MANI_HEMOR	("",""),
    EPISTAXE	("",""),    GENGIVO	("",""),    METRO	("",""),    PETEQUIAS	("",""),
    HEMATURA	("",""),    SANGRAM	("",""),    LACO_N	("",""),    PLASMATICO	("",""),
    EVIDENCIA	("",""),    PLAQ_MENOR	("",""),    CON_FHD	("",""),    COMPLICA	("",""),
    NU_LOTE_I	("",""),    DS_OBS	("",""),    TP_SISTEMA	("",""),    NDUPLIC_N	("",""),
    DT_DIGITA	("",""),    DT_TRANSUS	("",""),    DT_TRANSDM	("",""),    DT_TRANSSM	("",""),
    DT_TRANSRM	("",""),    DT_TRANSRS	("",""),    DT_TRANSSE	("",""),    NU_LOTE_V	("",""),
    NU_LOTE_H	("",""),    CS_FLXRET	("",""),    FLXRECEBI	("",""),    IDENT_MICR	("",""),
    MIGRADO_W	("",""),    NU_NOTIFIC	("",""),    TP_NOT	("",""),    SEM_NOT	("",""),
    SG_UF_NOT	("",""),    ID_MUNICIP	("",""),    ID_REGIONA	("",""),    ID_UNIDADE	("",""),
    DT_SIN_PRI	("",""),    NM_PACIENT	("",""),    FONETICA_N	("",""),    SOUNDEX	("",""),
    CS_RACA	("",""),    CS_ESCOL_N	("",""),    ID_CNS_SUS	("",""),    NM_MAE_PAC	("",""),
    ID_RG_RESI	("",""),    ID_DISTRIT	("",""),    ID_BAIRRO	("",""),    ID_LOGRADO	("",""),
    ID_GEO1	("",""),    ID_GEO2	("",""),    NM_REFEREN	("",""),    NU_DDD_TEL	("",""),
    NU_TELEFON	("",""),    ID_PAIS	("",""),    DT_INVEST	("",""),    ID_OCUPA_N	("",""),
    FEBRE	("",""),    MIALGIA	("",""),    CEFALEIA	("",""),    EXANTEMA	("",""),
    VOMITO	("",""),    NAUSEA	("",""),    DOR_COSTAS	("",""),    CONJUNTVIT	("",""),
    ARTRITE	("",""),    ARTRALGIA	("",""),    PETEQUIA_N	("",""),    LEUCOPENIA	("",""),
    LACO	("",""),    DOR_RETRO	("",""),    DIABETES	("",""),    HEMATOLOG	("",""),
    HEPATOPAT	("",""),    RENAL	("",""),    HIPERTENSA	("",""),    ACIDO_PEPT	("",""),
    AUTO_IMUNE	("",""),    DT_CHIK_S1	("",""),    DT_CHIK_S2	("",""),    DT_PRNT	("",""),
    RES_CHIKS1	("",""),    RES_CHIKS2	("",""),    RESUL_PRNT	("",""),    DT_SORO	("",""),
    RESUL_SORO	("",""),    DT_NS1	("",""),    RESUL_NS1	("",""),    DT_VIRAL	("",""),
    RESUL_VI_N	("",""),    DT_PCR	("",""),    RESUL_PCR_	("",""),    SOROTIPO	("",""),    
    HISTOPA_N	("",""),    IMUNOH_N	("",""),    HOSPITALIZ	("",""),    DT_INTERNA	("",""),    
    UF          ("",""),    MUNICIPIO	("",""),    HOSPITAL	("",""),    DDD_HOSP	("",""),    
    TEL_HOSP	("",""),    TPAUTOCTO   ("",""),    NOBAIINF    ("",""),     NM_COMPLEM ("","");
    
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
