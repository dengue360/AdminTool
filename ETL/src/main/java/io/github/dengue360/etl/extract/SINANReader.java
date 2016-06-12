/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.extract;

import com.linuxense.javadbf.DBFReader;
import io.github.dengue360.etl.entities.DataSINAN;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class SINANReader {
    private String filePath;

    public SINANReader() {
    }
    
    public SINANReader(String filePath) {
        this.filePath = filePath;
    }

    public List<DataSINAN> process(String path) throws Exception{
        this.filePath = path;
        InputStream inputStream = new FileInputStream(filePath); // take dbf file as program argument
        DBFReader reader = new DBFReader(inputStream);
//        inputStream.close();
        ConverterDBFToObject conv = new ConverterDBFToObject();
        return conv.getResultList(reader);
    }
    
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
}
