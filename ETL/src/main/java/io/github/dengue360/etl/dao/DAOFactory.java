/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.dao;



/**
 *
 * @author Rafael
 */
public class DAOFactory {
    
    public static DAO<Object> createObjectDao(){
        return new DAOJPA<>();
    }
}
