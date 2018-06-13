/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paises;

import ConstruccionesSovieticas.*;


/**
 *
 * @author NitroSkate <00159817@uca.edu.sv>
 */
public class RusiaFact implements AbstractFact {

    @Override
    public Eeuu getEeuu(String t) {
        return null;
    }

    @Override
    public Rusia getRusia(String t) {
        switch(t){
            case "bosque":
                return new Bosque();
            case "mezclador":
                return new Mezclador();
            case "metfact":
                return new MetFact();
        }
        return null;
    }

    @Override
    public Japon getJapon(String t) {
        return null;
    }
    
}
