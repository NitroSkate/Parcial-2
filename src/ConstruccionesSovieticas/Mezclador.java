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
public class Mezclador implements Rusia {
    private Sourcerer Mezclador;
    
    public void build(){
        this.Mezclador.setVida("200");
    }
    
    public Sourcerer getSource(){
        return this.Mezclador;
    }
}
