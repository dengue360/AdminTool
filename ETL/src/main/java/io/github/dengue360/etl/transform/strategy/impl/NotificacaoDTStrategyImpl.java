/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy.impl;

import io.github.dengue360.etl.exceptions.TransformException;
import io.github.dengue360.etl.transform.strategy.NotificacaoDTStrategy;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author Rafael
 */
public class NotificacaoDTStrategyImpl implements NotificacaoDTStrategy{
    private Date data = null;
            
    @Override
    public Date transform(Date param) throws TransformException {
        this.data = param;
        return data;
    }

    @Override
    public String getDay() throws TransformException {
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        LocalDate d = LocalDate.of(cal.get(Calendar.YEAR), 
                cal.get(Calendar.MONTH) + 1,
                cal.get(Calendar.DAY_OF_MONTH));
        return d.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("pt-br"));
    }

    @Override
    public String getMonth() throws TransformException {
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        LocalDate d = LocalDate.of(cal.get(Calendar.YEAR), 
                cal.get(Calendar.MONTH) + 1,
                cal.get(Calendar.DAY_OF_MONTH));
        return d.getMonth().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("pt-br")); 
    }
}
