/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.uiapp;




/**
 *
 * @author Rafael
 */
public class HistoryDBFUpdate {
    //verifico se o nome do arquivo ja existe no historico
    //caso contrario eu salvo lá e retorno.
    private String file;

    public HistoryDBFUpdate(String file) {
        this.file = file;
    }

    public Boolean check() {
        return Boolean.TRUE;
    }

    public void save() {
    }
    
    
            
}
