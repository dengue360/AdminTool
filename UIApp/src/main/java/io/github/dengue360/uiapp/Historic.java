/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.uiapp;

import java.time.LocalDate;
/**
 *
 * @author Rafael
 */
public class Historic {
    private String name;
    private LocalDate data;

    public Historic() {
    }

    public Historic(String name, LocalDate data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
