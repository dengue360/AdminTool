/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Rafael
 */
@Entity
public class Case implements Serializable{
    
    //Id temporario
    @Id
    private Long ID;
    private Boolean confirmado;
    private Boolean grave;
    
}
