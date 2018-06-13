/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstruccionesSovieticas;

import Paises.*;

/**
 *
 * @author NitroSkate <00159817@uca.edu.sv>
 */
public class Bosque implements Rusia {
    public static Sourcerer Bosque = new Sourcerer();

    @Override
    public void build(String nombre) {
        Bosque.setNombre(nombre);
        Bosque.setVida(100);
        Bosque.setFasesT(0);
        Bosque.setCosto1(0);
        Bosque.setCosto2(0);
        Bosque.setRecurso1(0);
        Bosque.setRecurso2(0);
        Bosque.setRecurso3(0);
    }

    @Override
    public Sourcerer getSource() {
        return Bosque;
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
