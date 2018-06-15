/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstruccionesSovieticas;

import Paises.Base;
import Paises.EAtaque;
import Paises.Sourcerer;
import Paises.Rusia;

/**
 *
 * @author NitroSkate <00159817@uca.edu.sv>
 */
public class Mezclador implements Rusia {
    public static Sourcerer Mezclador = new Sourcerer();

    @Override
    public void build(String nombre) {
        Mezclador.setNombre(nombre);
        Mezclador.setVida(200);
        Mezclador.setFasesT(0);
        Mezclador.setCosto1(1000);
        Mezclador.setCosto2(1500);
        Mezclador.setCosto3(0);
        Mezclador.setRecurso1(0);
        Mezclador.setRecurso2(2500);
        Mezclador.setRecurso3(0);
    }

    @Override
    public Sourcerer getSource() {
        return Mezclador;
    }

    @Override
    public Base getBase() {
        return null;
    }

    @Override
    public EAtaque getEAtaque() {
        return null;
    }
    

}
