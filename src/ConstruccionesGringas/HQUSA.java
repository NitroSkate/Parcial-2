/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstruccionesGringas;

import Paises.*;


/**
 *
 * @author NitroSkate <00159817@uca.edu.sv>
 */
public class HQUSA implements Eeuu {
    public static EAtaque HQUSA= new EAtaque();
    
    @Override
    public void build(String nombre) {
        HQUSA.setNombre(nombre);
        HQUSA.setVida(300);
        HQUSA.setCosto1(1000);
        HQUSA.setCosto2(1000);
        HQUSA.setCosto3(1000);
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
        return HQUSA;
    }
    
}
