/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JoshuaSharps_World;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class Jugador {
    Scanner in = new Scanner(System.in);
    private int pai;
    
    public int ElegirPais(){
        System.out.println("Elija una de los 3 paises");
        System.out.println("1. Estados Unidos");
        System.out.println("2. Japon");
        System.out.println("3. Rusia");
        int opc;
        opc = in.nextInt();
        boolean f = true;
        while(f){
            switch(opc){
                case 1:
                    pai=1;
                    return pai;
                case 2: 
                    pai=2;
                    return pai;
                case 3:
                    pai=3;
                    return pai;
                default:
                    System.out.println("No existe ese pais. Intentelo de nuevo");
                    break;
            }
        }
    }
}
