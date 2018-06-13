/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstruccionesSovieticas;

import Paises.Sourcerer;
import Paises.Rusia;

/**
 *
 * @author NitroSkate <00159817@uca.edu.sv>
 */
public class Bosque implements Rusia {
    private Sourcerer Bosque;
    
    public void build(){
        this.Bosque.setVida("100");
    }
    
    public Sourcerer getSource(){
        return this.Bosque;
    }
}
