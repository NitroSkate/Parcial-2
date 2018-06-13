/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstruccionesGringas;

import Paises.Base;
import Paises.EAtaque;
import Paises.Eeuu;
import Paises.Sourcerer;

/**
 *
 * @author NitroSkate <00159817@uca.edu.sv>
 */
public class HQUSA implements Eeuu {
    public static EAtaque HQUSA= new EAtaque();
    public static EAtaque getInstance(){
        return HQUSA;
    }
    
    @Override
    public void build() {
        HQUSA.setVida(100);
        HQUSA.setCosto1(0);
        HQUSA.setCosto2(0);
        HQUSA.setTiempoC(0);
    }

    @Override
    public Sourcerer getSource() {
        return null;
    }

    @Override
    public Base getBase() {
        return null;
    }

    @Override
    public EAtaque getEAtaque() {
        return this.HQUSA;
    }
    
}
