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
public class Fabrica implements Eeuu{
    public static Sourcerer Fabrica= new Sourcerer();

    @Override
    public void build(String nombre) {
        Fabrica.setNombre(nombre);
        Fabrica.setVida(200);
        Fabrica.setCosto1(1000);
        Fabrica.setCosto2(1500);
        Fabrica.setCosto3(0);
        Fabrica.setFasesT(0);
        Fabrica.setRecurso1(0);
        Fabrica.setRecurso2(2500);
        Fabrica.setRecurso3(0);
    }

    @Override
    public Sourcerer getSource() {
        return Fabrica;
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
