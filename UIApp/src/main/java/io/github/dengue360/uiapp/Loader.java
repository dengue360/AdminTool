/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.dengue360.uiapp;
import io.github.dengue360.uiapp.ui.App;
import javax.swing.SwingUtilities;
/**
 *
 * @author Rafael
 */
public class Loader {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				new App();
			}
        });
    }
}
