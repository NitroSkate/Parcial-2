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
public class Fundidora implements Eeuu{
    public static Sourcerer Fundidora = new Sourcerer();

    @Override
    public void build(String nombre) {
        Fundidora.setNombre(nombre);
        Fundidora.setVida(300);
        Fundidora.setCosto1(1000);
        Fundidora.setCosto2(1000);
        Fundidora.setCosto3(1500);
        Fundidora.setFasesT(1500);
        Fundidora.setRecurso1(0);
        Fundidora.setRecurso2(0);
        Fundidora.setRecurso3(1500);
    }

    @Override
    public Sourcerer getSource() {
        return Fundidora;
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
