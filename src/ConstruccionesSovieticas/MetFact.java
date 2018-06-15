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
public class MetFact implements Rusia {
    public static Sourcerer MetFact = new Sourcerer();

    @Override
    public void build(String nombre) {
        MetFact.setNombre(nombre);
        MetFact.setVida(300);
        MetFact.setFasesT(0);
        MetFact.setCosto1(1000);
        MetFact.setCosto2(1000);
        MetFact.setCosto3(1500);
        MetFact.setRecurso1(0);
        MetFact.setRecurso2(0);
        MetFact.setRecurso3(1500);
    }

    @Override
    public Sourcerer getSource() {
        return MetFact;
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
