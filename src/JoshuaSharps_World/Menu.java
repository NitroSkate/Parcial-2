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
    public String p1n;
    public String p2n;
    Scanner input = new Scanner(System.in);
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
                    TurnoAleatorio();
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
        System.out.println(" ");
    }
    
    public void ElegirPais(){
        System.out.println("--------- Jugador 1----------");
        System.out.println("Ingrese un usuario:");
        System.out.println(" ");
        p1n = input.nextLine();
        System.out.println("------------- Jugador 1 Escoja pais-----------");
        p1.ElegirPais();
        System.out.println("--------- Jugador 2----------");
        System.out.println("Ingrese un usuario:");
        System.out.println(" ");
        p2n = input.nextLine();
        System.out.println("");
        System.out.println("------------- Jugador 2 Escoja pais-----------");
        p2.ElegirPais();
    }
    
    public void TurnoAleatorio(){
        ElegirPais();
        int random = (int) (Math.random()*2)+1;
        if (random == 1){
            EmpiezaJ1();
        }
        else{
            EmpiezaJ2();
        }
    }
    
    
    public void EmpiezaJ1(){
        boolean Game = true;
        int fase = 1;
        while(Game){
            boolean J1=true, J2=true;
            System.out.println("");
            System.out.println("-----------Fase " +fase+ " -----------");
            System.out.println("-------Turno de " +p1n+" ---------");
            while(J1){
                int opc;
                Scanner in = new Scanner(System.in);
                System.out.println("");
                System.out.println("1. Construir edificios");
                System.out.println("2. Atacar/Defender ");
                System.out.println("3. Terminar el turno ");
                opc = in.nextInt();
                switch(opc){
                    case 1:
                        p1.MenuConstruir();
                        break;
                    case 2:
                        break;
                    case 3:
                        J1=false;
                        break;
                    default:
                        System.out.println("No existe esa opcion. Intentalo de nuevo");
                        System.out.println(" ");
                }
            }
            System.out.println("");
            System.out.println("------Turno de " +p2n+" ----------");
            while(J2){
                int opc;
                Scanner in = new Scanner(System.in);
                System.out.println("");
                System.out.println("1. Construir edificios");
                System.out.println("2. Atacar/Defender ");
                System.out.println("3. Terminar el turno ");
                opc = in.nextInt();
                switch(opc){
                    case 1:
                        p1.MenuConstruir();
                        break;
                    case 2:
                        break;
                    case 3:
                        J2=false;
                        break;
                    default:
                        System.out.println("No existe esa opcion. Intentalo de nuevo");
                }  System.out.println(" ");
            }
            if(p1.Game() && !p2.Game()){
                System.out.println("El jugador "+p1n+" ha ganado el juego");
                Game=false;
            }
            else if(!p1.Game() && p2.Game()){
                System.out.println("El jugador "+p2n+" ha ganado el juego");
                Game=false;
            }
            else if(p1.Game() && p2.Game()){
                System.out.println("Ambos jugadores pierden");
                Game=false;
            }
            fase++;
        }
    }
    
        public void EmpiezaJ2(){
        boolean Game = true;
        int fase = 1;
        while(Game){
            boolean J1=true, J2=true;
            System.out.println("");
            System.out.println("-----------Fase " +fase+ " -----------");
            System.out.println("-------Turno de " +p2n+" ---------");
            while(J2){
                int opc;
                Scanner in = new Scanner(System.in);
                System.out.println("");
                System.out.println("1. Construir edificios");
                System.out.println("2. Atacar/Defender ");
                System.out.println("3. Terminar el turno ");
                opc = in.nextInt();
                switch(opc){
                    case 1:
                        p2.MenuConstruir();
                        break;
                    case 2:
                        break;
                    case 3:
                        J2=false;
                        break;
                    default:
                        System.out.println("No existe esa opcion. Intentalo de nuevo");
                        System.out.println(" ");
                }
            }
            System.out.println("");
            System.out.println("------Turno de " +p1n+" ----------");
            while(J1){
                int opc;
                Scanner in = new Scanner(System.in);
                System.out.println("");
                System.out.println("1. Construir edificios");
                System.out.println("2. Atacar/Defender ");
                System.out.println("3. Terminar el turno ");
                opc = in.nextInt();
                switch(opc){
                    case 1:
                        p1.MenuConstruir();
                        break;
                    case 2:
                        break;
                    case 3:
                        J1=false;
                        break;
                    default:
                        System.out.println("No existe esa opcion. Intentalo de nuevo");
                }  System.out.println(" ");
            }
            if(p1.Game() && !p2.Game()){
                System.out.println("El jugador "+p1n+" ha ganado el juego");
                Game=false;
            }
            else if(!p1.Game() && p2.Game()){
                System.out.println("El jugador "+p2n+" ha ganado el juego");
                Game=false;
            }
            else if(p1.Game() && p2.Game()){
                System.out.println("Ambos jugadores pierden");
                Game=false;
            }
            fase++;
        }
    }
    
}
