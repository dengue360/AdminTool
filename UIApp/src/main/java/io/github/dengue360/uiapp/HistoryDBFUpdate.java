/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template dbfName, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.uiapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Formatter;




/**
 *
 * @author Rafael
 */
public class HistoryDBFUpdate {
    //verifico se o nome do arquivo ja existe no historico
    //caso contrario eu salvo lá e retorno.
    private String dbfName;
    private String path;
    private static HistoryDBFUpdate instance;
    private File f;

    private HistoryDBFUpdate() throws IOException {
        
//        this.path = getClass().getResource("/historyDBFUpdate.txt").getPath();
//        f = new File(path);
    }
    
    public static HistoryDBFUpdate getInstance() throws IOException{
        if (instance == null) {
            return new HistoryDBFUpdate();
        }
        return instance;
    }
    public Boolean check(String file) throws IOException {
//        this.dbfName = file;
//        if(readDBFNames().contains(dbfName))
//            return Boolean.TRUE;
//        return Boolean.FALSE;
        return Boolean.TRUE;
    }

    public void save() throws IOException {
//        System.out.println("Salvando");
//        fileWrite(dbfName);
    }
    
    public  void fileWrite(String text){
        String caminho= path;
        File file = new File(caminho);
        BufferedWriter bf;
        try {
            bf = new BufferedWriter(new FileWriter(file));
            bf.write(LocalDate.now().toString() + " : " + text);
            bf.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }         
    }
    private void writeDBFName(String text) throws IOException{
        //BufferedWriter bf;
        //bf = new BufferedWriter(new FileWriter(f));
        text = LocalDate.now().toString() + " : " + text;
        System.out.println(text);
        Formatter out = new Formatter(f);
        out.format(text);
        out.close();
//        bf.append(text);
//        bf.newLine();
//        bf.close();        
    }
    
    private List<String> readDBFNames() throws IOException {
        List<String> lista = new ArrayList();
        lista.add("data : nome");
        BufferedReader br;
       
           br = new BufferedReader(new FileReader(f.getPath()));
           String linha = br.readLine();
           while (linha != null) {
               String[] name =linha.split(" : ");
               lista.add(name[1]);
               linha = br.readLine();
           }
           br.close();
        for (String string : lista) {
            System.out.println(string);
        }
        return lista;
    }        
}
