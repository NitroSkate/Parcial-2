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
public class Fabrica implements Eeuu{
    public static Sourcerer Fabrica= new Sourcerer();
    public static Sourcerer getInstance(){
        return Fabrica;
    }
    @Override
    public void build() {
        Fabrica.setVida(200);
        Fabrica.setCosto1(0);
        Fabrica.setCosto2(0);
        Fabrica.setFasesT(0);
        Fabrica.setRecurso1(0);
        Fabrica.setRecurso2(1250);
        Fabrica.setRecurso3(0);
    }

    @Override
    public Sourcerer getSource() {
        return this.Fabrica;
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
