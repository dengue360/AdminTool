/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.etl.transform.strategy;

/**
 *
 * @author Rafael
 * @param <T>
 * @param <P>
 */
public interface Strategy <T,P> {
    T transform(P param);
}
