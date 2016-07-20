/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.extract;

import com.linuxense.javadbf.DBFException;
import com.linuxense.javadbf.DBFField;
import com.linuxense.javadbf.DBFReader;
import io.github.dengue360.etl.entities.DataSINAN;
import io.github.dengue360.etl.utils.SINANFields;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class ConverterDBFToObject {

    public ConverterDBFToObject() {
    }
    
    public List<DataSINAN> getResultList(DBFReader reader) throws DBFException{
        Object[] rowObjects;
        List<DataSINAN> list = new ArrayList();
        DataSINAN d= new DataSINAN();
        //teste de apenas um com if, para ler todos basta trocar por um while 
        while((rowObjects = reader.nextRecord()) != null) {
            list.add(converter(d, rowObjects, reader));
            d = new DataSINAN();
        }
        
        return list;
    }
    
    private DataSINAN converter(DataSINAN d, Object[] rowObjects, DBFReader reader) throws DBFException{
        for (int i = 0; i < rowObjects.length; i++) {
            DBFField campo = reader.getField(i);
            String nameField = campo.getName();
            SINANFields field = SINANFields.valueOf(nameField);
            switch(field){
                case ID_AGRAVO: 
                    d.setAgravo(String.valueOf(rowObjects[i]));
                    break;
                case DT_ENCERRA:
                    d.setEncerramentoDT((Date)rowObjects[i]);
                    break;
                case DT_NOTIFIC:
                    d.setNotificacaoDT((Date)rowObjects[i]);
                    break;
                case DT_NASC:
                    d.setNascimentoDT((Date)rowObjects[i]);
                    break;
                case DT_OBITO:
                    d.setObitoDT((Date)rowObjects[i]);
                    break;    
                case NU_ANO:
                    d.setAno(Integer.parseInt(String.valueOf(rowObjects[i])));
                    break;
                case SG_UF:
                    d.setCodUF(String.valueOf(rowObjects[i]));
                    break;
                case ID_MN_RESI:
                    d.setCodMunicip(String.valueOf(rowObjects[i]));
                    break;
                case SEM_PRI:
                    d.setSemEpid(String.valueOf(rowObjects[i]));
                    break;
                case NU_IDADE_N:
                    d.setIdade(String.valueOf(rowObjects[i]));
                    break;
                case CS_SEXO:
                    d.setSexo(String.valueOf(rowObjects[i]));
                    break;
                case CS_GESTANT:
                    d.setCodGesta(String.valueOf(rowObjects[i]));
                    break;
                case NM_BAIRRO:
                    d.setBairro(String.valueOf(rowObjects[i]));
                    break;
                case NM_LOGRADO:
                    d.setLogradouro(String.valueOf(rowObjects[i]));
                    break;
                case NU_CEP:
                    d.setCep(String.valueOf(rowObjects[i]));
                    break;
                case CS_ZONA:
                    d.setCodZona(String.valueOf(rowObjects[i]));
                    break;    
                case NU_NUMERO:
                    d.setNumCasa(String.valueOf(rowObjects[i]));
                    break;
                case CLASSI_FIN:
                    d.setClassificacao(String.valueOf(rowObjects[i]));
                    break;
                default:
                    break;
//throw new DBFException("O campo informado não existe ou foi modificado");
            }
        }
        
        return d;
    }
}
