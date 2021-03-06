/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.extract;

import com.linuxense.javadbf.DBFException;
import com.linuxense.javadbf.DBFReader;
import io.github.dengue360.etl.entities.DataSINAN;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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

    public List<DataSINAN> process(String path) throws FileNotFoundException, DBFException, IOException{
        this.filePath = path;
        InputStream inputStream = new FileInputStream(filePath); // take dbf file as program argument
        DBFReader reader = new DBFReader(inputStream);
        ConverterDBFToObject conv = new ConverterDBFToObject();
        List<DataSINAN> list = conv.getResultList(reader);
        inputStream.close();
        return list;
    }
    
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
}
