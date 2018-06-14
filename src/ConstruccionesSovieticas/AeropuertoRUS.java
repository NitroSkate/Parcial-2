/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstruccionesSovieticas;

import Paises.Base;
import Paises.EAtaque;
import Paises.Rusia;
import Paises.Sourcerer;

/**
 *
 * @author estudiante
 */
public class AeropuertoRUS implements Rusia{
    public static EAtaque AeropuertoRUS = new EAtaque();

    @Override
    public void build(String nombre) {
        AeropuertoRUS.setNombre(nombre);
        AeropuertoRUS.setVida(0);
        AeropuertoRUS.setTiempoC(0);
        AeropuertoRUS.setCosto1(0);
        AeropuertoRUS.setCosto2(0);
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
        return AeropuertoRUS;
    }
    
    
    
}
