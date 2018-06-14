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
public class Menu {
    Jugador p1 = new Jugador();
    Jugador p2 = new Jugador();
    
    private static Menu menu;
    
    private Menu(){
    }
    
    public static Menu getInstance(){
        if(menu == null){
            menu = new Menu();
        }
        return menu;
    }
    
    public void IniciarJuego(){
        boolean b = true;
        Scanner in = new Scanner(System.in);
        int opc;
        while(b){
            System.out.println("Bienvenido a JoshuaSharp's World");
            System.out.println("1. Comenzar la aventura");
            System.out.println("2. Conocer como jugar");
            System.out.println("3. Salir del juego");
            opc = in.nextInt();
            switch(opc){
                case 1:
                    break;
                case 2:
                    Instrucciones();
                    break;
                case 3: 
                    b=false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }
    
    public void Instrucciones(){
        System.out.println("El juego comienza.");
        System.out.println("Elegir un pais");
        System.out.println("Debes construir edificios");
        System.out.println("Recolectar recursos");
        System.out.println("Entrenar a la tropas");
        System.out.println("Construir vehiculos");
        System.out.println("Atacar y hacerte con el territorio");
        System.out.println("Las fases se dan cada turno");
        System.out.println("El jugador que se quede sin edificios pierde");
    }
    
    public void IniciaPrimero(){
        System.out.println("------------- Jugador 1 Escoja pais-----------");
        
        System.out.println("");
        System.out.println("------------- Jugador 2 Escoja pais-----------");
        
        
    }
}
