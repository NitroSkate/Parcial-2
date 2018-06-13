/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paises;

import ConstruccionesGringas.*;


/**
 *
 * @author NitroSkate <00159817@uca.edu.sv>
 */
public class EeuuFact implements AbstractFact{
    @Override
    public Eeuu getEeuu(String t) {
        switch(t){
            case "aserradero":
                return new Aserradero();
            case "fabrica":
                return new Fabrica();
            case "fundidora":
                return new Fundidora();
            case "aeropuertousa":
                return new AeropuertoUSA();
            case "cmusa":
                return new CMUSA();
            case "fabricatusa":
                return new FabricaTUSA();
            case "hqusa":
                return new HQUSA();
        }
        return null;
    }

    @Override
    public Rusia getRusia(String t) {
        return null;
    }

    @Override
    public Japon getJapon(String t) {
        return null;
    }
    
}
