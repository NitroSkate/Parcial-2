/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JoshuaSharps_World;

import Paises.*;
import java.util.ArrayList;

/**
 *
 * @author NitroSkate <00159817@uca.edu.sv>
 */
public class JoshuaSharps_World {
    //public static ArrayList <Sourcerer> pr = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*EeuuFact eeuu = new EeuuFact();
        eeuu.getEeuu("aserradero").build("Pene");
        Sourcerer edif = eeuu.getEeuu("Aserradero").getSource();
        System.out.println(edif.getNombre());
        edif.sour.add(edif);
        pr.add(edif);
        System.out.println(pr.get(0).getVida());
        */
        
        Menu menu;
        menu = Menu.getInstance();
        menu.IniciarJuego();
        
    }
    
}
