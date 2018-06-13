/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstruccionesNiponas;

import Paises.Japon;
import Paises.Sourcerer;

/**
 *
 * @author NitroSkate <00159817@uca.edu.sv>
 */
public class Maquila implements Japon {
    private Sourcerer Maquila;
    
    public void build(){
        this.Maquila.setVida("200");
    }
    
    public Sourcerer getSource(){
        return this.Maquila;
    }
}
