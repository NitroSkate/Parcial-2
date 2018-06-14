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
public class FabricaTRUS implements Rusia{
    public static EAtaque FabricaTRUS =  new EAtaque();

    @Override
    public void build(String nombre) {
        FabricaTRUS.setNombre(nombre);
        FabricaTRUS.setVida(0);
        FabricaTRUS.setTiempoC(0);
        FabricaTRUS.setCosto1(0);
        FabricaTRUS.setCosto2(0);
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
        return FabricaTRUS;
    }
    
}
