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
public class AeropuertoUSA implements Eeuu{

    public static EAtaque AeropuertoUSA = new EAtaque();
    
    @Override
    public void build(String nombre) {
        AeropuertoUSA.setNombre(nombre);
        AeropuertoUSA.setVida(0);
        AeropuertoUSA.setCosto1(0);
        AeropuertoUSA.setCosto2(0);
        AeropuertoUSA.setTiempoC(0);
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
        return AeropuertoUSA;
    }
    
}
