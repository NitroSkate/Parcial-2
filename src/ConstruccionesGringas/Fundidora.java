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
public class Fundidora implements Eeuu{
    public static Sourcerer Fundidora = new Sourcerer();
    public static Sourcerer getInstance(){
        return Fundidora;
    }
    @Override
    public void build() {
        Fundidora.setVida(300);
        Fundidora.setCosto1(0);
        Fundidora.setCosto2(0);
        Fundidora.setFasesT(0);
        Fundidora.setRecurso1(0);
        Fundidora.setRecurso2(0);
        Fundidora.setRecurso3(500);
    }

    @Override
    public Sourcerer getSource() {
        return this.Fundidora;
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
